package com.czxy.score.dao;

import com.czxy.score.domain.Metting;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import javax.persistence.Column;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MettingMapper extends Mapper<Metting> {
    @Select("SELECT * FROM tab_metting WHERE metting_starttime >=#{star} and metting_endtime<=#{end} and username=#{name}")
    @Results({
            @Result(property = "room",one = @One(select = "com.czxy.score.dao.RoomMapper.selectByPrimaryKey"),column = "room_id")
    })
    public List<Metting> findAll(@Param("end") String end, @Param("star") String star, @Param("name") String name);
    @Select("SELECT * FROM tab_metting WHERE metting_id=#{id}")

    public Metting findById(@Param("id") Integer id);
}
