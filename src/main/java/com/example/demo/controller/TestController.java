package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/")
public class TestController {

    @RequestMapping(value="/order/demo")
    public YYModel getDemo() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth);
        YYModel yy = new YYModel();
        yy.setYy("中文");
        yy.setZz(3);
        return yy;
    }

    @GetMapping("/test")
    public String getTest() {
        YYModel yy = new YYModel();
        yy.setYy("中文");
        yy.setZz(3);
        return yy.toJSONString();
    }
}

class  YYModel {

    String yy;
    int zz;

    public String getYy() {
        return yy;
    }

    public void setYy(String yy) {
        this.yy = yy;
    }

    public int getZz() {
        return zz;
    }

    public void setZz(int zz) {
        this.zz = zz;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}
