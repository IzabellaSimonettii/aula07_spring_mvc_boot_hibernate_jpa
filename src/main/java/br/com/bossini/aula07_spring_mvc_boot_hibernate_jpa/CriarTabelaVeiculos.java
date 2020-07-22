package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa;

import javax.persistence.Persistence;

public class CriarTabelaVeiculos {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("izabella");
    }
}
