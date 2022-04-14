package br.com.fiap.pacman;

public class Item extends GameObject {
	
	private boolean visivel;
	
	public Item() {
		
	}

	public Item(int posicaoX,int posicaoY) {
		super.setX(posicaoX);
		super.setY(posicaoY);
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}
	
	
}
