package com.jason.mvplib.view.activity;

import android.os.Bundle;

import com.jason.baseapp.BaseActivity;
import com.jason.mvplib.IMvpBase;
import com.jason.mvplib.presenter.IPresenter;
import com.jason.mvplib.view.iview.IView;

/**
 * Created by jsson on 16/12/2.
 */
public abstract class MVPActivity<V extends IView, P extends IPresenter<V>>
        extends BaseActivity implements IView, IMvpBase<V>{
    protected P presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView(getMvpView());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView(false);
    }

    public abstract P createPresenter();

    @Override
    public V getMvpView() {
        return (V)this;
    }
}
