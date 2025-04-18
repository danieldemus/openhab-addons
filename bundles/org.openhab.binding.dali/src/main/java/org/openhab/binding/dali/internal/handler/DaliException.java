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
package org.openhab.binding.dali.internal.handler;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link DaliException} signals exceptions within the DALI binding
 *
 * @author Robert Schmid - Initial contribution
 */
@NonNullByDefault
public class DaliException extends Exception {

    private static final long serialVersionUID = 1L;

    public DaliException() {
        super();
    }

    public DaliException(String message) {
        super(message);
    }

    public DaliException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaliException(Throwable cause) {
        super(cause);
    }
}
