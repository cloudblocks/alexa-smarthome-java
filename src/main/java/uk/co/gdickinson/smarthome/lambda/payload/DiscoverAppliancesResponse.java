package uk.co.gdickinson.smarthome.lambda.payload;

import java.util.List;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

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

@Override
public String toString() {
    return "DiscoverAppliancesResponse [endpoints=" + endpoints + "]";
}
  
  
  
}
