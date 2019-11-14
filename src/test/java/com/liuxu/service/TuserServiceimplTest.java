package com.liuxu.service;

import com.liuxu.dao.TuserMapper;
import com.liuxu.entity.Tuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class TuserServiceimplTest {
    @Autowired
    private  TuserService tuserService;
    @Autowired
    private TuserMapper tuserMapper;
    @Test
    public void insert() {
        Tuser tuser=new Tuser();
        tuser.setName("张三");
        tuser.setBirthday(new Date());
        tuserService.insert(tuser);
    }

    @Test
    public void update() {
        Optional<Tuser> byId = tuserMapper.findById(1);
        Tuser tuser = byId.get();
        tuser.setName("李四");
        tuserService.update(tuser);
    }

    @Test
    public void delete() {
        tuserService.delete(1);
    }
    @Test
    public void find() {
        Optional<Tuser> tuser = tuserService.find(1);
        System.out.println(tuser);
    }
}