/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;
import java.time.LocalDate;

public class Barbeiro extends Usuario implements Serializable {

    private static final long serialVersionUID = 123456789L;

    private String especialidade;
    private String email;

    public Barbeiro(int idUsuario, String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha, String especialidade, String email) {
        super(idUsuario, nome, cpf, telefone, dataCadastro, login, senha);
        this.especialidade = especialidade;
        this.email = email;
    }

    public Barbeiro(String nome, String cpf, String telefone, LocalDate dataCadastro, String login, String senha, String especialidade, String email) {
        super(nome, cpf, telefone, dataCadastro, login, senha);
        this.especialidade = especialidade;
        this.email = email;
    }

    public Barbeiro(int idUsuario) {
        super(idUsuario);
    }

    public Barbeiro(String login, String senha) {
        super(login, senha);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + "Barbeiro{" + this.especialidade + ", " + this.email + '}';
    }

}
