/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.dao;

import javax.sql.DataSource;

import com.iflytek.epdcloud.dynamicform.entity.Form;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月11日
 */
public class DynamicFormDao {
    @SuppressWarnings("unused")
    private DynamicFormDao() {};

    public DynamicFormDao(DataSource dataSource) {

    }

    /**
     * @Description:
     * @param formId
     * @return
     */
    public Form get(String formId) {
        return null;
    }



}
