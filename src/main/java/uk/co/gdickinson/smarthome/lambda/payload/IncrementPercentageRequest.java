package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class IncrementPercentageRequest extends Request<IncrementPercentageConfirmation> {
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
    return MessageName.INCREMENT_PERCENTAGE_REQUEST;
  }
}
