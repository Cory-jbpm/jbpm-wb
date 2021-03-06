/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.workbench.es.client.perspectives;

import javax.enterprise.context.ApplicationScoped;

import org.jbpm.workbench.common.client.perspectives.AbstractPerspective;
import org.uberfire.client.annotations.WorkbenchPerspective;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.DefaultPlaceRequest;

import static org.jbpm.workbench.common.client.PerspectiveIds.*;
/**
 * A Perspective to show Execution Errors
 */
@ApplicationScoped
@WorkbenchPerspective(identifier = EXECUTION_ERRORS)
public class ErrorManagementPerspective extends AbstractPerspective {

    @Override
    public PlaceRequest getPlaceRequest() {
        return new DefaultPlaceRequest(EXECUTION_ERROR_LIST_SCREEN);
    }

    @Override
    public String getPerspectiveId() {
        return EXECUTION_ERRORS;
    }

    @Override
    public String getBasicFiltersScreenId() {
        return EXECUTION_ERROR_LIST_BASIC_FILTERS_SCREEN;
    }

    @Override
    public String getAdvancedFiltersScreenId() {
        return EXECUTION_ERROR_LIST_ADVANCED_FILTERS_SCREEN;
    }

    @Override
    public String getSavedFiltersScreenId() {
        return EXECUTION_ERROR_LIST_SAVED_FILTERS_SCREEN;
    }

    @Override
    public String getDetailsScreenId() {
        return EXECUTION_ERROR_DETAILS_SCREEN;
    }
}
