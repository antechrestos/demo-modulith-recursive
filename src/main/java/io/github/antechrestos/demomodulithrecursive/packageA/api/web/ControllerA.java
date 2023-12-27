package io.github.antechrestos.demomodulithrecursive.packageA.api.web;

import io.github.antechrestos.demomodulithrecursive.packageA.domain.BusinessA;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {

    private final BusinessA businessA;

    ControllerA(BusinessA businessA) {
        this.businessA = businessA;
    }

    @GetMapping("api/v1/a")
    public String trigger() {
        return businessA.triggerBTreatment();
    }

}
