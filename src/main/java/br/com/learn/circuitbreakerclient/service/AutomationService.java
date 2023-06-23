package br.com.learn.circuitbreakerclient.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.learn.circuitbreakerclient.model.Automation;




@Service
public class AutomationService {

	private static final List<Automation> AUTOMATION = new ArrayList<>();
	private static long id = 1;
	
	//Inicializador dos statics
	static {
		AUTOMATION.add(new Automation(id++, 10, "Aniversário",  1L));
		AUTOMATION.add(new Automation(id++, 1, "Pascoa", 1L));
		AUTOMATION.add(new Automation(id++, 4, "Pascoa", 1L));
		AUTOMATION.add(new Automation(id++, 8, "Pascoa", 2L));
		AUTOMATION.add(new Automation(id++, 5, "Pascoa", 3L));
	}
	

    public Optional<Automation> findByPatientId(Long patientId) {
        return  AUTOMATION.stream().filter(e -> e.getId().equals(patientId)).findFirst();
    }

  
}