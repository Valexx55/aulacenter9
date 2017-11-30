package com.jcg.examples.service;

import org.springframework.stereotype.Service;

import com.jcg.examples.bean.LoginBean;
import com.jcg.examples.bean.Respuesta;

@Service
public class YesNoService
{
		public String gestionarRespuesta(Respuesta response)
		{
			String respuesta = null;
				
				System.out.println("RESPUETA = " + response);
				
				respuesta = (response.equals("S")) ? "SI" : "NO";
				
			return respuesta;
				
		}
		
}
