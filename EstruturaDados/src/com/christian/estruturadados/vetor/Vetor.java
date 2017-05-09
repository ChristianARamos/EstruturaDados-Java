/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christian.estruturadados.vetor;

import com.christian.ferramentas.Mensagem;

/**
 * Classe utilizada para contrução e manipulação de vetores.
 *
 * @author Christian Ramos
 */
public class Vetor {

    private String[] elementos;
    private int tamanho;

    /**
     * Construtor da classe Vetor.
     */
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /**
     * Retorna o tamanho real do vetor.
     */
    public int tamanho() {
        return this.tamanho;
    }

    /**
     * Retorna a capacidade do vetor.
     */
    public int capacidadeVetor() {
        return this.elementos.length;
    }

    /**
     * Retorna true se um elemento for adicionado ao vetor.
     */
    public boolean adicionarElemento(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            System.out.println("Elemento " + this.tamanho() + " adicionado com sucesso!");
            return true;
        }
        return false;
    }

    /**
     * Adiciona um elemento na posição desejada.
     */
    //inserir "A" na posição "0".
    //Vetor:   B C E F G
    //Posição: 0 1 2 3 4
    //tamanho = "5".
    public void adicionarElemento(String elemento, int posicao) {
        if (this.tamanho < this.elementos.length) {
            for(int i=this.tamanho; i > posicao; i--){
                this.elementos[i] = this.elementos[i-1];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        }else{
            String msg = "Não há mais espaço no vetor.\n";
            Mensagem.imprimirMensagem(msg);
            //Mensagem.exibirMensagemAviso(msg);
        }
    }

    /**
     * Retorna os elementos do vetor.
     */
    public String exibirElementos() {

        StringBuilder s = new StringBuilder(); //Manipulação de Strings.
        s.append("["); //Utilizado para adicionar Strings.

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]\n");

        return s.toString();
    }

    /**
     * Retorna o elemento do vertor indicado pela posição passada por parâmetro.
     */
    public String mostrarElemento(int posicaovetor) {
        int posicao = posicaovetor;
        return this.elementos[posicao].toString();
    }
}
