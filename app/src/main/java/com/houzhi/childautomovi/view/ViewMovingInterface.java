package com.houzhi.childautomovi.view;

import android.view.View;

/**
 * Created by houzhi on 15-5-13.
 */
public interface ViewMovingInterface {

    /**
     * 移动
     * @param view
     * @param height 移动高度
     * @param width 移动宽度
     */
    void move(View view,int width,int height);


    /**
     * 初始化位置
     * @param view
     * @param height 移动高度
     * @param width 移动宽度
     */
    void init(View view,int width,int height);

}
