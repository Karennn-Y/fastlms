package com.zerobase.fastlms.admin.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class LoginHistoryInput {

    Long id;

    String userName;
    String userAgent;
    String clientIp;
    LocalDateTime loginDt;

}
