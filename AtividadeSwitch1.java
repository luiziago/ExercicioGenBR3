package atividadeControleDeFluxo;

public class AtividadeSwitch1 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);
		
		String prod = null;
		int codigo, quantidade, preco = 0, valorTotal; 
		
		System.out.print("\n------------------------------------");
		System.out.print("\n| 1 | Cachorro quente | R$ 10,00   |");
		System.out.print("\n| 2 | X-Salada        | R$ 15,00   |");
		System.out.print("\n| 3 | X-Bacon         | R$ 18,00   |");
		System.out.print("\n| 4 | Bauru           | R$ 12,00   |");
		System.out.print("\n| 5 | Refrigerante    | R$ 8,00    |");
		System.out.print("\n| 6 | Suco de Laranja | R$ 13,00   |");
		System.out.print("\n------------------------------------");
		
		System.out.print("\nCódigo do pedido: ");
		codigo = ler.nextInt();
		System.out.print("\nQuantidade: ");
		quantidade = ler.nextInt();
		
		switch (codigo){
		
		case 1:
			prod= "Cachorro Quente";
			preco = 10;
			break;
		case 2:
			prod=("X-Salada");
			preco = 15;
			break;
		case 3:
			prod=("X-Bacon");
			preco = 18;
			break;
		case 4:
			prod=("Bauru");
			preco = 12;
			break;
		case 5:
			prod=("Refrigerante");
			preco = 8;
			break;
		case 6:
			prod=("Suco de Laranja");
			preco = 13;	
			break;
		}
		
		valorTotal = quantidade * preco;
		
		System.out.println("Produto: " + prod);
		System.out.println("Valor Total: " + valorTotal);
		
		ler.close();
	}

}
