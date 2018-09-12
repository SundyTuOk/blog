package com.waylau.spring.boot.blog.repository;

import com.waylau.spring.boot.blog.domain.UserAuthority;
import org.springframework.stereotype.Repository;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserAuthorityMapper extends Mapper<UserAuthority> {
}