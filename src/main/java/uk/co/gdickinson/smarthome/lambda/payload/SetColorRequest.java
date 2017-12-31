package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.Color;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetColorRequest extends Request<SetColorConfirmation> {
  private Color color;
  private Endpoint endpoint;

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_COLOR_REQUEST;
  }
}
