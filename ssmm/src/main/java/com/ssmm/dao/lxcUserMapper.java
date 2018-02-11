package com.ssmm.dao;

import java.util.List;

import com.ssmm.model.lxcUser;

public interface lxcUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(lxcUser record);

    int insertSelective(lxcUser record);

    lxcUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(lxcUser record);

    int updateByPrimaryKey(lxcUser record);
    
     Integer selectAllNumebr(String date);
    
     Integer selectAddNumebr(String Update,String Ondate );
     List<lxcUser> selectDetail(String time);
}