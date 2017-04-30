package com.example.niceweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Lucas on 2017/4/30.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provineCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvineCode() {
        return provineCode;
    }

    public void setProvineCode(int provineCode) {
        this.provineCode = provineCode;
    }
}
