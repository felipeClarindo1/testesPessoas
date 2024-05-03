package com.example.TESTEPESSOA.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public class EnderecoDto {

    @NotBlank
    private String ende2_rua;
    @NotBlank
    private String ende2_lorg;
    @NotBlank
    private String ende2_cep;
    @NotBlank
    private Integer ende2_num;
    @NotBlank
    private String ende2_cida;
    @NotBlank
    private String ende2_esta;
    @NotBlank
    private UUID pess2_cod;


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

    public String getPess2_cod() {
        return pess2_cod;
    }

    public void setPess2_cod(String pess2_cod) {
        this.pess2_cod = pess2_cod;
    }
}
