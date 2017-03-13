package me.crazyjiang.crazymusic.presenter;

import com.tbruyelle.rxpermissions.RxPermissions;

import javax.inject.Inject;

import me.crazyjiang.crazymusic.model.http.ApiService;
import me.crazyjiang.crazymusic.presenter.contract.MainContract;

/**
 * Created by Jiangwenjin on 2017/3/4.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {
    @Inject
    public MainPresenter(ApiService apiService) {
        mApiService = apiService;
    }

    @Override
    public void checkPermissions(RxPermissions rxPermissions) {

    }
}
