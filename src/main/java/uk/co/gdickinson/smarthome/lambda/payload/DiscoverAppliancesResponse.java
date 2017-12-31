package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

import java.util.List;

public class DiscoverAppliancesResponse implements Response {
  private List<Endpoint> discoveredEndpoints;

  @Override
  public MessageName getMessageName() {
    return MessageName.DISCOVER_APPLIANCES_RESPONSE;
  }

  public List<Endpoint> getDiscoveredEndpoints() {
    return discoveredEndpoints;
  }

  public void setDiscoveredEndpoints(List<Endpoint> discoveredEndpoints) {
    this.discoveredEndpoints = discoveredEndpoints;
  }
}
