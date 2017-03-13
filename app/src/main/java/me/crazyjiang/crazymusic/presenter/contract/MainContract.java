package me.crazyjiang.crazymusic.presenter.contract;

import com.tbruyelle.rxpermissions.RxPermissions;

import me.crazyjiang.crazymusic.presenter.BasePresenter;
import me.crazyjiang.crazymusic.ui.BaseView;

/**
 * Created by Jiangwenjin on 2017/3/4.
 */

public interface MainContract {
    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<View> {
        void checkPermissions(RxPermissions rxPermissions);
    }
}
