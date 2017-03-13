package me.crazyjiang.crazymusic.presenter.contract;

import me.crazyjiang.crazymusic.model.bean.RankingBean;
import me.crazyjiang.crazymusic.presenter.BasePresenter;
import me.crazyjiang.crazymusic.ui.BaseView;

/**
 * Created by Jiangwenjin on 2017/3/13.
 */

public interface RankingContract {
    interface View extends BaseView {
        void onNewLoaded(RankingBean rankingBean);
    }

    interface Presenter extends BasePresenter<View> {
        void getNew(int size, int offset);
    }
}
