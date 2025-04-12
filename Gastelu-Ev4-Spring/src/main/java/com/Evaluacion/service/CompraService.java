package com.Evaluacion.service;

import com.Evaluacion.Compra;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private KieContainer kieContainer;

    public Compra aplicarDescuento(Compra compra) {
        KieSession kieSession = kieContainer.newKieSession("ksession-descuentos");
        kieSession.insert(compra);
        kieSession.fireAllRules();
        kieSession.dispose();
        return compra;
    }
}
