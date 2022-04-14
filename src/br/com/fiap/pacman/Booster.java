package br.com.fiap.pacman;

public class Booster extends Item {
	
	private int tempo;
	
	public Booster(int posicaoX, int posicaoY) {
		super.setX(posicaoX);
		super.setY(posicaoY);
		
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		if(tempo > 0 ) {
			this.tempo = tempo;
		}
	}
	
	
	public void deixarInvencivel(Player player) {
		player.setInvencivel(true);
		System.out.println("Player invenciavel durente " + tempo + "segundos");
	}
}
