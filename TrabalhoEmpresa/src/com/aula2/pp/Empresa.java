package com.aula2.pp;
import java.util.*;

public class Empresa {
	
	Scanner read = new Scanner(System.in);
	
	private String Razao;
	private String CNPJ;
	private String NFuncionarios;
	private String Email;
	private String Ramo;
	private String Telefone;
	
	public Empresa() {};
	
	public void CadastrarEmpresa(int i) {
		System.out.println("\nCadastro da " + i + "° empresa\n");
		
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
		
		String resp = "sim";
		ArrayList<Departamentos> departamentos_list = new ArrayList<Departamentos>();
		
		do {
		System.out.println("\nDeseja Cadastrar um departamento?");
		resp = read.nextLine().toLowerCase();
			if(resp.equals("sim")) {
				AdicionarDepartamento(departamentos_list);
			} else {
				System.out.println("\nContinuar.\n");
			}
		} while (resp.equals("sim"));
		
		ShowDadosEmpresa(i, departamentos_list);
	}
	
	public ArrayList<Departamentos> AdicionarDepartamento(ArrayList<Departamentos> departamentos_list) {
		Departamentos dep = new Departamentos();
		dep.CadastrarDepartamento();
		departamentos_list.add(dep);
		return departamentos_list;
	}
	
	public void ShowDadosEmpresa(int i, ArrayList<Departamentos> dep) {
		System.out.println("\n*-- Dados cadastrados da Empresa " + i +  " --*\n");
		System.out.println("Razão social: " + getRazao());
		System.out.println("CNPJ: " + getCNPJ());
		System.out.println("Email: " + getEmail());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Número de funcionários: " + getNFuncionarios());
		System.out.println("Ramo: " + getRamo());
		System.out.println("\nDEPARTAMENTOS\n");
		for (int j = 0; j < dep.size(); j++) {
		    System.out.println("Ramo do departamento: " + dep.get(j).getRamoDepartamento());
			System.out.println("Número de funcionários do Departamento: " + dep.get(j).getNumeroFuncionarios());
			dep.get(j).ShowListaFuncionarios();
			System.out.println("\n");
		}
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
