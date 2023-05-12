package br.com.fiap.jogodois;


public class BolaDeFogo {
	
	private int poder;
	private int posX;
    private int posY;
	
	
    public BolaDeFogo(int poder, int posX, int posY) {
    	this.poder = poder;
        this.posX = posX;
        this.posY = posY;
    }
	
    public void mover(int newX, int newY) {
        posX = newX;
        posY = newY;
        System.out.println("A bola de fogo de poder igual a: " + poder + " caiu na posicao (" + posX + ", " + posY + ").");
        System.out.println("");
    }

}
