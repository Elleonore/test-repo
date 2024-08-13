package org.project.socialnetwork.controller;

import lombok.RequiredArgsConstructor;
import org.project.socialnetwork.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

//    @GetMapping
//    public String index(Model model) {
//model.addAttribute("users", userService.index());
//
//    }
}
