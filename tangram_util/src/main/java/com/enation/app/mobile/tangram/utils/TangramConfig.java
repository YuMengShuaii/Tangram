package com.enation.app.mobile.tangram.utils;

/**
 * 七巧板框架静态变量
 */
public class TangramConfig {
    /**
     * 轮播指示器，的方位
     */
    public static class IndicatorGravity {
        /**
         * 左
         */
        public static final String LEFT = "left";

        /**
         * 右
         */
        public static final String RIGHT = "right";

        /**
         * 中
         */
        public static final String CENTER = "center";
    }

    /**
     * 轮播指示器，在内部还是外部
     */
    public static class IndicatorPosition{
        /**
         * 内部
         */
        public static final String INSIDE =  "inside";

        /**
         * 外部
         */
        public static final String OUTSIZE = "outside";
    }

    /**
     * 控件方位
     */
    public static class Align{
        /**
         * 左上
         */
        public static final String TOP_LEFT = "top_left";

        /**
         * 右上
         */
        public static final String TOP_RIGHT = "top_right";

        /**
         * 左下
         */
        public static final String BOTTOM_LEFT = "bottom_left";

        /**
         * 右下
         */
        public static final String BOTTOM_RIGHT = "bottom_right";
    }

    /**
     * 浮动布局和固定布局 显示逻辑
     */
    public static class ShowType{
        /**
         * 上一个节点显示的时候  显示
         */
        public static final String SHOW_ON_ENTER = "showOnEnter";
        /**
         * 上一个节点在离开可视区域时 显示
         */
        public static final String SHOW_ON_LEAVE= "showOnLeave";
        /**
         * 一直显示
         */
        public static final String ALWAYS= "always";
    }
}
