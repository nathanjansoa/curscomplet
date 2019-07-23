/**
 * 
 */
package exercicio;

import java.math.BigDecimal;

/**
 * @author nathan
 *
 */
public class ContaPoupanca extends Conta {
	/**
	 * @author nathan
	 *
	 */
	public void rendeJuros(BigDecimal saldo) {
		saldo = getSaldo().add(saldo);
		credito(saldo);
	}
}
