package br.com.fiap.pacman;

public class Player extends GameObject {
	
	//Atributos do player
	private int direction;//Direcao em que o player vai andar
	private int life;//Vidas do player
	private boolean invencivel;// Se ele esta invencivel ou nao
	
	
	//Construtores
	public Player() {
	}
	
	public Player(int x,int y, int direction ) {
		this.direction = direction;
		super.setX(x);
		super.setY(y);
	}
	
	
	//Gets e Sets
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		if(direction >= 0) {
			this.direction = direction;
		}
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		if(life > 0) {
		this.life = life;
		}else {
			System.out.println("GAME OVER");
			return;
		}
	}
	
	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}
	
	
	//Metodo que testa se a nova posicao do player e valida ou nao 
	public boolean podeMover() {
		switch(this.getDirection()) {
		
		case(0):
			System.out.println("cima");
			if(this.getY() - 10 >= 0) {
				return true;
			}else {
				System.out.println("Posicao fora da tela");
				return false;
			}
		
		case(90):
			if(this.getX() + 10 <= getScreenSize()) {
				return true;
			}else {
				System.out.println("Posicao fora da tela");
				return false;
			}
		
		case(180):
			if(this.getY() + 10 <= getScreenSize()) {
				return true;
			}else {
				System.out.println("Posicao fora da tela");
				return false;
			}
		
		case(270):
			if(this.getX() - 10 >= 0) {
				return true;
			}else {
				System.out.println("Posicao fora da tela");
				return false;
			}
		
		default:
			System.out.println("direção indisponivel");
			return false;
		}
	}
	
	public void mover() {
		if(podeMover()) {
			if(this.getDirection() == 0) {
				super.setX(this.getX());
				super.setY(this.getY()-10);
				System.out.println("pacman indo pra CIMA"+ getY());
			}
			if(this.getDirection() == 90) {
				super.setX(this.getX()+10);
				super.setY(this.getY());
				System.out.println("pacman indo pra DIREITA"+ getX());
			}
			if(this.getDirection() == 180) {
				super.setX(this.getX());
				super.setY(this.getY()+10);
				System.out.println("pacman indo pra BAIXO"+ getY());
			}
			if(this.getDirection() == 270) {
				super.setX(this.getX()-10);
				super.setY(this.getY());
			}
			
		}else {
			System.out.println("Não pode se mover para esta localizacao");
		}
		
		
	}
}
