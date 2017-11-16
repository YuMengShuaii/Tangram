package com.enation.app.mobile.tangram.model;

public class TangramItemBean {
    /**
     * Native注册控件使用的Type
     */
    private Integer type;
    /**
     * 标题信息
     */
    private String  title;
    /**
     * 图片Url
     */
    private String  imageurl;
    /**
     * 功能类型
     */
    private Integer actionType;
    /**
     * 附带信息 以Json格式传输
     * 例如:
     *     {
     *     "price":1.22,
     *     "buyconunt":100
     *     }
     */
    private String  body;

    public TangramItemBean(Integer type, String title, String imageurl, Integer actionType, String body) {
        this.type = type;
        this.title = title;
        this.imageurl = imageurl;
        this.actionType = actionType;
        this.body = body;
    }

    public TangramItemBean() {
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

