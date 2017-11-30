package com.jcg.examples.bean;

import java.io.Serializable;

public class Respuesta implements Serializable
{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private String respuesta;
		private String respfinal;
		
		

		public String getRespfinal() {
			return respfinal;
		}

		public void setRespfinal(String respfinal) {
			this.respfinal = respfinal;
		}

		public String getRespuesta() {
			return respuesta;
		}

		public void setRespuesta(String respuesta) {
			this.respuesta = respuesta;
		}
		
		public String fraseFinal ()
		{
			this.respfinal = "La margarita dijo "+this.respuesta;
			return respfinal;
		}

		

}
