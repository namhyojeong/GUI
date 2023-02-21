package com.puppy.witchcraft.game.model.service;

import static com.puppy.witchcraft.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.puppy.witchcraft.game.model.dto.ItemDTO;
import com.puppy.witchcraft.game.model.mapper.forest.SqlMapper;

public class Forest1Service {

	private static SqlMapper mapper;
	
		public static List<ItemDTO> test() {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		List<ItemDTO> itemList = mapper.test();
		
		sqlSession.close();
		
		return itemList;
	

	}

	
		
	}

