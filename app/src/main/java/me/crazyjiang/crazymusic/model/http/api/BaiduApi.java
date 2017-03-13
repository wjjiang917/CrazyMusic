package me.crazyjiang.crazymusic.model.http.api;

import me.crazyjiang.crazymusic.model.bean.RankingBean;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Jiangwenjin on 2017/3/8.
 * http://www.cnblogs.com/liuying1995/p/5704176.html
 * 1、新歌榜，2、热歌榜，
 * 11、摇滚榜，12、爵士，16、流行
 * 21、欧美金曲榜，22、经典老歌榜，23、情歌对唱榜，24、影视金曲榜，25、网络歌曲榜
 */
public interface BaiduApi {
    String HOST = "http://tingapi.ting.baidu.com/v1/";

    /**
     * 新歌榜
     */
    @GET("restserver/ting?format=json&from=webapp_music&method=baidu.ting.billboard.billList&type=1")
    Observable<RankingBean> getNew(@Query("size") int size, @Query("offset") int offset);
}
