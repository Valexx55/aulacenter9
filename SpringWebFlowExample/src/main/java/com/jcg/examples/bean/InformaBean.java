package com.jcg.examples.bean;

import java.io.Serializable;

public class InformaBean implements Serializable {
	
	private int nveces, nveces_total;
	
	
	public int incnveces()
	{
		return (nveces = nveces+1);
	}
	
	public int incnvecestotal()
	{
		return (nveces_total = nveces_total+1);
	}
	
	public void resetnveces ()
	{
		nveces = 0;
	}
	
	public int getNveces() {
		return nveces;
	}

	public void setNveces(int nveces) {
		this.nveces = nveces;
	}

	public int getNveces_total() {
		return nveces_total;
	}

	public void setNveces_total(int nveces_total) {
		this.nveces_total = nveces_total;
	}

	public void informaInicio ()
	{
		System.out.println("EL flow ha EMPEZADO Nveces = " +nveces);
		System.out.println("EL flow ha EMPEZADO Nveces TOTAL= " +nveces_total);
	}
	
	public void informaFin ()
	{
		System.out.println("EL flow ha TERMINADO Nveces = " +nveces);
		System.out.println("EL flow ha TERMINADO Nveces TOTAL= " +nveces_total);
	}
	
	

}
