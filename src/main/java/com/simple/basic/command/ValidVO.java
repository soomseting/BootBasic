package com.simple.basic.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidVO {

    /*
    @NotNull - null값을 제외함. - Integer, Long, String에 적용함
    @NotEmpty - null제외, 공백허용하지 않음 - Array, Map , String에 적용 가능
    @NotBlank - null제외, 공백허용하지 않음, 화이트스페이스(띄어쓰기 공백,엔터 공백) 허용하지 않음. - String에 적용가능

    @Pattern - 정규표현식으로
    @Email - 기본으로 제공되는 이메일 검사
    @Size - 크기 검사... 등등
     */

    @NotBlank(message = "이름은 필수입니다")
    private String name;

    @NotNull(message = "급여는 필수입니다")
    private Integer salary;

    @Pattern(regexp = "[0-9]{3}-[0-9]{4}-[0-9]{4}", message = "010-0000-0000 유형입니다") //regexp - 정규표현식을 씀.
    private String phone;

    @Email(message = "이메일 형식이어야 합니다")
    @NotNull
    private String email;
}
