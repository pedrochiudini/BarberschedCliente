/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;
import java.time.LocalDate;

public class Comum extends Barbeiro implements Serializable {

    private static final long serialVersionUID = 123456789L;

    public Comum(int idUsuario, String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha, String especialidade, String email) {
        super(idUsuario, nome, cpf, telefone, dataCadastro, login, senha, especialidade, email);
    }

    public Comum(String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha, String especialidade, String email) {
        super(nome, cpf, telefone, dataCadastro, login, senha, especialidade, email);
    }

    public Comum(int idUsuario) {
        super(idUsuario);
    }

    public Comum(String login, String senha) {
        super(login, senha);
    }

    @Override
    public String toString() {
        return super.toString() + "Comum{" + '}';
    }

}
