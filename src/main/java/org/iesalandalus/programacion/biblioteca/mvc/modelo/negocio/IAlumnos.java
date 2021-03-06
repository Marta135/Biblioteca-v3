package org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Alumno;

/**
 * 
 * @author Marta García
 * versión: v3
 *
 */

public interface IAlumnos {
	
	void comenzar();
	
	void terminar();

	List<Alumno> get() throws NullPointerException, IllegalArgumentException;
	
	int getTamano();
	
	void insertar(Alumno alumno) throws OperationNotSupportedException, NullPointerException, IllegalArgumentException;
	
	Alumno buscar(Alumno alumno) throws NullPointerException, IllegalArgumentException;
	
	void borrar(Alumno alumno) throws OperationNotSupportedException;

}
