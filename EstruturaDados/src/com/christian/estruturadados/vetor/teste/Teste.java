/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christian.estruturadados.vetor.teste;

import com.christian.estruturadados.vetor.Vetor;
import com.christian.ferramentas.Mensagem;

/**
 *
 * @author Christian Ramos
 */
public class Teste {

    public static void main(String[] args) {

        Vetor vet = new Vetor(22);
        /**
        vet.adicionarElemento("Adriana");
        vet.adicionarElemento("Bernardo");
        vet.adicionarElemento("Christian");
        vet.adicionarElemento("Diane");
        vet.adicionarElemento("Eliseu");
        vet.adicionarElemento("Flávia");
        System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor());
        System.out.println("Elementos do vetor: " + vet.exibirElementos());
        vet.imprimirVetor();
        System.out.println("o elemento do vetor na posição 2 é " + vet.mostrarElemento(2) + ".");
        */
        
        Mensagem.exibirMensagemErro("Ocorreu um erro!");
        Mensagem.exibirInformação("Isto é uma informação");
        Mensagem.exibirMensagemAviso("Isto é um aviso!");
        Mensagem.exibirMensagemQuestao("Tem certeza?");
   
        
    }
}
