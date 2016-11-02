package cz.uhk.fim.pro2.model;

import java.util.ArrayList;

public class World {
	
	private Bird bird;
	private ArrayList<Tube> tubes;
	private ArrayList<Heart> hearts;
	
	public World(Bird bird){
		this.bird = bird;
		tubes = new ArrayList<>();
		hearts = new ArrayList<>();
	}
	
	public void addTube(Tube tube){
		tubes.add(tube);
	}
	public void addHeart(Heart heart){
		hearts.add(heart);
	}
	public void removeHeart(){
		hearts.remove(hearts.size()-1);
	}
	public String toString(){
		return bird.getName() + " je na pozici [" + bird.getPositionX() + "," + bird.getPositionY() + "], pocet trubek: " +
				tubes.size() + ", pocet srdicek: " + hearts.size();
	}
	public Bird getBird(){
		return bird;
	}
	

}
