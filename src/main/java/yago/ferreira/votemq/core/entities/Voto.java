package yago.ferreira.votemq.core.entities;

import java.time.LocalDateTime;

public class Voto {

    private Long id;
    private Candidato candidato;
    private LocalDateTime dataHora;

    public Voto() {
    }

    public Voto(Long id, Candidato candidato, LocalDateTime dataHora) {
        this.id = id;
        this.candidato = candidato;
        this.dataHora = dataHora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

}
