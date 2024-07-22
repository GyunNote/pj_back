package com.shoppingmore.shopping.controller;

import com.shoppingmore.shopping.dto.NoticeBoardsReqDto;
import com.shoppingmore.shopping.dto.NoticeWriteReqDto;
import com.shoppingmore.shopping.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @PostMapping("/writeBoard")
    public ResponseEntity<?> noticeBoardWrite(@RequestBody NoticeWriteReqDto noticeWriteReqDto){
        noticeService.saveNoticeBoard(noticeWriteReqDto);
        return ResponseEntity.ok(noticeWriteReqDto);
    }

    @GetMapping("/boards")
    public ResponseEntity<?> noticeBoards(NoticeBoardsReqDto noticeBoardsReqDto){
        return ResponseEntity.ok(noticeService.searchNoticeBoards(noticeBoardsReqDto));
    }

}
