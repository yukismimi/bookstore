package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.SecurityQuestion;
import cn.yukismimi.mapper.SecurityQuestionMapper;
import cn.yukismimi.service.SecurityQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SecurityQuestionService")
public class SecurityQuestionServiceImpl implements SecurityQuestionService {

    @Autowired
    SecurityQuestionMapper securityQuestionMapper;

    @Override
    public List<SecurityQuestion> findSecurityQuestionList() {
        return securityQuestionMapper.findSecurityQuestionList();
    }

}
