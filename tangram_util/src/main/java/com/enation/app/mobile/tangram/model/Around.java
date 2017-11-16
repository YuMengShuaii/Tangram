package com.enation.app.mobile.tangram.model;

import java.util.ArrayList;

/**
 * margin padding等 四边参数 简化类
 */
public class Around extends ArrayList<Integer> {

    private Around(Integer top, Integer right, Integer bottom, Integer left) {
        super();
        add(top);
        add(right);
        add(bottom);
        add(left);
    }

    /**
     * 构建Around
     * @param top      上
     * @param right    右
     * @param bottom   下
     * @param left     左
     * @return         Around
     */
    public static Around create(Integer top, Integer right, Integer bottom, Integer left){
        return new Around(top,right,bottom,left);
    }

}
