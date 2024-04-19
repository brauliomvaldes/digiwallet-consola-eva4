package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Account;

class AccountTest {

	Account cuenta;
	
	@BeforeEach
	void setUp() {
		this.cuenta = new Account();	
	}
	
	@Test
	void test() {
		
		cuenta.setAccount_balance(10000); // abono inicial
		assertAll(
				() -> assertEquals(10000,cuenta.getAccount_balance())
		);
				
		cuenta.ingreso(4000); // abono de dinero
		assertAll(
				() -> assertEquals(14000,cuenta.getAccount_balance())
		);
		
		cuenta.ingreso(-4000); // abono de dinero valor negativo toma valor absoluto
		assertAll(
				() -> assertEquals(18000,cuenta.getAccount_balance())
		);
		
		cuenta.reintegro(2000); // retiro de dinero
		assertAll(
				() -> assertEquals(16000,cuenta.getAccount_balance())
		);

		cuenta.reintegro(20000); // retiro de dinero mayor al saldo, mantiene saldo
		assertAll(
				() -> assertEquals(16000,cuenta.getAccount_balance())
		);

		cuenta.reintegro(6000); // retiro de dinero
		assertAll(
				() -> assertEquals(10000,cuenta.getAccount_balance())
		);
		 
		cuenta.reintegro(-6000); // retiro valor negativo toma valor absoluto
		assertAll(
				() -> assertEquals(4000,cuenta.getAccount_balance())
		);
		
		cuenta.ingreso(-1000);
		 
	}

}
