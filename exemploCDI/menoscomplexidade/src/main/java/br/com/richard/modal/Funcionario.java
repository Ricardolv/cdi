package br.com.richard.modal;

import java.io.Serializable;

public class Funcionario  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Escolaridade escolaridade;
	private Cargo cargo;
	private Double salario;

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public int getAnoAdmissao() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
