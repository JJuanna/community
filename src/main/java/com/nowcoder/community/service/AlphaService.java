package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// 业务组件注解
@Service
public class AlphaService {

    @Autowired
    AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("构造");
    }

    //    初始化方法在构造器之后调用
    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }

    public String find(){
        return alphaDao.select();
    }
}
