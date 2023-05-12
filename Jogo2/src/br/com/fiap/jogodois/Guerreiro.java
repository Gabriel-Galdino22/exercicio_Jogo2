package br.com.fiap.jogodois;


public class Guerreiro extends Jogador {
	
	private String nome;
	private int posX;
    private int posY;
	
	
    public Guerreiro(String nome, int posX, int posY, int xp, int hp) {
        this.nome = nome;
        this.posX = posX;
        this.posY = posY;
    }
	
    public void mover(int newX, int newY) {
        posX = newX;
        posY = newY;
        
        System.out.println("O Guerreiro" + nome + " que possui o xp de: " + xp + "e o hp de:" 
        + hp + "se moveu para a posicao (" + posX + ", " + posY + ").");
        System.out.println("");
        
        System.out.println("");
        
    }

}



