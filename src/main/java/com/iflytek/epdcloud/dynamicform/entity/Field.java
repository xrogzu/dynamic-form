/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.entity;

import java.io.IOException;
import java.io.PrintWriter;

import com.iflytek.epdcloud.dynamicform.FreemarkerRender;

import freemarker.template.TemplateException;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月11日
 */
public abstract class Field extends Entity {
    /**
     * 
     */
    private static final long serialVersionUID = 8490123409058414359L;
    /**
     * 字段编码
     */
    private String            code;
    /**
     * 字段用于显示的label
     */
    private String            label;
    /**
     * 字段类型
     */
    private FieldType         fieldType;
    /**
     * 一行几列
     */
    private byte              columns;
    /**
     * 是否必须
     */
    private boolean           required;
    /**
     * 默认值
     */
    private String            defaultValue;
    /**
     * 宽度
     */
    private short             width;
    /**
     * 高度
     */
    private short             height;
    /**
     * 顺序
     */
    private int               sequence;

    /**
     * 
     * @Description:显示配置字段表单
     * @param printWriter
     * @throws TemplateException
     * @throws IOException
     */
    public void displayConfigHtml(PrintWriter printWriter) throws IOException, TemplateException {
        String templateName = this.fieldType.getConfigTemplate();
        printWriter.print(FreemarkerRender.render(templateName, this));
    }



    /**
     * 
     * @Description:显示到页面表单
     * @param printWriter
     * @throws TemplateException
     * @throws IOException
     */
    public void displayEditHtml(PrintWriter printWriter) throws IOException, TemplateException {
        String templateName = this.fieldType.getEditTemplate();
        printWriter.print(FreemarkerRender.render(templateName, this));
    }



    /**
     * @return the code
     */
    public String getCode() {
        return this.code;
    }



    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }



    /**
     * @return the label
     */
    public String getLabel() {
        return this.label;
    }



    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }



    /**
     * @return the fieldType
     */
    public FieldType getFieldType() {
        return this.fieldType;
    }



    /**
     * @param fieldType the fieldType to set
     */
    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }



    /**
     * @return the columns
     */
    public byte getColumns() {
        return this.columns;
    }



    /**
     * @param columns the columns to set
     */
    public void setColumns(byte columns) {
        this.columns = columns;
    }



    /**
     * @return the required
     */
    public boolean isRequired() {
        return this.required;
    }



    /**
     * @param required the required to set
     */
    public void setRequired(boolean required) {
        this.required = required;
    }



    /**
     * @return the defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }



    /**
     * @param defaultValue the defaultValue to set
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }



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



    /**
     * @return the sequence
     */
    public int getSequence() {
        return this.sequence;
    }



    /**
     * @param sequence the sequence to set
     */
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }



}
