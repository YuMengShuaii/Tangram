package com.enation.app.mobile.tangram.model;

import com.enation.app.mobile.tangram.utils.TangramEnum;

/**
 * 固定布局
 */
public class FixLayoutStyleBean {
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
    /**
     * 显示模式
     */
    private String showType;

    public FixLayoutStyleBean(TangramEnum.Align align, Integer x, Integer y, String bgColor, TangramEnum.ShowType showType) {
        this.align = align.toString();
        this.x = x;
        this.y = y;
        this.bgColor = bgColor;
        this.showType = showType.toString();
    }

    public FixLayoutStyleBean() {
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

    public String getShowType() {
        return showType;
    }

    public void setShowType(TangramEnum.ShowType showType) {
        this.showType = showType.toString();
    }
}
