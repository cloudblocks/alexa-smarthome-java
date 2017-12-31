package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

public class SetTargetTemperatureRequest extends Request<SetTargetTemperatureConfirmation> {
  private Endpoint endpoint;
  private Temperature targetTemperature;

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_TARGET_TEMPERATURE_REQUEST;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  public Temperature getTargetTemperature() {
    return targetTemperature;
  }

  public void setTargetTemperature(Temperature targetTemperature) {
    this.targetTemperature = targetTemperature;
  }
}
