/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christian.estruturadados.vetor.teste;

import com.christian.estruturadados.vetor.Vetor;

/**
 *
 * @author Christian Ramos
 */
public class Teste {

    public static void main(String[] args) {
        
        Vetor vet = new Vetor();
        
System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor() +".\n");
        System.out.println("Tamanho do vetor: "+ vet.tamanho());
        vet.adicionaElemento("Adriana");
        vet.adicionaElemento("Bernardo");
        vet.adicionaElemento("Christian");
        vet.adicionaElemento("Diane");
        vet.adicionaElemento("Eliseu");
        vet.adicionaElemento("Flávia");
        vet.adicionaElemento("Flávio");
        vet.adicionaElemento("Júlio");
        vet.adicionaElemento("Vitor");
        vet.adicionaElemento("Kelly");
        vet.adicionaElemento("José");
        vet.adicionaElemento("Vanessa");
        System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor() +".\n");
        System.out.println("Tamanho do vetor: "+ vet.tamanho());
        System.out.println("Elementos do vetor: " + vet.exibeTodosElementos());
        System.out.println("o elemento do vetor na posição 2 é " + vet.exibeElemento(2) + ".\n");
        
        System.out.println("Inserir Tiago na posição 0.");
        vet.adicionaElemento("Tiago", 0);
        System.out.println("Tamanho do vetor: "+ vet.tamanho());
        System.out.println("Elementos do vetor: " + vet.exibeTodosElementos());
        System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor() +".\n");
        
        System.out.println("Inserir Ana Laura na posição 0.");
        vet.adicionaElemento("Ana Laura", 0);
        System.out.println("Tamanho do vetor: "+ vet.tamanho());
        System.out.println("Elementos do vetor: " + vet.exibeTodosElementos());
        System.out.println("o elemento do vetor na posição 2 é " + vet.exibeElemento(2) + ".\n");
        System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor() +".\n");
        
        System.out.println("Inserir Jacob na posição 0.");
        vet.adicionaElemento("Jacob", 0);
        System.out.println("Tamanho do vetor: "+ vet.tamanho());
        System.out.println("Elementos do vetor: " + vet.exibeTodosElementos());
        System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor() +".\n");
        
        System.out.println("Inserir João na posição 5.");
        vet.adicionaElemento("João", 5);
        System.out.println("Tamanho do vetor: "+ vet.tamanho());
        System.out.println("Elementos do vetor: " + vet.exibeTodosElementos());
        System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor() +".\n");
        
        System.out.println("Inserir José na posição 0.");
        vet.adicionaElemento("José", 0);
        System.out.println("Tamanho do vetor: "+ vet.tamanho());
        System.out.println("Elementos do vetor: " + vet.exibeTodosElementos());
        System.out.println("Capacidade total do vetor: "+ vet.capacidadeVetor() +".\n");
        /*
        Mensagem.exibirMensagemErro("Ocorreu um erro!");
        Mensagem.exibirInformação("Isto é uma informação");
        Mensagem.exibirMensagemAviso("Isto é um aviso!");
        Mensagem.exibirMensagemQuestao("Tem certeza?");
        */
        
    }
}
