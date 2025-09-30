package com.designpatterns.factoryMethod.factory;

import com.designpatterns.factoryMethod.model.Notificacion;
import com.designpatterns.factoryMethod.model.SmsNotificacion;

public class SmsNotificacionFactory extends NotificacionFactory {

	@Override
	public Notificacion crearNotificacion() {
		return new SmsNotificacion();
	}

}
