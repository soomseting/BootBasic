package com.simple.basic.controller;

import com.simple.basic.command.DemoVO;
import com.simple.basic.command.ValidVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/valid")
public class ValidController {

    //화면처리
    @GetMapping("/view")
    public String view(){

        return "valid/view";
    }

    @GetMapping("/result")
    public String result(){

        return "valid/result";
    }


    //가입요청  - action 태그에서 joinForm이라는 이름을 줌
    @PostMapping("/joinForm")
    public String joinForm(@Valid @ModelAttribute("vo") ValidVO vo, BindingResult result, Model model){ //화면에서 넘어오는 값이 ValideVO로 넘어옴
        //@Valid를 써야 ValidVO에 있는 유효성 검사 어노테이션들이 동작한다.
        //유효성 검사를 진행하고, 실패한 목록을 bindingresult에 담아줍니다


        //------------------------1st----------------------
//        if (result.hasErrors()) { //유효성검사에 실패하면 true
//            List<FieldError> list = result.getFieldErrors(); //에러목록
//            for(FieldError err : list){
//                System.out.println(err.getField()); //실패한 필드면
//                System.out.println(err.getDefaultMessage()); //실패한 필드의 message
//                model.addAttribute("valid_" + err.getField(), err.getDefaultMessage());
//            }
//        return "valid/view";
//        }

//        System.out.println(vo.toString());

        //------------------------2st------------------------
        if(result.hasErrors()){
            return "valid/view";
        }

        //하나씩 유효성 검사를 한다? 그럼 vo.get으로 하나씩 꺼내야함. (근데 보기도 좀 그렇고 지저분함)

        //redirect:/  - 다시 컨트롤러를 태워서 보낼 때 씀 (뒷 주소 안보이게)
        return "redirect:/valid/result";
    }

    @GetMapping("/quiz01")
    public String quiz01(){


        return "valid/quiz01";
    }

    @GetMapping("/quiz01_result")
    public String quiz01_result(){

        return "valid/quiz01_result";
    }

    @PostMapping("/quizJoinForm")
    public String quizJoinForm(@Valid @ModelAttribute("vo") DemoVO vo, BindingResult result, Model model){
        if (result.hasErrors()){
            return "valid/quiz01";
        }
        return "redirect:/valid/quiz01_result";
    }
}
