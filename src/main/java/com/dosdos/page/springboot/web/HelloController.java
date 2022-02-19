package com.dosdos.page.springboot.web;

import com.dosdos.page.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
    @RestController는
        컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줍니다.
 */
@RestController
public class HelloController {
    /*
        HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 준다.
        /hello로 요청이 오면 문자열 hello를 반환하는 기능을 가지게 된다.
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    // @RequestParam은 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션이다.
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
