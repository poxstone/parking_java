package com.brisasparking.model;

import javax.persistence.*;



@Entity
@Table(name = "operador")
public class OperadorModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_operador;
	private String nombre;
	private String apellido;
	
	public Integer getId_cliente() {
		return id_operador;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_operador = id_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	protected OperadorModel() {
    }
	
	public OperadorModel(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


}
