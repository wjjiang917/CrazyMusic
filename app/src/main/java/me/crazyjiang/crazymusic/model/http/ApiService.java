package me.crazyjiang.crazymusic.model.http;

import me.crazyjiang.crazymusic.model.http.api.BaiduApi;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */

public class ApiService {
    private BaiduApi baiduApi;

    public ApiService(BaiduApi baiduApi) {
        this.baiduApi = baiduApi;
    }
}
