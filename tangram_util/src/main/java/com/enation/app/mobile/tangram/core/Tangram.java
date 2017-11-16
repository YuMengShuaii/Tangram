package com.enation.app.mobile.tangram.core;

import com.enation.app.mobile.tangram.model.*;

import java.util.List;

/**
 * 七巧板工具类 协议
 */
public interface Tangram {

    /**
     * 添加七巧板节点
     * @param node 节点
     */
    void createTangramNode(Object node);

    /**
     * 批量添加七巧板节点
     * @param tangramNodes 节点集合
     */
    void createTangramNodes(List<Object> tangramNodes);

    /**
     * 清除七巧板节点
     */
    void clearTangramNode();

    /**
     * 创建横向视图/轮播节点
     * @param style  样式
     * @param items  子视图Info
     */
    void createHorizontalViewNode(HorizontalViewStyleBean style, List<TangramItemBean> items);

    /**
     * 创建单列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createSingleRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建双列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createTwoRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建三列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createThreeRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建四列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createFourRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建五列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createFiveRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建N列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createNRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建一拖N视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createTarilerNNode(TarilerNLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建浮动视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createFloatLayoutNode(FloatLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建固定顶部视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createFixTopLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建固定底部视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createFixBottomLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建固定视图 在FixNode前一个Node显示时 显示该Node
     * @param style 样式
     * @param items 子视图Info
     */
    void createFixShowEnterLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建吸附视图  根据样式中的参数 决定吸附哪边
     * @param style 样式
     * @param items 子视图Info
     */
    void createAbsorbAutoLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建吸顶视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createAbsorbTopLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建吸底 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createAbsorbBottomLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建瀑布流视图
     * @param style 样式
     * @param items 子视图Info
     */
    void createWaterfallLayoutNode(WaterfallLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 序列化成json数据
     * @return
     */
    String toJson();

    /**
     * 外部化Json转换器
     */
    interface JsonTransformation{
        String event(Object tangram);
    }
}
