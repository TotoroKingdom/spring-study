package com.totoro.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.totoro.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:totoro
 * @createDate:2022/11/25
 * @description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from tb_user limit 10")
    List<User> limitUser();

}
