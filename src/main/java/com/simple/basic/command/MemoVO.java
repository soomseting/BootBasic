package com.simple.basic.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoVO {
    private Integer mno;

    @Size(min=5, message = "5자 이상 입력하세요")
    private String memo;

    @Pattern(regexp = "[0-9]{3}-[0-9]{4}-[0-9]{4}", message = "올바른 전화번호를 입력해주세요")
    private String phone;

    @Pattern(regexp = "[0-9]{4}", message = "비밀번호는 숫자 4자리로 입력해주세요")
    private String pw;


    private String secret;

}
