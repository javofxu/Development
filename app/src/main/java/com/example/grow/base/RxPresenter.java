package com.example.grow.base;

/**
 * Created by 许格.
 * Date on 2019/7/23.
 * dec:
 */
public class RxPresenter<T extends BaseView> implements BasePresenter<T> {

    protected T mView;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }
}
