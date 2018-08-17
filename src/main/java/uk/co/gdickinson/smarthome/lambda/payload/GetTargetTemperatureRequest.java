package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetTargetTemperatureRequest extends Request<GetTargetTemperatureResponse> {

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_TARGET_TEMPERATURE_REQUEST;
  }
}
