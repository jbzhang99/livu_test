package com.rcplatform.livechat.ip;


import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.model.CityResponse;

import java.io.File;
import java.net.InetAddress;

/**
 * Created by yang peng on 2016/8/22.
 */
public class IpAnalysis {


    private String filePath;


    public IpAnalysis(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 解析ip
     * @param ip
     * @return
     * @throws Exception
     */
    public CityResponse analysisIp(String ip) throws Exception {
        DatabaseReader reader = new DatabaseReader.Builder(new File(filePath)).build();
        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = reader.city(ipAddress);
        return response;
    }




}
