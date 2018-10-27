package com.soft1611.jianshu.service;
import com.soft1611.jianshu.model.Article;
import com.soft1611.jianshu.core.Service;
import com.soft1611.jianshu.model.vo.ArticleVO;

import java.util.List;


/**
 * Created by ywy on 2018/10/26.
 */
public interface ArticleService extends Service<Article> {
    List<ArticleVO> getHotArticles();
}
