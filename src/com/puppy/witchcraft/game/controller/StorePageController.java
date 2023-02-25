package com.puppy.witchcraft.game.controller;

import java.util.ArrayList;
import java.util.List;

import com.puppy.witchcraft.game.model.dto.ImageDTO;
import com.puppy.witchcraft.game.model.dto.ItemDTO;
import com.puppy.witchcraft.game.model.dto.PlayerDTO;
import com.puppy.witchcraft.game.model.service.StorePageService;

public class StorePageController {

	private StorePageService storePageService = new StorePageService();
	
	public List<ItemDTO> item() {
		
		List<ItemDTO> itemList = new ArrayList<>();
		
		itemList = storePageService.test();
		
		return itemList;
		
		
	}
	
	public String imageUrl(int imageNo) {
		
		ImageDTO image = storePageService.imageUrl(imageNo);
		
		String imageUrl = image.getImageSave();
		
		return imageUrl;
	}

	public PlayerDTO buyItem(int playerGold) {

		PlayerDTO pp = new PlayerDTO();
		
		if(buyItem) {
			pp.getPlayerGold()
			
		}
		
		pp = storePageService.playerGoldChange();
		
		return result;
	}

	
	
}
