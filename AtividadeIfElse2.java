package atividadeControleDeFluxo;

public class AtividadeIfElse2 {

	public static void main(String[] args) {
		java.util.Scanner ler = new java.util.Scanner(System.in);
		
		int number;
		
		System.out.print("Digite um número inteiro: ");
		number = ler.nextInt();
		
		if (number % 2 == 0 && number > 0){
			System.out.println("O número "+ number +" é par e positivo!");
		}
		else if(number % 2 != 0 && number <0){
			System.out.println("O número "+ number +" é impar e negativo!");
		}
		else if(number % 2 == 0 && number <0){
			System.out.println("O número "+ number +" é par e negativo!");
		}
		else {
			System.out.println("O número "+ number+" é ímpar e positivo!");
		}
		ler.close();

	}

}
