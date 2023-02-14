package com.wy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wy.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
