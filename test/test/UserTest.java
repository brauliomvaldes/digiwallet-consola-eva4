package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	public void testCargarDatosPersonalesUsuario() {
		
	    // Crear el objeto simulando teclado para el atributo de la clase Usuario
		Scanner tecladoSimulado = mock(Scanner.class);
			    
		// Crear una instancia de la clase Usuario
	    Usuario usuario = new Usuario(tecladoSimulado);
	    
	    // Llamar los métodos cargar datos personales y
	    // verificar que los datos se hayan establecido correctamente

	    // nombre
	    when(tecladoSimulado.next()).thenReturn("Brisa");
	    usuario.ingresarNombre();
	    assertEquals("Brisa", usuario.getUser_firstname());  
	    
	    // edad
	    when(tecladoSimulado.nextInt()).thenReturn(21);
	    usuario.ingresarEdad();
	    assertEquals(21, usuario.isUser_age());

	    // username
	    when(tecladoSimulado.next()).thenReturn("brisa");
	    usuario.ingresarUsername();
	    assertEquals("brisa", usuario.getUser_username());

	    // password
	    when(tecladoSimulado.next()).thenReturn("123456");
	    usuario.ingresarPassword();
	    assertEquals("123456", usuario.getUser_password_hash());

	}
}
