package com.enation.app.mobile.tangram.model;

import com.enation.app.mobile.tangram.utils.TangramEnum;

import java.util.Map;

/**
 * 横向视图 可为轮播
 */
public class HorizontalViewStyleBean {


    /**
     * 轮播页面的外间距
     */
    private Around pageMargin;

    /**
     * 轮播指示器的未选中的颜色
     */
    private String defaultIndicatorColor;

    /**
     * 轮播指示器的已选中颜色
     */
    private String indicatorColor;

    /**
     * 控件的高度
     */
    private String pageHeight;

    /**
     * 轮播页面动画
     */
    private String animation;

    /**
     * 轮播指示器风格
     */
    private String indicatorStyle;

    /**
     * 轮播指示器大小
     */
    private String indicatorRadius;
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
     * 是否可以无限滚动
     */
    private boolean infinite;
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

    public HorizontalViewStyleBean(Around pageMargin, String defaultIndicatorColor, String indicatorColor, String pageHeight, String animation, String indicatorStyle, String indicatorRadius, Around margin, Around padding, Integer autoScroll, Map<String, String> specialInterval, boolean infinite, String indicatorGravity, String indicatorPosition, Integer indicatorGap, Integer indicatorMargin, Integer indicatorHeight, Integer pageWidth, Integer scrollMarginLeft, Integer scrollMarginRight, Integer hGap, Integer pageRatio, String bgColor) {
        this.pageMargin = pageMargin;
        this.defaultIndicatorColor = defaultIndicatorColor;
        this.indicatorColor = indicatorColor;
        this.pageHeight = pageHeight;
        this.animation = animation;
        this.indicatorStyle = indicatorStyle;
        this.indicatorRadius = indicatorRadius;
        this.margin = margin;
        this.padding = padding;
        this.autoScroll = autoScroll;
        this.specialInterval = specialInterval;
        this.infinite = infinite;
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

    /**
     * 构造方法
     */


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

    public String getIndicatorGravity() {
        return indicatorGravity;
    }

    public void setIndicatorGravity(TangramEnum.IndicatorGravity indicatorGravity) {
        this.indicatorGravity = indicatorGravity.toString();
    }

    public String getIndicatorPosition() {
        return indicatorPosition;
    }

    public void setIndicatorPosition(TangramEnum.IndicatorPosition indicatorPosition) {
        this.indicatorPosition = indicatorPosition.toString();
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

    public Around getPageMargin() {
        return pageMargin;
    }

    public void setPageMargin(Around pageMargin) {
        this.pageMargin = pageMargin;
    }

    public String getDefaultIndicatorColor() {
        return defaultIndicatorColor;
    }

    public void setDefaultIndicatorColor(String defaultIndicatorColor) {
        this.defaultIndicatorColor = defaultIndicatorColor;
    }

    public String getIndicatorColor() {
        return indicatorColor;
    }

    public void setIndicatorColor(String indicatorColor) {
        this.indicatorColor = indicatorColor;
    }

    public String getPageHeight() {
        return pageHeight;
    }

    public void setPageHeight(String pageHeight) {
        this.pageHeight = pageHeight;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation;
    }

    public String getIndicatorStyle() {
        return indicatorStyle;
    }

    public void setIndicatorStyle(String indicatorStyle) {
        this.indicatorStyle = indicatorStyle;
    }

    public String getIndicatorRadius() {
        return indicatorRadius;
    }

    public void setIndicatorRadius(String indicatorRadius) {
        this.indicatorRadius = indicatorRadius;
    }

    public void setIndicatorGravity(String indicatorGravity) {
        this.indicatorGravity = indicatorGravity;
    }

    public void setIndicatorPosition(String indicatorPosition) {
        this.indicatorPosition = indicatorPosition;
    }
}
