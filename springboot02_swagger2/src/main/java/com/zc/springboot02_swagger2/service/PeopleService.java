package com.zc.springboot02_swagger2.service;


import com.zc.springboot02_swagger2.Bean.PeopleBean;

import java.util.List;

/**
 * TODO
 *
 * @author JY
 * @date 2019/11/4 13:05
 */
public interface PeopleService {
    List<PeopleBean> getList();

    int create(PeopleBean bean);

    PeopleBean get(String peopleId);

    int delete(String peopleId);

    int update(String peopleId,PeopleBean bean);

}
