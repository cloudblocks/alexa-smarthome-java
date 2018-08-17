package uk.co.gdickinson.smarthome.lambda.payload;

import java.util.Optional;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public interface Payload {
  MessageName getMessageName();
  
  public default Optional<Endpoint> getEndpoint() {
      return Optional.empty();
  }
  
  public default void setEndpoint(Endpoint fromJson) {
      return;
  }
}
