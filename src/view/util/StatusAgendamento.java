/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.util;

public enum StatusAgendamento {

    CONFIRMADO("Confirmado"),
    CONCLUIDO("Concluído"),
    CANCELADO("Cancelado");
    
    private final String status;

    StatusAgendamento(String status) {
        this.status = status;
    }

    public String getStatusLiteral() {
        return status;
    }
    
}
