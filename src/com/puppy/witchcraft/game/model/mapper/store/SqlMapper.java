package com.puppy.witchcraft.game.model.mapper.store;

import java.util.List;

import com.puppy.witchcraft.game.model.dto.ImageDTO;
import com.puppy.witchcraft.game.model.dto.ItemDTO;

public interface SqlMapper {

	ImageDTO imageUrl(int imageNo);

	List<ItemDTO> storeList();

}
