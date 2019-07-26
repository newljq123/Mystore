package com.czxy.score.controller;

import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;
import com.czxy.score.domain.UserAndMetting;
import com.czxy.score.service.MettingService;
import com.czxy.score.service.UserAndMettingService;
import com.czxy.score.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("metting")
public class MettingController {
    @Resource
    private MettingService mettingService;
    @Resource
    private UserAndMettingService userAndMettingService;
    @Resource
    private UserService userService;
    @GetMapping("/showDate")
    public ResponseEntity<List<Metting>> showDate(HttpServletRequest request) {
        //获取当前日期
        Date date = new Date();
        //转换成字符串
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        String statr = df.format(date);
        //获取七天前日期
        long time = date.getTime();
        long time1= time+1000*60*60*24*7;
        Date d1 =new Date(time1);
        //转换成字符串
        String end = df.format(d1);
        //获取session域中存的user
        User user = (User) request.getSession().getAttribute("user");
        //调用方法获取集合
        List<Metting> all = mettingService.findAll(user.getUsername(),end,statr);
        //返回集合
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
    @PostMapping("/showMing/{id}")
    public ResponseEntity<Void> showMing(@PathVariable("id") Integer id,HttpServletRequest request){
        Metting byid = mettingService.findByid(id);

        request.getSession().setAttribute("byid",byid);
        System.out.println(byid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/showMetting")
    public ResponseEntity<Metting> showMetting(HttpServletRequest request){
        Metting byid = (Metting) request.getSession().getAttribute("byid");
        System.out.println(byid);
        return new ResponseEntity<>(byid,HttpStatus.OK);
    }
    @PostMapping("/user/{id}")
    public ResponseEntity<List<User>> findBy(@PathVariable("id") Integer id){
        List<UserAndMetting> byId = userAndMettingService.findBYId(id);
        List<User> list=new ArrayList<>();
        for (UserAndMetting userAndMetting : byId) {
            User by = userService.findBy(userAndMetting.getUserId());
            list.add(by);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
