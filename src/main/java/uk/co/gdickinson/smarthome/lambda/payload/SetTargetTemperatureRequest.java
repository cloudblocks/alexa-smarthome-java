package uk.co.gdickinson.smarthome.lambda.payload;

import java.util.Optional;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

public class SetTargetTemperatureRequest extends Request<SetTargetTemperatureConfirmation> {
  private Temperature targetSetpoint;
  private Endpoint endpoint;

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_TARGET_TEMPERATURE_REQUEST;
  }

  public Temperature getTargetSetpoint() {
    return targetSetpoint;
  }

  public void setTargetSetpoint(Temperature targetTemperature) {
    this.targetSetpoint = targetTemperature;
  }
  
  public Optional<Endpoint> getEndpoint() {
      return Optional.ofNullable(endpoint);
  }

  public void setEndpoint(Endpoint endpoint) {
      this.endpoint = endpoint;
  }

@Override
public String toString() {
    return "SetTargetTemperatureRequest [targetSetpoint=" + targetSetpoint + ", endpoint=" + endpoint + "]";
}
  
  
  
}
