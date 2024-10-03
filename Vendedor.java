package main9;

import java.time.LocalDate;

//Criar classe Vendedor
public class Vendedor {

		private String nome;
		private String cpf;
		private LocalDate dataNascimento;
		private LocalDate dataContratacao;
		private double salarioBase;
		private double percentualComissao;
		
//Construtor da classe
	
	public Vendedor(String nome, String cpf, LocalDate localDate, LocalDate localDate2, double salarioBase, double percentualComissao) {
	
	    this.nome = nome;
	    this.cpf = cpf;
	    this.dataNascimento = localDate;
	    this.dataContratacao = localDate2;
	    this.salarioBase = salarioBase;
	    this.percentualComissao = percentualComissao;
	    
    }
		
	
//Encapsular com Get e set
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//CPF
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//DATA NASCIMENTO
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//DATA CONTRATAÇÃO
	public String getDataContratacao() {
		return dataContratacao;
	}
	
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	//SALÁRIO BASE
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	//PERCENTUAL COMISSÃO
	public double getPercentualComissao() {
		return percentualComissao;
	}
	
	public void setSlarioComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	
}

