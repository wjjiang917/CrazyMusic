package me.crazyjiang.crazymusic.di.component;

import android.app.Activity;

import dagger.Component;
import me.crazyjiang.crazymusic.di.module.FragmentModule;
import me.crazyjiang.crazymusic.di.scope.FragmentScope;

/**
 * Created by Jiangwenjin on 2017/3/4.
 */
@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();
}
