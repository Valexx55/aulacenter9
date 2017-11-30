package com.jcg.examples.bean;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GestionaErrores {
	
	@ExceptionHandler(Throwable.class)
	public String errores ()
	{
		System.out.println("Ha ocurrido un fallo");
		
		return "error";
	}

}
