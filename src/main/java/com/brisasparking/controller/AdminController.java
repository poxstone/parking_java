package com.brisasparking.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.brisasparking.model.AdminIngressModel;



@RestController
@RequestMapping("/admin")
public class AdminController {
	private static final String MOVIMIENTOS_URL = "http://localhost:8080/movimientos";
	
	@Autowired
    private RestTemplate restTemplate;

	@PutMapping("/registrarEntrada")
//	public String NewIngres() {
	public String NewIngres(@RequestBody AdminIngressModel ingress) {
		
		restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		JSONObject personJsonObject = new JSONObject();
		personJsonObject.put("ingreso", "2023-01-01T00:00:00.090+00:00");
		personJsonObject.put("salida", "2023-01-01T01:00:00.090+00:00");
		personJsonObject.put("placa", "bhz-222");
		personJsonObject.put("id_operador", 1);
		
		HttpEntity<String> request = new HttpEntity<String>(personJsonObject.toString(), headers);
		String response = restTemplate.postForObject(MOVIMIENTOS_URL + "/add", request, String.class);

		return response;
	}

}
