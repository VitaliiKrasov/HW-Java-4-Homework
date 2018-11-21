package com.soft;

public enum HTTPError {
    HTTPError400 ("Bad Request"),
    HTTPError401 ("Unauthorized"),
    HTTPError402 ("Payment Required"),
    HTTPError403 ("Forbidden"),
    HTTPError404 ("Not Found"),
    HTTPError405 ("Method Not Allowed"),
    HTTPError406 ("Not Acceptable"),
    HTTPError407 ("Proxy Authentication Required"),
    HTTPError408 ("Request Timeout"),
    HTTPError409 ("Conflict"),
    HTTPError410 ("Gone"),
    HTTPError411 ("Length Required"),
    HTTPError412 ("Precondition Failed"),
    HTTPError413 ("Payload Too Large"),
    HTTPError414 ("Request-URI Too Long"),
    HTTPError415 ("Unsupported Media Type"),
    HTTPError416 ("Requested Range Not Satisfiable"),
    HTTPError417 ("Expectation Failed"),
    HTTPError418 ("I'm a teapot"),
    HTTPError421 ("Misdirected Request"),
    HTTPError422 ("Unprocessable Entity"),
    HTTPError423 ("Locked"),
    HTTPError424 ("Failed Dependency"),
    HTTPError426 ("Upgrade Required"),
    HTTPError428 ("Precondition Required"),
    HTTPError429 ("Too Many Requests"),
    HTTPError431 ("Request Header Fields Too Large"),
    HTTPError444 ("Connection Closed Without Response"),
    HTTPError451 ("Unavailable For Legal Reasons"),
    HTTPError499 ("Client Closed Request"),
    HTTPError500 ("Internal Server Error"),
    HTTPError501 ("Not Implemented"),
    HTTPError502 ("Bad Gateway"),
    HTTPError503 ("Service Unavailable"),
    HTTPError504 ("Gateway Timeout"),
    HTTPError505 ("HTTP Version Not Supported"),
    HTTPError506 ("Variant Also Negotiates"),
    HTTPError507 ("Insufficient Storage"),
    HTTPError508 ("Loop Detected"),
    HTTPError510 ("Not Extended"),
    HTTPError511 ("Network Authentication Required"),
    HTTPError599 ("Network Connect Timeout Error");

    private final String status;

    HTTPError(String s) {
        this.status = s;
    };

    public String getStatus() {
        return status;
    }

//    private static String value;
//
//    public static HTTPError of(int code) {
//        switch (code) {
//            case 400: return HTTPError.BAD_REQUEST;
//            case 401: return HTTPError.UNAUTHORIZED;
//            case 402: return HTTPError.PAYMENT_REQUIRED;
//            case 403: return HTTPError.FORBIDDEN;
//            case 404: return HTTPError.NOT_FOUND;
//            case 405: return HTTPError.METHOD_NOT_ALLOWED;
//            case 406: return HTTPError.NOT_ACCEPTABLE;
//            case 407: return HTTPError.PROXY_AUTHENTICATION_REQUIRED;
//            case 408: return HTTPError.REQUEST_TIMEOUT;
//            case 409: return HTTPError.CONFLICT;
//            case 410: return HTTPError.GONE;
//            case 411: return HTTPError.LENGTH_REQUIRED;
//            case 412: return HTTPError.PRECONDITION_FAILED;
//            case 413: return HTTPError.PAYLOAD_TOO_LARGE;
//            case 414: return HTTPError.REQUEST_URI_TOO_LONG;
//            case 415: return HTTPError.UNSUPPORTED_MEDIA_TYPE;
//            case 416: return HTTPError.REQUESTED_RANGE_NOT_SATISFIABLE;
//            case 417: return HTTPError.EXPECTATION_FAILED;
//            case 418: return HTTPError.I_AM_A_TEAPOT;
//            case 421: return HTTPError.MISDIRECTED_REQUEST;
//            case 422: return HTTPError.UNPROCESSABLE_ENTITY;
//            case 423: return HTTPError.LOCKED;
//            case 424: return HTTPError.FAILED_DEPENDENCY;
//            case 426: return HTTPError.UPGRADE_REQUIRED;
//            case 428: return HTTPError.PRECONDITION_REQUIRED;
//            case 429: return HTTPError.TOO_MANY_REQUESTS;
//            case 431: return HTTPError.REQUEST_HEADER_FIELDS_TOO_LARGE;
//            case 444: return HTTPError.CONNECTION_CLOSED_WITHOUT_RESPONSE;
//            case 451: return HTTPError.UNAVAILABLE_FOR_LEGAL_REASONS;
//            case 499: return HTTPError.CLIENT_CLOSED_REQUEST;
//            case 500: return HTTPError.INTERNAL_SERVER_ERROR;
//            case 501: return HTTPError.NOT_IMPLEMENTED;
//            case 502: return HTTPError.BAD_GATEWAY;
//            case 503: return HTTPError.SERVICE_UNAVAILABLE;
//            case 504: return HTTPError.GATEWAY_TIMEOUT;
//            case 505: return HTTPError.HTTP_VERSION_NOT_SUPPORTED;
//            case 506: return HTTPError.VARIANT_ALSO_NEGOTIATES;
//            case 507: return HTTPError.INSUFFICIENT_STORAGE;
//            case 508: return HTTPError.LOOP_DETECTED;
//            case 510: return HTTPError.NOT_EXTENDED;
//            case 511: return HTTPError.NETWORK_AUTHENTICATION_REQUIRED;
//            case 599: return HTTPError.NETWORK_CONNECT_TIMEOUT_ERROR;
//            default: return HTTPError.ERROR_CODE_NOT_EXIST;
//        }
//    }

}
