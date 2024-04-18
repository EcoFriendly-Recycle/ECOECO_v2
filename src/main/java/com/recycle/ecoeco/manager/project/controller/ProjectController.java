package com.recycle.ecoeco.manager.project.controller;

import com.recycle.ecoeco.manager.project.model.dto.CategoryDTO;
import com.recycle.ecoeco.manager.project.model.dto.MakerDTO;
//import com.recycle.ecoeco.manager.project.model.dto.ProjectAndMakerDTO;
import com.recycle.ecoeco.manager.project.model.dto.ProjectDTO;
import com.recycle.ecoeco.manager.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manager/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // 프로젝트 신규 리스트
    @GetMapping("/project_new_list")
    public String findProjectNewList(@RequestParam(defaultValue = "1") int page,
                                     @RequestParam(required = false) String searchCondition,
                                     @RequestParam(required = false) String searchValue,
                                     @RequestParam(required = false) String searchConditionDate,
                                     @RequestParam(required = false) String searchDate1,
                                     @RequestParam(required = false) String searchDate2,
                                     Model model){

        System.out.println("project_new_list_controller");

        Map<String, String> searchMap = new HashMap<>();
        searchMap.put("searchCondition", searchCondition);
        searchMap.put("searchValue", searchValue);
        searchMap.put("searchConditionDate", searchConditionDate);
        searchMap.put("searchDate1", searchDate1);
        searchMap.put("searchDate2", searchDate2);
        System.out.println("sarchMap : " + searchMap);

        Map<String, Object> boardListAndPaging = projectService.findProjectNewList(searchMap, page);
        model.addAttribute("paging", boardListAndPaging.get("paging"));
//        model.addAttribute("boardList", boardListAndPaging.get("boardList"));
        model.addAttribute("projectNewList", boardListAndPaging.get("boardList"));

        System.out.println("boardListAndPaging : " + boardListAndPaging);

        return "/manager/project/project_new_list";

    }
//    @GetMapping("/project_new_list")
//    public String findProjectNewList(Model model){
//        System.out.println("project_new_list");
//
//        List<ProjectDTO> projectNewList = projectService.findProjectNewList();
//
//        model.addAttribute("projectNewList", projectNewList);
//
//        return "/manager/project/project_new_list";
//
//    }

    // 프로젝트 진행중 리스트
    @GetMapping("/project_now_list")
    public String findProjectNowList(Model model) {
        System.out.println("project_now_list");
        return "/manager/project/project_now_list";
    }

    // 프로젝트 종료 리스트
    @GetMapping("/project_end_list")
    public String findProjectEndList(Model model) {
        System.out.println("project_end_list");
        return "/manager/project/project_end_list";
    }

    // 프로젝트 반려 리스트
    @GetMapping("/project_return_list")
    public String findProjectReturnList(Model model) {
        System.out.println("project_return_list");
        return "/manager/project/project_return_list";
    }

    // 프로젝트 정보 상세 페이지
    @GetMapping("/project_detail")
    public String projectDetail(@RequestParam int projectNo, Model model) {
        System.out.println("project_detail");
        System.out.println("projectNo : " + projectNo);

        List<ProjectDTO> projectDetail = projectService.projectDetail(projectNo);
//        List<ProjectAndMakerDTO> projectDetail = projectService.projectDetail(projectNo);
        model.addAttribute("projectDetail", projectDetail);
        model.addAttribute("projectNo", projectNo);

        System.out.println("projectDetail : " + projectDetail);

        return "/manager/project/project_detail";
    }

    // 프로젝트 정보 수정 페이지
    @GetMapping("/project_modify")
    public String projectModify(@RequestParam int projectNo, Model model) {
        System.out.println("project_modify");
        System.out.println("projectNo : " + projectNo);

        List<ProjectDTO> projectModify = projectService.projectModify(projectNo);
        model.addAttribute("projectModify", projectModify);
        model.addAttribute("projectNo", projectNo);

        return "/manager/project/project_modify";
    }

    // 프로젝트 정보 수정
    @PostMapping("/project_modify")
//    public String modifyProject(@RequestParam int projectNo, @RequestParam Map<String, String> parameters, Model model) {
    public String modifyProject(ProjectDTO projectDTO, MakerDTO makerDTO, Model model) {
        System.out.println("project_modify");
//        System.out.println("projectNo : " + projectNo);
//        int categoryCode = Integer.parseInt(parameters.get("categoryCode"));
//        int projectStatus = Integer.parseInt(parameters.get("projectStatus"));
//        Date startDate = new Date(parameters.get("startDate"));
//        Date endDate = new Date(parameters.get("endDate"));
//        String phone = parameters.get("phone");
//        String email = parameters.get("email");

//        projectDTO.setProjectNo(projectDTO.getProjectNo());
//        modifyProject.setProjectNo(projectNo);


        projectService.modifyProject(projectDTO, makerDTO);
//        List<ProjectDTO> modifyProject = projectService.modifyProject(projectNo);
        model.addAttribute("projectService", projectDTO);
//        model.addAttribute("projectNo", projectNo);



        return "redirect:/manager/project/project_detail?projectNo=" + projectDTO.getProjectNo();
    }

    // 프로젝트 정보 수정 카테고리 리스트
    @GetMapping("/category")
    public @ResponseBody List<CategoryDTO> findCategoryList() {
        System.out.println("category");

        return projectService.findCategoryList();
    }

    // 프로젝트 새소식
    @GetMapping("/project_news")
    public String projectNews(Model model) {
        System.out.println("project_news");
        return "/manager/project/project_news";
    }

    // 프로젝트 응원/리뷰
    @GetMapping("/project_review")
    public String projectReview(Model model) {
        System.out.println("project_review");
        return "/manager/project/project_review";
    }


}