/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.api;

import java.util.Arrays;
import java.util.List;

/**
 * Defines the scaling requirements for child containers
 */
public class ChildScalingRequirements {
    private List<String> rootContainerPatterns;

    @Override
    public String toString() {
        return "ChildScalingRequirements{" +
                "rootContainerPatterns=" + rootContainerPatterns +
                '}';
    }

    // Fluent API for configuring the requirements
    //-------------------------------------------------------------------------

    public ChildScalingRequirements rootContainerPatterns(List<String> rootContainerPatterns) {
        setRootContainerPatterns(rootContainerPatterns);
        return this;
    }

    public ChildScalingRequirements rootContainerPatterns(String... rootContainerPatterns) {
        return rootContainerPatterns(Arrays.asList(rootContainerPatterns));
    }


    // Properties
    //-------------------------------------------------------------------------

    /**
     * Returns a list of patterns to match root container ids to be used for creating child containers
     */
    public List<String> getRootContainerPatterns() {
        return rootContainerPatterns;
    }

    public void setRootContainerPatterns(List<String> rootContainerPatterns) {
        this.rootContainerPatterns = rootContainerPatterns;
    }
}
