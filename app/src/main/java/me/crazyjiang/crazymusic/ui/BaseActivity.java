package me.crazyjiang.crazymusic.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.crazyjiang.crazymusic.App;
import me.crazyjiang.crazymusic.di.component.ActivityComponent;
import me.crazyjiang.crazymusic.di.component.DaggerActivityComponent;
import me.crazyjiang.crazymusic.di.module.ActivityModule;
import me.crazyjiang.crazymusic.presenter.BasePresenter;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by Jiangwenjin on 2017/2/28.
 * MVP base activity
 */
public abstract class BaseActivity<T extends BasePresenter> extends SupportActivity implements BaseView {
    @Inject
    protected T mPresenter;
    protected Activity mContext;
    private Unbinder mUnBinder;

    protected abstract int getLayoutResId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        mUnBinder = ButterKnife.bind(this);
        mContext = this;

        // component inject
        inject();

        if (mPresenter != null)
            mPresenter.attachView(this);

        // load data, render, bind event
        init();
    }

    protected void setToolBar(Toolbar toolbar, String title) {
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressedSupport();
            }
        });
    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(getActivityModule())
                .build();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.detachView();
        mUnBinder.unbind();
    }

    protected abstract void inject();

    protected abstract void init();
}
