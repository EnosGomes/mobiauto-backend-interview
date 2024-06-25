package com.creta.mobi.model;

import lombok.Data;

import java.util.Set;

@Data

public class Loja {

    private String nome;
    private Set<Usuario> proprietarios;
    private Set<Usuario> gerentes;
    private Set<Usuario> funcionarios;
    private Set<Oportunidade> oportunidades;
}
