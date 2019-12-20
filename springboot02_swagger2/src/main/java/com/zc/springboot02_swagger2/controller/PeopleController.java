package com.zc.springboot02_swagger2.controller;

import com.zc.springboot02_swagger2.Bean.PeopleBean;
import com.zc.springboot02_swagger2.service.PeopleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * TODO
 *
 * @author JY
 * @date 2019/11/4 13:02
 */
@RestController
@RequestMapping("/people")
@Api("PeopleController Api 接口文档")
public class PeopleController {
    @Resource
    private PeopleService service;

    // @ApiOperation：描述一个类的一个方法，或者说一个接口
    @ApiOperation(value="获取所有学生列表", notes="获取所有学生列表")
    @RequestMapping(value={""}, method= RequestMethod.GET)
    public List<PeopleBean> getStudent() {
        List<PeopleBean> list = service.getList();
        return list;
    }

    @ApiOperation(value="添加人员信息", notes="添加人员信息")
    // @ApiImplicitParam：一个请求参数
    @ApiImplicitParam(name = "peopleBean", value = "人员信息详细实体", required = true, dataType = "PeopleBean")
    @PostMapping("/save")
    public int save(@RequestBody PeopleBean peopleBean){
        return service.create(peopleBean);
    }

    @ApiOperation(value="获取某个人员信息", notes="根据url的id来获取人员的详细信息")
    @ApiImplicitParam(name = "peopleId", value = "人员id", required = true, dataType = "String",paramType = "path")
    @GetMapping("/{id}")
    public PeopleBean findById(@PathVariable("id") String peoleId){
        return service.get(peoleId);
    }

    @ApiOperation(value="删除单个人员", notes="根据url的id来指定删除的人员")
    @ApiImplicitParam(name = "peopleId", value = "人员id", required = true, dataType = "String",paramType = "path")
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") String peopleId){
        return service.delete(peopleId);
    }

    @ApiOperation(value="更新人员信息", notes="根据url的id来指定更新学生信息")
    // @ApiImplicitParams：多个请求参数
    @ApiImplicitParams({
            @ApiImplicitParam(name = "peopleId", value = "人员ID", required = true, dataType = "String",paramType = "path"),
            @ApiImplicitParam(name = "peopleBean", value = "人员实体", required = true, dataType = "PeopleBean")
    })
    @PutMapping(value="/{id}")
    public int updateStudent(@PathVariable String peopleId, @RequestBody PeopleBean peopleBean) {
        return service.update(peopleId,peopleBean);
    }

}
