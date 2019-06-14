package com.ipartek.formacion;

public class Youtube {

	private static final int LONGITUD_CODIGO = 11;
	private static final int LONGITUD_MINTITULO = 2;
	private static final int LONGITUD_MAXTITULO = 250;
	// propiedades
	private String titulo; //minimo 2, maximo 250
	private String codigo; //exactamente 11
	private int reproducciones;
	private static final String url = "https://www.youtube.com/watch?v=";

	// constructores

	public Youtube(String titulo, String codigo) throws Exception {
		super();
		this.setTitulo(titulo);
		this.setCodigo(codigo);
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		
		if(titulo != null && titulo.length() >= LONGITUD_MINTITULO && titulo.length() <= LONGITUD_MAXTITULO ) {
			this.titulo = titulo;
		} else {
			String mensaje = String.format("El titulo debe ser entre %i %i",LONGITUD_MINTITULO, LONGITUD_MAXTITULO);
			throw new Exception( mensaje);
		}
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		//primero comprobamos que codigo sea diferente de null
		if (codigo != null && codigo.length() == LONGITUD_CODIGO) {
			this.codigo = codigo;
			
		} else {
			throw new Exception("La longitud debe ser " + LONGITUD_CODIGO);
		}
		
		
	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	// funciones

	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}
	
	/*public String getUrl() {
		return 
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
