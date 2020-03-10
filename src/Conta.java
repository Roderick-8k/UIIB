
public class Conta {
	private static int ultimoNumeroGerado = 1;

	private int numero;
	private double saldo;
	private Cliente cliente;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void status() {
		System.out.println(this.numero);
		System.out.println(this.saldo);
		System.out.println(this.cliente.getNome());

	}

	public void creditar(double valor) {
		saldo += valor;
	}

	public void debitar(double valor) {
		saldo -= valor;
	}

	public void transferir(Conta contaDestino, double valor) {
		debitar(valor);
		contaDestino.creditar(valor);

	}

	public void gerarNumero() {
		this.numeroConta = String.valueOf(Math.random() *100);
}
}

	
	
	
	
	
	
