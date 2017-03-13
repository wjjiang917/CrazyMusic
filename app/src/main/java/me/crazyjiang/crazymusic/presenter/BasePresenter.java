package me.crazyjiang.crazymusic.presenter;

import me.crazyjiang.crazymusic.ui.BaseView;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */

public interface BasePresenter<T extends BaseView> {
    void attachView(T view);

    void detachView();
}
