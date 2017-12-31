package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetPercentageRequest extends Request<SetPercentageConfirmation> {
  private Endpoint endpoint;
  private Float percentageState;

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  public Float getPercentageState() {
    return percentageState;
  }

  public void setPercentageState(Float percentageState) {
    this.percentageState = percentageState;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.SET_PERCENTAGE_REQUEST;
  }
}
