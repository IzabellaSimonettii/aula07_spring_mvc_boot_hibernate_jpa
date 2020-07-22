package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.testes;

import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans.Placa;
import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class TesteRemoveVeiculoComPlaca {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa p = manager.find(Placa.class, 1L);
		manager.remove(p);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
