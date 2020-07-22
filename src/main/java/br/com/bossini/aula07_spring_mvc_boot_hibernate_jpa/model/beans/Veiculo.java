package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String marca;

    @Column(nullable = false, length = 60)
    private String modelo;

    @Column(nullable = false)
    private int anoModelo;

    @OneToOne(optional = false)
    @JoinColumn(name = "jtb_identificador")
    private Placa placa;

//    Muito veiculos podem pertencer a uma pessoa
    @ManyToOne
    private Pessoa pessoa;

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return getAnoModelo() == veiculo.getAnoModelo() &&
                getId().equals(veiculo.getId()) &&
                getMarca().equals(veiculo.getMarca()) &&
                getModelo().equals(veiculo.getModelo()) &&
                getPlaca().equals(veiculo.getPlaca()) &&
                getPessoa().equals(veiculo.getPessoa());
    }

    @Override
    public String toString() {
        return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoModelo=" + anoModelo + ", placa="
                + placa + "]";
    }

}
