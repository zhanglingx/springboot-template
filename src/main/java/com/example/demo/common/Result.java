package com.example.demo.common;


/**
 * 向前端返回信息封装
 *
 * @param <T>
 * @param <T> 可变类型
 */
public class Result<T> {
  //返回信息
  private String msg;
  //数据是否正常请求
  private boolean success;
  //具体返回的数据
  private T detail;

  // getter and setter
  public String getMsg() {
    return this.msg;
  };

  public void setMsg(String msg) {
    this.msg = msg;
  };

  public boolean getSuccess() {
    return this.success;
  };

  public void setSuccess(boolean success) {
    this.success = success;
  };

  public T getDetail() {
    return this.detail;
  };

  public void setDetail(T detail) {
    this.detail = detail;
  };
}
