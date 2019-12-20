package com.zc.springboot04_mybatis.service;

import com.zc.springboot04_mybatis.bean.UserBean;

import java.util.HashMap;
import java.util.List;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/16 13:58
 */
public interface UserService {
    int create(UserBean bean);

    int update(UserBean bean);

    int delete(String id);

    List<UserBean> findList(HashMap<String,Object> map);

    UserBean get(String id);
}
