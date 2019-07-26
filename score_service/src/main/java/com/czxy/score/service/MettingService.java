package com.czxy.score.service;

import com.czxy.score.dao.MettingMapper;
import com.czxy.score.domain.Metting;

import java.util.List;

public interface MettingService {
    List<Metting> findAll(String name, String end , String star);
    Metting findByid(Integer id);
}
