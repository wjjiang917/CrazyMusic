package me.crazyjiang.crazymusic.ui.my.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import me.crazyjiang.crazymusic.R;
import me.crazyjiang.crazymusic.ui.SimpleFragment;

/**
 * Created by Jiangwenjin on 2017/3/13.
 */
public class MyFragment extends SimpleFragment {
    @BindView(R.id.rv_list)
    RecyclerView rvList;
    @BindView(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void init() {

    }
}
