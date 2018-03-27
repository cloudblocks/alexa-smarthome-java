package uk.co.gdickinson.smarthome.lambda.payload;

import java.util.HashMap;
import java.util.Map;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;

public class Event {
    private Header header;
    private Payload payload;
    private Endpoint endpoint;
    private Map<String, Object> additionalProperties = new HashMap<>();

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

}