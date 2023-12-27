package io.github.antechrestos.demomodulithrecursive.packageB.configuration;

import io.github.antechrestos.demomodulithrecursive.packageB.HandleBTreatmentEvent;
import io.github.antechrestos.demomodulithrecursive.packageB.domain.BusinessB;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class HandleBTreatmentEventListener {

    private final BusinessB businessB;

    HandleBTreatmentEventListener(BusinessB businessB) {
        this.businessB = businessB;
    }

    @TransactionalEventListener
    void on(HandleBTreatmentEvent event){
        this.businessB.handleBTreatment(event.eventId());
    }
}
