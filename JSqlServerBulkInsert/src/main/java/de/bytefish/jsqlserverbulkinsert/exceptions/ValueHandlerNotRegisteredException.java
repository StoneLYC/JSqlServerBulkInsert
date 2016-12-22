// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.jsqlserverbulkinsert.exceptions;

public class ValueHandlerNotRegisteredException extends RuntimeException {

    public ValueHandlerNotRegisteredException(String message) {
        super(message);
    }

    public ValueHandlerNotRegisteredException() {
    }

    public ValueHandlerNotRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueHandlerNotRegisteredException(Throwable cause) {
        super(cause);
    }

    public ValueHandlerNotRegisteredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
