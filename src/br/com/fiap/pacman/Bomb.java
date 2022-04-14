package br.com.fiap.pacman;

public class Bomb extends Item {
	
	public Bomb() {
		
	}

	public Bomb(int x, int y) {
		super.setX(x);
		super.setY(y);
		
	}
	
	public void removerVida(Player player) {
		player.setLife(player.getLife() - 1);
	}

}
