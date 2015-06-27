/*
 * Copyright 2012-2015 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.couchbase.core;


import com.couchbase.client.java.Bucket;

import org.springframework.data.couchbase.core.convert.CouchbaseConverter;

/**
 * Defines common operations on the Couchbase data source, most commonly implemented by {@link CouchbaseTemplate}.
 *
 * @author Michael Nitschinger
 * @author Simon Baslé
 */
public interface CouchbaseOperations {

	/**
	 * Returns the linked {@link Bucket} to this template.
	 *
	 * @return the client used for the template.
	 */
	Bucket getCouchbaseBucket();

	/**
	 * Returns the underlying {@link CouchbaseConverter}.
	 *
	 * @return CouchbaseConverter.
	 */
	CouchbaseConverter getConverter();

}
