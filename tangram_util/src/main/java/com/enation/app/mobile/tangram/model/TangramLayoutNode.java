package com.enation.app.mobile.tangram.model;

import java.util.List;

/**
 * 七巧板节点模型
 * @param <T> 布局Style
 */
public class TangramLayoutNode<T> {
    /**
     * 布局类型
     */
    private Integer type;
    /**
     * 对应布局Style信息
     */
    private T style;
    /**
     * 子视图信息
     */
    private List<TangramItemBean> items;

    /**
     * 构建横向视图 或者轮播
     * @param style Style
     * @param items 子视图
     * @return 横向视图
     */
    public static TangramLayoutNode createHorizontalView(HorizontalViewStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(10,style,items);
    }

    /**
     * 构建单列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 单列流式视图
     */
    public static TangramLayoutNode createSingleRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(1,style,items);
    }

    /**
     * 构建双列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 双列流式视图
     */
    public static TangramLayoutNode createTwoRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(2,style,items);
    }

    /**
     * 构建三列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 三列流式视图
     */
    public static TangramLayoutNode createThreeRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(3,style,items);
    }

    /**
     * 构建四列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 四列流式视图
     */
    public static TangramLayoutNode createFourRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(4,style,items);
    }

    /**
     * 构建五列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 五列流式视图
     */
    public static TangramLayoutNode createFiveRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(9,style,items);
    }

    /**
     * 构建N列 流式视图
     * @param style Style
     * @param items 子视图
     * @return N列流式视图
     */
    public static TangramLayoutNode createNRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(27,style,items);
    }

    /**
     * 构建1拖N视图
     * @param style Style
     * @param items 子视图
     * @return 1拖N视图
     */
    public static TangramLayoutNode createTarilerN(TarilerNLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(5,style,items);
    }

    /**
     * 构建浮动布局
     * @param style Style
     * @param items 子视图
     * @return  浮动布局
     */
    public static TangramLayoutNode createFloatLayout(FloatLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(7,style,items);
    }

    /**
     * 构建固定顶部布局
     * @param style Style
     * @param items 子视图
     * @return  固定布局
     */
    public static TangramLayoutNode createFixTopLayout(FixLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(8,style,items);
    }

    /**
     * 构建固定底部视图
     * @param style Style
     * @param items 子视图
     * @return  固定视图
     */
    public static TangramLayoutNode createFixBottomLayout(FixLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(23,style,items);
    }

    /**
     * 构建固定视图 前一个元素消失后 显示
     * @param style Style
     * @param items 子视图
     * @return  固定视图
     */
    public static TangramLayoutNode createFixShowEnterLayout(FixLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(28,style,items);
    }

    /**
     * 构建吸附布局  根据style内部参数 选择吸附哪边
     * @param style  Style
     * @param items  子视图
     * @return       吸附布局
     */
    public static TangramLayoutNode createAbsorbAutoLayout(AbsorbLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(20,style,items);
    }

    /**
     * 构建吸附顶部布局
     * @param style Style
     * @param items 子视图
     * @return      吸附布局
     */
    public static TangramLayoutNode createAbsorbTopLayout(AbsorbLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(21,style,items);
    }

    /**
     * 构建吸附底部视图
     * @param style Style
     * @param items 子视图
     * @return  吸附布局
     */
    public static TangramLayoutNode createAbsorbBottomLayout(AbsorbLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(22,style,items);
    }

    /**
     * 构建瀑布流视图
     * @param style Style
     * @param items 子视图
     * @return 瀑布流视图
     */
    public static TangramLayoutNode createWaterfallLayout(WaterfallLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(25,style,items);
    }

    private TangramLayoutNode(Integer type, T style, List<TangramItemBean> items) {
        this.type = type;
        this.style = style;
        this.items = items;
    }

    private TangramLayoutNode() {

    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public T getStyle() {
        return style;
    }

    public void setStyle(T style) {
        this.style = style;
    }

    public List<TangramItemBean> getItems() {
        return items;
    }

    public void setItems(List<TangramItemBean> items) {
        this.items = items;
    }

}
