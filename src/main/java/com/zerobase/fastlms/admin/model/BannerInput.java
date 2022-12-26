package com.zerobase.fastlms.admin.model;

import lombok.Data;

@Data
public class BannerInput {

    String bannerName;
    String url;
    String open;
    long sortValue;
    boolean usingYn;
    long id;

    String filename;
    String urlFilename;

    // 삭제를 위한 구성
    String idList;

}
