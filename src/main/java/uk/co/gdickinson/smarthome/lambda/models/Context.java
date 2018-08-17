package uk.co.gdickinson.smarthome.lambda.models;

import java.util.List;

public class Context {

    private List<ContextProperty> properties;

    public List<ContextProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ContextProperty> contextProperties) {
        this.properties = contextProperties;
    }
}
