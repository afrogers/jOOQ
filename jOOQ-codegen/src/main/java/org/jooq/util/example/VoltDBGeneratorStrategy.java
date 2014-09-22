/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.util.example;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

public class VoltDBGeneratorStrategy extends DefaultGeneratorStrategy {
    @Override
    public String getJavaClassName(final Definition definition, final Mode mode) {
        StringBuilder result = new StringBuilder();

        result.append(convertToCamelCase(definition.getOutputName(), true));

        if (mode == Mode.RECORD) {
            result.append("Record");
        }
        else if (mode == Mode.DAO) {
            result.append("Dao");
        }
        else if (mode == Mode.INTERFACE) {
            result.insert(0, "I");
        }

        return result.toString();
    }

    @Override
    public String getJavaMethodName(Definition definition, Mode mode) {
        return convertToCamelCase(definition.getOutputName(), false);
    }

    public static String convertToCamelCase(CharSequence input, boolean upperCaseFirst) {
        StringBuilder cName = new StringBuilder(input);

        boolean upperCaseIt = upperCaseFirst;
        boolean hasLowerCase = false;

        for (int i = 0; i < cName.length();) {
            char chr = cName.charAt(i);

            if (chr == '_' || chr == '.' || chr == '$') {

                cName.deleteCharAt(i);
                upperCaseIt = true;
                hasLowerCase = false;

            } else {

                if (upperCaseIt) {
                    chr = toUpperCase(chr);
                } else if (!(hasLowerCase = hasLowerCase || isLowerCase(chr))) {
                    chr = toLowerCase(chr);
                }
                cName.setCharAt(i++, chr);
                upperCaseIt = false;

            }
        }

        return cName.toString();
    }
}
