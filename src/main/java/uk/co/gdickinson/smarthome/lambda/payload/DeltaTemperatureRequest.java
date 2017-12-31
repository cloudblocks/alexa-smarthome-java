package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

public abstract class DeltaTemperatureRequest<R extends Response> extends Request<R> {
  private String accessToken;
  private Endpoint endpoint;
  private Temperature deltaTemperature;

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  public Temperature getDeltaTemperature() {
    return deltaTemperature;
  }

  public void setDeltaTemperature(Temperature deltaTemperature) {
    this.deltaTemperature = deltaTemperature;
  }
}
