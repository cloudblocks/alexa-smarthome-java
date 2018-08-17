package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class GetTemperatureReadingRequest extends Request<GetTemperatureReadingResponse> {

  @Override
  public MessageName getMessageName() {
    return MessageName.REPORT_STATE_REQUEST;
  }

}
