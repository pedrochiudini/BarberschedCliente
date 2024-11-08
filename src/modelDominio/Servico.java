/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;

public class Servico implements Serializable {

    private static final long serialVersionUID = 123456789L;

    private int idServico;
    private String nome;
    private int valor;

    // construtor com todos os campos para ser usado no SELECT E UPDATE
    public Servico(int idServico, String nome, int valor) {
        this.idServico = idServico;
        this.nome = nome;
        this.valor = valor;
    }

    // construtor sem o código(ID), pois este será usado para fazer INSERT no banco
    public Servico(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // construtor usado para fazer DELETEs no banco
    public Servico(int idServico) {
        this.idServico = idServico;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" + "idServico=" + idServico + ", nome=" + nome + ", valor=" + valor + '}';
    }

}
