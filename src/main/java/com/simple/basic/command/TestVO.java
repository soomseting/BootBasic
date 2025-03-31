package com.simple.basic.command;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor //기본생성자
@AllArgsConstructor //멤버변수를 받는 생성자
//@Getter
//@Setter
//@ToString //toString메서드 오버라이딩
@Data // getter + setter + toString 3개를 합침.
public class TestVO {

    //단축키 alt + insert

    private String id;
    private String pw;
    private String name;
    private int salary;
    private String address;
    private LocalDate hiredate;


}
