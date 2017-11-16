package com.enation.app.mobile.tangram.core;

/**
 * 七巧板工厂类
 */
public class TangramFactory {

    /**
     * 构建七巧板辅助器
     * @param jsonTransformation Json转换接口
     * @return 七巧板辅助器
     */
    public static Tangram create(Tangram.JsonTransformation jsonTransformation) {
        return new _Tangram(jsonTransformation);
    }

}
