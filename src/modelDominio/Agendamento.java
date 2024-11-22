/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import view.util.StatusAgendamento;

public class Agendamento implements Serializable {

    private static final long serialVersionUID = 123456789L;

    private int idAgendamento;
    private Cliente cliente;
    private Barbeiro barbeiro;
    private Servico servico;
    private LocalDate data;
    private LocalTime horario;
    private StatusAgendamento status;

    // construtor com todos os campos para ser usado no SELECT E UPDATE
    public Agendamento(int idAgendamento, Cliente cliente, Barbeiro barbeiro, Servico servico, LocalDate data, LocalTime horario, StatusAgendamento status) {
        this.idAgendamento = idAgendamento;
        this.cliente = cliente;
        this.barbeiro = barbeiro;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
        this.status = status;
    }

    // construtor sem o código(ID), pois este será usado para fazer INSERT no banco
    public Agendamento(Cliente cliente, Barbeiro barbeiro, Servico servico, LocalDate data, LocalTime horario, StatusAgendamento status) {
        this.cliente = cliente;
        this.barbeiro = barbeiro;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
        this.status = status;
    }

    // construtor usado para fazer DELETEs no banco
    public Agendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }
    
    // construtor usado para verificar disponibilidade de horario
    public Agendamento(Barbeiro barbeiro, LocalDate data, LocalTime horario) {
        this.barbeiro = barbeiro;
        this.data = data;
        this.horario = horario;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "idAgendamento=" + idAgendamento + ", cliente=" + cliente + ", barbeiro=" + barbeiro + ", servico=" + servico + ", data=" + data + ", horario=" + horario + ", status=" + status + '}';
    }

}
