package br.com.fiap.pacman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ghost extends GameObject {
	
	private int direction;
	
	private final List<Integer> direcoes = Arrays.asList(0,90,180,270);
	
	public Ghost() {
		
	}
	
	public Ghost(int posicaoX,int posicaoY, int direcao) {
		super.setX(posicaoX);
		super.setY(posicaoY);
		
	}
	
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	private int direcaoAleatoria() {
		Collections.shuffle(direcoes);
		return direcoes.get(0);
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
		
		int direcao = direcaoAleatoria();
		
		if(podeMover(this.getX(), this.getY(), direcao)) {
			if(direcao == 0) {
				super.setX(this.getX());
				super.setY(this.getY() + 10);
				setDirection(direcao);
			}
			if(direcao == 90) {
				super.setX(this.getX()+10);
				super.setY(this.getY());
				setDirection(direcao);
			}
			if(direcao == 180) {
				super.setX(this.getX());
				super.setY(this.getY()-10);
				setDirection(direcao);
			}
			if(direcao == 270) {
				super.setX(this.getX()-10);
				super.setY(this.getY());
				setDirection(direcao);
			}
		}else {
			mover();
		}
	}

}
	


