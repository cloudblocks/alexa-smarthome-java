package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

import java.util.List;

public class DiscoverAppliancesResponse implements Response {
  private List<Endpoint> endpoints;

  @Override
  public MessageName getMessageName() {
    return MessageName.DISCOVER_APPLIANCES_RESPONSE;
  }

  public List<Endpoint> getDiscoveredEndpoints() {
    return endpoints;
  }

  public void setDiscoveredEndpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
  }
}
