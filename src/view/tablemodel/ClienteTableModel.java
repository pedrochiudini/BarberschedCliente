/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.tablemodel;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Cliente;

public class ClienteTableModel extends AbstractTableModel {

    private ArrayList<Cliente> listaClientes;

    // Método construtor que recebe como parâmetro a lista de clientes
    public ClienteTableModel(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    // sobrescrita do método que diz quantas LINHAS a tabela tem
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    // sobrescrita do método que diz quantas COLUNAS a tabela tem
    @Override
    public int getColumnCount() {
        return 8;
    }

    // sobrescrita do método que retorna o valor de cada coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = listaClientes.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> cliente.getIdUsuario();
            case 1 -> cliente.getNome();
            case 2 -> cliente.getCpf();
            case 3 -> cliente.getTelefone();
            case 4 -> cliente.getDataDeNascimento();
            case 5 -> cliente.getDataCadastro().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            case 6 -> cliente.getLogin();
            case 7 -> cliente.getSenha();
            default -> "";
        };
    }
    
    // sobrescrita do método que retorna o nome de cada coluna
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Código";
            case 1 -> "Nome";
            case 2 -> "Cpf";
            case 3 -> "Telefone";
            case 4 -> "Data de Nascimento";
            case 5 -> "Data de Cadastro";
            case 6 -> "Login";
            case 7 -> "Senha";
            default -> "NoName";
        };
    }
    
    // método que retorna um objeto de Raça a partir da linha que o usuário selecionou.
    public Cliente getCliente(int row) {
        return listaClientes.get(row);
    }

}
