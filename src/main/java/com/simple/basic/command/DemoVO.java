package com.simple.basic.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoVO {


    @Pattern(regexp = "^[a-zA-Z0-9]{8,}$", message = "아이디 그렇게 입력하는 거 아닌데~")
    private String id;

    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[~@#$!%*?&])[a-zA-Z\\d~@#$!%*?&]{8,}$", message = "비밀번호 그렇게 입력하는 거 아닌데~")
    private String pw;
}
