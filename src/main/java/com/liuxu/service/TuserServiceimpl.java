package com.liuxu.service;

import com.liuxu.dao.TuserMapper;
import com.liuxu.entity.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TuserServiceimpl implements TuserService{
    @Autowired
    private TuserMapper tuserMapper;
    @Override
    public Tuser insert(Tuser tuser) {
        return tuserMapper.save(tuser);
    }

    @Override
    public Tuser update(Tuser tuser) {
        return tuserMapper.save(tuser);
    }

    @Override
    public void delete(Integer id) {
        tuserMapper.deleteById(id);
    }

    @Override
    public Optional<Tuser> find(Integer id) {
        return tuserMapper.findById(id);
    }
}
