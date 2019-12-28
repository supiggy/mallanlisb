package net.suncaper.mallanli.mapper;

import java.util.List;
import net.suncaper.mallanli.common.domain.ImgFile;
import net.suncaper.mallanli.common.domain.ImgFileExample;
import org.apache.ibatis.annotations.Param;

public interface ImgFileMapper {
    long countByExample(ImgFileExample example);

    int deleteByExample(ImgFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImgFile record);

    int insertSelective(ImgFile record);

    List<ImgFile> selectByExample(ImgFileExample example);

    ImgFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImgFile record, @Param("example") ImgFileExample example);

    int updateByExample(@Param("record") ImgFile record, @Param("example") ImgFileExample example);

    int updateByPrimaryKeySelective(ImgFile record);

    int updateByPrimaryKey(ImgFile record);
}