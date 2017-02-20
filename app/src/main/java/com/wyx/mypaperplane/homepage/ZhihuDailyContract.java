package com.wyx.mypaperplane.homepage;

import com.wyx.mypaperplane.BasePresenter;
import com.wyx.mypaperplane.BaseView;
import com.wyx.mypaperplane.bean.ZhihuDailyNews;

import java.util.ArrayList;

/**
 * Created by hp on 2017/2/20.
 */

public interface ZhihuDailyContract {

    interface View extends BaseView<Presenter> {

        // 显示加载或其它类型的错误
        void showError();
        // 显示正在加载
        void showLoading();
        // 停止显示正在加载
        void stopLoading();
        // 成功获取到数据后在界面显示
        void showResults(ArrayList<ZhihuDailyNews.Question> list);
        // 显示用于加载指定日期的date picker dialog
        void showPickDialog();

    }

    interface Presenter extends BasePresenter {

        // 请求数据
        void loadPosts(long date, boolean clearing);
        // 刷新数据
        void refresh();
        // 加载更多文章
        void loadMore(long date);
        // 显示详情
        void startReading(int position);
        // 随便看看
        void feelLucky();

    }
}
