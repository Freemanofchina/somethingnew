package com.cqx.excel;

import java.util.List;

/**
 * Author :chenqisheng
 * Date   :2016-09-05 15:38.
 */
public interface IExcelExport<T> {
    /**
     * 获取Excel的Header
     *
     * @return
     */
    String[] getHeader();

    /**
     * 返回Excel的header大小
     *
     * @return
     */
    int getHeaderSize();

    /**
     * 导出的标题
     *
     * @return
     */
    String getTitle();

    /**
     * 是否包含 特殊的Field的处理
     *
     * @param filedName
     * @return
     */
    boolean containSpecialField(String filedName);

    /**
     * 获取 特殊的Field的处理后的值
     *
     * @param filedName
     * @return
     */
    String getSpecialFieldValue(String filedName, Object value);

    /**
     * 获取数据源
     *
     * @return
     */
    List<T> getPoiList();

    /**
     * 设置数据源
     */
    void setPoiList(List<T> data);
}
