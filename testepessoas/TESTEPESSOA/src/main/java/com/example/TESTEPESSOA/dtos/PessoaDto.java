package com.example.TESTEPESSOA.dtos;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.Date;

public class PessoaDto {


    private String pess2_nom;

    private Date pess2_dat_nas;

    public String getPess2_nom() {
        return pess2_nom;
    }

    public void setPess2_nom(String pess2_nom) {
        this.pess2_nom = pess2_nom;
    }

    public Date getPess2_dat_nas() {
        return pess2_dat_nas;
    }

    public void setPess2_dat_nas(Date pess2_dat_nas) {
        this.pess2_dat_nas = pess2_dat_nas;
    }
}
