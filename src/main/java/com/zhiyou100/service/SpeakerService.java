package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.modle.Speaker;
import com.zhiyou100.modle.SpeakerVO;
import com.zhiyou100.util.Page;

public interface SpeakerService {

	List<Speaker> fandAllSpeaker();

	Page<Speaker> loadPage(SpeakerVO sv);

	void insertIntoBySpeaker(Speaker s);

	Speaker fandAllSpeakerById(Integer id);

	void updateSpeaker(Speaker sp);

	void deleteSpeakerById(Integer id);

}
