/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;
import java.time.LocalTime;

public class BarbeiroHorario implements Serializable {

    private static final long serialVersionUID = 123456789L;

    private int idBarbeiroHorario;
    private Barbeiro barbeiro;
    private String diaSemana;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;

    // construtor com todos os campos para ser usado no SELECT E UPDATE
    public BarbeiroHorario(int idBarbeiroHorario, Barbeiro barbeiro, String diaSemana, LocalTime horarioInicio, LocalTime horarioFim) {
        this.idBarbeiroHorario = idBarbeiroHorario;
        this.barbeiro = barbeiro;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    // construtor sem o código(ID), pois este será usado para fazer INSERT no banco
    public BarbeiroHorario(Barbeiro barbeiro, String diaSemana, LocalTime horarioInicio, LocalTime horarioFim) {
        this.barbeiro = barbeiro;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    // construtor usado para fazer DELETEs no banco
    public BarbeiroHorario(int idBarbeiroHorario) {
        this.idBarbeiroHorario = idBarbeiroHorario;
    }

    public int getIdBarbeiroHorario() {
        return idBarbeiroHorario;
    }

    public void setIdBarbeiroHorario(int idBarbeiroHorario) {
        this.idBarbeiroHorario = idBarbeiroHorario;
    }

    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(LocalTime horarioFim) {
        this.horarioFim = horarioFim;
    }

    @Override
    public String toString() {
        return "BarbeiroHorario{" + "idBarbeiroHorario=" + idBarbeiroHorario + ", barbeiro=" + barbeiro + ", diaSemana=" + diaSemana + ", horarioInicio=" + horarioInicio + ", horarioFim=" + horarioFim + '}';
    }

}
