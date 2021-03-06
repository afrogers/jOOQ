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
package org.jooq;

import java.util.Collection;

import org.jooq.impl.DSL;

/**
 * This type is used for the {@link Update}'s DSL API.
 * <p>
 * Example: <code><pre>
 * DSLContext create = DSL.using(configuration);
 *
 * create.update(table)
 *       .set(field1, value1)
 *       .set(field2, value2)
 *       .where(field1.greaterThan(100))
 *       .execute();
 * </pre></code>
 *
 * @author Lukas Eder
 */
public interface UpdateWhereStep<R extends Record> extends UpdateFinalStep<R>, UpdateReturningStep<R> {

    /**
     * Add conditions to the query
     */
    @Support
    UpdateConditionStep<R> where(Condition... conditions);

    /**
     * Add conditions to the query
     */
    @Support
    UpdateConditionStep<R> where(Collection<? extends Condition> conditions);

    /**
     * Add conditions to the query
     */
    @Support
    UpdateConditionStep<R> where(Field<Boolean> condition);

    /**
     * Add conditions to the query
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String)
     */
    @Support
    UpdateConditionStep<R> where(String sql);

    /**
     * Add conditions to the query
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String, Object...)
     */
    @Support
    UpdateConditionStep<R> where(String sql, Object... bindings);

    /**
     * Add conditions to the query
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see DSL#condition(String, QueryPart...)
     */
    @Support
    UpdateConditionStep<R> where(String sql, QueryPart... parts);

    /**
     * Add an EXISTS clause to the query
     */
    @Support
    UpdateConditionStep<R> whereExists(Select<?> select);

    /**
     * Add a NOT EXISTS clause to the query
     */
    @Support
    UpdateConditionStep<R> whereNotExists(Select<?> select);
}
