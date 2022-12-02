package com.totoro.servicce;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.totoro.mapper.UserMapper;
import com.totoro.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:totoro
 * @createDate:2022/11/25
 * @description:
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    @Autowired
    private UserMapper userMapper;

    public List<User> listAll(IPage<User> page){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        IPage<User> pageLIst = userMapper.selectPage(page, wrapper);
        long total = pageLIst.getTotal();
        System.out.println(total);
        System.out.println(pageLIst.getPages());
        List<User> list = pageLIst.getRecords();
        return list;
    }

}
