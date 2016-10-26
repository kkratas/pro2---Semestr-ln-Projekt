package cz.uhk.fim.pro2.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import cz.uhk.fim.pro2.gui.MainFrame;

public class HomeScreen extends Screen {
	
	
	
	public HomeScreen(MainFrame mainFrame){
		super(mainFrame);
		
		JButton play = new JButton("PLAY");
		JButton score = new JButton("SCORE");
		JButton sound = new JButton("SOUND");
		
		add(play);
		add(score);
		add(sound);
		
		play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setScreen(new GameScreen(mainFrame));
				
			}
		});
		score.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setScreen(new ScoreScreen(mainFrame));
				
			}
		});
		sound.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
	}
	

}
