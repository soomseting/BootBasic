package com.simple.basic.memo.service;

import com.simple.basic.command.MemoVO;
import com.simple.basic.memo.mapper.MemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service("memoService")
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoMapper memoMapper;

    @Override
    public void write_memo(MemoVO vo) {
        memoMapper.write_memo(vo);
    }

    @Override
    public ArrayList<MemoVO> check_memo() {
        return memoMapper.check_memo();
    }



    //메퍼 오토와이어드
}
