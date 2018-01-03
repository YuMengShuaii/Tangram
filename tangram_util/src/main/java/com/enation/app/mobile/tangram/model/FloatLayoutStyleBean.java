package com.enation.app.mobile.tangram.model;

import com.enation.app.mobile.tangram.utils.TangramEnum;

/**
 * 浮动布局
 */
public class FloatLayoutStyleBean {
    /**
     * 布局位置
     */
    private String align;
    /**
     * X轴位置
     */
    private Integer x;
    /**
     * Y轴位置
     */
    private Integer y;
    /**
     * 背景色
     */
    private String bgColor;

    public FloatLayoutStyleBean(TangramEnum.Align align, Integer x, Integer y, String bgColor) {
        this.align = align.toString();
        this.x = x;
        this.y = y;
        this.bgColor = bgColor;
    }

    public FloatLayoutStyleBean() {
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(TangramEnum.Align align) {
        this.align = align.toString();
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}
