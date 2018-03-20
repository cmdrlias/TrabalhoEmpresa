package com.aula2.pp;
import java.util.*;

public class Funcionarios extends Departamentos {
	Scanner read = new Scanner(System.in);
	
	private String NomeFuncionario;
	private String CPF;
	private String RG;
	private String NivelCargo;
	private String DataEntrada;
	private float Salario;
	
	public void CadastrarFuncionario() {
		System.out.printf("\nNome: ");
		setNomeFuncionario(read.nextLine());
		System.out.printf("CPF: ");
		setCPF(read.nextLine());
		System.out.printf("RG: ");
		setRG(read.nextLine());
		System.out.printf("Nivel de Cargo: ");
		setNivelCargo(read.nextLine());
		System.out.printf("Data de Admissão: ");
		setDataEntrada(read.nextLine());
		System.out.printf("Salário: ");
		setSalario(read.nextFloat());
		int resp = 0;
		do {
			System.out.println("O que deseja fazer?"
					+ "\n1. Bonificar Funcionário"
					+ "\n2. Trocar Funcionário de Departamento"
					+ "\n3. Promover Funcionário"
					+ "\n4. Calcular Valor Anual do Salário"
					+ "\n5. Finalizar");
			resp = read.nextInt();
			switch(resp) {
				case 1:
					BonificarFuncionario();
					break;
				case 2:
					TrocarDepartamento();
					break;
				case 3:
					PromoverFuncionario();
					break;
				case 4:
					SalarioAnual();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		} while(resp != 5);
	}
	
	public float BonificarFuncionario() {
		float bonificacao = 0, porc = 0, sal_atual = getSalario();
		System.out.println("Porcentagem da bonificação: ");
		porc = read.nextFloat();
		bonificacao = getSalario() * porc;
		setSalario(bonificacao + sal_atual);
		return getSalario();
	}
	
	public void TrocarDepartamento() {
		
	}
	
	public void PromoverFuncionario() {
		System.out.println("Novo cargo do funcionário: ");
		setNivelCargo(read.nextLine());
	}
	
	public void SalarioAnual() {
		System.out.println("Valor anual: " + (getSalario() * 12));
	}
	
	public String getNomeFuncionario() {
		return NomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		NomeFuncionario = nomeFuncionario;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getNivelCargo() {
		return NivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		NivelCargo = nivelCargo;
	}
	public String getDataEntrada() {
		return DataEntrada;
	}
	public void setDataEntrada(String dataAcesso) {
		DataEntrada = dataAcesso;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}

}
