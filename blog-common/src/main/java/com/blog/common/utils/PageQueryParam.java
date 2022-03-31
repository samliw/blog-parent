package com.blog.common.utils;


import java.util.HashMap;
import java.util.Map;

/**
 * @author dengdajun
 * @desc 通过isa和havea组装分页查询参数, 通过分页查询
 */
public class PageQueryParam<T> {
    private T t;
    private int pageNum = 1;

    private int pageSize = 10;

    private boolean page = true;

    private String orderProperty;

    private String orderWay = "ASC";

    /**
     * 用来存储请求参数，这个参数既不是实体属性，也不是分页公用参数
     */
    private Map<String, String> param = new HashMap<>();


    public boolean isPage() {
        return page;
    }

    public PageQueryParam<T> setPage(boolean page) {
        this.page = page;
        return this;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    public String getOrderProperty() {
        return orderProperty;
    }

    public PageQueryParam<T> setOrderProperty(String orderProperty) {
        this.orderProperty = orderProperty;
        return this;
    }

    public String getOrderWay() {
        return orderWay;
    }

    public PageQueryParam<T> setOrderWay(String orderWay) {
        this.orderWay = orderWay;
        return this;
    }


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
