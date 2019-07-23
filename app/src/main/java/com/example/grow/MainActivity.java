package com.example.grow;

import android.view.View;
import android.widget.TextView;

import com.example.grow.base.BaseActivity;
import com.example.grow.mvp.MainPresenter;
import com.example.grow.mvp.view.IMainView;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainView {

    private TextView text;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initPresent() {
        super.initPresent();
        mPresent = new MainPresenter();
    }

    @Override
    protected void initView() {
        super.initView();
        text = findViewById(R.id.main_text);
    }

    @Override
    public void update() {
        text.setText("你好世界！");
    }

    public void update(View view) {
        mPresent.refresh();
    }
}
