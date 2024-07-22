package com.shoppingmore.shopping.service;

import com.shoppingmore.shopping.dto.NoticeBoardRespDto;
import com.shoppingmore.shopping.dto.NoticeBoardsReqDto;
import com.shoppingmore.shopping.dto.NoticeWriteReqDto;
import com.shoppingmore.shopping.entity.Notice;
import com.shoppingmore.shopping.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoticeService {
    @Autowired
    private BoardMapper boardMapper;

    public void saveNoticeBoard(NoticeWriteReqDto noticeWriteReqDto){
        boardMapper.saveNoticeBoard(noticeWriteReqDto.toEntity());
    }

    public List<NoticeBoardRespDto> searchNoticeBoards(NoticeBoardsReqDto noticeBoardsReqDto){
        int startIndex = (noticeBoardsReqDto.getPage()-1)* noticeBoardsReqDto.getCount();

        List<Notice> noticeBoards = boardMapper.searchNoticeBoard(
                startIndex,
                noticeBoardsReqDto.getCount(),
                noticeBoardsReqDto.getSearchText()
        );
        return noticeBoards.stream().map(Notice :: toNoticeBoardListRespDto).collect(Collectors.toList());
    }

}
