package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class DiscoverAppliancesRequest extends Request<DiscoverAppliancesResponse> {
  private Scope scope;

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public Scope getScope() {
    return scope;
  }

  @Override
  public MessageName getMessageName() {
    return MessageName.DISCOVER_APPLIANCES_REQUEST;
  }
}
