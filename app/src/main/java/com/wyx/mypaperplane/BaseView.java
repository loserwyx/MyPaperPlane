package com.wyx.mypaperplane;

import android.view.View;

/**
 * Created by hp on 2017/2/20.
 */

public interface BaseView<T> {
    // 为view设置Presenter
    void setPresenter(T presenter);
    // 初始化界面控件
    void initViews(View view);
}
