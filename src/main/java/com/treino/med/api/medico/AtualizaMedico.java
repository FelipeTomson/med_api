package com.treino.med.api.medico;

import com.treino.med.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record AtualizaMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
        ){

}

