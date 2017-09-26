package com.decorate.ssm.mapper;

import com.decorate.ssm.po.Emprelationemp;
import com.decorate.ssm.po.EmprelationempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmprelationempMapper {
    int countByExample(EmprelationempExample example);

    int deleteByExample(EmprelationempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emprelationemp record);

    int insertSelective(Emprelationemp record);

    List<Emprelationemp> selectByExample(EmprelationempExample example);

    Emprelationemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Emprelationemp record, @Param("example") EmprelationempExample example);

    int updateByExample(@Param("record") Emprelationemp record, @Param("example") EmprelationempExample example);

    int updateByPrimaryKeySelective(Emprelationemp record);

    int updateByPrimaryKey(Emprelationemp record);
}