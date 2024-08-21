package academy.wakanda.wakacoop.pauta.service;

import academy.wakanda.wakacoop.pauta.api.NovaPautaRequest;
import academy.wakanda.wakacoop.pauta.api.PautaCadastradaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class PautaApliccationService implements PautaService{
    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaController - cadastraPauta");
        log.info("[novaPauta] {}", novaPauta);
        log.info("[finish] PautaController - cadastraPauta");
        return null;
    }
}
