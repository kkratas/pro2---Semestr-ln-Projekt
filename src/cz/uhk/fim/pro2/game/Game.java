package cz.uhk.fim.pro2.game;

import cz.uhk.fim.pro2.gui.HomeScreen;
import cz.uhk.fim.pro2.gui.MainFrame;

public class Game {

	public static void main(String[] args) {
		
		MainFrame mainFrame = new MainFrame();
		HomeScreen homeScreen = new HomeScreen(mainFrame); 
		mainFrame.setScreen(homeScreen);
		

	}

}
