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
    Tangram createTangramNode(Object node);

    /**
     * 批量添加七巧板节点
     * @param tangramNodes 节点集合
     */
    Tangram createTangramNodes(List<Object> tangramNodes);

    /**
     * 清除七巧板节点
     */
    Tangram clearTangramNode();

    /**
     * 创建横向视图/轮播节点
     * @param style  样式
     * @param items  子视图Info
     */
    Tangram createHorizontalViewNode(HorizontalViewStyleBean style, List<TangramItemBean> items);

    /**
     * 创建单列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createSingleRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建双列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createTwoRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建三列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createThreeRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建四列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createFourRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建五列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createFiveRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建N列 流水视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createNRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建一拖N视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createTarilerNNode(TarilerNLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建浮动视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createFloatLayoutNode(FloatLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建固定顶部视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createFixTopLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建固定视图 在FixNode前一个Node显示时 显示该Node
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createFixShowEnterLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 创建吸附视图  根据样式中的参数 决定吸附哪边
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createAbsorbAutoLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items);


    /**
     * 创建瀑布流视图
     * @param style 样式
     * @param items 子视图Info
     */
    Tangram createWaterfallLayoutNode(WaterfallLayoutStyleBean style, List<TangramItemBean> items);

    /**
     * 使用接口方式强行链化
     * @param with  接口会回调
     * @return self
     */
    Tangram with(TangramWith with);

    /**
     * 序列化成json数据
     * @return
     */
    String toJson();


    /**
     * 序列化成json数据 回调式
     * @return
     */
    void toJson(JsonResult result);

    /**
     * 外部化Json转换器
     */
    interface JsonTransformation{
        String event(Object tangram);
    }

    /**
     * 链式维护接口
     */
    interface TangramWith{
        void event(Tangram self);
    }

    interface JsonResult{
        void event(String json);
    }
}
