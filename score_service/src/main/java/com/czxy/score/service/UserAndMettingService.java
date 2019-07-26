package com.czxy.score.service;

import com.czxy.score.domain.User;
import com.czxy.score.domain.UserAndMetting;

import java.util.List;

public interface UserAndMettingService {
    List<UserAndMetting> findBYId(Integer id);
    User findBy(Integer id);
}
