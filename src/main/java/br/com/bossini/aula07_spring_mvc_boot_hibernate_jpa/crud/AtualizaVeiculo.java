package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans.Veiculo;
import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.repository.JPAUtil;

public class AtualizaVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo car = manager.find(Veiculo.class, 1L);
		car.setMarca("Honda");
		car.setModelo("Fit");
		car.setAnoModelo(2020);
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}

}
