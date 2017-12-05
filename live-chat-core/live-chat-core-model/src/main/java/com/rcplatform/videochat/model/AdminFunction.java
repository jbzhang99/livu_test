package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_admin_function")
public class AdminFunction implements Serializable {

    public AdminFunction() {
    }

    public AdminFunction(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 管理员角色id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 图标
     */
    private String icon;

    /**
     * 功能名称
     */
    private String name;

    /**
     * 功能url
     */
    private String url;

    private Integer navType;

    private Integer parentId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取管理员角色id
     *
     * @return role_id - 管理员角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置管理员角色id
     *
     * @param roleId 管理员角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取功能名称
     *
     * @return name - 功能名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置功能名称
     *
     * @param name 功能名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取功能url
     *
     * @return url - 功能url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置功能url
     *
     * @param url 功能url
     */
    public void setUrl(String url) {
        this.url = url;
    }

  public Integer getNavType() {
    return navType;
  }

  public void setNavType(Integer navType) {
    this.navType = navType;
  }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
  public String toString() {
    return "AdminFunction{" +
      "id=" + id +
      ", roleId=" + roleId +
      ", icon='" + icon + '\'' +
      ", name='" + name + '\'' +
      ", url='" + url + '\'' +
      ", navType=" + navType +
      '}';
  }
}
