package com.oscarlin.backend.bean;

import lombok.Data;

@Data
public class Result {

    private Integer code;
    private String message;
    private Object data;
}
