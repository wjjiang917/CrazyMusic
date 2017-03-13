package me.crazyjiang.crazymusic.presenter;

import javax.inject.Inject;

import me.crazyjiang.crazymusic.common.RxUtil;
import me.crazyjiang.crazymusic.model.bean.RankingBean;
import me.crazyjiang.crazymusic.model.http.ApiService;
import me.crazyjiang.crazymusic.presenter.contract.RankingContract;
import me.crazyjiang.crazymusic.util.Logger;
import rx.functions.Action1;

/**
 * Created by Jiangwenjin on 2017/3/13.
 */

public class RankingPresenter extends RxPresenter<RankingContract.View> implements RankingContract.Presenter {
    @Inject
    public RankingPresenter(ApiService apiService) {
        this.mApiService = apiService;
    }

    @Override
    public void getNew(int size, int offset) {
        addSubscribe(mApiService.fetchNew(size, offset)
                .compose(RxUtil.<RankingBean>rxSchedulerHelper())
                .subscribe(new Action1<RankingBean>() {
                    @Override
                    public void call(RankingBean rankingBean) {
                        mView.onNewLoaded(rankingBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Logger.e("", throwable);
                    }
                }));
    }
}
