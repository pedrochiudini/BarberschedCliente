/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ConexaoController;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Classe principal da aplicação que faz a conexão com o servidor e inicializa a
 * interface de login.
 */
public class Principal {

    public static ConexaoController ccont;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 55555);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            // Cria objeto da classe que controla a conexão com o servidor
            ccont = new ConexaoController(in, out);

            // Exibe a tela de login
            TelaLogin telalogin = new TelaLogin();
            telalogin.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
