package uk.co.gdickinson.smarthome.lambda.payload;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Scope {
    private String type;
    private String token;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(token).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scope) == false) {
            return false;
        }
        Scope rhs = ((Scope) other);
        return new EqualsBuilder().append(token, rhs.token).append(type, rhs.type).isEquals();
    }

}