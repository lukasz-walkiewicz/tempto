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

package io.prestosql.tempto.internal.fulfillment.resources;

import com.google.common.collect.ImmutableSet;
import io.prestosql.tempto.Requirement;
import io.prestosql.tempto.context.State;
import io.prestosql.tempto.fulfillment.RequirementFulfiller;
import io.prestosql.tempto.fulfillment.TestStatus;

import java.util.Set;

@RequirementFulfiller.SuiteLevelFulfiller
public class SuiteResourceFulfiller
        implements RequirementFulfiller
{
    private final SuiteResourcesState resourcesState = new SuiteResourcesState();

    @Override
    public Set<State> fulfill(Set<Requirement> requirements)
    {
        return ImmutableSet.of(resourcesState);
    }

    @Override
    public void cleanup(TestStatus status)
    {
        resourcesState.close();
    }
}
