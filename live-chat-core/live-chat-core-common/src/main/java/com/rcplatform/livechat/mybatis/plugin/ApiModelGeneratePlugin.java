package com.rcplatform.livechat.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yang peng on 2016/7/25.
 */
public class ApiModelGeneratePlugin extends PluginAdapter {


    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    public ApiModelGeneratePlugin() {
    }

    private static Pattern humpPattern = Pattern.compile("[A-Z]");


    private void addFiled(TopLevelClass topLevelClass,IntrospectedTable intropspectedTable){
        topLevelClass.addImportedType("io.swagger.annotations.ApiModelProperty");
        List<Field> fields = topLevelClass.getFields();
        for(Field field:fields){
            if(!field.getName().equals("serialVersionUID")){
                IntrospectedColumn column = intropspectedTable.getColumn(humpToLine(field.getName()));
                field.addAnnotation("@ApiModelProperty(value=\""+column.getRemarks()+"\")");
            }
        }
    }

    private void processEntityClass(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
            topLevelClass.addImportedType("io.swagger.annotations.ApiModel");
            topLevelClass.addAnnotation("@ApiModel");
    }


    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        this.addFiled(topLevelClass,introspectedTable);
        return true;
    }

    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        this.addFiled(topLevelClass,introspectedTable);
        return true;
    }

    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        this.addFiled(topLevelClass,introspectedTable);
        return false;
    }

    /**驼峰转下划线*/
    public static String humpToLine(String str){
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, "_"+matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }



}
