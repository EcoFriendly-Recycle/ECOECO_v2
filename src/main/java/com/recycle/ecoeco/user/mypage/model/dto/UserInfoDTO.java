package com.recycle.ecoeco.user.mypage.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.recycle.ecoeco.common.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.*;

public class UserInfoDTO implements UserDetails {
    private int userNo;         // 회원번호
    private String userId;      // 회원아이디
    private String userPwd;     // 비밀번호
    private String userName;    // 회원명
    private String userPnum;    // 전화번호
    private String userEmail;   // 이메일
    private LocalDate userBirth;    // 생년월일
    private char userGender;    // 성별
    private int userGrade;      // 등급
    private int userPoint;      // 포인트
    private LocalDate userDate;    // 가입일
    private int userAccount;    // 계좌번호
    private String userAddress; // 주소
    private char managerYN;     // 관리자 권한 여부
    private UserRole userRole;

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String roleName = "";
        if(userRole != null) roleName = userRole.name();
        return Arrays.asList(new SimpleGrantedAuthority(roleName));
    }

    @Override
    public String getPassword() {
        return userPwd;
    }

    @Override
    public String getUsername() {
        return userId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public UserInfoDTO() {}

    public UserInfoDTO(int userNo, String userId, String userPwd, String userName, String userPnum, String userEmail, LocalDate userBirth, char userGender, int userGrade, int userPoint, LocalDate userDate, int userAccount, String userAddress, char managerYN, UserRole userRole) {
        this.userNo = userNo;
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.userPnum = userPnum;
        this.userEmail = userEmail;
        this.userBirth = userBirth;
        this.userGender = userGender;
        this.userGrade = userGrade;
        this.userPoint = userPoint;
        this.userDate = userDate;
        this.userAccount = userAccount;
        this.userAddress = userAddress;
        this.managerYN = managerYN;
        this.userRole = userRole;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPnum() {
        return userPnum;
    }

    public void setUserPnum(String userPnum) {
        this.userPnum = userPnum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDate getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(LocalDate userBirth) {
        this.userBirth = userBirth;
    }

    public char getUserGender() {
        return userGender;
    }

    public void setUserGender(char userGender) {
        this.userGender = userGender;
    }

    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }

    public LocalDate getUserDate() {
        return userDate;
    }

    public void setUserDate(LocalDate userDate) {
        this.userDate = userDate;
    }

    public int getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(int userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public char getManagerYN() {
        return managerYN;
    }

    public void setManagerYN(char managerYN) {
        this.managerYN = managerYN;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", userPnum='" + userPnum + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userBirth=" + userBirth +
                ", userGender=" + userGender +
                ", userGrade=" + userGrade +
                ", userPoint=" + userPoint +
                ", userDate=" + userDate +
                ", userAccount=" + userAccount +
                ", userAddress='" + userAddress + '\'' +
                ", managerYN=" + managerYN +
                ", userRole=" + userRole +
                '}';
    }
}
