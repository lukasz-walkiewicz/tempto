/*
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
package io.prestosql.tempto.threads;

/**
 * An interface of a runnable that has an index and can throw checked exceptions.
 */
@FunctionalInterface
public interface IndexedRunnable
{
    /**
     * @param threadIndex an index of thread that executes this {@link IndexedRunnable}.
     * @throws Exception if something goes wrong
     */
    void run(int threadIndex)
            throws Exception;
}
