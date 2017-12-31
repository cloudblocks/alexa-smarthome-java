package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetLockStateRequest extends Request<GetLockStateResponse> {
  private Endpoint endpoint;

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.GET_LOCK_STATE_REQUEST;
  }
}
