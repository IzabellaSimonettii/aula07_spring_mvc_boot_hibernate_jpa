package br.com.bossini.aula07_spring_mvc_boot_hibernate_jpa.model.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_placa")
public class Placa {

    @Id
    @GeneratedValue
    private Long identificador;
    private String cidade;

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Placa)) return false;
        Placa placa = (Placa) o;
        return getIdentificador().equals(placa.getIdentificador()) &&
                getCidade().equals(placa.getCidade());
    }

    @Override
    public String toString() {
        return "Placa [identificador=" + identificador + ", cidade=" + cidade + "]";
    }
}
