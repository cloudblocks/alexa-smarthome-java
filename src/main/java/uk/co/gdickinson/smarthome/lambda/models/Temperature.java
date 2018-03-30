package uk.co.gdickinson.smarthome.lambda.models;

public class Temperature {
  private Scale scale;
  private float value;

  public float getValue() {
    return value;
  }

  public void setValue(float value) {
    this.value = value;
  }

  public Scale getScale() {
    return scale;
  }

  public void setScale(Scale scale) {
    this.scale = scale;
  }

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((scale == null) ? 0 : scale.hashCode());
    result = prime * result + Float.floatToIntBits(value);
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Temperature other = (Temperature) obj;
    if (scale != other.scale)
        return false;
    if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value))
        return false;
    return true;
}
  
  
}
