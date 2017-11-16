package com.enation.app.mobile.tangram.model;

/**
 * 瀑布流布局 Style
 */
public class WaterfallLayoutStyleBean {

    /**
     * 外间距
     */
    private Around margin;

    /**
     *  垂直方向Item间距
     */
    private Integer vGap;

    /**
     * 水平方向Item间距
     */
    private Integer hGap;

    /**
     * 背景颜色
     */
    private String bgColor;

    /**
     * 列数
     */
    private Integer column;

    public WaterfallLayoutStyleBean(Around margin, Integer vGap, Integer hGap, String bgColor, Integer column) {
        this.margin = margin;
        this.vGap = vGap;
        this.hGap = hGap;
        this.bgColor = bgColor;
        this.column = column;
    }

    public WaterfallLayoutStyleBean() {
    }

    public Around getMargin() {
        return margin;
    }

    public void setMargin(Around margin) {
        this.margin = margin;
    }

    public Integer getvGap() {
        return vGap;
    }

    public void setvGap(Integer vGap) {
        this.vGap = vGap;
    }

    public Integer gethGap() {
        return hGap;
    }

    public void sethGap(Integer hGap) {
        this.hGap = hGap;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }
}
