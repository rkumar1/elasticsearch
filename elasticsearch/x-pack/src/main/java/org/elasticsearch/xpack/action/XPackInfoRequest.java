/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.action;

import org.elasticsearch.action.ActionRequest;
import org.elasticsearch.action.ActionRequestValidationException;

/**
 *
 */
public class XPackInfoRequest extends ActionRequest<XPackInfoRequest> {

    public XPackInfoRequest() {}

    @Override
    public ActionRequestValidationException validate() {
        return null;
    }
}
