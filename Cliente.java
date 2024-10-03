package main9;

import java.time.LocalDate;

//Criar classe Cliente

public class Cliente {

	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private String email;
	private String numeroCartaoFidelidade;
	private String telefone;
	

//Contrutor da classe Cliente
	
	Cliente(String nome, String cpf, LocalDate localDate, String email, String numeroCartaoFidelidade, String telefone){
		
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = localDate;
		this.email = email;
		this.numeroCartaoFidelidade = numeroCartaoFidelidade;
		this.telefone = telefone;
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
			
			//E-MAIL
			public String getEmail() {
				return email;
			}
			
			public void setEmail(String email) {
				this.email = email;
			}
			
			//NÚMERO DO CARTÃO DE FIDELIDADE
			public String getNumeroCartaoFidelidade() {
				return numeroCartaoFidelidade;
			}
			
			public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
				this.numeroCartaoFidelidade = numeroCartaoFidelidade;
			}
			
			//Telefone
			public String getTelefone() {
				return telefone;
			}
			
			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}
}
