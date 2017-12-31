package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum DisplayCategories {
  @SerializedName("DOOR")
  DOOR,

  @SerializedName("CAMERA")
  CAMERA,

  @SerializedName("LIGHT")
  LIGHT,

  @SerializedName("SMARTLOCK")
  SMARTLOCK,

  @SerializedName("SMARTPLUG")
  SMARTPLUG,

  @SerializedName("SPEAKER")
  SPEAKER,

  @SerializedName("SWITCH")
  SWITCH,

  @SerializedName("TEMPERATURE_SENSOR")
  TEMPERATURE_SENSOR,

  @SerializedName("THERMOSTAT")
  THERMOSTAT,

  @SerializedName("TV")
  TV,

  @SerializedName("ACTIVITY_TRIGGER")
  ACTIVITY_TRIGGER,

  @SerializedName("SCENE_TRIGGER")
  SCENE_TRIGGER,

  @SerializedName("OTHER")
  OTHER
}
