package com.czxy.score.service.impl;

import com.czxy.score.dao.MettingAndUserMapper;
import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;
import com.czxy.score.domain.UserAndMetting;
import com.czxy.score.service.UserAndMettingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserAndMettingServiceImpl implements UserAndMettingService {
    @Resource
    private MettingAndUserMapper userMapperl;
    @Override
    public List<UserAndMetting> findBYId(Integer id) {
        List<UserAndMetting> byId = userMapperl.findById(id);
        return byId;

    }

    @Override
    public User findBy(Integer id) {
        User by = userMapperl.findBy(id);
        return by;
    }

}
