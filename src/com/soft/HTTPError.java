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
}
