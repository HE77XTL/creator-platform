package com.heds.creatorplatform.mapper;

import com.heds.creatorplatform.entity.User;
import org.springframework.stereotype.Repository;



@Repository
public interface UserMapper {
    User QueryById(int id);
}