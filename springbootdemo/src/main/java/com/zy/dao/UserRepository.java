package com.zy.dao;

import com.zy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: ZYY
 * @Date: 14:06 2018/5/14
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);

}
