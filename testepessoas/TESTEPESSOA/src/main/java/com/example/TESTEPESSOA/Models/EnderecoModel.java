package com.example.TESTEPESSOA.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "TB2_ENDE")
public class EnderecoModel {

    private static final int serialVersiomUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ende2_rua;

    private String ende2_lorg;

    private String ende2_cep;

    private Integer ende2_num;

    private String ende2_cida;

    private String ende2_esta;

    private Integer pess2_cod;


    public UUID getId() {
        return id;
    }

    public void setId(UUID ende2_cod) {
        this.id = id;
    }

    public String getEnde2_rua() {
        return ende2_rua;
    }

    public void setEnde2_rua(String ende2_rua) {
        this.ende2_rua = ende2_rua;
    }

    public String getEnde2_lorg() {
        return ende2_lorg;
    }

    public void setEnde2_lorg(String ende2_lorg) {
        this.ende2_lorg = ende2_lorg;
    }

    public String getEnde2_cep() {
        return ende2_cep;
    }

    public void setEnde2_cep(String ende2_cep) {
        this.ende2_cep = ende2_cep;
    }

    public Integer getEnde2_num() {
        return ende2_num;
    }

    public void setEnde2_num(Integer ende2_num) {
        this.ende2_num = ende2_num;
    }

    public String getEnde2_cida() {
        return ende2_cida;
    }

    public void setEnde2_cida(String ende2_cida) {
        this.ende2_cida = ende2_cida;
    }

    public String getEnde2_esta() {
        return ende2_esta;
    }

    public void setEnde2_esta(String ende2_esta) {
        this.ende2_esta = ende2_esta;
    }

    public Integer getPess2_cod() {
        return pess2_cod;
    }

    public void setPess2_cod(Integer pess2_cod) {
        this.pess2_cod = pess2_cod;
    }
}
