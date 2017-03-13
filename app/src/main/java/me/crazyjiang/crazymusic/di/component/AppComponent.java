package me.crazyjiang.crazymusic.di.component;

import javax.inject.Singleton;

import dagger.Component;
import me.crazyjiang.crazymusic.App;
import me.crazyjiang.crazymusic.di.module.AppModule;
import me.crazyjiang.crazymusic.di.module.HttpModule;
import me.crazyjiang.crazymusic.di.module.PageModule;
import me.crazyjiang.crazymusic.model.http.ApiService;
import me.crazyjiang.crazymusic.ui.main.fragment.FooterFragment;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class, PageModule.class})
public interface AppComponent {
    App getContext();

    ApiService apiService();

    FooterFragment footerFragment();
}
