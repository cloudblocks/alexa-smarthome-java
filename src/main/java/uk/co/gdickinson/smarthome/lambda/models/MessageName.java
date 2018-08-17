package uk.co.gdickinson.smarthome.lambda.models;

import java.lang.reflect.Type;

import com.google.gson.annotations.SerializedName;

import uk.co.gdickinson.smarthome.lambda.payload.AcceptGrantRequest;
import uk.co.gdickinson.smarthome.lambda.payload.AcceptGrantResponse;
import uk.co.gdickinson.smarthome.lambda.payload.DecrementColorTemperatureConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.DecrementColorTemperatureRequest;
import uk.co.gdickinson.smarthome.lambda.payload.DecrementPercentageConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.DecrementPercentageRequest;
import uk.co.gdickinson.smarthome.lambda.payload.DecrementTargetTemperatureConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.DecrementTargetTemperatureRequest;
import uk.co.gdickinson.smarthome.lambda.payload.DiscoverAppliancesRequest;
import uk.co.gdickinson.smarthome.lambda.payload.DiscoverAppliancesResponse;
import uk.co.gdickinson.smarthome.lambda.payload.ErrorResponse;
import uk.co.gdickinson.smarthome.lambda.payload.GetLockStateRequest;
import uk.co.gdickinson.smarthome.lambda.payload.GetLockStateResponse;
import uk.co.gdickinson.smarthome.lambda.payload.GetTargetTemperatureRequest;
import uk.co.gdickinson.smarthome.lambda.payload.GetTargetTemperatureResponse;
import uk.co.gdickinson.smarthome.lambda.payload.GetTemperatureReadingRequest;
import uk.co.gdickinson.smarthome.lambda.payload.GetTemperatureReadingResponse;
import uk.co.gdickinson.smarthome.lambda.payload.IncrementColorTemperatureConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.IncrementColorTemperatureRequest;
import uk.co.gdickinson.smarthome.lambda.payload.IncrementPercentageConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.IncrementPercentageRequest;
import uk.co.gdickinson.smarthome.lambda.payload.IncrementTargetTemperatureConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.IncrementTargetTemperatureRequest;
import uk.co.gdickinson.smarthome.lambda.payload.ReportStateRequest;
import uk.co.gdickinson.smarthome.lambda.payload.ReportStateResponse;
import uk.co.gdickinson.smarthome.lambda.payload.RetrieveCameraStreamUriRequest;
import uk.co.gdickinson.smarthome.lambda.payload.RetrieveCameraStreamUriResponse;
import uk.co.gdickinson.smarthome.lambda.payload.SetColorConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.SetColorRequest;
import uk.co.gdickinson.smarthome.lambda.payload.SetColorTemperatureConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.SetColorTemperatureRequest;
import uk.co.gdickinson.smarthome.lambda.payload.SetLockStateConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.SetLockStateRequest;
import uk.co.gdickinson.smarthome.lambda.payload.SetPercentageConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.SetPercentageRequest;
import uk.co.gdickinson.smarthome.lambda.payload.SetTargetTemperatureConfirmation;
import uk.co.gdickinson.smarthome.lambda.payload.SetTargetTemperatureRequest;

public enum MessageName {  

  @SerializedName("DecrementTargetTemperatureRequest")
  DECREMENT_TARGET_TEMPERATURE_REQUEST(DecrementTargetTemperatureRequest.class),

  @SerializedName("DecrementTargetTemperatureConfirmation")
  DECREMENT_TARGET_TEMPERATURE_CONFIRMATION(DecrementTargetTemperatureConfirmation.class),

  @SerializedName("Discover")
  DISCOVER_APPLIANCES_REQUEST(DiscoverAppliancesRequest.class),
  
  @SerializedName("AcceptGrant")
  ACCEPT_GRANT_REQUEST(AcceptGrantRequest.class),
  
  @SerializedName("AcceptGrant.Response")
  ACCEPT_GRANT_RESPONSE(AcceptGrantResponse.class),

  @SerializedName("Discover.Response")
  DISCOVER_APPLIANCES_RESPONSE(DiscoverAppliancesResponse.class),
  
  @SerializedName("Response")
  RESPONSE(Object.class),

  @SerializedName("DecrementColorTemperatureRequest")
  DECREMENT_COLOR_TEMPERATURE_REQUEST(DecrementColorTemperatureRequest.class),

  @SerializedName("DecrementColorTemperatureConfirmation")
  DECREMENT_COLOR_TEMPERATURE_CONFIRMATION(DecrementColorTemperatureConfirmation.class),

  @SerializedName("DecrementPercentageRequest")
  DECREMENT_PERCENTAGE_REQUEST(DecrementPercentageRequest.class),

  @SerializedName("DecrementPercentageConfirmation")
  DECREMENT_PERCENTAGE_CONFIRMATION(DecrementPercentageConfirmation.class),

  @SerializedName("ReportState")
  REPORT_STATE_REQUEST(ReportStateRequest.class),
  
  @SerializedName("StateReport")
  STATE_REPORT_RESPONSE(ReportStateResponse.class),
  
  @SerializedName("IncrementColorTemperatureRequest")
  INCREMENT_COLOR_TEMPERATURE_REQUEST(IncrementColorTemperatureRequest.class),

  @SerializedName("IncrementColorTemperatureConfirmation")
  INCREMENT_COLOR_TEMPERATURE_CONFIRMATION(IncrementColorTemperatureConfirmation.class),

  @SerializedName("IncrementPercentageRequest")
  INCREMENT_PERCENTAGE_REQUEST(IncrementPercentageRequest.class),

  @SerializedName("IncrementPercentageConfirmation")
  INCREMENT_PERCENTAGE_CONFIRMATION(IncrementPercentageConfirmation.class),

  @SerializedName("IncrementTargetTemperatureRequest")
  INCREMENT_TARGET_TEMPERATURE_REQUEST(IncrementTargetTemperatureRequest.class),

  @SerializedName("IncrementTargetTemperatureConfirmation")
  INCREMENT_TARGET_TEMPERATURE_CONFIRMATION(IncrementTargetTemperatureConfirmation.class),

  @SerializedName("SetColorRequest")
  SET_COLOR_REQUEST(SetColorRequest.class),

  @SerializedName("SetColorConfirmation")
  SET_COLOR_CONFIRMATION(SetColorConfirmation.class),

  @SerializedName("SetColorTemperatureRequest")
  SET_COLOR_TEMPERATURE_REQUEST(SetColorTemperatureRequest.class),

  @SerializedName("SetColorTemperatureConfirmation")
  SET_COLOR_TEMPERATURE_CONFIRMATION(SetColorTemperatureConfirmation.class),

  @SerializedName("SetLockStateRequest")
  SET_LOCK_STATE_REQUEST(SetLockStateRequest.class),

  @SerializedName("SetLockStateConfirmation")
  SET_LOCK_STATE_CONFIRMATION(SetLockStateConfirmation.class),

  @SerializedName("SetPercentageRequest")
  SET_PERCENTAGE_REQUEST(SetPercentageRequest.class),

  @SerializedName("SetPercentageConfirmation")
  SET_PERCENTAGE_CONFIRMATION(SetPercentageConfirmation.class),

  @SerializedName("SetTargetTemperature")
  SET_TARGET_TEMPERATURE_REQUEST(SetTargetTemperatureRequest.class),

  @SerializedName("Response")
  SET_TARGET_TEMPERATURE_CONFIRMATION(SetTargetTemperatureConfirmation.class),

  @SerializedName("GetLockStateRequest")
  GET_LOCK_STATE_REQUEST(GetLockStateRequest.class),

  @SerializedName("GetLockStateResponse")
  GET_LOCK_STATE_RESPONSE(GetLockStateResponse.class),

  @SerializedName("GetTargetTemperatureRequest")
  GET_TARGET_TEMPERATURE_REQUEST(GetTargetTemperatureRequest.class),

  @SerializedName("GetTargetTemperatureResponse")
  GET_TARGET_TEMPERATURE_RESPONSE(GetTargetTemperatureResponse.class),

  @SerializedName("GetTemperatureReadingRequest")
  GET_TEMPERATURE_READING_REQUEST(GetTemperatureReadingRequest.class),

  @SerializedName("GetTemperatureReadingResponse")
  GET_TEMPERATURE_READING_RESPONSE(GetTemperatureReadingResponse.class),

  @SerializedName("RetrieveCameraStreamUriRequest")
  RETRIEVE_CAMERA_STREAM_URI_REQUEST(RetrieveCameraStreamUriRequest.class),

  @SerializedName("RetrieveCameraStreamUriResponse")
  RETRIEVE_CAMERA_STREAM_URI_RESPONSE(RetrieveCameraStreamUriResponse.class),
  
  @SerializedName("ErrorResponse")
  ERROR_RESPONSE(ErrorResponse.class);

  public Type getDeserializationType() {
    return deserializationType;
  }

  private final Type deserializationType;

  MessageName(Type deserializationType) {
    this.deserializationType = deserializationType;
  }
}
