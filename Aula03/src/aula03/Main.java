package aula03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner tec = new Scanner (System.in);	
		
		
		System.out.println("digite as horas trabalhadas por mês");
		int a = tec.nextInt();
		
		System.out.println("digite o salario por hora");
		int b = tec.nextInt();
		
		double id=(a*b);
			
	System.out.println("seu salario e de"+" "+id);
		
	}
}