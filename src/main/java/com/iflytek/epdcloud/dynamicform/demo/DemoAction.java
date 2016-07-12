/**
 * Copyright © 2016 科大讯飞股份有限公司. All rights reserved.
 */
package com.iflytek.epdcloud.dynamicform.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

import com.iflytek.epdcloud.dynamicform.DynamicFormServer;
import com.iflytek.epdcloud.dynamicform.entity.Form;

/**
 * @description：
 * 
 * @author suenlai
 * @date 2016年7月12日
 */
@RequestMapping("/dynamicForm/")
public class DemoAction {
    private DynamicFormServer dynamicFormService;

    /**
     * 
     * 
     * @Description:选定指标后,点击添加动态表单,后台创建一个默认的无字段列表的动态表单并返回到页面
     */
    @RequestMapping("/add.do")
    public String createForm(int indicatorId, byte category) {
        Form form = new Form();
        form.setCategory(category);
        form.setIndicatorId(indicatorId);
        dynamicFormService.create(form);
        return "detail.jsp";
    }

    /**
     * 
     * @Description: 点击动态表单的添加字段动作
     */
    @RequestMapping("/addField.do")
    public void addField(String formId, HttpServletRequest httpRequest) {
        dynamicFormService.appendField2Form(null, null);

    }


    /**
     * 
     * @Description:保存字段配置,以及字段和表单的关联
     */
    @RequestMapping("/saveField.do")
    public void saveField() {

    }

    /**
     * 提交填写完成后的动态表单
     * 
     * @Description:
     * @param httpRequest
     */
    public void saveActivity(HttpServletRequest httpRequest, String formId, String identity) {
        // 做默认业务字段的提交,

        // 处理动态字段
        Map<String, String> dynamicFieldValue =
                dynamicFormService.collectFieldProperties(httpRequest);
        dynamicFormService.set(identity, dynamicFormService.get(formId), dynamicFieldValue);

    }


}
