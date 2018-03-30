package uk.co.gdickinson.smarthome.lambda.codec;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import uk.co.gdickinson.smarthome.lambda.payload.Directive;

public class SmartHomeDirectiveRequest {
  private Directive directive;

  public Directive getDirective() {
    return directive;
  }

  public void setDirective(Directive directive) {
    this.directive = directive;
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(directive).toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof SmartHomeDirectiveRequest) == false) {
      return false;
    }
    SmartHomeDirectiveRequest rhs = ((SmartHomeDirectiveRequest) other);
    return new EqualsBuilder().append(directive, rhs.directive).isEquals();
  }
}
