package me.crazyjiang.crazymusic.ui.discovery.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import me.crazyjiang.crazymusic.R;
import me.crazyjiang.crazymusic.ui.SimpleFragment;
import me.crazyjiang.crazymusic.ui.ViewPagerAdapter;

/**
 * Created by Jiangwenjin on 2017/3/13.
 */

public class DiscoveryFragment extends SimpleFragment {
    @BindView(R.id.tab_discovery)
    TabLayout mTabLayout;
    @BindView(R.id.viewpager_discovery)
    ViewPager mViewPager;

    private ViewPagerAdapter mAdapter;
    private List<Fragment> fragments = new ArrayList<>();

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_discovery;
    }

    @Override
    protected void init() {
        fragments.add(new RankingFragment());

        mAdapter = new ViewPagerAdapter(getChildFragmentManager(), fragments);
        mViewPager.setAdapter(mAdapter);

        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText("排行榜");
    }
}
