package com.cafucaa.alumniassociation.mapper;

import com.cafucaa.alumniassociation.model.CaNews;
import com.cafucaa.alumniassociation.model.CaNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int countByExample(CaNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int deleteByExample(CaNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int deleteByPrimaryKey(Integer caNewsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int insert(CaNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int insertSelective(CaNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    List<CaNews> selectByExampleWithBLOBs(CaNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    List<CaNews> selectByExample(CaNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    CaNews selectByPrimaryKey(Integer caNewsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") CaNews record, @Param("example") CaNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") CaNews record, @Param("example") CaNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int updateByExample(@Param("record") CaNews record, @Param("example") CaNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int updateByPrimaryKeySelective(CaNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CaNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_news
     *
     * @mbggenerated Sat Jun 01 23:57:31 CST 2019
     */
    int updateByPrimaryKey(CaNews record);
}