package com.yangheejung.task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class TaskDto {
    private String name;
    private String category;
    private String explanation;
    private String date;
    private String time;
}
