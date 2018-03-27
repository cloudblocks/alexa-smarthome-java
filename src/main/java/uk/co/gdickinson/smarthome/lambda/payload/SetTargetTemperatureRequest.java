package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

public class SetTargetTemperatureRequest extends Request<SetTargetTemperatureConfirmation> {
  private Temperature targetTemperature;

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_TARGET_TEMPERATURE_REQUEST;
  }

  public Temperature getTargetTemperature() {
    return targetTemperature;
  }

  public void setTargetTemperature(Temperature targetTemperature) {
    this.targetTemperature = targetTemperature;
  }
}
