package com.recycle.ecoeco.manager.board.service;

import com.recycle.ecoeco.common.paging.Pagenation;
import com.recycle.ecoeco.common.paging.SelectCriteria;
import com.recycle.ecoeco.manager.board.model.dao.NoticeMapper;
import com.recycle.ecoeco.manager.board.model.dto.NoticeDTO;
import com.recycle.ecoeco.manager.project.model.dto.ProjectDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@Transactional
public class NoticeService {

    private final NoticeMapper noticeMapper;

    public NoticeService(NoticeMapper noticeMapper) {
        this.noticeMapper = noticeMapper;
    }

    /* 공지사항 리스트 조회 */
//    public List<NoticeDTO> selectNoticeList() {
//        return noticeMapper.selectNoticeList();
//    }
    public Map<String, Object> selectNoticeList(Map<String, String> searchMap, int page) {
        /* 1. 전체 게시글 수 확인 (검색어가 있는 경우 포함) => 페이징 처리를 위해 */
        int totalCount = noticeMapper.selectTotalCount(searchMap);
        log.info("noticeList totalCount : {}", totalCount);

        /* 2. 페이징 처리와 연관 된 값을 계산하여 SelectCriteria 타입의 객체에 담는다. */
        int limit = 10;         // 한 페이지에 보여줄 게시물의 수
        int buttonAmount = 5;   // 한 번에 보여질 페이징 버튼의 수
        SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount, searchMap);
        log.info("noticeList selectCriteria : {}", selectCriteria);

        /* 3. 요청 페이지와 검색 기준에 맞는 게시글을 조회해온다. */
        List<NoticeDTO> noticeList = noticeMapper.selectNoticeList(selectCriteria);
        log.info("noticeList : {}", noticeList);

        Map<String, Object> noticeListAndPaging = new HashMap<>();
        noticeListAndPaging.put("paging", selectCriteria);
        noticeListAndPaging.put("noticeList", noticeList);

        return noticeListAndPaging;
    }

    // 공지 상세보기
    public NoticeDTO selectNoticeDetail(int noticeNo) {

        return noticeMapper.selectNoticeDetail(noticeNo);
    }

    public void writeBoard(NoticeDTO notice) {

        notice.setNoticeCategory(notice.getNoticeCategory());
        noticeMapper.insertNotice(notice);
    }

    // 공지사항 삭제
    public void deleteNotice(NoticeDTO deleteNotice) {

        noticeMapper.deleteNotice(deleteNotice);
    }
}
