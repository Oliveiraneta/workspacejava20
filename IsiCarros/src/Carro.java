
public class Carro {

	//declarar as variaveis
	String marca;
	String modelo;
	int ano;	
	String cor;
	double preco;
	
	// agora tbm criar trechos de c�digos para manipula��o
	
		void exibirInfo() {
			System.out.println("Autom�vel: " + marca + " - " + modelo);
			System.out.println("	  Ano: " + ano);
			System.out.println("	  Cor: " + cor);
			System.out.println("	Pre�o:  R$" + preco);
	
}
		//aplicar desconto
		void aplicarDesconto(double percentual) {
			preco = preco - preco * percentual/100;
			
		}
		
		//calcular IPVA 
		
		double calcularIpva() {
			double valoripva;
			if (ano < 2000) {
				valoripva = 0.0;
		}
		else {
			valoripva = preco * 0.02;
		}
			return valoripva;
		}
		
}