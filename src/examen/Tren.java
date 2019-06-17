package com.ipartek.examen;


public class Tren {
	
	String tipo;
	int referencia;
	int asientosOcupados;
	int aniosActivo;
	
	
	public Tren() {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.aniosActivo = aniosActivo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getReferencia() {
		return referencia;
	}


	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}


	public int getAsientosOcupados() {
		return asientosOcupados;
	}


	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}


	public int getAniosActivo() {
		return aniosActivo;
	}


	public void setAniosActivo(int aniosActivo) {
		this.aniosActivo = aniosActivo;
	}
	
	
}
