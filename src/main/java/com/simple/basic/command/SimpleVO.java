package com.simple.basic.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor //기본생성자
@AllArgsConstructor //멤버변수를 받는 생성자
//@Getter
//@Setter
//@ToString //toString메서드 오버라이딩
@Data //getter + setter + toString 를 합침
@Builder
public class SimpleVO {

    //단축키 alt + insert
    private int mno;
    private String name;
    private LocalDateTime hiredate;
}
