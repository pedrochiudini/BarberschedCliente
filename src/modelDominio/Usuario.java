/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;
import java.time.LocalDate;

// Utilizamos Serializable para permitir que objetos da 
// classe Usuario sejam transmitidos pela Internet.
public abstract class Usuario implements Serializable {

    // atributo necessário por causa do Serializable
    private static final long serialVersionUID = 123456789L;

    private int idUsuario;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataCadastro;
    private String login;
    private String senha;

    // iremos declarar 4 construtores
    // construtor com todos os campos para ser usado no SELECT E UPDATE
    public Usuario(int idUsuario, String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
        this.login = login;
        this.senha = senha;
    }

    // construtor sem o código(ID), pois este será usado para fazer INSERT
    // no banco
    public Usuario(String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
        this.login = login;
        this.senha = senha;
    }

    // construtor usado para fazer DELETEs no banco
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // esse construtor será usado para fazer login no sistema
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // esse método será usado para poder verificar todos os campos
    // de um ususário quando dermos um sout de um objeto do tipo Usuario
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", dataCadastro=" + dataCadastro + ", login=" + login + ", senha=" + senha + '}';
    }

}
