/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月11日
 */
class Entity implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3423440404621264406L;
    private String            id;
    private Timestamp         createTime;
    private String            createUser;
    private String            updateUser;
    private Timestamp         updateTime;

    /**
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the createTime
     */
    public Timestamp getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the createUser
     */
    public String getCreateUser() {
        return this.createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * @return the updateUser
     */
    public String getUpdateUser() {
        return this.updateUser;
    }

    /**
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return the updateTime
     */
    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }


}
