package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class RetrieveCameraStreamUriRequest extends Request<RetrieveCameraStreamUriResponse> {
  private String directedId;
  private Endpoint endpoint;

  public String getDirectedId() {
    return directedId;
  }

  public void setDirectedId(String directedId) {
    this.directedId = directedId;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.RETRIEVE_CAMERA_STREAM_URI_REQUEST;
  }
}
