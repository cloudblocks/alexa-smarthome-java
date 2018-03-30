package uk.co.gdickinson.smarthome.lambda.payload;

import java.util.Optional;

import uk.co.gdickinson.smarthome.lambda.models.Context;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class ReportStateResponse implements Response {

    private Context context;
    
    @Override
    public MessageName getMessageName() {
        return MessageName.STATE_REPORT_RESPONSE;
    }
    
    @Override
    public boolean responseSupportsContextPayload() {
        return true;
    }
    
    @Override
    public Optional<Context> getResponseContext() {
        return Optional.ofNullable(context);
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
