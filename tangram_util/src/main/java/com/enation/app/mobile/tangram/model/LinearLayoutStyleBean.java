package com.enation.app.mobile.tangram.model;

public class LinearLayoutStyleBean {
    private Around margin;
    private Around padding;
    private String aspectRatio;
    private Integer vGap;
    private Integer hGap;
    private String bgImgUrl;
    private String bgColor;
    private Integer[] cols;

    public LinearLayoutStyleBean() {
    }

    public LinearLayoutStyleBean(Around margin, Around padding, String aspectRatio, Integer vGap, Integer hGap, String bgImgUrl, String bgColor, Integer[] cols) {
        this.margin = margin;
        this.padding = padding;
        this.aspectRatio = aspectRatio;
        this.vGap = vGap;
        this.hGap = hGap;
        this.bgImgUrl = bgImgUrl;
        this.bgColor = bgColor;
        this.cols = cols;
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

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
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

    public Integer[]  getCols() {
        return cols;
    }

    public void setCols(Integer[]  cols) {
        this.cols = cols;
    }
}