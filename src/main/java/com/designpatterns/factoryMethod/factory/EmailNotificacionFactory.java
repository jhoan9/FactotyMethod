package com.designpatterns.factoryMethod.factory;

import com.designpatterns.factoryMethod.model.EmailNotificacion;
import com.designpatterns.factoryMethod.model.Notificacion;

public class EmailNotificacionFactory extends NotificacionFactory{

	@Override
	public Notificacion crearNotificacion() {
		return new EmailNotificacion();
	}

}
