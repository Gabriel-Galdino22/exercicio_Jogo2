package br.com.fiap.jogodois;


public class Dragao {
	
	private String nome;
	private int posX;
    private int posY;
	
	
    public Dragao(String nome, int posX, int posY) {
        this.nome = nome;
        this.posX = posX;
        this.posY = posY;
    }
	
    public void mover(int newX, int newY) {
        posX = newX;
        posY = newY;
        System.out.println("O dragao" + nome + " se moveu para a posicao (" + posX + ", " + posY + ").");
        System.out.println("");
    
    }

}
