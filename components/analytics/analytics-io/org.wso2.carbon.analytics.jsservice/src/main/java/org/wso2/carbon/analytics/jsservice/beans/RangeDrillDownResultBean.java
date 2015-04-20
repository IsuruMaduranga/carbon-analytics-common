/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.analytics.jsservice.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the the drilldown result when we give numeric ranges as categories/facets
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RangeDrillDownResultBean {
    @XmlElement(name = "drillDownResult")
    private List<PerFieldRangeDrillDownResultBean> perFieldResults;

    public List<PerFieldRangeDrillDownResultBean> getPerFieldResults() {
        return perFieldResults;
    }

    public void setPerFieldResults(List<PerFieldRangeDrillDownResultBean> perFieldResults) {
        this.perFieldResults = perFieldResults;
    }

    public void setPerFieldResults(PerFieldRangeDrillDownResultBean bean) {
        if (perFieldResults == null) {
            perFieldResults = new ArrayList<>(0);
        }
        perFieldResults.add(bean);
    }
}
