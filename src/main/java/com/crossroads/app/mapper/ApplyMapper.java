package com.crossroads.app.mapper;

import com.crossroads.app.domain.dto.ApplyDTO;
import com.crossroads.app.domain.vo.ApplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplyMapper {
//    신청 목록 전체 조회
    public List<ApplyDTO> selectAll();

//    신청 상세 조회
    public ApplyVO select(Long applyId);

//    신청 상태 조회
    public String selectStatus(Long applyId);

//    신청 상태 수정
    public void updateStatus(Long applyId);
}
