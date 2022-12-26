package com.zerobase.fastlms.admin.service;

import com.zerobase.fastlms.admin.dto.LoginHistoryDto;
import com.zerobase.fastlms.admin.model.LoginHistoryParam;
import java.util.List;

public interface LoginHistoryService {

    boolean add(LoginHistoryParam parameter);
    List<LoginHistoryDto> list(LoginHistoryParam parameter);
}
