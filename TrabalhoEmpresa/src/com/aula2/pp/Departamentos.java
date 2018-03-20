package com.aula2.pp;
import java.util.*;

public class Departamentos extends Empresa {
	Scanner read = new Scanner(System.in);
	
	private String RamoDepartamento;
	private String NumeroFuncionarios;
	public ArrayList<Funcionarios> funcionarios_list;
	
	public Departamentos() {}
	
	public void CadastrarDepartamento() {
		System.out.printf("\nRamo do Departamento: ");
		setRamoDepartamento(read.nextLine());
		System.out.printf("Número de funcionários do departamento: ");
		setNumeroFuncionarios(read.nextLine());
		
		String resp = "sim";
		funcionarios_list = new ArrayList<Funcionarios>();
		
		do {
		System.out.println("\nDeseja Cadastrar um funcionário?");
		resp = read.nextLine().toLowerCase();
			if(resp.equals("sim")) {
				AdicionarFuncionario(funcionarios_list);
			} else {
				System.out.println("\nContinuar.\n");
			}
		} while (resp.equals("sim"));
	}
	
	public ArrayList<Funcionarios> AdicionarFuncionario(ArrayList<Funcionarios> funcionarios_list) {
		Funcionarios func = new Funcionarios();
		func.CadastrarFuncionario();
		funcionarios_list.add(func);
		return funcionarios_list;
	}
	
	public void ShowListaFuncionarios() {
		System.out.println("\nFuncionários do Departamento\n");
		for(int j = 0; j < funcionarios_list.size(); j++) {
			System.out.println("Nome: " + funcionarios_list.get(j).getNomeFuncionario());
			System.out.println("CPF: " + funcionarios_list.get(j).getCPF());
			System.out.println("RG: " + funcionarios_list.get(j).getRG());
			System.out.println("Nivel de Cargo: " + funcionarios_list.get(j).getNivelCargo());
			System.out.println("Data de Admissão: " + funcionarios_list.get(j).getDataEntrada());
			System.out.println("Salário: " + funcionarios_list.get(j).getSalario());
		}
	}
	
	public String getRamoDepartamento() {
		return RamoDepartamento;
	}
	public void setRamoDepartamento(String ramoDepartamento) {
		RamoDepartamento = ramoDepartamento;
	}

	public String getNumeroFuncionarios() {
		return NumeroFuncionarios;
	}

	public void setNumeroFuncionarios(String numeroFuncionarios) {
		NumeroFuncionarios = numeroFuncionarios;
	}
	
	

}
