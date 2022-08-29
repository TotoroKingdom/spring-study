package com.totoro.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2022/8/29
 * @description:
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@Component
@Data
public class User {

    private String name;

    private Integer age;

}
