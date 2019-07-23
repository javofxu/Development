package com.example.grow.base;

/**
 * Created by 许格.
 * Date on 2019/7/23.
 * dec:
 */
public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
