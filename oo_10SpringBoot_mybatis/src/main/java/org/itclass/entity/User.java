package org.itclass.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 * 用于封装数据，方便数据传递
 * ORM映射
 *   类 - 表              User      - user表
 *  对象 - 行数据         User对象   - user行数据
 *  属性 - 列数据         属性       - 列数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
}
