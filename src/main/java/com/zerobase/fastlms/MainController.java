package com.zerobase.fastlms;

// MainPage 클래스를 만든 목적!!
// 맵핑하기 위해서
// 주소와 (논리적인 주소 - 인터넷 주소) 물리적인 파일 (프로그래밍을 해야 하니까)을 맵핑

// 하나의 주소에 대해서
// 어디서 맵핑? 누가 맵핑?
// 후보
// 1. 클래스 (속성. 메소드로 이루어짐) -- 새로 생길 때마다 클래스가 계속 생겨야 됨 !!탈락!!
//

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {

        return "index";
    }



    // 스프링 -> MVC (View -> 템플릿엔진 화면에 내용을 출력(html))
    // .NET -> MVC (View -> 출력)
    // python django -> MTV(T = Template -> 화면출력)
    // 백엔드과정 -> View 까진 가지 않음 / 프론트엔드 과정
    // BUT . 백엔드도 WEB 이기 때문에 알아야 됨
    // V -> HTML ==> 웹페이지가
    // V -> json ==> API
    // 기본적인 개념은 꼭 알아야 됨



    //request -> WEB -> SERVER
    //response -> SERVER -> WEB


    @RequestMapping("/hello")
    public void hello (HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = response.getWriter();

        String msg =  "<html>" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "</head>" +
                "<body>" +
                "<p>hello</p>" +
                "<p>fastlms website!!</p>" +
                "<p>안녕하세요!!!!<p>" +
                "</body>" +
                "</html>";

        printWriter.write(msg);
        printWriter.close();
    }
}
