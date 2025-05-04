package com.invocation.api.model;

import org.aspectj.apache.bcel.classfile.annotation.NameValuePair;

import java.util.List;
import java.util.Map;

public class RequestDTO {
    private ApiMethod apiMethod;
    private String url;
    private Map<String, String> queryParams;
    private Map<String, String> headerVariables;
    private String bodyType;
    private String requestBody;
    private Map<String, String> pathMap;
    private Map<String, String> formParam;
    private Map<String, String> urlEncodedParam;
    private List<NameValuePair> params;
}

