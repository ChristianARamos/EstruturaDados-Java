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
 * @author Christian A. Ramos
 * @param <T>
 */
public class Vetor<T> { // T de Type (Generics).

    private T[] elementos;
    private int tamanho;

    /**
     * Contrutor da classe Vetor com capacidade inicial pré-definida em 10.
     */
    public Vetor(){
    
        this.elementos = (T[]) new Object[10];
    }
    
    /**
     * Construtor da classe Vetor.
     * @param capacidade 
     */
    public Vetor(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
        
    }
    
    /**Outra solução possível para o construtor acima
    public Vetor(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }
    */
    
    /**
     * Retorna o tamanho real do vetor.
     * @return 
     */
    public int tamanho() {
        return this.tamanho;
    }

    /**
     * Retorna a capacidade do vetor.
     * @return 
     */
    public int capacidadeVetor() {
        return this.elementos.length;
    }

    /**Duplica a capacidade do vetor.*/
    public void aumentaCapacidade(){
        
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length + 10];
            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            this.elementos = elementosNovos;
        }
    }
    
    /**
     * Retorna true se um elemento for adicionado ao vetor.
     * @param elemento
     * @return 
     */
    public boolean adicionaElemento(T elemento) {

        aumentaCapacidade();
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
     * @param elemento
     * @param posicao
     */
    //inserir "A" na posição "0".
    //Vetor:   B C E F G
    //Posição: 0 1 2 3 4
    //tamanho = "5".
    public void adicionaElemento(T elemento, int posicao) {
        
        aumentaCapacidade();
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
     * @return 
     */
    public String exibeTodosElementos() {

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
     * @param posicaoVetor
     * @return 
     */
    public T exibeElemento(int posicaoVetor) {
        
        int posicao = posicaoVetor;
        return this.elementos[posicao];
    }
}