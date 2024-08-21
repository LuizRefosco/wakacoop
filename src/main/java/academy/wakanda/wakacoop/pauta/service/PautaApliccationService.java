package academy.wakanda.wakacoop.pauta.service;

import academy.wakanda.wakacoop.pauta.api.NovaPautaRequest;
import academy.wakanda.wakacoop.pauta.api.PautaCadastradaResponse;
import academy.wakanda.wakacoop.pauta.domain.Pauta;
import academy.wakanda.wakacoop.pauta.repository.PautaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class PautaApliccationService implements PautaService{
    private final PautaRepository pautaRepository;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaController - cadastraPauta");
        log.info("[novaPauta] {}", novaPauta);
        Pauta pauta = pautaRepository.salva(new Pauta(novaPauta));
        log.info("[finish] PautaController - cadastraPauta");
        return new PautaCadastradaResponse(pauta);
    }
}
