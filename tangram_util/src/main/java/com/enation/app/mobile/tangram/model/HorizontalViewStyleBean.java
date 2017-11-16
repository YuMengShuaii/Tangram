package com.enation.app.mobile.tangram.model;

import java.util.Map;

/**
 * 横向视图 可为轮播
 */
public class HorizontalViewStyleBean {
    /**
     * 外间距
     */
    private Around margin;
    /**
     * 内间距
     */
    private Around padding;
    /**
     * 自动滚动的时间间隔
     */
    private Integer autoScroll;
    /**
     * 可以自由设置每一帧的间隔时间
     */
    private Map<String,String> specialInterval;
    /**
     * 是否无线滚动
     */
    private boolean infinite;
    /**
     * 选中状态 轮播指示图
     */
    private String indicatorImg1;
    /**
     * 未选中状态 轮播指示图
     */
    private String indicatorImg2;
    /**
     * 轮播指示器 位置
     */
    private String indicatorGravity;
    /**
     * 轮播指示器 显示在轮播内部还是外部
     */
    private String indicatorPosition;
    /**
     * 轮播指示器的每个间隔
     */
    private Integer indicatorGap;
    /**
     * 轮播指示器外间距
     */
    private Integer indicatorMargin;
    /**
     * 轮播指示器高度
     */
    private Integer indicatorHeight;
    /**
     * 页面宽度 一旦设置改参数后 该视图就会变成 横向视图 不再是轮播
     */
    private Integer pageWidth;
    /**
     * 轮播控件左外间距
     */
    private Integer scrollMarginLeft;
    /**
     * 轮播控件右外间距
     */
    private Integer scrollMarginRight;
    /**
     * 轮播指示器高度
     */
    private Integer hGap;
    /**
     * 每个page的偏移量
     */
    private Integer pageRatio;
    /**
     * 背景色
     */
    private String bgColor;

    public HorizontalViewStyleBean(Around margin, Around padding, Integer autoScroll, Map<String, String> specialInterval, boolean infinite, String indicatorImg1, String indicatorImg2, String indicatorGravity, String indicatorPosition, Integer indicatorGap, Integer indicatorMargin, Integer indicatorHeight, Integer pageWidth, Integer scrollMarginLeft, Integer scrollMarginRight, Integer hGap, Integer pageRatio, String bgColor) {
        this.margin = margin;
        this.padding = padding;
        this.autoScroll = autoScroll;
        this.specialInterval = specialInterval;
        this.infinite = infinite;
        this.indicatorImg1 = indicatorImg1;
        this.indicatorImg2 = indicatorImg2;
        this.indicatorGravity = indicatorGravity;
        this.indicatorPosition = indicatorPosition;
        this.indicatorGap = indicatorGap;
        this.indicatorMargin = indicatorMargin;
        this.indicatorHeight = indicatorHeight;
        this.pageWidth = pageWidth;
        this.scrollMarginLeft = scrollMarginLeft;
        this.scrollMarginRight = scrollMarginRight;
        this.hGap = hGap;
        this.pageRatio = pageRatio;
        this.bgColor = bgColor;
    }

    public HorizontalViewStyleBean() {
    }

    public Around getMargin() {
        return margin;
    }

    public void setMargin(Around margin) {
        this.margin = margin;
    }

    public Around getPadding() {
        return padding;
    }

    public void setPadding(Around padding) {
        this.padding = padding;
    }

    public Integer getAutoScroll() {
        return autoScroll;
    }

    public void setAutoScroll(Integer autoScroll) {
        this.autoScroll = autoScroll;
    }

    public Map<String, String> getSpecialInterval() {
        return specialInterval;
    }

    public void setSpecialInterval(Map<String, String> specialInterval) {
        this.specialInterval = specialInterval;
    }

    public boolean isInfinite() {
        return infinite;
    }

    public void setInfinite(boolean infinite) {
        this.infinite = infinite;
    }

    public String getIndicatorImg1() {
        return indicatorImg1;
    }

    public void setIndicatorImg1(String indicatorImg1) {
        this.indicatorImg1 = indicatorImg1;
    }

    public String getIndicatorImg2() {
        return indicatorImg2;
    }

    public void setIndicatorImg2(String indicatorImg2) {
        this.indicatorImg2 = indicatorImg2;
    }

    public String getIndicatorGravity() {
        return indicatorGravity;
    }

    public void setIndicatorGravity(String indicatorGravity) {
        this.indicatorGravity = indicatorGravity;
    }

    public String getIndicatorPosition() {
        return indicatorPosition;
    }

    public void setIndicatorPosition(String indicatorPosition) {
        this.indicatorPosition = indicatorPosition;
    }

    public Integer getIndicatorGap() {
        return indicatorGap;
    }

    public void setIndicatorGap(Integer indicatorGap) {
        this.indicatorGap = indicatorGap;
    }

    public Integer getIndicatorMargin() {
        return indicatorMargin;
    }

    public void setIndicatorMargin(Integer indicatorMargin) {
        this.indicatorMargin = indicatorMargin;
    }

    public Integer getIndicatorHeight() {
        return indicatorHeight;
    }

    public void setIndicatorHeight(Integer indicatorHeight) {
        this.indicatorHeight = indicatorHeight;
    }

    public Integer getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(Integer pageWidth) {
        this.pageWidth = pageWidth;
    }

    public Integer getScrollMarginLeft() {
        return scrollMarginLeft;
    }

    public void setScrollMarginLeft(Integer scrollMarginLeft) {
        this.scrollMarginLeft = scrollMarginLeft;
    }

    public Integer getScrollMarginRight() {
        return scrollMarginRight;
    }

    public void setScrollMarginRight(Integer scrollMarginRight) {
        this.scrollMarginRight = scrollMarginRight;
    }

    public Integer gethGap() {
        return hGap;
    }

    public void sethGap(Integer hGap) {
        this.hGap = hGap;
    }

    public Integer getPageRatio() {
        return pageRatio;
    }

    public void setPageRatio(Integer pageRatio) {
        this.pageRatio = pageRatio;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}
