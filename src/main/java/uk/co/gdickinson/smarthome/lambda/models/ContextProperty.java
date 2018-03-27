package uk.co.gdickinson.smarthome.lambda.models;

public class ContextProperty<T> {

    private Namespace namespace;
    private String name;
    private String timeOfSample;
    private int uncertaintyInMilliseconds;
    private T value;
    
    public Namespace getNamespace() {
        return namespace;
    }
    
    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTimeOfSample() {
        return timeOfSample;
    }
    
    public void setTimeOfSample(String timeOfSample) {
        this.timeOfSample = timeOfSample;
    }
    
    public int getUncertaintyInMilliseconds() {
        return uncertaintyInMilliseconds;
    }
    
    public void setUncertaintyInMilliseconds(int uncertaintyInMilliseconds) {
        this.uncertaintyInMilliseconds = uncertaintyInMilliseconds;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
