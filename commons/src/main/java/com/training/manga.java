package com.training;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Builder
@Getter
@Setter
public class manga {

    private String title;
    private String description;
    private BigDecimal chapters;
    private boolean readOrNot;
    private Integer readerCount;
    private boolean likedOrNot;
    private LocalDate updateTime;
    private List<comments> commentsOnManga;
}
