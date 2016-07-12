/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import com.iflytek.epdcloud.dynamicform.dao.DynamicFormDao;
import com.iflytek.epdcloud.dynamicform.entity.Field;
import com.iflytek.epdcloud.dynamicform.entity.FieldType;
import com.iflytek.epdcloud.dynamicform.entity.Form;
import com.iflytek.epdcloud.dynamicform.util.Servlets;



/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月11日
 */
public class DynamicFormServer {
    /**
     * HTTP提交时的动态字段的前缀 <br>
     * injecting property
     */
    private String          dynamicFieldHttpParameterPrefix = "custom_";
    // injecting property
    private String          fieldTypeConfigLocation;
    // injecting property
    private String          templateLocation                = null;
    // injecting property
    private DataSource      dataSource                      = null;
    private FieldTypeHolder fieldTypeHolder;
    private DynamicFormDao  dynamicFormDao;


    public void init() {
        fieldTypeHolder = new FieldTypeHolder(fieldTypeConfigLocation);
        dynamicFormDao = new DynamicFormDao(dataSource);
        // 初始化freemarkerRender
        FreemarkerRender.init(templateLocation);
    }

    /**
     * @param fieldTypeConfigLocation the fieldTypeConfigLocation to set
     */
    public void setFieldTypeConfigLocation(String fieldTypeConfigLocation) {
        this.fieldTypeConfigLocation = fieldTypeConfigLocation;
    }


    /**
     * @Description: 列出所有的字段类型
     * @return 所有的字段类型
     */
    public List<FieldType> all() {
        return fieldTypeHolder.getFieldTypes();
    }

    /**
     * 添加表单定义
     * 
     * @Description:
     * @param form
     * @return
     */
    public int create(Form form) {
        return 0;
    }

    /**
     * 
     * 
     * @Description: 删除表单
     * @param formId
     * @return
     */
    public int delete(String formId) {
        return 0;
    }

    /**
     * 
     * @Description:查询formId指定的Form定义
     * @param formId
     * @return
     */
    public Form get(String formId) {
        return dynamicFormDao.get(formId);
    }

    /**
     * 
     * @Description:添加新的字段到此表单定义中
     * @param field 待添加的字段
     * @param formId 待操作表单定义的主键ID
     * @return
     */
    public int appendField2Form(Field field, String formId) {
        return 0;
    }

    /**
     * 从表单定义中去除此字段
     * 
     * @Description:
     * @param field 待去除的字段
     * @param formId 待操作的表单定义的主键ID
     * @return
     */
    public int removeFieldFromForm(Field field, String formId) {
        return 0;
    }

    /**
     * 
     * @Description:根据业务模型主键和动态表单获取所有的字段的键值对
     * @param identity
     * @param form 须设置category值和指标ID
     * @return 字段键值列表
     */
    public Map<String, String> get(String identity, Form form) {
        return null;
    }

    /**
     * 
     * @Description: 设置动态表单字段的键值对
     * @param identity
     * @param form 须设置category值和指标ID
     * @param customs 字段键值列表
     */
    public void set(String identity, Form form, Map<String, String> customs) {}

    /**
     * 
     * @Description:收集httpServletRequest中的符合前缀的参数
     * @param httpRequest 待收集的httpServletRequest
     * @return 参数key-value集合
     */
    public Map<String, String> collectFieldProperties(HttpServletRequest httpRequest) {
        return Servlets.getParameterMap(httpRequest, this.dynamicFieldHttpParameterPrefix, false);
    }



    /**
     * @return the dynamicFieldHttpParameterPrefix
     */
    public String getDynamicFieldHttpParameterPrefix() {
        return this.dynamicFieldHttpParameterPrefix;
    }


    /**
     * @param dynamicFieldHttpParameterPrefix the dynamicFieldHttpParameterPrefix to set
     */
    public void setDynamicFieldHttpParameterPrefix(String dynamicFieldHttpParameterPrefix) {
        this.dynamicFieldHttpParameterPrefix = dynamicFieldHttpParameterPrefix;
    }

    /**
     * @param dataSource the dataSource to set
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
