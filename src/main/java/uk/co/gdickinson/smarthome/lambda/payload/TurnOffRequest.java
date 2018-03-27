package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class TurnOffRequest extends Request<TurnOffConfirmation> {
  
  @Override
  public MessageName getMessageName() {
    return MessageName.TURN_OFF_REQUEST;
  }
}
