package com.example.grow.mvp.presenter;

import com.example.grow.base.BasePresenter;
import com.example.grow.mvp.view.IMainView;

/**
 * Created by 许格.
 * Date on 2019/7/23.
 * dec:
 */
public interface IMainPersenter extends BasePresenter<IMainView> {

    void refresh();
}
