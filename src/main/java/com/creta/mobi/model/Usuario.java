package com.creta.mobi.model;

import com.creta.mobi.enums.Cargo;
import com.creta.mobi.enums.TipoUsuario;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Usuario {

    private UUID uuid;
    private String email;
    private String nome;
    private String password;
    private String telefone;
    private Cargo cargo;
    private TipoUsuario tipoUsuario;
}
