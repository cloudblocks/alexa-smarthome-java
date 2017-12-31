package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetTargetTemperatureRequest extends Request<GetTargetTemperatureResponse> {
  private Endpoint endpoint;

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_TARGET_TEMPERATURE_REQUEST;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }
}
