package com.recycle.ecoeco.manager.project.model.dao;

import com.recycle.ecoeco.common.paging.SelectCriteria;
import com.recycle.ecoeco.manager.project.model.dto.CategoryDTO;
import com.recycle.ecoeco.manager.project.model.dto.ProjectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {
    // 프로젝트 신규 리스트
    //    List<ProjectDTO> findProjectNewList();
    List<ProjectDTO> findProjectNewList(SelectCriteria selectCriteria);


    // 리스트 총 개수
    int selectTotalCount(Map<String, String> searchMap);


    // 프로젝트 정보 상세 페이지
    //    List<ProjectAndMakerDTO> projectDetail(int projectNo);
    List<ProjectDTO> projectDetail(int projectNo);


    // 프로젝트 정보 수정 페이지
    List<ProjectDTO> projectModify(int projectNo);

    // 프로젝트 정보 수정 카테고리 리스트
    List<CategoryDTO> findCategoryList();

    // 프로젝트 정보 수정
    //    List<ProjectDTO> modifyProject(ProjectDTO modifyProject);
    int modifyProject(Map<String, Object> parameterMap);

}
