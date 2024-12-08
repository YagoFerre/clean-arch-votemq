package yago.ferreira.votemq.application.service;

import org.springframework.stereotype.Service;
import yago.ferreira.votemq.application.dto.VotoRequest;
import yago.ferreira.votemq.application.mappers.VotoMapper;
import yago.ferreira.votemq.gateway.VotoGateway;

@Service
public class VotoService {
    private final VotoGateway gateway;
    private final VotoMapper mapper;

    public VotoService(VotoGateway gateway, VotoMapper mapper) {
        this.gateway = gateway;
        this.mapper = mapper;
    }

    public void processarVoto(VotoRequest request) {
        Long candidatoId = mapper.toLong(request);
        gateway.executeProcessarVoto(candidatoId);
    }
}
