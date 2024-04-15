package com.recycle.ecoeco.user.main.model.dto;
import java.util.Date;

public class UsgreenDTO {

    // 우리가 그린(커뮤니티)
    private int comuNo; // 커뮤니티 번호
    private String comuTitle; // 커뮤니티 제목
    private String comuDetail; // 커뮤니티 내용
    private Date comuDate; // 커뮤니티 작성일
    private char comuDelete; // 삭제 여부

    // 우리가 그린(커뮤티니) 좋아요
    private int likeNo; // 번호
    private Integer likeCount; // 좋아요 수
    private Integer badCount; // 아쉬워요 수

    // 우리가 그린(커뮤니티) 이미지
    private int comuImgNo; // 커뮤니티 이미지 번호
    private String comuOriginFileName; // 커뮤니티 이미지 원본 파일명
    private String comuSaveName; // 커뮤니티 이미지 저장 파일명
    private String comuPath; // 커뮤니티 이미지 경로명

    // 우리가 그린(댓글)
    private int commentNo; // 댓글 번호
    private String commentDetail; // 댓글 내용
    private Date commentDate; // 작성일
    private char commentDelete; // 삭제 여부

    // 우리가 그린(댓글) 좋아요
    private int cLikeNo; // 좋아요 번호
    private int cLikeCount; // 좋아요 수

    public void UsgreenDTO() {}

    public UsgreenDTO(int comuNo, String comuTitle, String comuDetail, Date comuDate, char comuDelete, int likeNo, Integer likeCount, Integer badCount, int comuImgNo, String comuOriginFileName, String comuSaveName, String comuPath, int commentNo, String commentDetail, Date commentDate, char commentDelete, int cLikeNo, int cLikeCount) {
        this.comuNo = comuNo;
        this.comuTitle = comuTitle;
        this.comuDetail = comuDetail;
        this.comuDate = comuDate;
        this.comuDelete = comuDelete;
        this.likeNo = likeNo;
        this.likeCount = likeCount;
        this.badCount = badCount;
        this.comuImgNo = comuImgNo;
        this.comuOriginFileName = comuOriginFileName;
        this.comuSaveName = comuSaveName;
        this.comuPath = comuPath;
        this.commentNo = commentNo;
        this.commentDetail = commentDetail;
        this.commentDate = commentDate;
        this.commentDelete = commentDelete;
        this.cLikeNo = cLikeNo;
        this.cLikeCount = cLikeCount;
    }

    public int getComuNo() {
        return comuNo;
    }

    public void setComuNo(int comuNo) {
        this.comuNo = comuNo;
    }

    public String getComuTitle() {
        return comuTitle;
    }

    public void setComuTitle(String comuTitle) {
        this.comuTitle = comuTitle;
    }

    public String getComuDetail() {
        return comuDetail;
    }

    public void setComuDetail(String comuDetail) {
        this.comuDetail = comuDetail;
    }

    public Date getComuDate() {
        return comuDate;
    }

    public void setComuDate(Date comuDate) {
        this.comuDate = comuDate;
    }

    public char getComuDelete() {
        return comuDelete;
    }

    public void setComuDelete(char comuDelete) {
        this.comuDelete = comuDelete;
    }

    public int getLikeNo() {
        return likeNo;
    }

    public void setLikeNo(int likeNo) {
        this.likeNo = likeNo;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getBadCount() {
        return badCount;
    }

    public void setBadCount(Integer badCount) {
        this.badCount = badCount;
    }

    public int getComuImgNo() {
        return comuImgNo;
    }

    public void setComuImgNo(int comuImgNo) {
        this.comuImgNo = comuImgNo;
    }

    public String getComuOriginFileName() {
        return comuOriginFileName;
    }

    public void setComuOriginFileName(String comuOriginFileName) {
        this.comuOriginFileName = comuOriginFileName;
    }

    public String getComuSaveName() {
        return comuSaveName;
    }

    public void setComuSaveName(String comuSaveName) {
        this.comuSaveName = comuSaveName;
    }

    public String getComuPath() {
        return comuPath;
    }

    public void setComuPath(String comuPath) {
        this.comuPath = comuPath;
    }

    public int getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(int commentNo) {
        this.commentNo = commentNo;
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public char getCommentDelete() {
        return commentDelete;
    }

    public void setCommentDelete(char commentDelete) {
        this.commentDelete = commentDelete;
    }

    public int getcLikeNo() {
        return cLikeNo;
    }

    public void setcLikeNo(int cLikeNo) {
        this.cLikeNo = cLikeNo;
    }

    public int getcLikeCount() {
        return cLikeCount;
    }

    public void setcLikeCount(int cLikeCount) {
        this.cLikeCount = cLikeCount;
    }

    @Override
    public String toString() {
        return "UsgreenDTO{" +
                "comuNo=" + comuNo +
                ", comuTitle='" + comuTitle + '\'' +
                ", comuDetail='" + comuDetail + '\'' +
                ", comuDate=" + comuDate +
                ", comuDelete=" + comuDelete +
                ", likeNo=" + likeNo +
                ", likeCount=" + likeCount +
                ", badCount=" + badCount +
                ", comuImgNo=" + comuImgNo +
                ", comuOriginFileName='" + comuOriginFileName + '\'' +
                ", comuSaveName='" + comuSaveName + '\'' +
                ", comuPath='" + comuPath + '\'' +
                ", commentNo=" + commentNo +
                ", commentDetail='" + commentDetail + '\'' +
                ", commentDate=" + commentDate +
                ", commentDelete=" + commentDelete +
                ", cLikeNo=" + cLikeNo +
                ", cLikeCount=" + cLikeCount +
                '}';
    }
}
