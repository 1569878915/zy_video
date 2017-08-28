package com.zhiyou100.service;

import com.zhiyou100.modle.QueryVO;
import com.zhiyou100.modle.Video;
import com.zhiyou100.util.Page;

public interface VideoService {

	Page<Video> loadPage(QueryVO qv);




	void insertIntoByVideoVO(Video v);

	Video fandAllVideoById(Integer id);




	void updateVideo(Video vp);




	void deleteVideoById(Integer id);







//void updateVideo(Video id);

}
