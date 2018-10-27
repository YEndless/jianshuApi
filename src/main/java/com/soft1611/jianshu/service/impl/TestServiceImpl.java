package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.dao.TestMapper;
import com.soft1611.jianshu.model.Test;
import com.soft1611.jianshu.service.TestService;
import com.soft1611.jianshu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ywy on 2018/10/26.
 */
@Service
@Transactional
public class TestServiceImpl extends AbstractService<Test> implements TestService {
    @Resource
    private TestMapper testMapper;

}
