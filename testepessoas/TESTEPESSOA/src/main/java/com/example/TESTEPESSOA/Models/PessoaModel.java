package com.example.TESTEPESSOA.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB2_PESS")
public class PessoaModel {

    private static final int serialVersiomUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String pess2_nom;

    private Date pess2_dat_nas;

    private Integer ende2_cod;

    public UUID getId() {
        return id;
    }

    public void setId(UUID pess2_cod) {
        this.id = id;
    }

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

    public Integer getEnde2_cod() {
        return ende2_cod;
    }

    public void setEnde2_cod(Integer ende2_cod) {
        this.ende2_cod = ende2_cod;
    }
}
