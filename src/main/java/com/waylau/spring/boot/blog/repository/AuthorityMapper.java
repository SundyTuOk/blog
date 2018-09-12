package com.waylau.spring.boot.blog.repository;


import com.waylau.spring.boot.blog.domain.Authority;
import org.springframework.stereotype.Repository;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface AuthorityMapper extends Mapper<Authority> {
}