package cz.uhk.fim.pro2.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import cz.uhk.fim.pro2.gui.MainFrame;

public class ScoreScreen extends Screen {
	public ScoreScreen(MainFrame mainFrame){
		super(mainFrame);
		
		JButton back = new JButton("BACK");
		add(back);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setScreen(new HomeScreen(mainFrame));
				
			}
		});
	}

}
