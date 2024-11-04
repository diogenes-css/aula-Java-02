package aula03;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tec= new Scanner(System.in);
System.out.println("digite o primeiro valor");
double a=tec.nextDouble();
System.out.println("digite o segundo valor");
double b=tec.nextDouble();
double soma = a+b;
System.out.println("o valor da soma e"+ soma);

System.out.println("------------------------------------------------------------------");


System.out.println("digite o primeiro valor");
double aa=tec.nextDouble();
System.out.println("digite o segundo valor");
double ba=tec.nextDouble();
double sub = aa-ba;
System.out.println("o valor da soma e" + sub);

System.out.println("------------------------------------------------------------------");

System.out.println("digite o primeiro valor");
double ab=tec.nextDouble();
System.out.println("digite o segundo valor");
double bb=tec.nextDouble();
double mult = ab*bb;
System.out.println("o valor da soma e" + mult);

System.out.println("------------------------------------------------------------------");

System.out.println("digite o primeiro valor");
double ac=tec.nextDouble();
System.out.println("digite o segundo valor");
double bc=tec.nextDouble();
double divi = ac/bc;
if (bc==0) {
	System.out.println("A divisão com 0 não e possivel");
} else {
	System.out.println("o valor da soma e" + divi);
}
}
}
