package com.decorate.ssm.mapper;

import com.decorate.ssm.po.Emplyeerelationcompany;
import com.decorate.ssm.po.EmplyeerelationcompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmplyeerelationcompanyMapper {
    int countByExample(EmplyeerelationcompanyExample example);

    int deleteByExample(EmplyeerelationcompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emplyeerelationcompany record);

    int insertSelective(Emplyeerelationcompany record);

    List<Emplyeerelationcompany> selectByExample(EmplyeerelationcompanyExample example);

    Emplyeerelationcompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Emplyeerelationcompany record, @Param("example") EmplyeerelationcompanyExample example);

    int updateByExample(@Param("record") Emplyeerelationcompany record, @Param("example") EmplyeerelationcompanyExample example);

    int updateByPrimaryKeySelective(Emplyeerelationcompany record);

    int updateByPrimaryKey(Emplyeerelationcompany record);
}