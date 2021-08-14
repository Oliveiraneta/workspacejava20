
public class EmpresgadoTeste {
	public static void main(String[] args) {
		
		//declarar
		
		Empregado e1, e2, e3;
		
		e1 = new Empregado();
		e2 = new Empregado();
		e3 = new Empregado();
		
		e1.nome  	="Professor Isidro";
		e1.cargo	="Professor";
		e1.salario	=5000.00;
		
		e2.nome  	="Vandeco";
		e2.cargo	="Patrão";
		e2.salario	=10000.00;
		
		e3.nome  	="Anne";
		e3.cargo	="Presidente";
		e3.salario	=15000.00;
			
		
		System.out.println("----- antes do aumento do Ordenado");
		
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();


		System.out.println();		
				
				
		e1.aumentarSalario(10);	
		e2.aumentarSalario(12);	
		e3.aumentarSalario(15);	
				
		System.out.println("----- Depois do aumento do Ordenado");
		
		
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();
		
	}

}
