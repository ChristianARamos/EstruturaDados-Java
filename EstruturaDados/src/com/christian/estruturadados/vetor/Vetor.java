/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christian.estruturadados.vetor;

/**
 *
 * @author Christian Ramos
 */
public class Vetor {
    
    private String[] elementos;
    private int tamanho;
    
    /**Construtor*/
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
    /**Exibe o tamanho do vetor.*/
    private int tamanho(){
        return this.tamanho;
    }
    
    /**Exibe a capacidade do vetor.*/
    public int capacidadeVetor(){
        return this.elementos.length;
    }
    
    /**
     * @param 
     * Adiciona um elemento ao vetor.*/
    public boolean adicionarElemento(String elemento){
        
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
            System.out.println("Elemento " + this.tamanho() + " adicionado com sucesso!");
            return true;
        }
        return false;
    }
}