package uk.co.gdickinson.smarthome.lambda.codec;

import java.util.HashMap;
import java.util.Map;

import uk.co.gdickinson.smarthome.lambda.models.Context;
import uk.co.gdickinson.smarthome.lambda.payload.Event;

public class SmartHomeDirectiveResponse {
    private Event event;
    
    private Context context;
      
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
    
    public Context getContext() {
      return context;
    }
    
    public void setContext(Context context) {
      this.context = context;
    }

}
