package me.crazyjiang.crazymusic.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import me.crazyjiang.crazymusic.di.scope.ActivityScope;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }
}
