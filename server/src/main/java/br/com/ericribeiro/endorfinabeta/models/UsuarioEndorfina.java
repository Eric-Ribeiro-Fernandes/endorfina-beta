package br.com.ericribeiro.endorfinabeta.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_endorfina")
public class UsuarioEndorfina {
	@Column(name = "id")
	@Id
	private String email;
	
	@Column(name = "nm_usuario")
	private String nome;
	
	@Column(name = "nm_primeiro_nome")
	private String Primeironome;
	

	@Column(name = "nm_sobrenome")
	private String sobrenome;
	
	@Column(name = "nr_cpf")
	private String cpf;
	
	@Column(name = "dt_criacao_cadastro")
	private LocalDate dataCriacaoCadastro ;
	
	@Column(name = "dt_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "id_strava")
	private Long idStrava;
	
	
	// Construtor proprio
	public UsuarioEndorfina(String email) {
		this.email = email;
		
	}
	
	// Construtor padrão
	public UsuarioEndorfina() {

		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrimeironome() {
		return Primeironome;
	}
	
	public void setPrimeironome(String primeironome) {
		Primeironome = primeironome;
	}
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataCriacaoCadastro() {
		return dataCriacaoCadastro;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getIdStrava() {
		return this.idStrava;
	}

	public void setIdStrava(Long idStrava) {
		this.idStrava = idStrava;
	}
	
	
	
	
	
}
