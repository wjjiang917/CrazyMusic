package me.crazyjiang.crazymusic.model.http;

import me.crazyjiang.crazymusic.model.bean.RankingBean;
import me.crazyjiang.crazymusic.model.http.api.BaiduApi;
import rx.Observable;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */

public class ApiService {
    private BaiduApi baiduApi;

    public ApiService(BaiduApi baiduApi) {
        this.baiduApi = baiduApi;
    }

    public Observable<RankingBean> fetchNew(int size, int offset) {
        return baiduApi.getNew(size, offset);
    }
}
