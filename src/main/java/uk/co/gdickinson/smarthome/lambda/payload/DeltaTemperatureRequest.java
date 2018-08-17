package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Temperature;

public abstract class DeltaTemperatureRequest<R extends Response> extends Request<R> {
  private Temperature deltaTemperature;

  public Temperature getDeltaTemperature() {
    return deltaTemperature;
  }

  public void setDeltaTemperature(Temperature deltaTemperature) {
    this.deltaTemperature = deltaTemperature;
  }
}
