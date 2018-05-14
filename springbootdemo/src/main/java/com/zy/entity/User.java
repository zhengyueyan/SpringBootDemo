package com.zy.entity;

import lombok.Data;
import javax.persistence.*;

/**
 * @Description:
 * @Author: ZYY
 * @Date: 14:01 2018/5/14
 */
@Entity
@Table(name = "tbl_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String password;

}
