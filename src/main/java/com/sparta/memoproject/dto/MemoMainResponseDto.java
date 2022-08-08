package com.sparta.memoproject.dto;

import com.sparta.memoproject.model.Memo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemoMainResponseDto {
    private Long id;
    private String title;
    private String memberName;
    private Long heartCnt;
    private Long commentCnt;



    public MemoMainResponseDto(Memo memo, Long heartCnt,Long commentCnt) {
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.memberName = memo.getMemberName();
        this.heartCnt = heartCnt;
        this.commentCnt = commentCnt;
    }
}
