package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import wallet.Transferencias;

class FactorConversionMonedaTest {

	@Test
	public void testAplicaFactorConversionAMonto() {
		// se proporcional el monto a convertir y el factor de conversión
		
		BigDecimal monto = BigDecimal.valueOf(1000);
		BigDecimal factor = BigDecimal.valueOf(0.0011);
		BigDecimal valorEsperado = monto.multiply(factor);
	    assertEquals(valorEsperado, Transferencias.calculoAplicaFactorConversion(monto, factor)); 
	}
}
