package uk.co.gdickinson.smarthome.lambda.codec;

import uk.co.gdickinson.smarthome.lambda.models.Context;
import uk.co.gdickinson.smarthome.lambda.payload.Event;

public class SmartHomeDirectiveResponse {
    private Event event;
    
    private Context context;
      
    public Event getEvent() {
      return event;
    }
    
    public void setEvent(Event event) {
      this.event = event;
    }

    
    public Context getContext() {
      return context;
    }
    
    public void setContext(Context context) {
      this.context = context;
    }

}
