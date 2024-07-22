package com.shoppingmore.shopping.dto;

import com.shoppingmore.shopping.entity.Notice;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class NoticeWriteReqDto {
    private int noticeId;
    private String title;
    private String content;
    private int viewCount;
    private LocalDateTime createDate;

    public Notice toEntity(){
        return Notice.builder()
                .noticeId(noticeId)
                .title(title)
                .content(content)
                .viewCount(viewCount)
                .createDate(createDate)
                .build();
    }

}
