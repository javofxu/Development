package com.example.grow.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 许格.
 * Date on 2019/7/23.
 * dec:
 */
public class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView{

    protected Context mContext;
    protected T mPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        if (getLayoutId()!=-1){
            setContentView(getLayoutId());
        }

        initPresent();
        if (mPresent!=null){
            mPresent.attachView(this);
        }

        initView();
        initData();
        initListener();
    }


    protected void initPresent() {
    }

    protected int getLayoutId() {
        return -1;
    }

    protected void initView() {
    }

    protected void initData() {
    }

    protected void initListener() {
    }

    @Override
    public void showSuccess() {

    }

    @Override
    public void showFailed() {

    }
}
