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
public class FieldType extends Entity {

    /**
     * 
     */
    private static final long serialVersionUID = -2849371327865416883L;

    private String            name;
    private String            code;
    private String            description;
    private String            className;
    private String            configTemplate;
    private String            editTemplate;

    /**
     * @param name
     * @param description
     * @param className
     */
    public FieldType(String name, String code, String description, String className,
            String configTemplate, String editTemplate) {
        super();
        this.name = name;
        this.code = code;
        this.description = description;
        this.className = className;
        this.configTemplate = configTemplate;
        this.editTemplate = editTemplate;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the configTemplate
     */
    public String getConfigTemplate() {
        return this.configTemplate;
    }

    /**
     * @param configTemplate the configTemplate to set
     */
    public void setConfigTemplate(String configTemplate) {
        this.configTemplate = configTemplate;
    }

    /**
     * @return the editTemplate
     */
    public String getEditTemplate() {
        return this.editTemplate;
    }

    /**
     * @param editTemplate the editTemplate to set
     */
    public void setEditTemplate(String editTemplate) {
        this.editTemplate = editTemplate;
    }



}
