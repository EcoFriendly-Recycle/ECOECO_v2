package com.recycle.ecoeco.manager.board.model.dao;

import com.recycle.ecoeco.common.paging.SelectCriteria;
import com.recycle.ecoeco.manager.board.model.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface NoticeMapper {

    int selectTotalCount(Map<String, String> searchMap);

    List<NoticeDTO> selectNoticeList(SelectCriteria selectCriteria);             // 공지사항 리스트 조회

    NoticeDTO selectNoticeDetail(int noticeNo);     // 공지사항 상세보기

    void insertNotice(NoticeDTO notice);             // 공지사항 등록

    void deleteNotice(NoticeDTO deleteNotice);      // 공지사항 삭제
}
