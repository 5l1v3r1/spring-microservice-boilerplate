package com.saintdan.framework.vo;

import java.io.Serializable;

/**
 * VO for {@link com.saintdan.framework.po.User}
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 6/30/15
 * @since JDK1.8
 */
public class UserVO implements Serializable {

  private static final long serialVersionUID = 6597728015488383528L;

  private Long id;

  private String name;

  private String usr;

  private String description;

  @Override public String toString() {
    final StringBuffer sb = new StringBuffer("UserVO{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", usr='").append(usr).append('\'');
    sb.append(", description='").append(description).append('\'');
    sb.append('}');
    return sb.toString();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsr() {
    return usr;
  }

  public void setUsr(String usr) {
    this.usr = usr;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
