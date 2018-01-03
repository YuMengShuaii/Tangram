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
    public Tangram createTangramNode(Object node) {
        add(node);
        return this;
    }

    @Override
    public Tangram createTangramNodes(List<Object> tangramNodes) {
        addAll(tangramNodes);
        return this;
    }

    @Override
    public Tangram clearTangramNode() {
        clear();
        return this;
    }

    @Override
    public Tangram createHorizontalViewNode(HorizontalViewStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createHorizontalView(style,items));
        return this;
    }

    @Override
    public Tangram createSingleRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createSingleRow(style,items));
        return this;
    }

    @Override
    public Tangram createTwoRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createTwoRow(style,items));
        return this;
    }

    @Override
    public Tangram createThreeRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createThreeRow(style,items));
        return this;
    }

    @Override
    public Tangram createFourRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFourRow(style,items));
        return this;
    }

    @Override
    public Tangram createFiveRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFiveRow(style,items));
        return this;
    }

    @Override
    public Tangram createNRowNode(LinearLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createNRow(style,items));
        return this;
    }

    @Override
    public Tangram createTarilerNNode(TarilerNLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createTarilerN(style,items));
        return this;
    }

    @Override
    public Tangram createFloatLayoutNode(FloatLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFloatLayout(style,items));
        return this;
    }

    @Override
    public Tangram createFixTopLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFixTopLayout(style,items));
        return this;
    }

    @Override
    public Tangram createFixShowEnterLayoutNode(FixLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createFixShowEnterLayout(style,items));
        return this;
    }

    @Override
    public Tangram createAbsorbAutoLayoutNode(AbsorbLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createAbsorbAutoLayout(style,items));
        return this;
    }


    @Override
    public Tangram createWaterfallLayoutNode(WaterfallLayoutStyleBean style, List<TangramItemBean> items) {
        add(TangramLayoutNode.createWaterfallLayout(style,items));
        return this;
    }

    @Override
    public Tangram with(TangramWith with) {
        with.event(this);
        return this;
    }

    @Override
    public String toJson() {
        return jsonTransformation.event(this);
    }


    @Override
    public void toJson(JsonResult result) {
        result.event(jsonTransformation.event(this));
    }


}
