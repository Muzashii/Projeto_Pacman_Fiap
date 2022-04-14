package br.com.fiap.pacman;

public class GameObject {
	
	//Posicao do elemento na tela
	private int posicaoX;
	private int posicaoY;
	
	//Tamanho da tela
	private int ScreenSize = 600;
	private final int SCREENSIZEMAXIMO = 600;
	
	
	//Construtores
	//Construtor padrao
	public GameObject() {

	}

	//Contrutor 
	public GameObject(int posicaoX, int posicaoY) {
		if((posicaoX >= 0 && posicaoY >= 0) && (posicaoX <= ScreenSize && posicaoY <= ScreenSize)) {
			this.posicaoX = posicaoX;
			this.posicaoY = posicaoY;
		}
	}

	//Gets e Sets
	public int getX() {
		return posicaoX;
	}


	public void setX(int posicaoX) {
		if(posicaoX >= 0 && posicaoX <= ScreenSize) {
		this.posicaoX = posicaoX;
		}else {
			if(posicaoX <= ScreenSize) {
				System.out.println("Posicao X deve estar dentro da tela");
			}
			if(posicaoX >= 0) {
				System.out.println("Posicao X deve ser POSITIVO");
			}
		}
	}


	public int getY() {
		return posicaoY;
	}


	public void setY(int posicaoY) {
		if(posicaoY >= 0 && posicaoY <= ScreenSize) {
		this.posicaoY = posicaoY;
		}else {
			if(posicaoY <= ScreenSize) {
				System.out.println("Posicao Y deve estar dentro da tela");
			}
			if(posicaoY >= 0) {
				System.out.println("Posicao Y deve ser POSITIVO");
			}
		}
	}


	public int getScreenSize() {
		return ScreenSize;
	}


	public void setScreenSize(int ScreenSize) {
		if(ScreenSize > 0 && ScreenSize <= SCREENSIZEMAXIMO) {
		this.ScreenSize = ScreenSize;
		}else {
			System.out.println("Tamanho da tela de ser maior que 0 e menor que 600");
		}
		
	}
}
