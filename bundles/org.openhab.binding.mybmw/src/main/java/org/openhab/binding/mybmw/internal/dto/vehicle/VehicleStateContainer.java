/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.mybmw.internal.dto.vehicle;

/**
 * 
 * derived from the API responses
 * 
 * @author Martin Grassl - initial contribution
 */
public class VehicleStateContainer {
    private VehicleState state = new VehicleState();
    private VehicleCapabilities capabilities = new VehicleCapabilities();

    private String rawStateJson = "";

    public VehicleState getState() {
        return state;
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    public VehicleCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(VehicleCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public String toString() {
        return "VehicleState [state=" + state + ", capabilities=" + capabilities + "]";
    }

    public String getRawStateJson() {
        return rawStateJson;
    }

    public void setRawStateJson(String rawStateJson) {
        this.rawStateJson = rawStateJson;
    }
}
