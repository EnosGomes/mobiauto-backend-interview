package com.creta.mobi.model;

import java.time.LocalDate;
import java.util.UUID;

public class Oportunidade {

    private UUID uuid;
    private String motivoConclusao;
    private Boolean isDisponivel;
    private Usuario assistenteResposavel;
    private LocalDate dataAtribuicao;
    private LocalDate dataConclusao;
}
