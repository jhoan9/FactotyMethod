package com.designpatterns.factoryMethod.factory;

import com.designpatterns.factoryMethod.model.Notificacion;

public abstract class NotificacionFactory {
	
	public abstract Notificacion crearNotificacion();
	
	public void procesarNotificacion(String mensaje) {
        Notificacion notificacion = crearNotificacion();
        notificacion.enviar(mensaje);
    }

}