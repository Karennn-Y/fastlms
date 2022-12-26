package com.zerobase.fastlms.admin.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Banner implements BannerCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    // 배너명
    String bannerName;
    // 링크
    String url;
    // 오픈방법
    String open;
    // 정렬 순서
    long sortValue;
    // 등록일
    LocalDate regDt;
    // 수정일
    LocalDateTime udtDt;
    // 파일명
    String filename;
    // 파일 경로
    String urlFilename;
    // 공개여부
    boolean usingYn;
}
