package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.SubjectMapper;
import com.zhiyou100.modle.Subject;
import com.zhiyou100.service.SubjectService;
@Service

public class SubjectServiceImpl implements SubjectService {
@Autowired 
SubjectMapper sm;

@Override
public List<Subject> fandAllSubject() {
	
	return sm.selectByExample(null);
}

}
