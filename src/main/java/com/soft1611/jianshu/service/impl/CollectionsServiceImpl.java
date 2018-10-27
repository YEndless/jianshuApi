package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.dao.CollectionsMapper;
import com.soft1611.jianshu.model.Collections;
import com.soft1611.jianshu.service.CollectionsService;
import com.soft1611.jianshu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ywy on 2018/10/26.
 */
@Service
@Transactional
public class CollectionsServiceImpl extends AbstractService<Collections> implements CollectionsService {
    @Resource
    private CollectionsMapper collectionsMapper;

}
