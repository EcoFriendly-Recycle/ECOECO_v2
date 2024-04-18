package com.recycle.ecoeco.manager.project.service;

import com.recycle.ecoeco.common.paging.Pagenation;
import com.recycle.ecoeco.common.paging.SelectCriteria;
import com.recycle.ecoeco.manager.project.model.dao.ProjectMapper;
import com.recycle.ecoeco.manager.project.model.dto.CategoryDTO;
import com.recycle.ecoeco.manager.project.model.dto.MakerDTO;
import com.recycle.ecoeco.manager.project.model.dto.ProjectDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Parser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectService {

    private final ProjectMapper projectMapper;

    public ProjectService(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    // 프로젝트 신규 리스트
    public Map<String, Object> findProjectNewList(Map<String, String> searchMap, int page) {
        System.out.println("project_new_list_service");
        System.out.println("searchMap : " + searchMap);

        /* 1. 전체 게시글 수 확인 (검색어가 있는 경우 포함) => 페이징 처리를 위해 */
        int totalCount = projectMapper.selectTotalCount(searchMap);
//        log.info("boardList totalCount : {}", totalCount);
        System.out.println("totalCount : " + totalCount);

        /* 2. 페이징 처리와 연관 된 값을 계산하여 SelectCriteria 타입의 객체에 담는다. */
        int limit = 10;         // 한 페이지에 보여줄 게시물의 수
        int buttonAmount = 5;   // 한 번에 보여질 페이징 버튼의 수
        SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount, searchMap);
//        log.info("boardList selectCriteria : {}", selectCriteria);
        System.out.println("selectCriteria : " + selectCriteria);

        /* 3. 요청 페이지와 검색 기준에 맞는 게시글을 조회해온다. */
        List<ProjectDTO> boardList = projectMapper.findProjectNewList(selectCriteria);
//        log.info("boardList : {}", boardList);
        System.out.println("boardList : " + boardList);

        Map<String, Object> boardListAndPaging = new HashMap<>();
        boardListAndPaging.put("paging", selectCriteria);
        boardListAndPaging.put("boardList", boardList);

        return boardListAndPaging;

    }

//    public List<ProjectDTO> findProjectNewList() {
//        return projectMapper.findProjectNewList();
//    }

    // 프로젝트 정보 상세 페이지
    public List<ProjectDTO> projectDetail(int projectNo) {
        return projectMapper.projectDetail(projectNo);
    }
//    public List<ProjectAndMakerDTO> projectDetail(int projectNo) {
//        return projectMapper.projectDetail(projectNo);
//    }

    // 프로젝트 정보 수정 페이지
    public List<ProjectDTO> projectModify(int projectNo) {
        return projectMapper.projectModify(projectNo);
    }

    // 프로젝트 정보 수정 페이지 카테고리 리스트
    public List<CategoryDTO> findCategoryList() {
        return projectMapper.findCategoryList();
    }

    // 프로젝트 정보 수정
    @Transactional
    public void modifyProject(ProjectDTO projectDTO, MakerDTO makerDTO) {

        Map<String, Object> parameterMap = new HashMap<>();
//            parameterMap.put("projectNo", projectDTO.getProjectNo());
//            parameterMap.put("categoryCode", projectDTO.getCategoryCode());
//            parameterMap.put("projectStatus", projectDTO.getProjectStatus());
        parameterMap.put("projectNo", String.valueOf(projectDTO.getProjectNo()) != null ? projectDTO.getProjectNo() : 0);
        parameterMap.put("categoryCode", String.valueOf(projectDTO.getCategoryCode()) != null ? projectDTO.getCategoryCode() : 0);
        parameterMap.put("projectStatus", projectDTO.getProjectStatus() != null ? projectDTO.getProjectStatus() : 0);
        parameterMap.put("startDate", projectDTO.getStartDate());
        parameterMap.put("endDate", projectDTO.getEndDate());
        parameterMap.put("phone", makerDTO.getPhone());
        parameterMap.put("email", makerDTO.getEmail());

        System.out.println("-------------------------------------------------");
        System.out.println("projectNo : " + parameterMap.get("projectNo"));
        System.out.println("categoryCode : " + parameterMap.get("categoryCode"));
        System.out.println("projectStatus : " + parameterMap.get("projectStatus"));
        System.out.println("startDate : " + parameterMap.get("startDate"));
        System.out.println("endDate : " + parameterMap.get("endDate"));
        System.out.println("phone : " + parameterMap.get("phone"));
        System.out.println("email : " + parameterMap.get("email"));
        System.out.println("-------------------------------------------------");

        // 트랜잭션 시작
        int result = projectMapper.modifyProject(parameterMap);
//        int result = projectMapper.modifyProject("modifyProject", parameterMap);

//            System.out.println("parameterMap : " + parameterMap);
//            sqlSession.update("modifyProject", parameterMap);
        if (result > 0) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }

//    public List<ProjectDTO> modifyProject(ProjectDTO modifyProject) {
//        return projectMapper.modifyProject(modifyProject);
//    }


}
