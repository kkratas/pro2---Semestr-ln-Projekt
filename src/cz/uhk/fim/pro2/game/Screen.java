package cz.uhk.fim.pro2.game;

import javax.swing.JPanel;

import cz.uhk.fim.pro2.gui.MainFrame;

public abstract class Screen extends JPanel {

	protected MainFrame mainFrame;

	public Screen(MainFrame mainFrame) {
		this.mainFrame = new MainFrame();
	}

}
