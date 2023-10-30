package com.treino.med.api.medico;

public record DadosListagemMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Enum especialidade) {

    public DadosListagemMedico(Medico medico){
        this(medico.getId(),
             medico.getNome(),
             medico.getEmail(),
             medico.getCrm(),
             medico.getEspecialidade());
    }

}
