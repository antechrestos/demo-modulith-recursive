package io.github.antechrestos.demomodulithrecursive.packageC.configuration;

import io.github.antechrestos.demomodulithrecursive.packageB.BTreatmentHandledEvent;
import io.github.antechrestos.demomodulithrecursive.packageC.domain.BusinessC;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class BTreatmentHandledEventListener {

    private final BusinessC businessC;

    public BTreatmentHandledEventListener(BusinessC businessC) {
        this.businessC = businessC;
    }

    @ApplicationModuleListener
    void on(BTreatmentHandledEvent event) {
        businessC.postBTreatment(event.eventId());
    }
}
