package uk.co.gdickinson.smarthome.lambda.models;

public class SupportedCapabilityProperty {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SupportedCapabilityProperty [name=" + name + "]";
    }
    
    
}
