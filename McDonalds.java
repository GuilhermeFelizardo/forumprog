package strategy.mcdonalds;

public class McDonalds {

	private Pedido pedido;
	
	public McDonalds(BigMac bigMac) {}
	
	public McDonalds(Sorvete sorvete) {}
	
	public void calcularPedido(int quantidade) {
		this.pedido.calcularValorPedido(quantidade);
	}
}
