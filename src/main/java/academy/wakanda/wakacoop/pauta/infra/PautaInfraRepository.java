package academy.wakanda.wakacoop.pauta.infra;

import academy.wakanda.wakacoop.pauta.domain.Pauta;
import academy.wakanda.wakacoop.pauta.repository.PautaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {
    private final PautaSpringDataJpaRepository pautaSpringDataJpaRepository;
    @Override
    public Pauta salva(Pauta pauta) {
        log.info("[start] PautaController - cadastraPauta");
        pautaSpringDataJpaRepository.save(pauta);
        log.info("[finish] PautaController - cadastraPauta");
        return pauta;
    }
}
