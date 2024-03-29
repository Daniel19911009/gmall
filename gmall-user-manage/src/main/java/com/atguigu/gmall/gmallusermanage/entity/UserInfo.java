package com.atguigu.gmall.gmallusermanage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
public class UserInfo implements Serializable {
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  @Column
  private String loginName;
  @Column
  private String nickName;
  @Column
  private String passwd;
  @Column
  private String name;
  @Column
  private String phoneNum;
  @Column
  private String email;
  @Column
  private String headImg;
  @Column
  private String userLevel;
}
