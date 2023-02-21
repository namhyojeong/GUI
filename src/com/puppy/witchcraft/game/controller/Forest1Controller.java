package com.puppy.witchcraft.game.controller;

import java.util.List;

import com.puppy.witchcraft.game.model.dto.ItemDTO;
import com.puppy.witchcraft.game.model.service.Forest1Service;

public class Forest1Controller {

	private  Forest1Service forest1Service = new Forest1Service();

	public void Foresttst1Controller() {

		List<ItemDTO> itemList = forest1Service.test();

		if(itemList != null) {
			for(ItemDTO item : itemList) {
				System.out.println(item);
			}
		} else {
			System.out.println("...");
		}
	}
}


