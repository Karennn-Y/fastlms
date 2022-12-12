package com.zerobase.fastlms;

// MainPage 클래스를 만든 목적!!
// 맵핑하기 위해서
// 주소와 (논리적인 주소 - 인터넷 주소) 물리적인 파일 (프로그래밍을 해야 하니까)을 맵핑

// 하나의 주소에 대해서
// 어디서 맵핑? 누가 맵핑?
// 후보
// 1. 클래스 (속성. 메소드로 이루어짐) -- 새로 생길 때마다 클래스가 계속 생겨야 됨 !!탈락!!
//

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {
    @RequestMapping("/")
    public String index() {

        return "Index Page";

    }
    @RequestMapping("/hello")
    public String hello () {
        String msg =  "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<p>hello</p> <p>fastlms website!!</p>" +
                "</body>" +
                "</html>";
        return msg;
    }
}
