package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		System.out.println("Quantas casas serao alugadas? ");
		System.out.print(": ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.println("Numero da casa alugada: ");
			int casa = sc.nextInt();
			
			vect[casa] = new Aluguel(name, email, casa);
		}
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i]!= null) {
				System.out.print(vect[i].getQuarto()+":  " + vect[i].getName() + ", " + vect[i].getEmail());
				System.out.println();
			}
		}
		
		sc.close();
	}

}
