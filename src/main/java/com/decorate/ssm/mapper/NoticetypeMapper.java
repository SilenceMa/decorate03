package com.decorate.ssm.mapper;

import com.decorate.ssm.po.Noticetype;
import com.decorate.ssm.po.NoticetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticetypeMapper {
    int countByExample(NoticetypeExample example);

    int deleteByExample(NoticetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Noticetype record);

    int insertSelective(Noticetype record);

    List<Noticetype> selectByExample(NoticetypeExample example);

    Noticetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Noticetype record, @Param("example") NoticetypeExample example);

    int updateByExample(@Param("record") Noticetype record, @Param("example") NoticetypeExample example);

    int updateByPrimaryKeySelective(Noticetype record);

    int updateByPrimaryKey(Noticetype record);
}