package execoes.exceptions;

public class WithdrawExeption extends Exception{
	private static final long serialVersionUID = 1L;

	public WithdrawExeption(String message) {
		super("Withdraw error: "+message);
	}
}
