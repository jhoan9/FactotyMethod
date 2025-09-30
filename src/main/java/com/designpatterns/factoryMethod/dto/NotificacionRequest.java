package com.designpatterns.factoryMethod.dto;

public class NotificacionRequest {

	private String tipo;
    private String mensaje;
    
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
