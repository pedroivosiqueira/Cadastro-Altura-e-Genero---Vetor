package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Main;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, totalF = 0, totalM = 0;
		double menor, maior, mediaF, somaF = 0;
		
		System.out.print("Quantas Pessoas Serão Cadastradas? ");
		n = sc.nextInt();		
		
		Main[] vect = new Main[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Altura da " + (i+1) + "a Pessoa: ");
			double altura = sc.nextDouble();
			
			System.out.print("Gênero da " + (i+1) + "a Pessoa: ");
			char genero = sc.next().charAt(0);
			
			vect[i] = new Main(altura, genero);
		}		
		
		menor = vect[0].getAltura();
		maior = vect[0].getAltura();
		
		for (int i=0; i<vect.length; i++) {
			
			if (vect[i].getGenenro() == 'F') {
				somaF += vect[i].getAltura();
				totalF += 1;				
			}
			else {
				totalM += 1;
			}
			
			if (vect[i].getAltura() < menor) {
				menor = vect[i].getAltura();
			}
			
			if (vect[i].getAltura() > maior) {
				maior = vect[i].getAltura();
			}
		}
		
		mediaF = somaF / totalF;
		
		System.out.printf("Menor Altura = %.2f%n", menor);
		
		System.out.printf("Maior Altura = %.2f%n", maior);		
		
		System.out.printf("Media das Alturas das Mulheres = %.2f%n", mediaF);
		
		System.out.printf("Número de Homens = %d", totalM);		
		
		sc.close();

	}

}
