package com.example.demo.entity.user;

import com.example.demo.entity.AbstractDo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author wjx
 * @Date:2019/1/17
 * @Description:
 */
@Data
@Entity(name = "user")
public class UserDo extends AbstractDo{
    private String username;
    private String password;
}
