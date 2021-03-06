package com.enation.app.mobile.tangram.utils;

import com.enation.app.mobile.tangram.model.Around;
import com.enation.app.mobile.tangram.model.TangramItemBean;
import com.enation.app.mobile.tangram.model.HorizontalViewStyleBean;

import java.util.ArrayList;
import java.util.List;

public class TangramUtils {
    /**
     * 构建轮播图Style
     * @param selectIndicatorColor  轮播指示器选中状态颜色
     * @param nomalIndicatorColor   轮播指示器未选中状态颜色
     * @return
     */
    public static HorizontalViewStyleBean getCarouselStyle(String selectIndicatorColor, String nomalIndicatorColor,String indicatorSize){
        HorizontalViewStyleBean carouselStyle = new HorizontalViewStyleBean();
        carouselStyle.setAutoScroll(2000);
        carouselStyle.setIndicatorGravity(TangramEnum.IndicatorGravity.CENTER);
        carouselStyle.setIndicatorGap(2);
        carouselStyle.setIndicatorPosition(TangramEnum.IndicatorPosition.OUTSIZE);
        carouselStyle.setMargin(Around.create(5,5,5,5));
        carouselStyle.setPadding(Around.create(5,5,5,5));
        carouselStyle.setInfinite(true);
        carouselStyle.setScrollMarginLeft(20);
        carouselStyle.setScrollMarginRight(20);
        carouselStyle.sethGap(12);
        carouselStyle.setPageRatio(1);
        carouselStyle.setBgColor("#ffffff");
        carouselStyle.setAnimation("desc");
        carouselStyle.setDefaultIndicatorColor(nomalIndicatorColor);
        carouselStyle.setIndicatorStyle(selectIndicatorColor);
        carouselStyle.setIndicatorRadius(indicatorSize);
        return carouselStyle;
    }

    /**
     * 快速构建 七巧板子视图信息
     * @param values      数据源
     * @param itemGetter  数据源转换记忆 回调接口
     * @param <T>         数据源泛型
     */
    public static <T> void createItemList(List<T> values, TangramItemGetter<T> itemGetter){
        List<TangramItemBean> items = new ArrayList<>();
        if (values==null || values.size()==0){
            itemGetter.error("数据源格式不正确！");
            return;
        }

        for (T value : values) {
            items.add(itemGetter.transform(value));
        }

        itemGetter.complete(items);
    }

    /**
     * 数据操作接口
     * @param <T> 数据源泛型
     */
    public interface TangramItemGetter<T>{
        TangramItemBean  transform(T originalValue);
        void complete(List<TangramItemBean> result);
        void error(String message);
    }
}
