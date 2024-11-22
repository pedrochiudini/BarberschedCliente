/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelDominio.Agendamento;
import modelDominio.Barbeiro;
import modelDominio.Cliente;
import modelDominio.Servico;

public class ConexaoController {

    private ObjectInputStream in;
    private ObjectOutputStream out;
    // barbeiro que está logado no sistema
    private Barbeiro barbeiroLogado;

    public ConexaoController(ObjectInputStream in, ObjectOutputStream out) {
        this.in = in;
        this.out = out;
    }

    public Barbeiro getBarbeiroLogado() {
        return barbeiroLogado;
    }

    public void setBarbeiroLogado(Barbeiro barbeiroLogado) {
        this.barbeiroLogado = barbeiroLogado;
    }

    // aqui teremos diversos métodos que se comunicarão com o servidor
    public Barbeiro efetuarLogin(Barbeiro barbeiro) {
        try {
            // enviando o comando BarbeiroEfetuarLogin para o servidor
            out.writeObject("BarbeiroEfetuarLogin");
            in.readObject(); // recebendo o "ok" do servidor
            // enviar o barbeiro que está tentando fazer login
            out.writeObject(barbeiro);
            // recebendo o barbeiro do servidor
            Barbeiro barbeiroLogin = (Barbeiro) in.readObject();
            return barbeiroLogin;
        } catch (Exception e) {
            e.printStackTrace();
            // se acontecer erro retornaremos null
            return null;
        }
    }

    // método que comunica com o Servidor e envia o
    // comando "BarbeiroLista" e recebe uma listagem de barbeiros
    public ArrayList<Barbeiro> getBarbeiroLista() {
        try {
            // enviar o comando "BarbeiroLista"
            out.writeObject("BarbeiroLista");
            // recebendo e retornando listagem de Barbeiros
            return (ArrayList<Barbeiro>) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean barbeiroInserir(Barbeiro barbeiro) {
        try {
            out.writeObject("BarbeiroInserir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(barbeiro); // enviando o barbeiro
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean barbeiroAlterar(Barbeiro barbeiro) {
        try {
            out.writeObject("BarbeiroAlterar"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(barbeiro); // enviando o barbeiro
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean barbeiroExcluir(Barbeiro barbeiro) {
        try {
            out.writeObject("BarbeiroExcluir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(barbeiro); // enviando o barbeiro
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // método que comunica com o Servidor e envia o
    // comando "ClienteLista" e recebe uma listagem de clientes
    public ArrayList<Cliente> getClienteLista() {
        try {
            // enviar o comando "ClienteLista"
            out.writeObject("ClienteLista");
            // recebendo e retornando listagem de Clientes
            return (ArrayList<Cliente>) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean clienteInserir(Cliente cliente) {
        try {
            out.writeObject("ClienteInserir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(cliente); // enviando o cliente
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean clienteAlterar(Cliente cliente) {
        try {
            out.writeObject("ClienteAlterar"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(cliente); // enviando o cliente
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean clienteExcluir(Cliente cliente) {
        try {
            out.writeObject("ClienteExcluir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(cliente); // enviando o cliente
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // método que comunica com o Servidor e envia o
    // comando "ServicoLista" e recebe uma listagem de serviços
    public ArrayList<Servico> getServicoLista() {
        try {
            // enviar o comando "ServicoLista"
            out.writeObject("ClienteLista");
            // recebendo e retornando listagem de Serviços
            return (ArrayList<Servico>) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean servicoInserir(Servico servico) {
        try {
            out.writeObject("ServicoInserir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(servico); // enviando o serviço
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean servicoAlterar(Servico servico) {
        try {
            out.writeObject("ServicoAlterar"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(servico); // enviando o serviço
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean servicoExcluir(Servico servico) {
        try {
            out.writeObject("ServicoExcluir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(servico); // enviando o serviço
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // método que comunica com o Servidor e envia o
    // comando "AgendamentoLista" e recebe uma listagem de serviços
    public ArrayList<Agendamento> getAgendamentoLista() {
        try {
            // enviar o comando "AgendamentoLista"
            out.writeObject("AgendamentoLista");
            // recebendo e retornando listagem de Serviços
            return (ArrayList<Agendamento>) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean agendamentoInserir(Agendamento agendamento) {
        try {
            out.writeObject("AgendamentoInserir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(agendamento); // enviando o agendamento
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean agendamentoAlterar(Agendamento agendamento) {
        try {
            out.writeObject("AgendamentoAlterar"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(agendamento); // enviando o agendamento
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean agendamentoExcluir(Agendamento agendamento) {
        try {
            out.writeObject("AgendamentoExcluir"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(agendamento); // enviando o agendamento
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean verificarHorarioDisponivel(Agendamento agendamento) {
        try {
            out.writeObject("VerificarHorarioDisponivel"); // enviando o comando
            in.readObject(); // lendo "ok"
            out.writeObject(agendamento); // enviando o agendamento
            return (boolean) in.readObject(); // lendo e devolvendo o resultado
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // ================== FIM ==================

    public void fim() {
        try {
            out.writeObject("fim");
            in.close();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
