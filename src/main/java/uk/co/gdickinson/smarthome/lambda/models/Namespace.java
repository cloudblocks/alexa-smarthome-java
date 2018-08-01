package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum Namespace {
  @SerializedName("Alexa.Discovery")
  DISCOVERY("Alexa.Discovery"),
  
  @SerializedName("Alexa.Authorization")
  AUTHORIZATION("Alexa.Authorization"),

  @SerializedName("Alexa.PowerController")
  CONTROL("Alexa.ConnectedHome.Control"),
  
  @SerializedName("Alexa")
  ALEXA("Alexa"),
  
  @SerializedName("Alexa.TemperatureSensor")
  TEMPERATURE_SENSOR("Alexa.TemperatureSensor"),
  
  @SerializedName("Alexa.ThermostatController")
  THERMOSTAT_CONTROLLER("Alexa.ThermostatController"),

  @SerializedName("Alexa.ConnectedHome.Query")
  QUERY("Alexa.ConnectedHome.Query");
  
  private String stringValue;

  Namespace(String stringValue) {
    this.stringValue = stringValue;
  }

  @Override
  public String toString() {
    return this.stringValue;
  }
}
