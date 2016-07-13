/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.entity;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月11日
 */
public class TextField extends Field {
    /**
     * 
     */
    private static final long serialVersionUID = 9129633277768057353L;
    private int               maxSize;

    /**
     * @return the maxSize
     */
    public int getMaxSize() {
        return this.maxSize;
    }

    /**
     * @param maxSize the maxSize to set
     */
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


}
