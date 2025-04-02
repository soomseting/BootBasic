package com.simple.basic.controller;

import com.simple.basic.command.MemoVO;
import com.simple.basic.memo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping("/memo")
@RequiredArgsConstructor
public class MemoController {

    //멤버변수 주입
//    @Autowired
//    @Qualifier("memoService")
//    private MemoService memoService;

    //생성자 주입
//    @Autowired
//    public MemoController(MemoService memoService) {
//        this.memoService = memoService;
//    } //이 코드를 대신해주는 게 @RequiredArgsConstructor임

    //위의 코드를 함축적으로 압축해줌?
    private final MemoService memoService; //반드시 final필드로 생성

    //글 작성화면
    @GetMapping("/memoWrite")
    public String memoWrite() {
        return "memo/memoWrite";
    }


    //조회 화면
    @GetMapping("/memoList")
    public String memoList(Model model) {
       ArrayList<MemoVO> list = memoService.check_memo();
        model.addAttribute("list", list);
        return "memo/memoList";
    }

    //memowirte에 있는 action 주소
    @PostMapping("/memoForm")
    public String memoForm(@Valid @ModelAttribute("vo") MemoVO vo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "memo/memoWrite";
        }

        return "redirect:/memo/memoList";
    }
}
