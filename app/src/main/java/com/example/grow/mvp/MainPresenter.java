package com.example.grow.mvp;

import com.example.grow.base.RxPresenter;
import com.example.grow.mvp.presenter.IMainPersenter;
import com.example.grow.mvp.view.IMainView;

/**
 * Created by 许格.
 * Date on 2019/7/23.
 * dec:
 */
public class MainPresenter extends RxPresenter<IMainView> implements IMainPersenter{

    @Override
    public void refresh() {
        mView.update();
    }
}
