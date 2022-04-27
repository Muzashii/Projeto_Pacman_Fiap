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
		if(direction > 0) {
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
	public boolean podeMover(int x,int y, int direcao) {
		switch(direcao) {
		case(0):
			if(y + 10 <= getScreenSize()) {
				return true;
			}else {
				System.out.println("Posicao fora da tela");
				return false;
			}
		case(90):
			if(x + 10 <= getScreenSize()) {
				return true;
			}else {
				System.out.println("Posicao fora da tela");
				return false;
			}
		case(180):
			if(y - 10 <= getScreenSize() && y - 10 >= 0) {
				return true;
			}else {
				System.out.println("Posicao fora da tela");
				return false;
			}
		case(270):
			if(x - 10 <= getScreenSize() && x - 10 >= 0) {
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
		int direcao = this.getDirection();
		if(podeMover(this.getX(), this.getY(), direcao)) {
			if(direcao == 0) {
				super.setX(this.getX());
				super.setY(this.getY()+10);
				System.out.println("pacman indo pra CIMA"+ getY());

				setDirection(direcao);
			}
			if(direcao == 90) {
				super.setX(this.getX()+10);
				super.setY(this.getY());
				System.out.println("pacman indo pra DIREITA"+ getX());
				setDirection(direcao);
			}
			if(direcao == 180) {
				super.setX(this.getX());
				super.setY(this.getY()+10);
				System.out.println("pacman indo pra BAIXO"+ getY());

				setDirection(direcao);
			}
			if(direcao == 270) {
				super.setX(this.getX()-10);
				super.setY(this.getY());
				setDirection(direcao);
			}
			
		}else {
			System.out.println("Não pode se mover para esta localizacao");
		}
		
		
	}
}
