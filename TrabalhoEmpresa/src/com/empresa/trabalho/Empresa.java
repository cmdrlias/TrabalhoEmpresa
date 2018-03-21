package com.empresa.trabalho;
import java.util.*;

public class Empresa {
	
	Scanner read = new Scanner(System.in);
	
	private String Razao;
	private String CNPJ;
	private String NFuncionarios;
	private String Email;
	private String Ramo;
	private String Telefone;
	public ArrayList<Departamentos> departamentos_list = new ArrayList<Departamentos>();
	public ArrayList<Funcionarios> funcionarios_list = new ArrayList<Funcionarios>();
	
	public Empresa() {};
	
	public void CadastrarEmpresa() {
		System.out.printf("Razão Social: ");
		setRazao(read.nextLine());
		System.out.printf("CNPJ: ");
		setCNPJ(read.nextLine());
		System.out.printf("Email: ");
		setEmail(read.nextLine());
		System.out.printf("Telefone: ");
		setTelefone(read.nextLine());
		System.out.printf("Número de Funcionários: ");
		setNFuncionarios(read.nextLine());
		System.out.printf("Ramo da Empresa: ");
		setRamo(read.nextLine());
		
		Menu();
	}
	
	public void Menu() {
		System.out.printf("\nO QUE DESEJA FAZER?"
				+ "\n1. Cadastrar Departamento"
				+ "\n2. Cadastrar Funcionário"
				+ "\n3. Listar Departamentos"
				+ "\n4. Listar Funcionarios"
				+ "\n5. Trocar Funcionario de Departamento"
				+ "\n6. Bonificar um Funcionário"
				+ "\n7. Promover um Funcionário"
				+ "\n8. Sair");
		int resp = read.nextInt();
		switch(resp) {
			case 1:
				AdicionarDepartamento();
				break;
			case 2:
				AdicionarFuncionario();
				break;
			case 3:
				ShowDadosEmpresa();
				break;
			case 4:
				ShowDadosFuncionarios();
				break;
			case 5:
				TrocarFuncionarioDepartamento();
				break;
			case 6:
				BonificarFuncionario();
				break;
			case 7:
				PromoverFuncionario();
			case 8:
				System.out.println("\nObrigado!");
				break;
			default:
				System.out.println("\nOpção inválida!");
		}
	}
	
	public void AdicionarFuncionario() {
		Funcionarios func = new Funcionarios();
		func.CadastrarFuncionario();
		funcionarios_list.add(func);
	}
	
	public void AdicionarDepartamento() {
		Departamentos dep = new Departamentos();
		dep.CadastrarDepartamento();
		departamentos_list.add(dep);
	}
	
	public void ShowDadosFuncionarios() {
		for(int j = 0; j < funcionarios_list.size(); j++) {
			System.out.println("Nome: " + funcionarios_list.get(j).getNomeFuncionario());
			System.out.println("CPF: " + funcionarios_list.get(j).getCPF());
			System.out.println("RG: " + funcionarios_list.get(j).getRG());
			System.out.println("Nivel de Cargo: " + funcionarios_list.get(j).getNivelCargo());
			System.out.println("Data de Admissão: " + funcionarios_list.get(j).getDataEntrada());
			System.out.println("Salário: " + funcionarios_list.get(j).getSalario());
		}
	}
	
	public void ShowDadosEmpresa() {
		for (int j = 0; j < departamentos_list.size(); j++) {
		    System.out.println("Ramo do departamento: " + departamentos_list.get(j).getRamoDepartamento());
			System.out.println("Número de funcionários do Departamento: " + departamentos_list.get(j).getNumeroFuncionarios());
			System.out.println("\n");
		}
	}
	
	public void TrocarFuncionarioDepartamento() {
		System.out.println("Selecione o funcionário: ");
		for(int i = 0; i < funcionarios_list.size(); i++) {
			System.out.printf((i + 1) + "\tNome: " + funcionarios_list.get(i).getNomeFuncionario());
		}
		int opc_funcionario = read.nextInt();
		
		System.out.println("Selecione o departamento: ");
		for(int i = 0; i < departamentos_list.size(); i++) {
			System.out.printf((i + 1) + "\nRamo do departamento: " + departamentos_list.get(i).getRamoDepartamento());
		}
		int opc_departamento = read.nextInt();
		
		funcionarios_list.get(opc_funcionario - 1).setDepartamentoFuncionario(departamentos_list.get(opc_departamento - 1).getRamoDepartamento());
		System.out.println("Funcionário transferido para o departamento com sucesso!");
		departamentos_list.get(opc_departamento - 1).setNumeroFuncionarios(departamentos_list.get(opc_departamento - 1).getNumeroFuncionarios() + 1);
	}
	
	public void BonificarFuncionario() {
		System.out.println("Selecione o funcionário a ser bonificado: ");
		for(int i = 0; i < funcionarios_list.size(); i++) {
			System.out.printf((i + 1) + "\tNome: " + funcionarios_list.get(i).getNomeFuncionario());
		}
		int opc_funcionario = read.nextInt();
		
		float bonificacao = 0, porc = 0, sal_atual = funcionarios_list.get(opc_funcionario).getSalario();
		System.out.println("Porcentagem da bonificação: ");
		porc = read.nextFloat();
		bonificacao = sal_atual * porc;
		funcionarios_list.get(opc_funcionario).setSalario(bonificacao + sal_atual);
		System.out.println("Salário atual: " + funcionarios_list.get(opc_funcionario).getSalario());
	}
	
	public void PromoverFuncionario() {
		System.out.println("Selecione o funcionário a ser bonificado: ");
		for(int i = 0; i < funcionarios_list.size(); i++) {
			System.out.printf((i + 1) + "\tNome: " + funcionarios_list.get(i).getNomeFuncionario());
		}
		
		int opc_funcionario = read.nextInt();
		System.out.println("Novo cargo do funcionário: ");
		funcionarios_list.get(opc_funcionario).setNivelCargo(read.nextLine());
	}
	
	public String getRazao() {
		return Razao;
	}
	public void setRazao(String razao) {
		Razao = razao;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNFuncionarios() {
		return NFuncionarios;
	}
	public void setNFuncionarios(String nFuncionarios) {
		NFuncionarios = nFuncionarios;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRamo() {
		return Ramo;
	}
	public void setRamo(String ramo) {
		Ramo = ramo;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}	
}
