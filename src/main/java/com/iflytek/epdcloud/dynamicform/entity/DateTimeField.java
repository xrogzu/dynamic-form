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
public class DateTimeField extends Field {

    /**
     * 
     */
    private static final long serialVersionUID = 3020321608827385602L;
    private String            dateFormat;

    /**
     * @return the dateFormat
     */
    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * @param dateFormat the dateFormat to set
     */
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }



}
