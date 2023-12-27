package io.github.antechrestos.demomodulithrecursive.packageB.domain;

import io.github.antechrestos.demomodulithrecursive.packageB.BTreatmentHandledEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BusinessB {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessB.class);

    private final ApplicationEventPublisher applicationEventPublisher;

    BusinessB(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional
    public void handleBTreatment(String eventId){
        LOGGER.debug("handleBTreatment({}) - start", eventId);
        applicationEventPublisher.publishEvent(new BTreatmentHandledEvent(eventId));
        LOGGER.debug("handleBTreatment({}) - end", eventId);
    }
}
