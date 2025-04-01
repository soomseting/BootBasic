package com.simple.basic.controller;

import com.simple.basic.command.SimpleVO;
import com.simple.basic.command.TestVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Controller
@RequestMapping("/view")
public class ThymleafController {

    @GetMapping("/ex01")
    public String ex01() {
        return "view/ex01"; //templates폴더 하위경로
    }

    @GetMapping("/ex02")
    public String ex02(Model model) {

        ArrayList<TestVO> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            TestVO vo = TestVO
                    .builder()
                    .id("aaa" + i)
                    .name("홍길동" + i)
                    .address("서울시" + i)
                    .hiredate(LocalDateTime.now())
                    .salary(3000)
                    .build();
            list.add(vo);
        }

        model.addAttribute("list", list);

        return "view/ex02";
    }

    @GetMapping("/ex03")
    public String ex03(Model model) {

        ArrayList<TestVO> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            TestVO vo = TestVO
                    .builder()
                    .id("aaa" + i)
                    .name("홍길동" + i)
                    .address("서울시" + i)
                    .hiredate(LocalDateTime.now())
                    .salary(3000)
                    .build();
            list.add(vo);
        }

        model.addAttribute("list", list);

        return "view/ex03";
    }

    @GetMapping("/result")
    public String result() {
        return "view/result";
    }

    @GetMapping("/result2/{address}/{value}")
    public String result2(@PathVariable("address") String address,
                          @PathVariable("value") String value) {

        System.out.println(address + ", " + value);


        return "view/result";
    }

    @GetMapping("/ex04")
    public String ex04(Model model) {

        TestVO vo = new TestVO();
        vo.setId("abc123");
        vo.setId("경기도");
        vo.setId("홍길동");
        vo.setHiredate(LocalDateTime.now()); //오늘날짜

        model.addAttribute("vo", vo);

        return "view/ex04";
    }

    @GetMapping("/ex05")
    public String ex05() {

        return "view/ex05";
    }

    @GetMapping("/ex06")
    public String ex06() {

        return "view/ex06";
    }

    @GetMapping("/quiz01")
    public String quiz01(Model model) {

//        ArrayList<SimpleVO> list = new ArrayList<>();
//
//        for (int i = 1; i <= 10; i++) {
//            SimpleVO vo = SimpleVO
//                    .builder()
//                    .mno(i)
//                    .name("홍길동" + i)
//                    .hiredate(LocalDateTime.now())
//                    .build();
//            list.add(vo);
//        }
//
//        model.addAttribute("list", list);

        SimpleVO vo = new SimpleVO(1, "홍길동",LocalDateTime.now());
        model.addAttribute("info", vo);


        return "view/quiz01";
    }

    @GetMapping("quiz01_result")
    //1
    public String quiz01_result(SimpleVO vo){
        System.out.println(vo.toString());

    //2
//    public String quiz01Result(@RequestParam("mno")int mno,
//                               @RequestParam("name")String name,
//                               Model model){
//        model.addAttribute("mno", mno);
//        model.addAttribute("name", name);

    //3
//    public String quiz01Result(@ModelAttribute("simpleVO") SimpleVO vo) {

        return "view/quiz01_result";
    }
}
