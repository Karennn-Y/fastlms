package com.zerobase.fastlms.admin.mapper;

import com.zerobase.fastlms.admin.dto.LoginHistoryDto;
import com.zerobase.fastlms.admin.model.LoginHistoryParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginHistoryMapper {

    List<LoginHistoryDto> selectList(LoginHistoryParam parameter);

    long selectListCount(LoginHistoryParam parameter);
}
