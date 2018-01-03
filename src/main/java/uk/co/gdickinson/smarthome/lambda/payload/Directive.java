package uk.co.gdickinson.smarthome.lambda.payload;

import com.google.gson.JsonElement;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import uk.co.gdickinson.smarthome.lambda.models.Endpoint;

public class Directive {
    private Header header;
    private JsonElement endpoint;
    private JsonElement payload;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public JsonElement getPayload() {
        return payload;
    }

    public void setPayload(JsonElement payload) {
        this.payload = payload;
    }

    public JsonElement getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(JsonElement endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payload).append(header).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Directive) == false) {
            return false;
        }
        Directive rhs = ((Directive) other);
        return new EqualsBuilder().append(payload, rhs.payload).append(header, rhs.header).isEquals();
    }

}