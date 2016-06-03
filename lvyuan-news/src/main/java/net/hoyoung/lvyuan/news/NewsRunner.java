package net.hoyoung.lvyuan.news;

import cn.edu.hfut.dmic.webcollector.crawler.Crawler;
import cn.edu.hfut.dmic.webcollector.model.CrawlDatum;
import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by v_huyang01 on 2016/6/3.
 */
public class NewsRunner extends BreadthCrawler{
    public NewsRunner(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);

        CrawlDatum crawlDatum = new CrawlDatum("url");
        HashMap<String,String> metaData = new HashMap<String,String>();
        metaData.put("key1","value1");
        crawlDatum.setMetaData(metaData);

        this.addSeed(crawlDatum);
    }

    public static void main(String[] args) {

        System.out.println("hello");
    }

    @Override
    public void visit(Page page, CrawlDatums crawlDatums) {

    }
}
