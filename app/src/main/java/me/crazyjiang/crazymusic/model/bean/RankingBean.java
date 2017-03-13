package me.crazyjiang.crazymusic.model.bean;

import java.util.List;

/**
 * Created by Jiangwenjin on 2017/3/13.
 * <p>
 * "song_list": []
 * "billboard": {}
 * "error_code": 22000
 */

public class RankingBean {
    private List<SongBean> song_list;

    private BillboardBean billboard;

    private String error_code;

    public List<SongBean> getSong_list() {
        return song_list;
    }

    public void setSong_list(List<SongBean> song_list) {
        this.song_list = song_list;
    }

    public BillboardBean getBillboard() {
        return billboard;
    }

    public void setBillboard(BillboardBean billboard) {
        this.billboard = billboard;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }
}
