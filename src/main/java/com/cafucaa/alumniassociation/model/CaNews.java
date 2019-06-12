package com.cafucaa.alumniassociation.model;

import java.util.Date;

public class CaNews {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ca_news.CA_News_ID
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    private Integer caNewsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ca_news.news_title
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    private String newsTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ca_news.news_date
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    private Date newsDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ca_news.news_content
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    private String newsContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ca_news.CA_News_ID
     *
     * @return the value of ca_news.CA_News_ID
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public Integer getCaNewsId() {
        return caNewsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ca_news.CA_News_ID
     *
     * @param caNewsId the value for ca_news.CA_News_ID
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public void setCaNewsId(Integer caNewsId) {
        this.caNewsId = caNewsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ca_news.news_title
     *
     * @return the value of ca_news.news_title
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ca_news.news_title
     *
     * @param newsTitle the value for ca_news.news_title
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ca_news.news_date
     *
     * @return the value of ca_news.news_date
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public Date getNewsDate() {
        return newsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ca_news.news_date
     *
     * @param newsDate the value for ca_news.news_date
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ca_news.news_content
     *
     * @return the value of ca_news.news_content
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public String getNewsContent() {
        return newsContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ca_news.news_content
     *
     * @param newsContent the value for ca_news.news_content
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }
}