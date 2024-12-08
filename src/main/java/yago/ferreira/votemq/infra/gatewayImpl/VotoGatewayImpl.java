package yago.ferreira.votemq.infra.gatewayImpl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import yago.ferreira.votemq.application.dto.VotoRequest;
import yago.ferreira.votemq.application.mappers.VotoMapper;
import yago.ferreira.votemq.gateway.VotoGateway;

@Service
public class VotoGatewayImpl implements VotoGateway {
    private final VotoMapper votoMapper = VotoMapper.INSTANCE;

    private final RabbitTemplate rabbitTemplate;

    public VotoGatewayImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void executeProcessarVoto(Long idCandidato) {
        VotoRequest votoRequest = votoMapper.toVotoRequest(idCandidato);
        rabbitTemplate.convertAndSend("", "", votoRequest);
    }
}
