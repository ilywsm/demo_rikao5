package com.liuxu.service;

import com.liuxu.entity.Tuser;

import java.util.Optional;

public interface TuserService {
        Tuser insert(Tuser tuser);
        Tuser update(Tuser tuser);
        void delete(Integer id);
        Optional<Tuser> find(Integer id);
}
