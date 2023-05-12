package br.com.fiap.jogodois;


public class Mago extends Jogador {

	private int mp = 10; 
	private int posX;
    private int posY;
	
	
    public Mago(int mp, int posX, int posY, int xp, int hp) {
        this.mp = mp;
        this.posX = posX;
        this.posY = posY;
    }
	
    public void mover(int newX, int newY) {
        posX = newX;
        posY = newY;
        System.out.println("O mago Merlin de mp igual a:" + mp + " ,xp igual a :" + xp + " ,e hp igual: " + hp + 
        		"se moveu para a posicao (" + posX + ", " + posY + ").");
        System.out.println("");
    }

	public int getMp() {
		return mp;
	}
	
	
	
	
	

 

	


}
 