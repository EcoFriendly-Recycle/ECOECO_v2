package com.recycle.ecoeco.manager.board.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/manager/board")
public class UsGreenController {

    @GetMapping("/usGreenList")
    public String showUsGreenListPage() {
        return "manager/board/usGreenList";
    }
}
