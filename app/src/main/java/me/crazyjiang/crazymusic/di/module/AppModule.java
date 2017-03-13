package me.crazyjiang.crazymusic.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.crazyjiang.crazymusic.App;
import me.crazyjiang.crazymusic.model.http.ApiService;
import me.crazyjiang.crazymusic.model.http.api.BaiduApi;

/**
 * Created by Jiangwenjin on 2017/2/28.
 */
@Module
public class AppModule {
    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    ApiService provideApiService(BaiduApi baiduApi) {
        return new ApiService(baiduApi);
    }
}
