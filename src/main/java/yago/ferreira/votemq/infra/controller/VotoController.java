package yago.ferreira.votemq.infra.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import yago.ferreira.votemq.application.dto.VotoRequest;
import yago.ferreira.votemq.application.service.VotoService;

@RestController
@RequestMapping("api/v1/voto")
public class VotoController {
    private final VotoService votoService;

    public VotoController(VotoService votoService) {
        this.votoService = votoService;
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    public void processarVoto(@RequestBody VotoRequest votoRequest) {
        votoService.processarVoto(votoRequest);
    }
}
