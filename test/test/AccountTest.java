package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

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
		
		cuenta.setAccount_balance(BigDecimal.valueOf(10000)); // abono inicial
		assertAll(
				() -> assertEquals(BigDecimal.valueOf(10000),cuenta.getAccount_balance())
		);
				
		cuenta.ingreso(BigDecimal.valueOf(4000)); // abono de dinero
		assertAll(
				() -> assertEquals(BigDecimal.valueOf(14000),cuenta.getAccount_balance())
		);
		
		cuenta.ingreso(BigDecimal.valueOf(-4000)); // abono de dinero valor negativo toma valor absoluto
		assertAll(
				() -> assertEquals(BigDecimal.valueOf(18000),cuenta.getAccount_balance())
		);
		
		cuenta.reintegro(BigDecimal.valueOf(2000)); // retiro de dinero
		assertAll(
				() -> assertEquals(BigDecimal.valueOf(16000),cuenta.getAccount_balance())
		);

		cuenta.reintegro(BigDecimal.valueOf(20000)); // retiro de dinero mayor al saldo, mantiene saldo
		assertAll(
				() -> assertEquals(BigDecimal.valueOf(16000),cuenta.getAccount_balance())
		);

		cuenta.reintegro(BigDecimal.valueOf(6000)); // retiro de dinero
		assertAll(
				() -> assertEquals(BigDecimal.valueOf(10000),cuenta.getAccount_balance())
		);
		 
		cuenta.reintegro(BigDecimal.valueOf(-6000)); // retiro valor negativo toma valor absoluto
		assertAll(
				() -> assertEquals(BigDecimal.valueOf(4000),cuenta.getAccount_balance())
		);
		 
	}

}
