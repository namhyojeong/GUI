package com.puppy.witchcraft.game.model.service;

import static com.puppy.witchcraft.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.puppy.witchcraft.game.model.dto.ImageDTO;
import com.puppy.witchcraft.game.model.dto.ItemDTO;
import com.puppy.witchcraft.game.model.dto.PlayerDTO;
import com.puppy.witchcraft.game.model.mapper.store.SqlMapper;
	
public class StorePageService {
	
	private static SqlMapper mapper;
	
//	public StorePageService(StorePageMapper storePageMapper) {
//		this.mapper = storePageMapper;
//	}
	
//	public List<Map<String, Object>> selectItemList() {
// 
//		SqlSession sqlSession = getSqlSession();
//		mapper = sqlSession.getMapper(StorePageMapper.class);
//		List<Map<String, Object>> itemList = mapper.selectItemList(sqlSession);
//		
//		sqlSession.close();
//		
//		return itemList;
//	}

	public static List<ItemDTO> test() {

	SqlSession sqlSession = getSqlSession();
	mapper = sqlSession.getMapper(SqlMapper.class);
	
	List<ItemDTO> itemList = mapper.storeList();
	
	sqlSession.close();
	
	return itemList;
	
	}

	public ImageDTO imageUrl(int imageNo) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		ImageDTO image = mapper.imageUrl(imageNo);
		
		sqlSession.close();
		
		return image;
	}

	public PlayerDTO playerGoldChange() {
		return null;
	}
	}



