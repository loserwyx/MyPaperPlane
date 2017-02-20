package com.wyx.mypaperplane;

/**
 * Created by hp on 2017/2/20.
 */

public interface BasePresenter {
    // 获取数据并改变界面显示，在todo-mvp的项目的调用时机为Fragment的OnResume()方法中
    void start();
}
