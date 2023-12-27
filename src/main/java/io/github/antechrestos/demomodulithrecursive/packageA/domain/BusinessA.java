package io.github.antechrestos.demomodulithrecursive.packageA.domain;

import io.github.antechrestos.demomodulithrecursive.packageB.HandleBTreatmentEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class BusinessA {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessA.class);

    private final ApplicationEventPublisher applicationEventPublisher;

    BusinessA(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional
    public String triggerBTreatment() {
        HandleBTreatmentEvent event = new HandleBTreatmentEvent(UUID.randomUUID().toString());
        LOGGER.debug("triggerBTreatment({}) - start", event.eventId());
        applicationEventPublisher.publishEvent(event);
        LOGGER.debug("triggerBTreatment({}) - end", event.eventId());
        return event.eventId();
    }

}
