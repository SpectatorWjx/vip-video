package com.example.demo.dao;

import com.example.demo.entity.user.UserDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author wjx
 * @Date:2019/1/17
 * @Description:
 */
@Repository
public interface UserJpa extends JpaRepository<UserDo, Long>, JpaSpecificationExecutor<UserDo> {
    UserDo findUserDoByUsername(String username);
}
