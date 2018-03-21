package com.empresa.trabalho;
import java.util.*;

public class Funcionarios {
	Scanner read = new Scanner(System.in);
	
	private String DepartamentoFuncionario;
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
		
		System.out.println("Salário anual do funcionário: ");
		SalarioAnual();
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
	public String getDepartamentoFuncionario() {
		return DepartamentoFuncionario;
	}

	public void setDepartamentoFuncionario(String departamentoFuncionario) {
		DepartamentoFuncionario = departamentoFuncionario;
	}

}
