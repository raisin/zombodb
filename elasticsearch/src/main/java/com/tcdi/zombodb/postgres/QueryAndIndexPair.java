/*
 * Copyright 2013-2015 Technology Concepts & Design, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tcdi.zombodb.postgres;

import com.tcdi.zombodb.query_parser.ASTLimit;
import org.elasticsearch.index.query.QueryBuilder;

class QueryAndIndexPair {
    private final QueryBuilder query;
    private final String indexName;
    private final ASTLimit limit;

    public QueryAndIndexPair(QueryBuilder query, String indexName, ASTLimit limit) {
        this.query = query;
        this.indexName = indexName;
        this.limit = limit;
    }

    public QueryBuilder getQueryBuilder() {
        return query;
    }

    public String getIndexName() {
        return indexName;
    }

    public boolean hasLimit() {
        return limit != null;
    }

    public ASTLimit getLimit() {
        return limit;
    }
}
