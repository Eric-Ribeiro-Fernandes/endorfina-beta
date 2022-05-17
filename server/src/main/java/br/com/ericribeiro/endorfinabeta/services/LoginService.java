package br.com.ericribeiro.endorfinabeta.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import br.com.ericribeiro.endorfinabeta.dao.UsuarioEndorfinaDao;
import br.com.ericribeiro.endorfinabeta.models.Login;
import br.com.ericribeiro.endorfinabeta.models.UsuarioEndorfina;
import br.com.ericribeiro.endorfinabeta.util.JPAUil;

public class LoginService {
	
	@PersistenceContext
	EntityManager em;
	
	
    UsuarioEndorfinaDao dao;
	
	public static void main(String[] args) {
		
		EntityManager em = JPAUil.getEntityManager();
		
		String email = "ze@gmail.com";
		String senha = "1234567";
		
		Login login = new Login(email,senha);
		
		
		
		
		Login credentials = em.find(Login.class, login.getEmail());
		
		if(login.getEmail().equals(credentials.getEmail()) 
				&& 
				login.getSenha().equals(credentials.getSenha())) {
			
			
			System.out.println("Usuario pode entrar");
			
			UsuarioEndorfinaDao dao = new UsuarioEndorfinaDao(em);
			
			UsuarioEndorfina user =  em.find(UsuarioEndorfina.class,login.getEmail());
			
			
			System.out.println("Nome: " + user.getNome());
			System.out.println("Email: " + user.getEmail());
			System.out.println("CPF: " + user.getSobrenome());
			
			
			
			
			;
		} else {System.out.println("Credenciais inválidas");}
		
		
		
		
	}

    
    
}
