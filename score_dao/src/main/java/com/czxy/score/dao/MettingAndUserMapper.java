package com.czxy.score.dao;

import com.czxy.score.domain.User;
import com.czxy.score.domain.UserAndMetting;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MettingAndUserMapper extends Mapper<UserAndMetting> {
    @Select("select * from  tab_user_metting where metting_id=#{id}")

    public List<UserAndMetting> findById(@Param("id") Integer id);
    @Select("SELECT * FROM  tab_user WHERE user_id IN (SELECT user_id FROM  tab_user_metting WHERE metting_id=#{id})")
    public User findBy(@Param("id") Integer id);
}
