package test;

import java.util.Scanner;

import entities.User;

public class Usuario extends User{

	protected Scanner teclado;
	
	public Usuario(Scanner teclado) {
		super();
		this.teclado=teclado;
	}
	
	public void ingresarNombre() {
		System.out.print("\nIngrese el nombre: ");
		super.setUser_firstname(teclado.next());
	}
	public void ingresarEdad() {
		System.out.print("\nIngrese la edad: ");
		super.setUser_age((short)teclado.nextInt());
	}
	public void ingresarUsername() {
		System.out.print("\nIngrese el username: ");
		super.setUser_username(teclado.next());
	}
	public void ingresarPassword() {
		System.out.print("\nIngrese el password: ");
		super.setUser_password_hash(teclado.next());
	}

}
