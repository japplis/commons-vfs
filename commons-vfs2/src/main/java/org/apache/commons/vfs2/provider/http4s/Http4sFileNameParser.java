/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.vfs2.provider.http4s;

import org.apache.commons.vfs2.provider.FileNameParser;
import org.apache.commons.vfs2.provider.GenericURLFileNameParser;

/**
 * {@code FileNameParser} implementation for http4s provider, setting default port to 443.
 *
 * @since 2.3
 * @deprecated Use {@link org.apache.commons.vfs2.provider.http5}.
 */
@Deprecated
public class Http4sFileNameParser extends GenericURLFileNameParser {

    private static final int DEFAULT_PORT = 443;

    private static final Http4sFileNameParser INSTANCE = new Http4sFileNameParser();

    /**
     * Gets the singleton instance.
     *
     * @return the singleton instance.
     */
    public static FileNameParser getInstance() {
        return INSTANCE;
    }

    /**
     * Constructs a new instance with the default port 443.
     */
    public Http4sFileNameParser() {
        super(DEFAULT_PORT);
    }
}
