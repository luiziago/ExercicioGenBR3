package atividadeControleDeFluxo;

public class AtivdadeIfElse1 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.print("A: ");
		a = ler.nextInt();
		System.out.print("B: ");
		b = ler.nextInt();
		System.out.print("C: ");
		c = ler.nextInt();
		
		soma = a + b;
		
		if (soma > c){
			System.out.println(a + " + " + b + " = " + soma + " > " + c);
			System.out.println("A soma de A + B é maior que C");
		}
		else if (soma < c){
			System.out.println(a + " + " + b + " = " + soma + " < " + c);
			System.out.println("A soma de A + B é menor que C");
		}
		else {
			System.out.println(a + " + " + b + " = " + soma + " = " + c);
			System.out.println("A soma de A + B é igual a C");
		}
		ler.close();
	}

}
