/**
 * 
 */
package exercicio;

import java.math.BigDecimal;

/**
 * @author nathan
 *
 */
public class Conta {
	// Variaveis
	private int numConta;
	private BigDecimal saldo;

	// Construtor
	public Conta() {
		this(0,null);
	}
	public Conta(int numConta, BigDecimal saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}

	// Gets
	public int getNumConta() {
		return numConta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	// Sets
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	private void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	/**
	 * @author nathan
	 *
	 */
	public void debito(BigDecimal saldo) {
		saldo = getSaldo().add(saldo);
		setSaldo(saldo);
	}

	/**
	 * @author nathan
	 *
	 */
	public void credito(BigDecimal saldo) {
		saldo = getSaldo().subtract(saldo);
		setSaldo(saldo);
	}
}
