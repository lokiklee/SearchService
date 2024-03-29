package integration.ninjas;

import java.util.Map;

public class Response {

  private int statusCode; // http status code

  private Map<String, String> headers; // headers

  private String body; // body - what you want to return to client

  public Response(int statusCode, Map<String, String> headers, String body) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.body = body;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public String getBody() {
    return body;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public void setBody(String body) {
    this.body = body;
  }

}