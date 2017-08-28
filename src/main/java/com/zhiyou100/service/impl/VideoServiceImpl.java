package com.zhiyou100.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.VideoMapper;
import com.zhiyou100.modle.QueryVO;
import com.zhiyou100.modle.Video;
import com.zhiyou100.service.VideoService;
import com.zhiyou100.util.Page;
@Service
public class VideoServiceImpl implements VideoService {
@Autowired
VideoMapper vm;

@Override
public Page<Video> loadPage(QueryVO qv) {
	
	Page<Video> page=new Page<Video>();
	page.setPage(qv.getPage());
	page.setSize(5);
	page.setTotal(vm.fandAllVideoCount(qv));
	page.setRows(vm.fandAllVideoByQueryVO(qv));
	return page;
}

/*Override
public void insertIntoByVideoVO(VideoVO vv) {
	System.out.println(vv+"111111111");
//vv.getV();
	Video v=new Video();
	vm.insert(vv.getV());
	//vm.insertSelective(vv.getV());
}
*/
@Override
public void insertIntoByVideoVO(Video v) {
	//System.out.println(v+"33333333333333333333");
	vm.insertSelective(v);
}

@Override
public Video fandAllVideoById(Integer id) {
	
	return vm.selectByPrimaryKey(id);
}

@Override
public void updateVideo(Video vp) {
	vm.updateByPrimaryKeySelective(vp);
}

@Override
public void deleteVideoById(Integer id) {
	vm.deleteByPrimaryKey(id);
}





}
