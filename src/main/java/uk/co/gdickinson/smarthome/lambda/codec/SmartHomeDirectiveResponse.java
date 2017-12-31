package uk.co.gdickinson.smarthome.lambda.codec;

import uk.co.gdickinson.smarthome.lambda.payload.Event;
import uk.co.gdickinson.smarthome.lambda.payload.Header;
import uk.co.gdickinson.smarthome.lambda.payload.Payload;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeDirectiveResponse {
  private Event event;
  private Map<String, Object> additionalProperties = new HashMap<>();

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}
