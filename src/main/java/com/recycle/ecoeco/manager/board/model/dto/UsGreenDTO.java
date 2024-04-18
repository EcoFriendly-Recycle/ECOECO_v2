package com.recycle.ecoeco.manager.board.model.dto;

import com.recycle.ecoeco.user.mypage.model.dto.UserInfoDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter @Setter @ToString
public class UsGreenDTO {

    private int comuNo;
    private String comuTitle;
    private String comuDetail;
    private LocalDate comuDate;
    private char comuStatus;
    private int userNo;
    private UserInfoDTO writer;



}
