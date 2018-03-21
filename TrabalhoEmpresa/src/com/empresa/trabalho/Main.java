package com.empresa.trabalho;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i = 1;
		String resp = null;
		ArrayList<Empresa> empresa = new ArrayList<Empresa>();
		System.out.println("*-- CADASTRAR EMPRESA --*");
		
		do {
			System.out.println("\nDeseja cadastrar uma empresa?");
			resp = read.nextLine().toLowerCase();
			if (resp.equals("sim")) {
				Empresa emp = new Empresa();
				emp.CadastrarEmpresa(i);
				empresa.add(emp);
				i++;
			} else {
				System.out.println("\n*-- OBRIGADO --*\n");
			}
		} while(resp.equals("sim"));
		
		read.close();
	}
}
