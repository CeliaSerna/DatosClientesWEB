package com.cursoceat.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cursoceat.modell.Clientes;
import com.cursoceat.services.Validaciones;
/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet implements Validaciones {
	private static final long serialVersionUID = 1L;
	
	/**
	 * hacer la colección global para poder ser utilizada
	 * tanto en el método post como en el get
	 */
    List<Clientes> listadoClientes= new ArrayList<Clientes>();  
	
	
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/**
	 * leer los datos que envia el formulario
	 */
	String nombre=request.getParameter("nombre");
	String apellidos=request.getParameter("apellidos");
	String telefono=request.getParameter("telefono");
	/**
	 * variable tipo cadena que envia mensaje a la vista
	 */
	String mensaje=null;
	
	/**
	 * validación del teléfono
	 */
	 if(!validarTel(telefono)) {
		 mensaje ="Error en el formato del teléfono";
		 
      ///este error lo enviamos a la vista
     request.setAttribute("mensaje", mensaje);
     //el error lo despacho a la vista
     request.getRequestDispatcher("index.jsp").forward(request, response);
 
	 }else {
	 Clientes miClientes = new Clientes(pasarPriMayus(nombre),pasarPriMayus(apellidos), telefono);
	 
	 listadoClientes.add(miClientes);
	 mensaje="El cliente se ha creado correctamente";
	 
	 request.getSession().setAttribute("mensaje", mensaje);
	 
	 request.getSession().setAttribute("clientes", listadoClientes);
	 response.sendRedirect("index.jsp");
	 }
	
	
	
	
	}

}
