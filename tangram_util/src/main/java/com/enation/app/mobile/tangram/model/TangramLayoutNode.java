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
    private String type;
    /**
     * 对应布局Style信息
     */
    private T style;
    /**
     * 子视图信息
     */
    private List<TangramItemBean> items;

    /**
     * 七巧板节点类型通用头部
     */
    private static final String CONTAINER_STR_HEADER = "container-";

    /**
     * 构建七巧板节点类型
     * @param tag 类型footer
     * @return  类型
     */
    private static String createTangramNodeTag(String tag){
        return CONTAINER_STR_HEADER+tag;
    }

    /**
     * 七巧板节点类型 流式布局 单列
     */
    public static final String  TANGRAM_STREAM_ONECOLUMN =createTangramNodeTag("oneColumn");

    /**
     * 七巧板节点类型 流式布局 双列
     */
    public static final String  TANGRAM_STREAM_TWOCOLUMN =createTangramNodeTag("twoColumn");

    /**
     * 七巧板节点类型 流式布局 三列
     */
    public static final String  TANGRAM_STREAM_THREECOLUMN =createTangramNodeTag("threeColumn");

    /**
     * 七巧板节点类型 流式布局 四列
     */
    public static final String  TANGRAM_STREAM_FOURCOLUMN =createTangramNodeTag("fourColumn");

    /**
     * 七巧板节点类型 流式布局 五列
     */
    public static final String  TANGRAM_STREAM_FIVECOLUMN =createTangramNodeTag("fiveColumn");

    /**
     * 七巧板节点类型 流式布局 N列
     */
    public static final String  TANGRAM_STREAM_NCOLUMN =createTangramNodeTag("flow");

    /**
     * 1拖n布局 到达数量自动区分
     */
    public static final String TANGRAM_ONEWITHN = createTangramNodeTag("onePlusN");

    /**
     * 浮标可拖动 自动吸边
     */
    public static final String TANGRAM_FLOAT = createTangramNodeTag("float");

    /**
     * 固定布局 固定在某个位置不可拖动
     */
    public static final String TANGRAM_FIX = createTangramNodeTag("fix");

    /**
     * 滚动固定(滚动到某个布局的时候，出现并固定)
     */
    public static final String TANGRAM_SCROLL_FIX = createTangramNodeTag("scrollFix");

    /**
     * 吸顶/吸底 根据属性指定
     */
    public static final String TANGRAM_STICKY = createTangramNodeTag("sticky");

    /**
     * 轮播
     */
    public static final String TANGRAM_BANNER = createTangramNodeTag("banner");

    /**
     * 横向滚动视图
     */
    public static final String TANGRAM_SCROLL = createTangramNodeTag("scroll");

    /**
     * 瀑布流
     */
    public static final String TANGRAM_WATERFALL = createTangramNodeTag("waterfall");


    /**
     * 私有构造方法 禁止外部实例化
     * @param type    Tangram节点类型
     * @param style   风格
     * @param items   子节点列表
     */
    private TangramLayoutNode(String type, T style, List<TangramItemBean> items) {
        this.type = type;
        this.style = style;
        this.items = items;
    }

    /**
     * 私有构造方法 禁止外部实例化
     */
    private TangramLayoutNode() {

    }

    /**
     * GET SET Header  
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
    /**
     * GET SET Footer
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     */

    /**
     * 构建横向滚动视图
     * @param style Style
     * @param items 子视图
     * @return 横向视图
     */
    public static TangramLayoutNode createHorizontalView(HorizontalViewStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_SCROLL,style,items);
    }

    /**
     * 构建轮播视图
     * @param style Style
     * @param items 子视图
     * @return 横向视图
     */
    public static TangramLayoutNode createBannerlView(HorizontalViewStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_BANNER,style,items);
    }

    /**
     * 构建单列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 单列流式视图
     */
    public static TangramLayoutNode createSingleRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_STREAM_ONECOLUMN,style,items);
    }

    /**
     * 构建双列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 双列流式视图
     */
    public static TangramLayoutNode createTwoRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_STREAM_TWOCOLUMN,style,items);
    }

    /**
     * 构建三列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 三列流式视图
     */
    public static TangramLayoutNode createThreeRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_STREAM_THREECOLUMN,style,items);
    }

    /**
     * 构建四列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 四列流式视图
     */
    public static TangramLayoutNode createFourRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_STREAM_FOURCOLUMN,style,items);
    }

    /**
     * 构建五列 流式视图
     * @param style Style
     * @param items 子视图
     * @return 五列流式视图
     */
    public static TangramLayoutNode createFiveRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_STREAM_FIVECOLUMN,style,items);
    }

    /**
     * 构建N列 流式视图
     * @param style Style
     * @param items 子视图
     * @return N列流式视图
     */
    public static TangramLayoutNode createNRow(LinearLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_STREAM_NCOLUMN,style,items);
    }

    /**
     * 构建1拖N视图
     * @param style Style
     * @param items 子视图
     * @return 1拖N视图
     */
    public static TangramLayoutNode createTarilerN(TarilerNLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_ONEWITHN,style,items);
    }

    /**
     * 构建浮动布局
     * @param style Style
     * @param items 子视图
     * @return  浮动布局
     */
    public static TangramLayoutNode createFloatLayout(FloatLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_FLOAT,style,items);
    }

    /**
     * 构建固定布局
     * @param style Style
     * @param items 子视图
     * @return  固定布局
     */
    public static TangramLayoutNode createFixTopLayout(FixLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_FIX,style,items);
    }

    /**
     * 构建固定视图 前一个元素消失后 显示
     * @param style Style
     * @param items 子视图
     * @return  固定视图
     */
    public static TangramLayoutNode createFixShowEnterLayout(FixLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_SCROLL_FIX,style,items);
    }

    /**
     * 构建吸附布局  根据style内部参数 选择吸附哪边
     * @param style  Style
     * @param items  子视图
     * @return       吸附布局
     */
    public static TangramLayoutNode createAbsorbAutoLayout(AbsorbLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_STICKY,style,items);
    }

    /**
     * 构建瀑布流视图
     * @param style Style
     * @param items 子视图
     * @return 瀑布流视图
     */
    public static TangramLayoutNode createWaterfallLayout(WaterfallLayoutStyleBean style, List<TangramItemBean> items){
        return new TangramLayoutNode(TANGRAM_WATERFALL,style,items);
    }
}
