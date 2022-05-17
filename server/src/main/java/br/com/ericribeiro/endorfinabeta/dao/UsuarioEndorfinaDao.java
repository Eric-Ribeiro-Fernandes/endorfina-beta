package br.com.ericribeiro.endorfinabeta.dao;

import javax.persistence.EntityManager;

import javax.transaction.Transactional;

import br.com.ericribeiro.endorfinabeta.models.UsuarioEndorfina;

public class UsuarioEndorfinaDao {
	
	
	private EntityManager em;

	public UsuarioEndorfinaDao(EntityManager em) {
	this.em = em;	
	}

	@Transactional
	public UsuarioEndorfina buscaUsuarioEndorfina(String email) {
		return em.find(UsuarioEndorfina.class, email);
		
	}

}
