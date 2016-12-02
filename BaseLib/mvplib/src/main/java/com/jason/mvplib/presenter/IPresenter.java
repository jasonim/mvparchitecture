package com.jason.mvplib.presenter;

import com.jason.mvplib.view.iview.IView;

/**
 * Created by jason on 16/12/2.
 */
public interface IPresenter<V extends IView> {
    void attachView(V view);
    void detachView(boolean retainInstance);
}
