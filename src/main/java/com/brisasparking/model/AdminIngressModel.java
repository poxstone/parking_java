package com.brisasparking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminIngressModel {
	@Id
	private Integer id;
	private Integer id_operador;
	private Integer id_cliente;
	private String placa;
	
	public Integer getId_operador() {
		return id_operador;
	}

	public void setId_operador(Integer id_operador) {
		this.id_operador = id_operador;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	protected AdminIngressModel() {
    }
	
	public AdminIngressModel(Integer id_operador, Integer id_cliente, String placa) {
		this.id_operador = id_operador;
		this.id_cliente = id_cliente;
		this.placa = placa;
    }
}
