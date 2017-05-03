/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christian.ferramentas;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian Ramos
 */
public class Mensagem {

    public Mensagem() {

    }
    
    /**Exibe uma mensagem do tipo String no console*/
    public static void imprimirMensagem(String msg) {
        System.out.println(msg);
    }
    
    /**Exibe uma mensagem do tipo String no console*/
    public static void imprimirMensagem(String msg, int var) {
        System.out.println(msg + var);
    }

    /**Exibe uma mensagem do tipo String no console*/
    public static void imprimirMensagem(String msg, int var, String msg2) {
        System.out.println(msg + var + msg2);
    }

    /**Exibe uma mensagem de erro na tela.*/
    public static void exibirMensagemErro(String msg){
        JOptionPane.showMessageDialog(null, msg, "<< ALERTA DE ERRO >>", 0);
    }
    
        /**Exibe uma informação na tela.*/
    public static void exibirInformação(String msg){
        JOptionPane.showMessageDialog(null, msg, "<< INFORMAÇÃO >>", 1);
    }
    
    /**Exibe uma mensagem de aviso na tela.*/
    public static void exibirMensagemAviso(String msg){
        JOptionPane.showMessageDialog(null, msg, "<< ATENÇÃO >>", 2);
    }
    
    /**Exibe uma mensagem de questionamento na tela.*/
    public static void exibirMensagemQuestao(String msg){
        JOptionPane.showMessageDialog(null, msg, "<< QUESTIONANDO >>", 3);
    }
}
