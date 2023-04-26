package com.cursoceat.services;

public interface Validaciones {

	public default boolean validarTel(String tel) {
		if ( (!tel.startsWith("9")&&!tel.startsWith("6") &&!tel.startsWith("7") )
			||tel.length()!=9) {
			return false;
			
		}else {
			return true;
		}
	}
	
	public default String pasarPriMayus(String texto) {
		texto=texto.toLowerCase();//paso todo el texto a minisculas
		String[] arrayTexto=texto.split(" ");//si es mas de una palabra
		String temp="";//creo la variable que se formara por cada interacion
		for (int i=0; i <arrayTexto.length; i++) {
		arrayTexto[i]=arrayTexto[i].substring(0,1).toUpperCase() 
			+ arrayTexto[i].substring(1);
			
		temp+=arrayTexto[i] + " ";//lo acumulamos en temp
		}
		return temp.trim();//enviamos temp ya formateado 
		//y quitando espacios del principio y el final

	}	
	
	
	
	
	
}
