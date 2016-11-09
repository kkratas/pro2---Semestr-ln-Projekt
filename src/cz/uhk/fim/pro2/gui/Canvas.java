package cz.uhk.fim.pro2.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import cz.uhk.fim.pro2.model.Bird;
import cz.uhk.fim.pro2.model.Heart;
import cz.uhk.fim.pro2.model.Tube;
import cz.uhk.fim.pro2.model.World;

public class Canvas extends java.awt.Canvas{
	
	private World world;
	
	public Canvas(World world){
		this.world = world;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		world.getBird().paint(g);
		for (Heart heart : world.getHearts()) {
			heart.paint(g);
		}
		for (Tube tube : world.getTubes()){
			tube.paint(g);
		}
	}
	

}
