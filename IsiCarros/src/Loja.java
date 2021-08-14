
public class Loja {
public static void main(String[] args) {
	// carro e meu novo tipo de dados
	//c1 e c2 são as varriaveis que chamamos de objeto
	Carro c1;
	Carro c2;
	// se fosse tipo comum ja estava ok, como falamos de classes
	// precisamos solicitar a maquina virtual um espaco de memoria
	c1 = new Carro(); // reserva de memoria para todas as variavies
	c2 = new Carro();
	
	//atribyuindo valores 
	c1.marca 	= "Pórxy";
    c1.modelo 	= "Kaineni";
    c1.ano		= 2021;
    c1.cor		= "Preto";
    c1.preco	= 780000;
	
    c2.marca 	= "Xevrolé";
    c2.modelo	= "Corça";
    c2.ano		= 2021;
    c2.cor		= "Prata meio gasto";
	c2.preco	= 7500;
	
	//vamos exibir um anuncio 
	
	c1.exibirInfo();
	c2.exibirInfo();
	
	c1.aplicarDesconto(10.0);
	c2.aplicarDesconto(5.0);
	System.out.println("-------------------------------");
	c1.exibirInfo();
	c2.exibirInfo();
	
	double ipvaC1 = c1.calcularIpva();
	double ipvaC2 = c2.calcularIpva();
	
	System.out.println("Valor do ipva do " +c1.modelo+ " - " +ipvaC1);
	System.out.println("Valor do ipva do " +c2.modelo+ " - " +ipvaC2);
	
			
	//System.out.println("Automóvel: "+c1.marca+ " " +c1.modelo);
	//System.out.println("	  Ano: "+c1.ano);
	//System.out.println("	  Cor: "+c1.cor);
	//System.out.println("	  Preço: R$"+c1.preco);
	
	//System.out.println (); //pula linha
	
	//System.out.println("Automóvel: "+c2.marca+ " " +c2.modelo);
	//System.out.println("	  Ano: "+c2.ano);
	//System.out.println("	  Cor: "+c2.cor);
	//System.out.println("	  Preço: R$"+c2.preco);
	
}
	
			}




	
	
	
	
	
	