package com.totoro.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.analysis.ExcelAnalyser;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.totoro.mapper.UserMapper;
import com.totoro.pojo.User;
import com.totoro.servicce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author:totoro
 * @createDate:2022/11/25
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @RequestMapping("all")
    public void all(HttpServletResponse response) throws IOException {
        long start = System.currentTimeMillis();

        Page<User> page = new Page<>();
        page.setCurrent(2);
        page.setSize(1000);
        List<User> users = userService.listAll(page);

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"); //设置响应内容类型
        response.setCharacterEncoding("utf-8");//编码
        String fileName = URLEncoder.encode("用户表", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");//设置响应头

        ExcelWriter writer = EasyExcel.write(response.getOutputStream(), User.class).build();
        WriteSheet sheet = EasyExcel.writerSheet("用户").build();
        writer.write(users, sheet);
        writer.finish();
        System.gc();

        System.out.println("耗时"+(System.currentTimeMillis()-start / 1000) + "s");
    }


    @RequestMapping("test")
    public List<?> export(){
        Page<User> page = new Page<>();
        page.setCurrent(1);
        page.setSize(100);
        List<User> users = userService.listAll(page);
        return users;
    }
}
