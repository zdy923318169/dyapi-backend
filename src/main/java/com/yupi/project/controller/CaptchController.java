package com.yupi.project.controller;

import com.yupi.project.common.BaseResponse;
import com.yupi.project.common.ErrorCode;
import com.yupi.project.common.ResultUtils;
import com.yupi.project.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class CaptchController {
    @GetMapping("/captcha")
    public BaseResponse Captcha(){
        return  ResultUtils.error(ErrorCode.NOT_LOGIN_ERROR,"923318");
    }
}
