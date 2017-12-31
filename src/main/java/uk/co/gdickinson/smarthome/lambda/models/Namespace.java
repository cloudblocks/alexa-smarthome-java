package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum Namespace {
  @SerializedName("Alexa.Discovery")
  DISCOVERY("Alexa.Discovery"),

  @SerializedName("Alexa.ConnectedHome.Control")
  CONTROL("Alexa.ConnectedHome.Control"),

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
