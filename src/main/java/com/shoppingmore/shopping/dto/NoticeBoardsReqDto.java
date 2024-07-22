package com.shoppingmore.shopping.dto;

import lombok.Data;

@Data
public class NoticeBoardsReqDto {
    private int page;
    private int count;
    private String searchText;

}
