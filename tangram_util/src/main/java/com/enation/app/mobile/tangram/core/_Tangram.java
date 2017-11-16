package com.enation.app.mobile.tangram.core;

import com.enation.app.mobile.tangram.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 七巧板框架辅助类
 */
class _Tangram extends ArrayList implements Tangram {

    private JsonTransformation jsonTransformation;

    protected _Tangram(JsonTransformation jsonTransformation) {
        super();
        this.jsonTransformation = jsonTransformation;
    }

    @Override
    public void createTangramNode(Object node) {
        add(node);
    }

    @Override
    public void createTangramNodes(List<Object> tangramNodes) {
        addAll(tangramNodes);
    }

    @Override
    public void clearTangramNode() {
        clear();
    }

    @Override
    public void createHorizontalViewNode(HorizontalViewStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createHorizontalView(style,items));
    }

    @Override
    public void createSingleRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createSingleRow(style,items));
    }

    @Override
    public void createTwoRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createTwoRow(style,items));
    }

    @Override
    public void createThreeRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createThreeRow(style,items));
    }

    @Override
    public void createFourRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFourRow(style,items));
    }

    @Override
    public void createFiveRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFiveRow(style,items));
    }

    @Override
    public void createNRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createNRow(style,items));
    }

    @Override
    public void createTarilerNNode(TarilerNLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createTarilerN(style,items));
    }

    @Override
    public void createFloatLayoutNode(FloatLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFloatLayout(style,items));
    }

    @Override
    public void createFixTopLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFixTopLayout(style,items));
    }

    @Override
    public void createFixBottomLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFixBottomLayout(style,items));
    }

    @Override
    public void createFixShowEnterLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFixShowEnterLayout(style,items));
    }

    @Override
    public void createAbsorbAutoLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createAbsorbAutoLayout(style,items));
    }

    @Override
    public void createAbsorbTopLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createAbsorbTopLayout(style,items));
    }

    @Override
    public void createAbsorbBottomLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createAbsorbBottomLayout(style,items));
    }

    @Override
    public void createWaterfallLayoutNode(WaterfallLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createWaterfallLayout(style,items));
    }

    @Override
    public String toJson() {
        return jsonTransformation.event(this);
    }


}
