package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class TurnOnRequest extends Request<TurnOnConfirmation> {

  @Override
  public MessageName getMessageName() {
    return MessageName.TURN_ON_REQUEST;
  }
}
