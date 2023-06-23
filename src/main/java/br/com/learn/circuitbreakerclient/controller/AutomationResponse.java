package br.com.learn.circuitbreakerclient.controller;

import br.com.learn.circuitbreakerclient.model.Automation;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutomationResponse {

    public static AutomationResponse of(Automation automation) {
        return new AutomationResponse(
            automation.getId(),
            automation.getDias(),
            automation.getDescricao()
        );
    }
  
    private Long id;
	private Integer dias;
	private String descricao;

}
