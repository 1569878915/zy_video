package com.zhiyou100.modle;

import java.util.Arrays;
import java.util.List;

public class VideoVO {
private Video v;
private String [] hobbys;
private List<String> list;

public List<String> getList() {
	return list;
}

public void setList(List<String> list) {
	this.list = list;
}

public String[] getHobbys() {
	return hobbys;
}

public void setHobbys(String[] hobbys) {
	this.hobbys = hobbys;
}




@Override
public String toString() {
	return "VideoVO [v=" + v + ", hobbys=" + Arrays.toString(hobbys) + ", list=" + list + "]";
}

public Video getV() {
	return v;
}

public void setV(Video v) {
	this.v = v;
}

}
