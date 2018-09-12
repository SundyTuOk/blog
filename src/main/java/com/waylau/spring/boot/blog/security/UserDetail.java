package com.waylau.spring.boot.blog.security;

import com.waylau.spring.boot.blog.domain.User;
import com.waylau.spring.boot.blog.repository.AuthorityMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import tk.mybatis.mapper.entity.Example;

import java.util.Collection;


public class UserDetail implements UserDetails {

    private User user;

    private AuthorityMapper authorityMapper;

    public UserDetail(User user, AuthorityMapper authorityMapper) {
        this.user = user;
        this.authorityMapper = authorityMapper;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        this.authorityMapper.se
        Example userExample = new Example(User.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.and

        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
