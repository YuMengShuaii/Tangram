package com.enation.app.mobile.tangram.model;

import com.enation.app.mobile.tangram.utils.TangramEnum;

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

    /**
     * 吸顶/吸底
     */
    private String sticky;

    public AbsorbLayoutStyleBean(Around margin, Integer offset, boolean enableScroll ,TangramEnum.Sticky sticky) {
        this.margin = margin;
        this.offset = offset;
        this.enableScroll = enableScroll;
        this.sticky = sticky.toString();
    }

    public AbsorbLayoutStyleBean() {
    }

    public String getSticky() {
        return sticky;
    }

    public void setSticky(TangramEnum.Sticky sticky) {
        this.sticky = sticky.toString();
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
