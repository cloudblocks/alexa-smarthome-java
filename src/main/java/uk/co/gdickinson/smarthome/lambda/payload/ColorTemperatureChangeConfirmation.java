package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.AchievedState;

abstract class ColorTemperatureChangeConfirmation implements Response {
  private AchievedState achievedState;
  
  public AchievedState getAchievedState() {
    return achievedState;
  }

  public void setAchievedState(AchievedState achievedState) {
    this.achievedState = achievedState;
  }

}
