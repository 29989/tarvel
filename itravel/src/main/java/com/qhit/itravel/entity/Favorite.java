package com.qhit.itravel.entity;

import java.io.Serializable;

/**
 * (Favorite)实体类
 *
 * @author makejava
 * @since 2020-04-16 15:30:00
 */
public class Favorite implements Serializable {
    private static final long serialVersionUID = 938451607808478410L;
    
    private Integer rid;
    
    private Object date;
    
    private Integer uid;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

}