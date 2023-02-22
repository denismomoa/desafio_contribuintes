package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TaxPayer x;
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite os dados do " + (i+1) + "o contribuinte:");
			System.out.print("Renda anual com salário: ");
			double salarioAnual = sc.nextDouble();	
			System.out.print("Renda anual com prestação de serviço: ");
			double servicoAnual = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalAnual = sc.nextDouble();
			System.out.print("Gastos Médicos: ");
			double gastosMedicos = sc.nextDouble();
			System.out.print("Gastos Educaionais: ");
			double gastosEducacionais = sc.nextDouble();
			
			x = new TaxPayer(salarioAnual, servicoAnual, capitalAnual, gastosMedicos, gastosEducacionais);
			list.add(x);
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i<n;i++) {
			for (TaxPayer obj : list) {
				System.out.println("Resumo do " + (i) + "o contribuinte:");
				System.out.println(obj);
				i++;
			}
		}
		
		sc.close();
	}

}
