package strategy.mcdonalds;

public class AppMcDonalds {

	public static void main(String[] args) {
		int quantidadeBigMac = 2;
		BigMac bigMac = new BigMac(quantidadeBigMac);
		
		int quantidadeSorvete = 5;
		Sorvete sandue = new Sorvete(quantidadeSorvete);
		
		McDonalds pedidoBigMac = new McDonalds(bigMac);
		pedidoBigMac.calcularPedido(quantidadeBigMac);
		
		McDonalds pedidoSorvete = new McDonalds(sandue);
		pedidoSorvete.calcularPedido(quantidadeSorvete);
	}

}
