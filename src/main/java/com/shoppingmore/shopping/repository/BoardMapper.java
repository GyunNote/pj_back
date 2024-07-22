package com.shoppingmore.shopping.repository;

import com.shoppingmore.shopping.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    public int saveNoticeBoard(Notice notice);

    public List<Notice> searchNoticeBoard(
            @Param("startIndex") int startIndex,
            @Param("count") int count,
            @Param("searchText") String searchText
    );

}
