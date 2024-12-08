package yago.ferreira.votemq.core.entities;

import java.util.List;

public class Candidato {

    private Long id;
    private String nome;
    private List<Voto> votos;

    public Candidato() {
    }

    public Candidato(Long id, String nome, List<Voto> votos) {
        this.id = id;
        this.nome = nome;
        this.votos = votos;
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

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }
}
