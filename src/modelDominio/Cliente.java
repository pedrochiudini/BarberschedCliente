/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;
import java.time.LocalDate;

public class Cliente extends Usuario implements Serializable {

    private static final long serialVersionUID = 123456789L;

    private String dataDeNascimento;

    public Cliente(int idUsuario, String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha, String dataDeNascimento) {
        super(idUsuario, nome, cpf, telefone, dataCadastro, login, senha);
        this.dataDeNascimento = dataDeNascimento;
    }

    public Cliente(String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha, String dataDeNascimento) {
        super(nome, cpf, telefone, dataCadastro, login, senha);
        this.dataDeNascimento = dataDeNascimento;
    }

    public Cliente(int idUsuario) {
        super(idUsuario);
    }
    
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + this.dataDeNascimento + '}';
    }

}
