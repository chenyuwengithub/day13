package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Major;
import com.xiaoshu.entity.MajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorMapper extends BaseMapper<Major> {
    long countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    List<Major> selectByExample(MajorExample example);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

	Integer findID(String maname);
}