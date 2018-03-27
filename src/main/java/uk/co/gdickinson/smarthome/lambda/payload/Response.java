package uk.co.gdickinson.smarthome.lambda.payload;

import java.util.Optional;

import uk.co.gdickinson.smarthome.lambda.models.Context;

public interface Response extends Payload {

    default boolean responseSupportsContextPayload() {
        return false;
    }
    
    default Optional<Context> getResponseContext() {
        return Optional.empty();
    }
}
