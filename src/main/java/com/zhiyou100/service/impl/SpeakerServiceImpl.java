package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.SpeakerMapper;
import com.zhiyou100.modle.Speaker;
import com.zhiyou100.modle.SpeakerVO;
import com.zhiyou100.service.SpeakerService;
import com.zhiyou100.util.Page;
@Service
public class SpeakerServiceImpl implements SpeakerService {
@Autowired
SpeakerMapper sm;

@Override
public List<Speaker> fandAllSpeaker() {
	return sm.selectByExample(null);
}

@Override
public Page<Speaker> loadPage(SpeakerVO sv) {
//	System.out.println("dddddddddd"+sv);
	Page<Speaker> page1=new Page<Speaker>();
	page1.setPage(sv.getPage());
	page1.setSize(3);
	page1.setTotal(sm.fandAllSpeakerCount(sv));
	page1.setRows(sm.fandAllSpeakerBySpeakerVO(sv));
//	System.out.println("33333"+page1);
	return page1;
}

@Override
public void insertIntoBySpeaker(Speaker s) {
	sm.insertSelective(s);
	
}

@Override
public Speaker fandAllSpeakerById(Integer id) {
	
	return sm.selectByPrimaryKey(id);
}

@Override
public void updateSpeaker(Speaker sp) {
	System.out.println("aaaaaaaaaaaaaaaaa"+sp);
	//	vm.updateByPrimaryKeySelective(vp);
	sm.updateByPrimaryKeySelective(sp);
	
}

@Override
public void deleteSpeakerById(Integer id) {
sm.deleteByPrimaryKey(id);	
}

}
