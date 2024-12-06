/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.tablemodel;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Servico;

public class ServicoTableModel extends AbstractTableModel {

    private ArrayList<Servico> listaServicos;

    // Método construtor que recebe como parâmetro a lista de servicos
    public ServicoTableModel(ArrayList<Servico> listaServicos) {
        this.listaServicos = listaServicos;
    }

    // sobrescrita do método que diz quantas LINHAS a tabela tem
    @Override
    public int getRowCount() {
        return listaServicos.size();
    }

    // sobrescrita do método que diz quantas COLUNAS a tabela tem
    @Override
    public int getColumnCount() {
        return 3;
    }

    // sobrescrita do método que retorna o valor de cada coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Servico servico = listaServicos.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                servico.getIdServico();
            case 1 ->
                servico.getNome();
            case 2 ->
                servico.getValor();
            default ->
                "";
        };
    }

    // sobrescrita do método que retorna o nome de cada coluna
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "Código";
            case 1 ->
                "Nome";
            case 2 ->
                "Valor";
            default ->
                "NoName";
        };
    }

    // método que retorna um objeto de Raça a partir da linha que o usuário selecionou.
    public Servico getServico(int row) {
        return listaServicos.get(row);
    }

}
