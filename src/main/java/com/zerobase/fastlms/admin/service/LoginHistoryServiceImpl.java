package com.zerobase.fastlms.admin.service;

import com.zerobase.fastlms.admin.dto.LoginHistoryDto;
import com.zerobase.fastlms.admin.entity.LoginHistory;
import com.zerobase.fastlms.admin.mapper.LoginHistoryMapper;
import com.zerobase.fastlms.admin.model.LoginHistoryParam;
import com.zerobase.fastlms.admin.repository.LoginHistoryRepository;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@RequiredArgsConstructor
@Service
public class LoginHistoryServiceImpl implements LoginHistoryService {

    private final LoginHistoryRepository loginHistoryRepository;
    private final LoginHistoryMapper loginHistoryMapper;
    @Override
    public boolean add(LoginHistoryParam parameter) {
        LoginHistory loginHistory = LoginHistory.builder()
                    .userId(parameter.getUserId())
                    .userAgent(parameter.getUserAgent())
                    .clientIp(parameter.getClientIp())
                    .loginDt(LocalDateTime.now())
                    .build();
        loginHistoryRepository.save(loginHistory);
        return true;
    }

    @Override
    public List<LoginHistoryDto> list(LoginHistoryParam parameter) {
        long totalCount = loginHistoryMapper.selectListCount(parameter);

        List<LoginHistoryDto> list = loginHistoryMapper.selectList(parameter);
        if (!CollectionUtils.isEmpty(list)) {
            int i = 0;
            for (LoginHistoryDto x : list) {
                x.setSeq(totalCount - parameter.getPageStart() - i);
                i++;
            }
        }
        return list;
    }

}
