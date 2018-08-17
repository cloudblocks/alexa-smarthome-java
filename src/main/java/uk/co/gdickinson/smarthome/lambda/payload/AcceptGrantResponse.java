package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class AcceptGrantResponse implements Response {

    @Override
    public MessageName getMessageName() {
        // TODO Auto-generated method stub
        return MessageName.ACCEPT_GRANT_RESPONSE;
    }

}
