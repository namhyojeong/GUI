package com.puppy.witchcraft.game.view.pages;

import java.util.Collections;

import javax.swing.JPanel;

import com.puppy.witchcraft.common.MainFrame;

public class Forest1Page extends JPanel {

	public Forest1Page(MainFrame mf) {
	
	 while(set.size() < 5) {
		 int temp = ((int) (Math.random() *1));
		 set.add(temp);
	 }
	 
	 List<Integer> list = new ArrayList<>(set);
	 Collections.sort(list);
	 
	 returrn list;
	}
	
}
