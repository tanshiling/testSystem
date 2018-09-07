package com.tsl.dao;

import com.tsl.model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserDao {

    public User login(Map<String,String> map,int type)throws Exception;
}
