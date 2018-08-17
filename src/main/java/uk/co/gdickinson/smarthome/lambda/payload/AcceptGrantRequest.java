package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.grant.Grant;
import uk.co.gdickinson.smarthome.lambda.models.grant.Grantee;

public class AcceptGrantRequest extends Request<AcceptGrantResponse> {
    
    private Grant grant;
    
    private Grantee grantee;

    @Override
    public MessageName getMessageName() {
        return MessageName.ACCEPT_GRANT_REQUEST;
    }

    public Grant getGrant() {
        return grant;
    }

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    public Grantee getGrantee() {
        return grantee;
    }

    public void setGrantee(Grantee grantee) {
        this.grantee = grantee;
    }

}
