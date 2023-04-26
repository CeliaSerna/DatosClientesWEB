package com.cursoceat.modell;



public class Clientes {

	private static int idGeneral;
	private int idCliente;
	private String nombreCliente;
	private String apellidosCliente;
	private String telefonoCliente;

	public Clientes(String nombreCliente, String apellidosCliente, String telefonoCliente) {
		
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
		this.telefonoCliente = telefonoCliente;
		this.idCliente =++idGeneral;
	}
	
	public Clientes() {
		this.idCliente =++idGeneral;
	}
	 /**
	 * métodos getter y setter
	 */
	
	public int getIdCliente() {
		return idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	
	
	


}
