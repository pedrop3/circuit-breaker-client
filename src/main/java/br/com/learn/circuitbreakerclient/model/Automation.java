package br.com.learn.circuitbreakerclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Automation {

    private Long id;
	private Integer days;
	private String description;
	private Long patientId;

}
