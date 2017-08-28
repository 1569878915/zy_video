package com.zhiyou100.mapper;

import com.zhiyou100.modle.Speaker;
import com.zhiyou100.modle.SpeakerExample;
import com.zhiyou100.modle.SpeakerVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpeakerMapper {
    int countByExample(SpeakerExample example);

    int deleteByExample(SpeakerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Speaker record);

    int insertSelective(Speaker record);

    List<Speaker> selectByExample(SpeakerExample example);

    Speaker selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Speaker record, @Param("example") SpeakerExample example);

    int updateByExample(@Param("record") Speaker record, @Param("example") SpeakerExample example);

    int updateByPrimaryKeySelective(Speaker record);

    int updateByPrimaryKey(Speaker record);


	List<Speaker> fandAllSpeakerBySpeakerVO(SpeakerVO sv);

	int fandAllSpeakerCount(SpeakerVO sv);
}