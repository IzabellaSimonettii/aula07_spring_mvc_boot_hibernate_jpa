package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.testes;

import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans.Placa;
import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans.Veiculo;
import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class TesteInsereVeiculoComPlaca {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa p = new Placa();
		p.setCidade("São Paulo");
		manager.persist(p);
		Veiculo car = new Veiculo();
		car.setMarca("Hyundai");
		car.setModelo("Karens");
		car.setAnoModelo(2020);
		car.setPlaca(p);
		manager.persist(car);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
