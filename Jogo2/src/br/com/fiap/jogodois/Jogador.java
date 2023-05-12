package br.com.fiap.jogodois;

public class Jogador {
	
	public int xp = 5;
	public int hp = 100;
	
	public Jogador() {
		
	}
	

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}
	
	public void receberDano(int pontos) {
		this.hp -= pontos;
		if(this.hp <= 0) {
			System.out.println("Game Over");
			this.hp = 0;
		}
	}

	public void receberCura(int pontos) {
		this.hp += pontos;		
	}

	public void ganharExperiencia(int pontos) {
		this.xp += pontos;		
	}
	
	

	public void atacar(Jogador jogador) {
		jogador.receberDano(this.xp);
		
		if(jogador.foiDerrotado()) 
			this.ganharExperiencia(jogador.getXp());
		
	}

	private boolean foiDerrotado() {
		return hp == 0;
	}
	
	
}
