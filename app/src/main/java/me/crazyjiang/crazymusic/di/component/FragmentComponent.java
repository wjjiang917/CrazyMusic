package me.crazyjiang.crazymusic.di.component;

import android.app.Activity;

import dagger.Component;
import me.crazyjiang.crazymusic.di.module.FragmentModule;
import me.crazyjiang.crazymusic.di.scope.FragmentScope;
import me.crazyjiang.crazymusic.ui.discovery.fragment.RankingFragment;

/**
 * Created by Jiangwenjin on 2017/3/4.
 */
@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();

    void inject(RankingFragment rankingFragment);
}
