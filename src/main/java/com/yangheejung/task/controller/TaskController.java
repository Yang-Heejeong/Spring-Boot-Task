package com.yangheejung.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yangheejung.task.dto.request.TaskDto;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @GetMapping("{taskNumber}")
    public String getMapping(
        @PathVariable("taskNumber") String taskNumber
    ) {
        return "일정 불러오기 < " +  taskNumber + " >";
    }

    @PostMapping("{taskNumber}")
    public String postMapping(
        @RequestBody TaskDto requestBody
    ) {
        return "일정이름 : " + requestBody.getName() + " 카테고리 : " + requestBody.getCategory() + " 설명 : " + requestBody.getExplanation()
        + " 날짜 : " + requestBody.getDate() + " 시간 : " + requestBody.getTime();
    }

    @PatchMapping("{taskNumber}")
    public String patchMapping(
        @RequestBody TaskDto requestBody
    ) {
        return "일정이름 : " + requestBody.getName() + " 카테고리 : " + requestBody.getCategory() + " 설명 : " + requestBody.getExplanation()
        + " 날짜 : " + requestBody.getDate() + " 시간 : " + requestBody.getTime();
    }

    @DeleteMapping("task/{taskNumber}")
    public String dlelteMapping() { 
        return "삭제 완료!!";
    }
}
    
