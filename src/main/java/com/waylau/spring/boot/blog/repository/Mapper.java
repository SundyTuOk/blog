package com.waylau.spring.boot.blog.repository;

import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author tuzhaoliang
 * 所有mapper的基础接口类, 可以在这里做统一扩展.
 * @param <T>
 */
public interface Mapper<T> extends tk.mybatis.mapper.common.Mapper<T>, MySqlMapper<T> {
}
