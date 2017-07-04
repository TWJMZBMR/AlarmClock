package com.example.alarmclock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 汪志鹏 on 2017/7/2 0002.
 */

class Province {
    private String province;
    private List<String> cityList=new ArrayList<String>();

    public Province(String province){
        this.province=province;
        cityList.add(province);
    }

    public Province(String province,String[] citys) {
        this.province=province;
        for(int i=0;i<citys.length;i++){
           cityList.add(citys[i]);
        }
    }
    public void addProvince(String[] citys){
        for(int i=0;i<citys.length;i++){
            cityList.add(citys[i]);
        }
    }
    public void addProvince(String citys){
        cityList.add(citys);
    }
    public String getProvince() {
        return province;
    }

    public List<String> getCityList() {
        return cityList;
    }
}
