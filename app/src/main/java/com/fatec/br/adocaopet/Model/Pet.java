package com.fatec.br.adocaopet.Model;

import java.io.Serializable;

public class Pet implements Serializable {
    private String idPet;
    private String nome;
    private String idade;
    private String peso;
    private String porte;
    private String raca;
    private String especie;
    private String sexo;
    private String idUsuario;
    private String descricao;
    private String vermifugado;
    private String vacinado;

    public Pet(){};

    public Pet(String nome, String idade, String descricao){
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public Pet(String idPet, String nome, String idade, String peso, String porte, String raca, String especie, String sexo, String idUsuario, String descricao, String vermifugado, String vacinado) {
        this.idPet = idPet;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.porte = porte;
        this.raca = raca;
        this.especie = especie;
        this.sexo = sexo;
        this.idUsuario = idUsuario;
        this.descricao = descricao;
        this.vermifugado = vermifugado;
        this.vacinado = vacinado;
    }

    public String getVermifugado() {
        return vermifugado;
    }

    public void setVermifugado(String vermifugado) {
        this.vermifugado = vermifugado;
    }

    public String getVacinado() {
        return vacinado;
    }

    public void setVacinado(String vacinado) {
        this.vacinado = vacinado;
    }

    public String getIdPet() {
        return idPet;
    }

    public void setIdPet(String idPet) {
        this.idPet = idPet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
