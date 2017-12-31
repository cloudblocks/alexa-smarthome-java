package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.AchievedState;
import uk.co.gdickinson.smarthome.lambda.models.Endpoint;

abstract class ColorTemperatureChangeConfirmation implements Response {
  private AchievedState achievedState;
  private Endpoint endpoint;

  public AchievedState getAchievedState() {
    return achievedState;
  }

  public void setAchievedState(AchievedState achievedState) {
    this.achievedState = achievedState;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }
}
