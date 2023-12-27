package io.github.antechrestos.demomodulithrecursive.packageC.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BusinessC {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessC.class);
    @Transactional
    public void postBTreatment(String eventId){
        LOGGER.debug("postBTreatment({}) - start", eventId);
        LOGGER.debug("postBTreatment({}) - end", eventId);
    }
}
