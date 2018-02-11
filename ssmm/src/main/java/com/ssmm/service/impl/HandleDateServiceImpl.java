package com.ssmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmm.dao.lxcUserMapper;
import com.ssmm.model.lxcUser;
import com.ssmm.service.HandleDateService;
@Service("handleDateService")
public class HandleDateServiceImpl  implements HandleDateService{

		@Autowired
		lxcUserMapper UserMapper;
	
	
	@Override
	public Integer selectALLNumber(String time) {
		Integer selectAllNumebr = UserMapper.selectAllNumebr(time);
		if(selectAllNumebr!=null){
			
			return selectAllNumebr;
		}
		return 0;
	}

	@Override
	public Integer selectAddNumber(String Uptime, String Dntime) {
		Integer selectAddNumebr = UserMapper.selectAddNumebr(Uptime, Dntime);
		if(selectAddNumebr!=null){
			return UserMapper.selectAddNumebr(Uptime,Dntime );
			
		}
		return 0;
	}

	@Override
	public List<lxcUser> selectDetail(String time) {
		
	
		return UserMapper.selectDetail(time);
	}
	
	
	
}
