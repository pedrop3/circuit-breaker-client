package br.com.learn.circuitbreakerclient.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.learn.circuitbreakerclient.service.AutomationService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final AutomationService automationService;

    @GetMapping(path = "/{patientId}" )
    public List<AutomationResponse> getBin(
            @PathVariable Long patientId
            )  {
                
        return  automationService.findByPatientId(patientId)
                    .stream()
                    .map(AutomationResponse::of)
                    .collect(Collectors.toList());
    }

}