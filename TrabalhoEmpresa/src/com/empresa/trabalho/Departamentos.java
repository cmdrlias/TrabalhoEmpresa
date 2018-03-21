package com.empresa.trabalho;
import java.util.*;

public class Departamentos extends Empresa {
	Scanner read = new Scanner(System.in);
	
	private String RamoDepartamento;
	private int NumeroFuncionarios;
	
	public Departamentos() {}
	
	public void CadastrarDepartamento() {
		System.out.printf("\nRamo do Departamento: ");
		setRamoDepartamento(read.nextLine());
		System.out.printf("Número de funcionários do departamento: ");
		setNumeroFuncionarios(read.nextInt());
	}
	
	public String getRamoDepartamento() {
		return RamoDepartamento;
	}
	public void setRamoDepartamento(String ramoDepartamento) {
		RamoDepartamento = ramoDepartamento;
	}

	public int getNumeroFuncionarios() {
		return NumeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		NumeroFuncionarios = numeroFuncionarios;
	}
	
	

}
