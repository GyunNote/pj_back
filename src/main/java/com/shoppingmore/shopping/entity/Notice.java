package com.shoppingmore.shopping.entity;

import com.shoppingmore.shopping.dto.NoticeBoardRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private int noticeId;
    private String title;
    private String content;
    private int viewCount;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public NoticeBoardRespDto toNoticeBoardListRespDto(){
        return NoticeBoardRespDto.builder()
                .noticeId(noticeId)
                .title(title)
                .content(content)
                .viewCount(viewCount)
                .createDate(createDate)
                .updateDate(updateDate)
                .build();
    }


}
