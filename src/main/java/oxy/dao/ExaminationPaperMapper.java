package oxy.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import oxy.model.ExaminationPaper;
import oxy.model.ExaminationPaperExample;

public interface ExaminationPaperMapper {
    long countByExample(ExaminationPaperExample example);

    int deleteByExample(ExaminationPaperExample example);

    int deleteByPrimaryKey(Integer paperid);

    int insert(ExaminationPaper record);

    int insertSelective(ExaminationPaper record);

    List<ExaminationPaper> selectByExample(ExaminationPaperExample example);

    ExaminationPaper selectByPrimaryKey(Integer paperid);

    int updateByExampleSelective(@Param("record") ExaminationPaper record, @Param("example") ExaminationPaperExample example);

    int updateByExample(@Param("record") ExaminationPaper record, @Param("example") ExaminationPaperExample example);

    int updateByPrimaryKeySelective(ExaminationPaper record);

    int updateByPrimaryKey(ExaminationPaper record);
}