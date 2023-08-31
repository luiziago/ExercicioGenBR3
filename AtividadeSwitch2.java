package atividadeControleDeFluxo;

public class AtividadeSwitch2 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);
		
		String nomeColaborador = null, cargo = null;
		int codCargo;
		float salario, novoSalario;
		float reajuste = 0.0f;
		
		System.out.print("\n-------------------------------------------------------------");
		System.out.print("\n|Código do Cargo    |    Cargo      | Percentual de Reajuste|");
		System.out.print("\n------------------------------------------------------------");
		System.out.print("\n| 1                 | Gerente       |         10%           |");
		System.out.print("\n| 2                 | Vendedor      |         7%            |");
		System.out.print("\n| 3                 | Surpervisor   |         9%            |");
		System.out.print("\n| 4                 | Motorista     |         6%            |");
		System.out.print("\n| 5                 | Estoquista    |         5%            |");
		System.out.print("\n| 6                 | Técnico de TI |         8%            |");
		System.out.print("\n------------------------------------------------------------");
		
		System.out.print("\nNome do Colaborador: ");
		nomeColaborador = ler.nextLine();
		System.out.print("\nCargo: ");
		codCargo = ler.nextInt();
		System.out.print("\nSalario: ");
		salario = ler.nextFloat();
		
		switch (codCargo){
		
		case 1:
			cargo = "Gerente";
			reajuste= 10f/100f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste= 7f/100f;
			break;
		case 3:
			cargo = "Surpervisor";
			reajuste= 9f/100f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste= 6f/100f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste= 5f/100f;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste= 8f/100f;
			break;
		}
		
		novoSalario = salario + (reajuste * salario);
		
		System.out.println("\nNome do Colaborador: " + nomeColaborador);
		System.out.println("\nCargo : " + cargo);
		System.out.printf("\nSalario: %.2f", novoSalario);
		
		ler.close();

	}

}
