package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

//    EXERCICIO
//    1. Estabeleça um relacionamento 1 x N entre a classe Veículo já existente e uma nova classe chamada Pessoa:
//    Uma pessoa tem N veículos e um veículo pertence a uma única pessoa. Faça as anotações apropriadas usando a JPA.

//    AQUI UMA PESSOA PODE TER MUITOS VEICULOS
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Veiculo> veiculos;

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
