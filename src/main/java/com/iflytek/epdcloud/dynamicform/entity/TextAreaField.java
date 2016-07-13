/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.entity;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月13日
 */
public class TextAreaField extends TextField {
    /**
     * 
     */
    private static final long serialVersionUID = -6744446811954529101L;
    /**
     * 宽度
     */
    private short             width;
    /**
     * 高度
     */
    private short             height;

    /**
     * @return the width
     */
    public short getWidth() {
        return this.width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(short width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public short getHeight() {
        return this.height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(short height) {
        this.height = height;
    }

}
