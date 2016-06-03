package net.hoyoung.news.vo;

import java.util.Date;

/**
 * Created by v_huyang01 on 2016/5/31.
 */
public class NewsItem {
    private int id;
    private String title;
    private String desc;
    private Date createTime;
    private Date updateTime;
    private String url;
    private String origin;//来源域名，比如sina.cn
    private String source;//来源站点名称，比如新浪网
    private int status;
}
