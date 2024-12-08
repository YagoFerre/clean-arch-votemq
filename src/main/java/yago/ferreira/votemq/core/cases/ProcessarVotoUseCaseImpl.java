package yago.ferreira.votemq.core.cases;

import yago.ferreira.votemq.gateway.VotoGateway;

public class ProcessarVotoUseCaseImpl implements ProcessarVotoUseCase {
    private final VotoGateway gateway;

    public ProcessarVotoUseCaseImpl(VotoGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processarVoto(Long idCandidato) {
        gateway.executeProcessarVoto(idCandidato);
    }
}
