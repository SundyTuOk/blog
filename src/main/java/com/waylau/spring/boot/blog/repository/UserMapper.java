package com.waylau.spring.boot.blog.repository;

import com.waylau.spring.boot.blog.domain.User;
import org.springframework.stereotype.Repository;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}