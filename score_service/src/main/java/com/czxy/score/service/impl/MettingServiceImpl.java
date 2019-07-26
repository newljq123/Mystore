package com.czxy.score.service.impl;

import com.czxy.score.dao.MettingMapper;
import com.czxy.score.domain.Metting;
import com.czxy.score.service.MettingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MettingServiceImpl implements MettingService {
    @Resource
    private MettingMapper mettingMapper;
    @Override
    public List<Metting> findAll(String name, String end, String star) {
        List<Metting> all = mettingMapper.findAll(end, star, name);
        return all;
    }

    @Override
    public Metting findByid(Integer id) {
        Metting byId = mettingMapper.findById(id);
        return byId;
    }
}
