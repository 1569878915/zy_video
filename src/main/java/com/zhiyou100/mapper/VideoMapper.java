package com.zhiyou100.mapper;

import com.zhiyou100.modle.QueryVO;
import com.zhiyou100.modle.Video;
import com.zhiyou100.modle.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

	int fandAllVideoCount(QueryVO qv);

	List<Video> fandAllVideoByQueryVO(QueryVO qv);
}