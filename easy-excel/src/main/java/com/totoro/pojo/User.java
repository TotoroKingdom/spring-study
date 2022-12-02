package com.totoro.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author:totoro
 * @createDate:2022/11/25
 * @description:
 */
@Data
@TableName("tb_user")
public class User {

    @ExcelProperty(value = "用户id",index = 0)
    private Long id;

    @ExcelProperty(value = "手机",index = 1)
    private String mbphone1;

    @ExcelProperty(value = "openid",index = 2)
    private String openId;
}
