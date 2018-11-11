package com.soft;

public enum HTTPError {
    BAD_REQUEST (400),
    UNAUTHORIZED (401),
    PAYMENT_REQUIRED (402),
    FORBIDDEN (403),
    NOT_FOUND (404),
    METHOD_NOT_ALLOWED (405),
    NOT_ACCEPTABLE (406),
    PROXY_AUTHENTICATION_REQUIRED (407),
    REQUEST_TIMEOUT (408),
    CONFLICT (409),
    GONE (410),
    LENGTH_REQUIRED (411),
    PRECONDITION_FAILED (412),
    PAYLOAD_TOO_LARGE (413),
    REQUEST_URI_TOO_LONG (414),
    UNSUPPORTED_MEDIA_TYPE (415),
    REQUESTED_RANGE_NOT_SATISFIABLE (416),
    EXPECTATION_FAILED (417),
    I_AM_A_TEAPOT (418),
    MISDIRECTED_REQUEST (421),
    UNPROCESSABLE_ENTITY (422),
    LOCKED (423),
    FAILED_DEPENDENCY (424),
    UPGRADE_REQUIRED (426),
    PRECONDITION_REQUIRED (428),
    TOO_MANY_REQUESTS (429),
    REQUEST_HEADER_FIELDS_TOO_LARGE (431),
    CONNECTION_CLOSED_WITHOUT_RESPONSE (444),
    UNAVAILABLE_FOR_LEGAL_REASONS (451),
    CLIENT_CLOSED_REQUEST (499),
    INTERNAL_SERVER_ERROR (500),
    NOT_IMPLEMENTED (501),
    BAD_GATEWAY (502),
    SERVICE_UNAVAILABLE (503),
    GATEWAY_TIMEOUT (504),
    HTTP_VERSION_NOT_SUPPORTED (505),
    VARIANT_ALSO_NEGOTIATES (506),
    INSUFFICIENT_STORAGE (507),
    LOOP_DETECTED (508),
    NOT_EXTENDED (510),
    NETWORK_AUTHENTICATION_REQUIRED (511),
    NETWORK_CONNECT_TIMEOUT_ERROR (599),
    ERROR_CODE_NOT_EXIST (-1);

    final int code;

    HTTPError(int code) {
        this.code = code;
    }

    public static HTTPError of(int code) {
        switch (code) {
            case 400: return HTTPError.BAD_REQUEST;
            case 401: return HTTPError.UNAUTHORIZED;
            case 402: return HTTPError.PAYMENT_REQUIRED;
            case 403: return HTTPError.FORBIDDEN;
            case 404: return HTTPError.NOT_FOUND;
            case 405: return HTTPError.METHOD_NOT_ALLOWED;
            case 406: return HTTPError.NOT_ACCEPTABLE;
            case 407: return HTTPError.PROXY_AUTHENTICATION_REQUIRED;
            case 408: return HTTPError.REQUEST_TIMEOUT;
            case 409: return HTTPError.CONFLICT;
            case 410: return HTTPError.GONE;
            case 411: return HTTPError.LENGTH_REQUIRED;
            case 412: return HTTPError.PRECONDITION_FAILED;
            case 413: return HTTPError.PAYLOAD_TOO_LARGE;
            case 414: return HTTPError.REQUEST_URI_TOO_LONG;
            case 415: return HTTPError.UNSUPPORTED_MEDIA_TYPE;
            case 416: return HTTPError.REQUESTED_RANGE_NOT_SATISFIABLE;
            case 417: return HTTPError.EXPECTATION_FAILED;
            case 418: return HTTPError.I_AM_A_TEAPOT;
            case 421: return HTTPError.MISDIRECTED_REQUEST;
            case 422: return HTTPError.UNPROCESSABLE_ENTITY;
            case 423: return HTTPError.LOCKED;
            case 424: return HTTPError.FAILED_DEPENDENCY;
            case 426: return HTTPError.UPGRADE_REQUIRED;
            case 428: return HTTPError.PRECONDITION_REQUIRED;
            case 429: return HTTPError.TOO_MANY_REQUESTS;
            case 431: return HTTPError.REQUEST_HEADER_FIELDS_TOO_LARGE;
            case 444: return HTTPError.CONNECTION_CLOSED_WITHOUT_RESPONSE;
            case 451: return HTTPError.UNAVAILABLE_FOR_LEGAL_REASONS;
            case 499: return HTTPError.CLIENT_CLOSED_REQUEST;
            case 500: return HTTPError.INTERNAL_SERVER_ERROR;
            case 501: return HTTPError.NOT_IMPLEMENTED;
            case 502: return HTTPError.BAD_GATEWAY;
            case 503: return HTTPError.SERVICE_UNAVAILABLE;
            case 504: return HTTPError.GATEWAY_TIMEOUT;
            case 505: return HTTPError.HTTP_VERSION_NOT_SUPPORTED;
            case 506: return HTTPError.VARIANT_ALSO_NEGOTIATES;
            case 507: return HTTPError.INSUFFICIENT_STORAGE;
            case 508: return HTTPError.LOOP_DETECTED;
            case 510: return HTTPError.NOT_EXTENDED;
            case 511: return HTTPError.NETWORK_AUTHENTICATION_REQUIRED;
            case 599: return HTTPError.NETWORK_CONNECT_TIMEOUT_ERROR;
            default: return HTTPError.ERROR_CODE_NOT_EXIST;
        }
    }

}
