package strategy.mcdonalds;

public class BigMac implements Pedido {

	private double valor;
	
	public BigMac(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularValorPedido(int quantidade) {
		double valorPedido = valor * quantidade;
		return valorPedido;
	}
	
}
