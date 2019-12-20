package com.zc.springboot02_swagger2.service.Impl;

import com.zc.springboot02_swagger2.Bean.PeopleBean;
import com.zc.springboot02_swagger2.service.PeopleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author JY
 * @date 2019/11/4 13:10
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Override
    public List<PeopleBean> getList() {
        return null;
    }

    @Override
    public int create(PeopleBean bean) {
        return 0;
    }

    @Override
    public PeopleBean get(String peopleId) {
        return null;
    }

    @Override
    public int delete(String peopleId) {
        return 0;
    }

    @Override
    public int update(String peopleId, PeopleBean bean) {
        return 0;
    }
}
