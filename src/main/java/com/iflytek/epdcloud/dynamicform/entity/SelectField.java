/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.entity;

import java.util.List;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月11日
 */
public class SelectField extends Field {
    /**
     * 
     */
    private static final long serialVersionUID = 857082671538993802L;
    private List<String>      options;

    /**
     * @return the options
     */
    public List<String> getOptions() {
        return this.options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(List<String> options) {
        this.options = options;
    }



}
