package com.yu.common.service.api;

/**
 * 封装API的错误码
 * Created on 2019/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}