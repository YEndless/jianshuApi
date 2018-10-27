package com.soft1611.jianshu.model;

import javax.persistence.*;

public class Article {
    @Id
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "article_count")
    private Integer articleCount;

    @Column(name = "collection_name")
    private String collectionName;

    @Column(name = "collection_url")
    private String collectionUrl;

    @Column(name = "fans_count")
    private Integer fansCount;

    private String summary;

    /**
     * @return article_id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return article_count
     */
    public Integer getArticleCount() {
        return articleCount;
    }

    /**
     * @param articleCount
     */
    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    /**
     * @return collection_name
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * @param collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * @return collection_url
     */
    public String getCollectionUrl() {
        return collectionUrl;
    }

    /**
     * @param collectionUrl
     */
    public void setCollectionUrl(String collectionUrl) {
        this.collectionUrl = collectionUrl;
    }

    /**
     * @return fans_count
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * @param fansCount
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}