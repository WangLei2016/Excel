package com.ssmm.service;

import java.util.List;

import com.ssmm.model.lxcUser;



public interface HandleDateService {

	public Integer selectALLNumber(String time);
	public Integer selectAddNumber(String Uptime,String Dntime);
	public List <lxcUser>selectDetail(String time);
	
	
}
