package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.ErrorType;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class ErrorResponse implements Response {

    private ErrorType type;
    private String message;
    
    
    @Override
    public MessageName getMessageName() {
        return MessageName.ERROR_RESPONSE;
    }


    public ErrorType getType() {
        return type;
    }


    public void setType(ErrorType type) {
        this.type = type;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

}
