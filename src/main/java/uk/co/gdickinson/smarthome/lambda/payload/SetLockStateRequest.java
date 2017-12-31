package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.LockState;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetLockStateRequest extends Request<SetLockStateConfirmation> {
  private Endpoint endpoint;
  private LockState lockState;

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  public LockState getLockState() {
    return lockState;
  }

  public void setLockState(LockState lockState) {
    this.lockState = lockState;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_LOCK_STATE_REQUEST;
  }
}
