package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.testes;

import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans.Veiculo;
import br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.repository.JPAUtil;

import javax.persistence.EntityManager;


public class TesteBuscaVeiculoComPlaca {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		Veiculo car = manager.find(Veiculo.class, 1L);
		System.out.println(car);
		manager.close();
		JPAUtil.close();
	}

}
