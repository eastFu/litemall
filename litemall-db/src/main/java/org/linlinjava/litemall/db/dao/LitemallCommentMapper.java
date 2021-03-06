package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallComment;
import org.linlinjava.litemall.db.domain.LitemallCommentExample;

public interface LitemallCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    long countByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int insert(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int insertSelective(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallComment selectOneByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallComment selectOneByExampleSelective(@Param("example") LitemallCommentExample example, @Param("selective") LitemallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallComment> selectByExampleSelective(@Param("example") LitemallCommentExample example, @Param("selective") LitemallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    List<LitemallComment> selectByExample(LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    LitemallComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallComment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") LitemallComment record, @Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") LitemallComment record, @Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallComment record, @Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallComment record, @Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}