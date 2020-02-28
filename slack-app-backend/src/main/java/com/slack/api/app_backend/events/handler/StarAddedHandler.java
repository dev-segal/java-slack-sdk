package com.slack.api.app_backend.events.handler;

import com.slack.api.app_backend.events.EventHandler;
import com.slack.api.app_backend.events.payload.StarAddedPayload;
import com.slack.api.model.event.StarAddedEvent;

public abstract class StarAddedHandler extends EventHandler<StarAddedPayload> {

    @Override
    public String getEventType() {
        return StarAddedEvent.TYPE_NAME;
    }
}
