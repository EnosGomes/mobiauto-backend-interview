package com.creta.mobi.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Revenda {

    private UUID uuiid;
    private String cnpj;
    private String nomeSocial;



}
