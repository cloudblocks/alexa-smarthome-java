package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import uk.co.gdickinson.smarthome.lambda.payload.Directive;
import uk.co.gdickinson.smarthome.lambda.payload.Header;

import java.lang.reflect.Type;

public class SmartHomeDirectiveDeserializer implements JsonDeserializer<SmartHomeDirectiveRequest> {

  public SmartHomeDirectiveRequest deserialize(
    JsonElement jsonElement,
    Type type,
    JsonDeserializationContext jsonDeserializationContext
  ) throws JsonParseException {

    Directive directive = jsonDeserializationContext
            .deserialize(jsonElement.getAsJsonObject().get("directive"), Directive.class);

    Header header = jsonDeserializationContext
      .deserialize(jsonElement.getAsJsonObject().getAsJsonObject("directive").get("header"), Header.class);


    SmartHomeDirectiveRequest request = new SmartHomeDirectiveRequest();
    request.setDirective(directive);
    request.getDirective().setHeader(header);

    request.getDirective().setPayload(jsonElement.getAsJsonObject().getAsJsonObject("directive").get("payload"));
    return request;
  }
}
