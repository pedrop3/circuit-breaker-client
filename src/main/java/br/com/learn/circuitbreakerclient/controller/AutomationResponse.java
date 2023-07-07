package br.com.learn.circuitbreakerclient.controller;

import br.com.learn.circuitbreakerclient.model.Automation;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutomationResponse {

    private Long id;
	private Integer days;
	private String description;

    public static AutomationResponse of(Automation automation) {
        return new AutomationResponse(
            automation.getId(),
            automation.getDays(),
            automation.getDescription()
        );
    }
  
}
