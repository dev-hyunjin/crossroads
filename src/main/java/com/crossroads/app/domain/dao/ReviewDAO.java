package com.crossroads.app.domain.dao;

import com.crossroads.app.domain.dto.ReviewDTO;
import com.crossroads.app.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class ReviewDAO {
    private final ReviewMapper reviewMapper;

    //    마이페이지 후기 전체 조회
    public List<ReviewDTO> findAllMy(Long memberId) {
        return reviewMapper.selectAll(memberId);
    }

    //    후기 목록 조회
    public List<ReviewDTO> findAllReview() {
        return reviewMapper.selectReviewAll();
    }

    public List<ReviewDTO> findReviewByPage(int start, int end) {
        return reviewMapper.selectReviewByPage(start, end);
    }

    //    후기 삭제
    public void deleteById(Long reviewId) {
        reviewMapper.delete(reviewId);
    }


}

