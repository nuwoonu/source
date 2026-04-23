package com.soldesk.sub_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soldesk.sub_backend.dto.UserRequestDTO;
import com.soldesk.sub_backend.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public void postCreate(@RequestBody UserRequestDTO dto) {
        userService.create(dto);
    }

}
