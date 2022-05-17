package br.com.ericribeiro.endorfinabeta.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_endorfina")
public class Login {
	@Column(name = "id")
	@Id
	private String email;
	
	@Column(name ="senha")
	private String senha;
	
	// Construtor Personalizado
	public  Login(String email, String senha){
			
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	// Construtor Padrão
	Login(){
		
	}
}
