package com.designpatterns.factoryMethod.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.designpatterns.factoryMethod.dto.NotificacionRequest;
import com.designpatterns.factoryMethod.factory.EmailNotificacionFactory;
import com.designpatterns.factoryMethod.factory.NotificacionFactory;
import com.designpatterns.factoryMethod.factory.SmsNotificacionFactory;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/notificaciones")
public class NotificacionController {
	
	@PostMapping("/enviar")
	public String enviarNotificacion(@RequestBody NotificacionRequest request) {
		NotificacionFactory factory;
		
		String tipo = request.getTipo();
		String mensaje = request.getMensaje();
		
		switch (tipo) {
		case "EMAIL":
			factory = new EmailNotificacionFactory();
			break;
			
		case "SMS":
			factory = new SmsNotificacionFactory();
			break;

		default:
			return "Tipo de notificación no soportado";			
		}
		
		factory.procesarNotificacion(mensaje);				
		return "Notificación enviada por " + tipo;
	}
	

}
