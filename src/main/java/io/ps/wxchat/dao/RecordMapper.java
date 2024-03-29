package io.ps.wxchat.dao;

import com.github.pagehelper.Page;
import io.ps.wxchat.po.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

    List<Record> selectByStudents(@Param("studentids") String studentids);

    List<Record> selectByCompanyandClass(@Param("studentids") String studentids,@Param("companyID") Integer companyID);
}