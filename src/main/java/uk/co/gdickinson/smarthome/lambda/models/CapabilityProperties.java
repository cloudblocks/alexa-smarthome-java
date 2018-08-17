package uk.co.gdickinson.smarthome.lambda.models;

import java.util.List;

public class CapabilityProperties {

    private boolean proactivelyReported;
    private boolean retrievable;
    private List<SupportedCapabilityProperty> supported;

    public boolean isProactivelyReported() {
        return proactivelyReported;
    }

    public void setProactivelyReported(boolean proactivelyReported) {
        this.proactivelyReported = proactivelyReported;
    }

    public boolean isRetrievable() {
        return retrievable;
    }   

    public void setRetrievable(boolean retrievable) {
        this.retrievable = retrievable;
    }

    public List<SupportedCapabilityProperty> getSupportedProperties() {
        return supported;
    }

    public void setSupportedProperties(List<SupportedCapabilityProperty> supportedProperties) {
        this.supported = supportedProperties;
    }

    @Override
    public String toString() {
        return "CapabilityProperties [proactivelyReported=" + proactivelyReported + ", retrievable=" + retrievable
                + ", supported=" + supported + "]";
    }
    
    
    
}
