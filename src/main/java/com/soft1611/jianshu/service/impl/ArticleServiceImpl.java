package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.dao.ArticleMapper;
import com.soft1611.jianshu.model.Article;
import com.soft1611.jianshu.model.vo.ArticleVO;
import com.soft1611.jianshu.service.ArticleService;
import com.soft1611.jianshu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by ywy on 2018/10/26.
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Override
    public List<ArticleVO> getHotArticles() {
        return articleMapper.getHotArticles();
    }

}
