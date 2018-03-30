package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.Gson;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.payload.Request;
import uk.co.gdickinson.smarthome.lambda.payload.Response;

public class PayloadDeserializer {
  private static Gson gson = new Gson();

  public static <T extends Request<R>, R extends Response> T deserializePayload(SmartHomeDirectiveRequest request) {
    Request req =  gson.fromJson(gson.toJson(request.getDirective().getPayload()), request.getDirective().getHeader().getName().getDeserializationType());
    // Deserialize endpoint for, but not limited to, obtaining the access token.
    req.setEndpoint(gson.fromJson(gson.toJson(request.getDirective().getEndpoint()), Endpoint.class));
    
    return (T) req;
  }
}
