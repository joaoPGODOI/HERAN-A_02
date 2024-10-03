package main9;

import java.time.LocalDate; 

public class main {

	public static void main(String[] args) {
	
	//Criar objetos
		
//Objeto vendedor
	
	Vendedor vendedor1 = new Vendedor("Mario Gonzales", "177.547.244-07,",LocalDate.of(1970, 01, 01), LocalDate.of(2012, 2, 15), 4000.00, 8.4);	
	
//Objeto Gerente
	
	Gerente gerente1 = new Gerente("Miguel Gomes", "167.473.982-05", LocalDate.of(1965, 03, 25), LocalDate.of(2007, 04, 05), 6000.00 , "Gerente de vendas");

//Objeto Cliente
	
	Cliente cliente1 = new Cliente("Dexter Morgan", "189.453.234-06", LocalDate.of(1983, 07, 13), "dexmorgan@gmail.com", "147-92", "(15)9963-4622");
	
	
	//Exibir objetos
	System.out.println(vendedor1);
	System.out.println(gerente1);
	System.out.println(cliente1);
	}

}
