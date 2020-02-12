package com.kxg.dubbo_learningProvider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.kxg.dubbo_learningProvider.model.TestModel;

@Mapper
public interface TestModelMapper {
    int insert(@Param("testModel") TestModel testModel);

    int insertSelective(@Param("testModel") TestModel testModel);

    int insertList(@Param("testModels") List<TestModel> testModels);

    int update(@Param("testModel") TestModel testModel);

    List<TestModel> findByIdGreaterThan(@Param("minId")Integer minId);
}