package br.com.fiap.jogodois;

public class Jogo {

	public static void main(String[] args) {
		
		BolaDeFogo bolaDeFogo = new BolaDeFogo (1, 0, 0);
		bolaDeFogo.mover(20, 5);
		
		Dragao dragao = new Dragao (" Banguela", 0, 0);
		dragao.mover(20, 5);
		
		Guerreiro guerreiro = new Guerreiro (" Galdino", 0, 0, 150, 200);
		guerreiro.mover(10, 4);
		
        Mago mago = new Mago( 10, 0, 0, 100, 200);
        mago.mover(5, 3);
    }

}
