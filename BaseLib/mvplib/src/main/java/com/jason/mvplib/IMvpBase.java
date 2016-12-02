package com.jason.mvplib;

import com.jason.mvplib.view.iview.IView;

/**
 * Created by jsson on 16/12/2.
 */
public interface IMvpBase<V extends IView> {
    V getMvpView();
}
