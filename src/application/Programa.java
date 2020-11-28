package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contribuinte contribuinte;
		List<Contribuinte> lista = new ArrayList<>();				
		
		System.out.print("Informe quantos contribuintes são: ");
		int numCont = sc.nextInt();
		
		for(int x = 0; x < numCont ; x++) {
			System.out.print("Pessoa Fisica ou Pessoa Jurifica?(F/J)");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if(c == 'F') {
				
				System.out.print("Gasto com saude: ");
				Double gastoSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
				
			}else {
				
				System.out.print("Quantos Funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual,numeroFuncionarios));
			}
		}
		
		System.out.println("IMPRIMINDO");

		for(Contribuinte c : lista) {
			System.out.print(c.getNome() + 
					" - Renda Anual: R$" + 
					String.format("%.2f",c.getRendaAnual()) +
					" - Imposto: R$ " +
					String.format("%.2f",c.impostoPago()));
			System.out.println(2);
		}
	}

}
