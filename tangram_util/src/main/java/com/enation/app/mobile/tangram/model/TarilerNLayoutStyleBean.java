package com.enation.app.mobile.tangram.model;


/**
 * 一拖N布局 Style
 */
public  class TarilerNLayoutStyleBean {
    /**
     * 外间距
     */
    private Around margin;

    /**
     *  每一个布局的偏移量
     */
    private String aspectRatio;

    /**
     * 背景图Url
     */
    private String bgImgUrl;

    /**
     * 背景颜色
     */
    private String bgColor;

    /**
     * 设置宽度比例
     */
    private Integer[] cols;
    /**
     * 设置高度比例
     */
    private Integer[] rows;

    public TarilerNLayoutStyleBean(Around margin, String aspectRatio, String bgImgUrl, String bgColor, Integer[] cols, Integer[] rows) {
        this.margin = margin;
        this.aspectRatio = aspectRatio;
        this.bgImgUrl = bgImgUrl;
        this.bgColor = bgColor;
        this.cols = cols;
        this.rows = rows;
    }

    public TarilerNLayoutStyleBean() {
    }

    public Around getMargin() {
        return margin;
    }

    public void setMargin(Around margin) {
        this.margin = margin;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getBgImgUrl() {
        return bgImgUrl;
    }

    public void setBgImgUrl(String bgImgUrl) {
        this.bgImgUrl = bgImgUrl;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public Integer[] getCols() {
        return cols;
    }

    public void setCols(Integer[] cols) {
        this.cols = cols;
    }

    public Integer[] getRows() {
        return rows;
    }

    public void setRows(Integer[] rows) {
        this.rows = rows;
    }
}