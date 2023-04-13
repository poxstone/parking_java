package com.brisasparking.controller;

import org.json.simple.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	private ResponseEntity<String> putHttp(String url, JSONObject jsonObject, HttpMethod method) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<String>(jsonObject.toString(), headers);
		ResponseEntity<String> response = restTemplate.exchange(url, method, request, String.class);
		return response;
	}
	
	@PutMapping("/registrarEntrada")
	public ResponseEntity<String> NewIngres(@RequestBody AdminIngressModel ingress) {
		JSONObject jsonEntrada = new JSONObject();
		jsonEntrada.put("ingreso", "2023-01-01T00:00:00.090+00:00");
		jsonEntrada.put("placa", ingress.getPlaca());
		jsonEntrada.put("id_operador", ingress.getId_operador());
		ResponseEntity<String> response = putHttp(MOVIMIENTOS_URL+"/clientes/add", jsonEntrada, HttpMethod.PUT);
		return response;
	}
}
