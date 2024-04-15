package com.recycle.ecoeco.user.main.model.dto;

import java.util.Date;

public class NoticeDTO {

    // 공지사항
    private int noticeNo;
    private String noticeCategory;
    private String noticeSubCategory;
    private String noticeTitle;
    private String noticeDetail;
    private Date noticeDate;

    // 공지사항 이미지
    private int noticeImgNo; // 공지 이미지번호
    private String noticeOriginFileName; // 공지 이미지 원본명
    private String noticeSaveName; // 공지 이미지 저장명
    private String noticePath; // 공지 이미지 경로명

    public void NoticeDTO() {}

    public NoticeDTO(int noticeNo, String noticeCategory, String noticeSubCategory, String noticeTitle, String noticeDetail, Date noticeDate, int noticeImgNo, String noticeOriginFileName, String noticeSaveName, String noticePath) {
        this.noticeNo = noticeNo;
        this.noticeCategory = noticeCategory;
        this.noticeSubCategory = noticeSubCategory;
        this.noticeTitle = noticeTitle;
        this.noticeDetail = noticeDetail;
        this.noticeDate = noticeDate;
        this.noticeImgNo = noticeImgNo;
        this.noticeOriginFileName = noticeOriginFileName;
        this.noticeSaveName = noticeSaveName;
        this.noticePath = noticePath;
    }

    public int getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(int noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getNoticeCategory() {
        return noticeCategory;
    }

    public void setNoticeCategory(String noticeCategory) {
        this.noticeCategory = noticeCategory;
    }

    public String getNoticeSubCategory() {
        return noticeSubCategory;
    }

    public void setNoticeSubCategory(String noticeSubCategory) {
        this.noticeSubCategory = noticeSubCategory;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeDetail() {
        return noticeDetail;
    }

    public void setNoticeDetail(String noticeDetail) {
        this.noticeDetail = noticeDetail;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public int getNoticeImgNo() {
        return noticeImgNo;
    }

    public void setNoticeImgNo(int noticeImgNo) {
        this.noticeImgNo = noticeImgNo;
    }

    public String getNoticeOriginFileName() {
        return noticeOriginFileName;
    }

    public void setNoticeOriginFileName(String noticeOriginFileName) {
        this.noticeOriginFileName = noticeOriginFileName;
    }

    public String getNoticeSaveName() {
        return noticeSaveName;
    }

    public void setNoticeSaveName(String noticeSaveName) {
        this.noticeSaveName = noticeSaveName;
    }

    public String getNoticePath() {
        return noticePath;
    }

    public void setNoticePath(String noticePath) {
        this.noticePath = noticePath;
    }

    @Override
    public String toString() {
        return "NoticeDTO{" +
                "noticeNo=" + noticeNo +
                ", noticeCategory='" + noticeCategory + '\'' +
                ", noticeSubCategory='" + noticeSubCategory + '\'' +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeDetail='" + noticeDetail + '\'' +
                ", noticeDate=" + noticeDate +
                ", noticeImgNo=" + noticeImgNo +
                ", noticeOriginFileName='" + noticeOriginFileName + '\'' +
                ", noticeSaveName='" + noticeSaveName + '\'' +
                ", noticePath='" + noticePath + '\'' +
                '}';
    }
}
