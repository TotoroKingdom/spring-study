package com.totoro.pojo;

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

    private Long id;

    private String mbphone1;

    private String openId;
}
