package strategy.mcdonalds;

public class Sorvete implements Pedido {

	private double valorSandue;
	
	public Sorvete(double valor) {
		this.valorSandue = valor;
	}

	@Override
	public double calcularValorPedido(int quantidade) {
		double valorPedido = valorSandue * quantidade;
		return valorPedido;
	}

	
}
