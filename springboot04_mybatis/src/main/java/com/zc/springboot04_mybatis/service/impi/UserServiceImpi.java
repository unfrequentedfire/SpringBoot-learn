package com.zc.springboot04_mybatis.service.impi;

import com.zc.springboot04_mybatis.bean.UserBean;
import com.zc.springboot04_mybatis.dao.UserDao;
import com.zc.springboot04_mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/16 13:59
 */
@Service
public class UserServiceImpi implements UserService {
    @Resource
    private UserDao dao;


    @Override
    public int create(UserBean bean) {
        return dao.create(bean);
    }

    @Override
    public int update(UserBean bean) {
        return dao.update(bean);
    }

    @Override
    public int delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<UserBean> findList(HashMap<String, Object> map) {
        return dao.findList(map);
    }

    @Override
    public UserBean get(String id) {
        return dao.get(id);
    }
}
