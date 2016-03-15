package com.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class MessageBean {
    private List<String> langs;
    private Set<String> cities;
    private Map<String,String> scores;
    private Properties dbinfo;

    public Map<String, String> getScores() {
        return scores;
    }

    public Properties getDbinfo() {
        return dbinfo;
    }

    public void setDbinfo(Properties dbinfo) {
        this.dbinfo = dbinfo;
    }

    public void setScores(Map<String, String> scores) {
        this.scores = scores;
    }

    public Set<String> getCities() {
        return cities;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    public List<String> getLangs() {
        return langs;
    }

    public void setLangs(List<String> langs) {
        this.langs = langs;
    }

    public void showInfo(){
        System.out.println("langs:" + langs);
        System.out.println("cities:" + cities);
        System.out.println("scores:" + scores);
        System.out.println("dbinfo:" + dbinfo);
    }
}
