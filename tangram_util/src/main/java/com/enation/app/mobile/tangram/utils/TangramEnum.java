package com.enation.app.mobile.tangram.utils;

/**
 * 七巧板框架枚举类
 */
public class TangramEnum {
    /**
     * 轮播指示器，的方位
     */
    public  enum  IndicatorGravity {
        /**
         * 左
         */
        LEFT{
            @Override
            public String toString() {
                return "left";
            }
        },

        /**
         * 右
         */
        RIGHT{
            @Override
            public String toString() {
                return "right";
            }
        },


        /**
         * 中
         */
        CENTER{
            @Override
            public String toString() {
               return  "center";
            }
        }
    }

    /**
     * 轮播指示器，在内部还是外部
     */
    public enum IndicatorPosition{
        /**
         * 内部
         */
        INSIDE{
            @Override
            public String toString() {
                return "inside";
            }
        },

        /**
         * 外部
         */
        OUTSIZE{
            @Override
            public String toString() {
                return "outside";
            }
        }
    }

    /**
     * 控件方位
     */
    public enum  Align{
        /**
         * 左上
         */
        TOP_LEFT{
            @Override
            public String toString() {
                return "top_left";
            }
        },
        /**
         * 右上
         */
        TOP_RIGHT{
            @Override
            public String toString() {
                return "top_right";
            }
        },

        /**
         * 左下
         */
        BOTTOM_LEFT{
            @Override
            public String toString() {
                return "bottom_left";
            }
        },
        /**
         * 右下
         */
        BOTTOM_RIGHT{
            @Override
            public String toString() {
                return "bottom_right";
            }
        }
    }

    /**
     * 浮动布局和固定布局 显示逻辑
     */
    public enum  ShowType{
        /**
         * 上一个节点显示的时候  显示
         */
        SHOW_ON_ENTER{
            @Override
            public String toString() {
                return "showOnEnter";
            }
        },
        /**
         * 上一个节点在离开可视区域时 显示
         */
        SHOW_ON_LEAVE{
            @Override
            public String toString() {
                return "showOnLeave";
            }
        },

        /**
         * 一直显示
         */
        ALWAYS{
            @Override
            public String toString() {
                return "always";
            }
        }
    }

    /**
     * 吸附布局参数 决定吸底还是吸顶
     */
    public enum Sticky{

        /**
         * 吸顶
         */
        STICKY_START{
            @Override
            public String toString() {
                return "start";
            }
        },

        /**
         * 吸底
         */
        STICKY_END{
            @Override
            public String toString() {
                return "end";
            }
        }
    }
}
