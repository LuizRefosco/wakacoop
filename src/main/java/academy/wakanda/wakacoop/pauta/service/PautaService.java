package academy.wakanda.wakacoop.pauta.service;

import academy.wakanda.wakacoop.pauta.api.PautaCadastradaResponse;
import academy.wakanda.wakacoop.pauta.api.NovaPautaRequest;
import academy.wakanda.wakacoop.pauta.domain.Pauta;
public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}
