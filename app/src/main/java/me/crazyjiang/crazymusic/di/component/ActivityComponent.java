package me.crazyjiang.crazymusic.di.component;

import android.app.Activity;

import dagger.Component;
import me.crazyjiang.crazymusic.di.module.ActivityModule;
import me.crazyjiang.crazymusic.di.scope.ActivityScope;
import me.crazyjiang.crazymusic.ui.main.activity.MainActivity;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();

    void inject(MainActivity mainActivity);
}
