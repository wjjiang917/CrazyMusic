package me.crazyjiang.crazymusic.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.crazyjiang.crazymusic.ui.main.fragment.FooterFragment;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */
@Module
public class PageModule {
    @Singleton
    @Provides
    FooterFragment provideFooter() {
        return new FooterFragment();
    }
}
