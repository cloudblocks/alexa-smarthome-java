package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

/**
 * Request to decrease the numerical setting of the specified device by the specified percentage.

 */
public class DecrementPercentageRequest extends Request<DecrementPercentageConfirmation> {
  private Endpoint endpoint;
  private Float deltaPercentage;

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

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
