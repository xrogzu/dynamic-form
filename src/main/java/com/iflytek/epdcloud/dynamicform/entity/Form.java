/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.entity;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import freemarker.template.TemplateException;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月11日
 */
public class Form extends Entity {
    /**
     * 
     */
    private static final long serialVersionUID = 4307770216706319520L;
    /**
     * 分类,活动还是动态
     */
    private byte              category;
    /**
     * 指标ID
     */
    private int               indicatorId;
    /**
     * 字段列表
     */
    private List<Field>       fields           = new LinkedList<Field>();

    /**
     * 
     * 
     * @Description:显示到页面表单
     * @return
     * @throws TemplateException
     * @throws IOException
     */
    public void displayEditHtml(PrintWriter printWriter) throws IOException, TemplateException {
        for (Field f : this.fields) {
            f.displayEditHtml(printWriter);
        }
    }

    /**
     * @return the category
     */
    public byte getCategory() {
        return this.category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(byte category) {
        this.category = category;
    }

    /**
     * @return the indicatorId
     */
    public int getIndicatorId() {
        return this.indicatorId;
    }

    /**
     * @param indicatorId the indicatorId to set
     */
    public void setIndicatorId(int indicatorId) {
        this.indicatorId = indicatorId;
    }

    /**
     * @return the fields
     */
    public List<Field> getFields() {
        return this.fields;
    }

    /**
     * @param fields the fields to set
     */
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }



}
