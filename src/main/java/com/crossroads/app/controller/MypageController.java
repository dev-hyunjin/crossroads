package com.crossroads.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {
    @GetMapping("/test")
    public String test(){
        return "index";
    }

    @GetMapping("/maintest")
    public String maintest(){
        return "main/main";
    }
    @GetMapping("/classList")
    public String classList(){
        return "mypage/classList";
    }

    @GetMapping("/review")
    public String review(){
        return "mypage/review";
    }

    @GetMapping("/point")
    public String point(){
        return "mypage/point";
    }
    @GetMapping("/profile-modify")
    public String test14535(){
        return "mypage/profile-modify";
    }

    @GetMapping("/change-password")
    public String test24(){
        return "mypage/change-password";
    }

   @GetMapping("/withdraw")
    public String test4(){
        return "mypage/withdraw";
    }
    @GetMapping("/withdraw-agree")
    public String test5(){
        return "mypage/withdraw-agree";
    }

   @GetMapping("/withdraw-confirm")
    public String test3(){
        return "mypage/withdraw-confirm";
    }

    @GetMapping("/my-board-list")
    public String test14(){
        return "mypage/my-board-list";
    }
    @GetMapping("/my-reply-list")
    public String test45(){
        return "mypage/my-reply-list";
    }
    @GetMapping("/confirm-password")
    public String test16(){
        return "mypage/confirm-password";
    }
    @GetMapping("/mypage-main")
    public String test17(){
        return "mypage/mypage-main";
    }

    @GetMapping("/review-update")
    public String reviewupdate() {
        return "review/review-update";
    }

    @GetMapping("/review-list")
    public String reviewlist() {
        return "review/review-list";
    }

    @GetMapping("/review-write")
    public String reviewwrite() {
        return "review/review-write";
    }




}