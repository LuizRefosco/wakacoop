package academy.wakanda.wakacoop.pauta.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class NovaPautaRequest {
    @NotBlank
    private String titulo;
    @NotBlank
    private String descricao;
    @NotNull
    private UUID idAssociadoAutor;
}
