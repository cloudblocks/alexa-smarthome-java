package uk.co.gdickinson.smarthome.lambda.payload;

import java.util.Optional;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class ReportStateRequest extends Request<ReportStateResponse> {

    private Endpoint endpoint;

    
    @Override
    public MessageName getMessageName() {
        return MessageName.REPORT_STATE_REQUEST;
    }


    public Optional<Endpoint> getEndpoint() {
        return Optional.ofNullable(endpoint);
    }


    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

}
