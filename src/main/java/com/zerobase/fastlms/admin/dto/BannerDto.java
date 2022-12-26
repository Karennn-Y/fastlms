package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.admin.entity.Banner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BannerDto {

    long id;
    String bannerName;
    String url;
    String open;
    long sortValue;
    boolean usingYn;
    String filename;
    String urlFilename;

    // 등록일
    LocalDate regDt;
    // 수정일
    LocalDateTime udtDt;

    // 추가컬럼
    long totalCount;
    long seq;

    public static BannerDto of(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .bannerName(banner.getBannerName())
                .url(banner.getUrl())
                .open(banner.getOpen())
                .sortValue(banner.getSortValue())
                .usingYn(banner.isUsingYn())
                .filename(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .regDt(banner.getRegDt())
                .udtDt(banner.getUdtDt())
                .build();
    }

    public static List<BannerDto> of (List<Banner> banners) {
        if (banners == null) {
            return null;
        }
        List<BannerDto> bannerList = new ArrayList<>();
        for (Banner x : banners) {
            bannerList.add(BannerDto.of(x));
        }
        return bannerList;
    }
}
