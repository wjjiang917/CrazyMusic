package me.crazyjiang.crazymusic.ui.discovery.fragment;

import me.crazyjiang.crazymusic.R;
import me.crazyjiang.crazymusic.model.bean.RankingBean;
import me.crazyjiang.crazymusic.presenter.RankingPresenter;
import me.crazyjiang.crazymusic.presenter.contract.RankingContract;
import me.crazyjiang.crazymusic.ui.BaseFragment;

/**
 * Created by Jiangwenjin on 2017/3/13.
 */

public class RankingFragment extends BaseFragment<RankingPresenter> implements RankingContract.View {
    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_ranking;
    }

    @Override
    protected void inject() {
        getFragmentComponent().inject(this);
    }

    @Override
    protected void init() {
        mPresenter.getNew(3, 0);
    }

    @Override
    public void onNewLoaded(RankingBean rankingBean) {

    }
}
