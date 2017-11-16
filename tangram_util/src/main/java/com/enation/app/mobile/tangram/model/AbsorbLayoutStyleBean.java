package com.enation.app.mobile.tangram.model;

/**
 * 吸附布局
 */
public class AbsorbLayoutStyleBean {
    /**
     * 外间距
     */
    private Around margin;
    /**
     * 偏移量
     */
    private Integer offset;
    /**
     * 是否跟随滑动
     */
    private boolean enableScroll;

    public AbsorbLayoutStyleBean(Around margin, Integer offset, boolean enableScroll) {
        this.margin = margin;
        this.offset = offset;
        this.enableScroll = enableScroll;
    }

    public AbsorbLayoutStyleBean() {
    }

    public Around getMargin() {
        return margin;
    }

    public void setMargin(Around margin) {
        this.margin = margin;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public boolean isEnableScroll() {
        return enableScroll;
    }

    public void setEnableScroll(boolean enableScroll) {
        this.enableScroll = enableScroll;
    }
}
