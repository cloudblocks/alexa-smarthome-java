package uk.co.gdickinson.smarthome.lambda.models;

import java.util.List;
import java.util.Map;

public class Endpoint {
  private String endpointId;
  private String manufacturerName;
  private String friendlyName;
  private String description;
  private List<DisplayCategories> displayCategories;
  private List<Capability> capabilities = null;

  public List<DisplayCategories> getDisplayCategories() {
    return displayCategories;
  }

  public void setDisplayCategories(List<DisplayCategories> displayCategories) {
    this.displayCategories = displayCategories;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Capability> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<Capability> capabilities) {
    this.capabilities = capabilities;
  }
}
