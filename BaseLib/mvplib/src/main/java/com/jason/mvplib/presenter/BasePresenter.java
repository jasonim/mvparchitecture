package com.jason.mvplib.presenter;

import com.jason.mvplib.model.IModel;
import com.jason.mvplib.view.iview.IView;

import java.lang.ref.WeakReference;

/** MVP基础Presenter
 * Created by jason on 16/12/2.
 */
public class BasePresenter<V extends IView> implements IPresenter<V> {

    private WeakReference<V> viewRef;

    @Override
    public void attachView(IView view) {
        viewRef = new WeakReference<V>((V) view);
    }

    @Override
    public void detachView(boolean retainInstance) {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    /**
     * 获取 presenter 对应的view
     * @return 如果对应,返回对应实例,否则返回 null
     */
    public V getView() {
        return viewRef == null ? null :viewRef.get();
    }

    /**
     * 检查 presenter 是否存在对应View
     * @return 如果存在返回true, 否则返回false
     */
    public boolean isViewAttached() {
        return viewRef != null && viewRef.get() != null;
    }
}
