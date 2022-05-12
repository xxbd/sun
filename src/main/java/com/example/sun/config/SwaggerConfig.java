// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   SwaggerConfig.java

package com.example.sun.config;

import springfox.documentation.builders.*;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig
{

public Docket createRestApi()
{
return (new Docket(DocumentationType.SWAGGER_2)).pathMapping("/").select().apis(RequestHandlerSelectors.basePackage("com.example.sun.controller")).paths(PathSelectors.any()).build().apiInfo((new ApiInfoBuilder()).title("SpringBoot����Swagger").description("SpringBoot����Swagger����ϸ��Ϣ......").version("9.0").contact(new Contact("��������", "blog.csdn.net", "aaa@gmail.com")).license("The Apache License").licenseUrl("http://www.baidu.com").build());
}
}
