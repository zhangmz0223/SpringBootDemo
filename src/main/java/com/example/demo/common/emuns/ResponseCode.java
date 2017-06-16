package com.example.demo.common.emuns;

/**
 * @author zhangmz
 * @create 2017/6/12
 */
public enum ResponseCode {

  SUCCESS(0, "SUCCESS"),
  ERROR(1, "ERROR");

  private final int code;
  private final String desc;


  ResponseCode(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public int getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }
}
