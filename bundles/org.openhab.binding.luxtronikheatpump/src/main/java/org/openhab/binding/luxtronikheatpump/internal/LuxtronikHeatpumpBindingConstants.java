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
package org.openhab.binding.luxtronikheatpump.internal;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link LuxtronikHeatpumpBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Stefan Giehl - Initial contribution
 */
@NonNullByDefault
public class LuxtronikHeatpumpBindingConstants {

    public static final String BINDING_ID = "luxtronikheatpump";

    public static final ThingTypeUID THING_TYPE_HEATPUMP = new ThingTypeUID(BINDING_ID, "heatpump");

    public static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Set.of(THING_TYPE_HEATPUMP);
}
