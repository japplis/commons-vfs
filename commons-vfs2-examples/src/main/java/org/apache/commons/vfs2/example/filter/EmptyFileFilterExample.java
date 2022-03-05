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
package org.apache.commons.vfs2.example.filter;

import java.io.File;

import org.apache.commons.vfs2.FileFilterSelector;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;
import org.apache.commons.vfs2.filter.EmptyFileFilter;

/**
 * Example for using {@link EmptyFileFilter}.
 */
// CHECKSTYLE:OFF Example code
public final class EmptyFileFilterExample {
    private EmptyFileFilterExample() {
        /* main class not instantiated. */
    }

    /**
     * Invokes this example from the command line.
     *
     * @param args Arguments TODO
     * @throws Exception If anything goes wrong.
     */
    public static void main(final String[] args) throws Exception {

        final FileSystemManager fsManager = VFS.getManager();
        final FileObject dir = fsManager.toFileObject(new File("."));

        // Example, showing how to print out a list of the current directory's
        // empty files/directories
        System.out.println("---EMPTY---");
        for (final FileObject file : dir.findFiles(new FileFilterSelector(EmptyFileFilter.EMPTY))) {
            System.out.println(file);
        }

        // Example, showing how to print out a list of the current directory's
        // non-empty files/directories
        System.out.println("---NOT_EMPTY---");
        for (final FileObject file : dir.findFiles(new FileFilterSelector(EmptyFileFilter.NOT_EMPTY))) {
            System.out.println(file);
        }

    }

}
// CHECKSTYLE:ON
