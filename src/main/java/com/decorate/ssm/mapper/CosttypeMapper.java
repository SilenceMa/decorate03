package com.decorate.ssm.mapper;

import com.decorate.ssm.po.Costtype;
import com.decorate.ssm.po.CosttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CosttypeMapper {
    int countByExample(CosttypeExample example);

    int deleteByExample(CosttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Costtype record);

    int insertSelective(Costtype record);

    List<Costtype> selectByExample(CosttypeExample example);

    Costtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Costtype record, @Param("example") CosttypeExample example);

    int updateByExample(@Param("record") Costtype record, @Param("example") CosttypeExample example);

    int updateByPrimaryKeySelective(Costtype record);

    int updateByPrimaryKey(Costtype record);
}