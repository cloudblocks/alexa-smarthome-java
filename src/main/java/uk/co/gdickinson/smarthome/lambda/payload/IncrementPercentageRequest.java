package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementPercentageRequest extends Request<IncrementPercentageConfirmation> {
  private Float deltaPercentage;

  public Float getDeltaPercentage() {
    return deltaPercentage;
  }

  public void setDeltaPercentage(Float deltaPercentage) {
    this.deltaPercentage = deltaPercentage;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.INCREMENT_PERCENTAGE_REQUEST;
  }
}
