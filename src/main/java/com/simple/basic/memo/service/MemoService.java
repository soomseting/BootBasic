package com.simple.basic.memo.service;

import com.simple.basic.command.MemoVO;

import java.util.ArrayList;

public interface MemoService {
    void write_memo(MemoVO vo);
    ArrayList<MemoVO> check_memo();

}
