package com.zc.springboot04_mybatis.dao;

import com.zc.springboot04_mybatis.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/16 13:55
 */
public interface UserDao {
    int create(UserBean bean);

    int update(UserBean bean);

    int delete(String id);

    List<UserBean> findList(HashMap<String,Object> map);

    UserBean get(String id);
}
