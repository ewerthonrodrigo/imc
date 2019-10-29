/**
 * 
 */
package br.com.main;

import java.util.Scanner;

/**
 * @author etecja
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double peso;
		double altura;
		
		
		
		
		System.out.println("Qual seu peso? ");
		peso = scanner.nextDouble();
		
		System.out.println("Qual sua altura? ");
		altura = scanner.nextDouble();
		
		
		Calcular calcular = new Calcular();
		System.out.println("Resultado: " + calcular.calcularImc(peso, altura));
		

	}

}
