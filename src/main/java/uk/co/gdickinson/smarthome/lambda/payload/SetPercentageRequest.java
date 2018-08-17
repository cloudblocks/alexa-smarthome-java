package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetPercentageRequest extends Request<SetPercentageConfirmation> {
  private Float percentageState;


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
