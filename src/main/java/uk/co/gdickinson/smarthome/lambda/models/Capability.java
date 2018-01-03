package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public class Capability {
    public static final String VERSION_INTERFACE_V3 = "3";
    public static final String TYPE_ALEXA_INTERFACE = "AlexaInterface";

    private String type;

    @SerializedName("interface")
    private String _interface;
    private String version;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInterface() {
        return _interface;
    }

    public void setInterface(String _interface) {
        this._interface = _interface;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}