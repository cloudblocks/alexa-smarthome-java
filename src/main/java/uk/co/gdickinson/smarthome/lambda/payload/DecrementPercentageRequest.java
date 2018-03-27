package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

/**
 * Request to decrease the numerical setting of the specified device by the specified percentage.

 */
public class DecrementPercentageRequest extends Request<DecrementPercentageConfirmation> {
  private Float deltaPercentage;

  public Float getDeltaPercentage() {
    return deltaPercentage;
  }

  public void setDeltaPercentage(Float deltaPercentage) {
    this.deltaPercentage = deltaPercentage;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.DECREMENT_PERCENTAGE_REQUEST;
  }
}
