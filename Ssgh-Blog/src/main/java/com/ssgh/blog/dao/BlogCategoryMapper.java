package com.ssgh.blog.dao;

import com.ssgh.blog.entity.BlogCategory;
import com.ssgh.blog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);
    int insert(BlogCategory record);
    int insertSelective(BlogCategory record);
    BlogCategory selectByPrimaryKey(Integer categoryId);
    BlogCategory selectByCategoryName(String categoryName);
    int updateByPrimaryKeySelective(BlogCategory record);
    int updateByPrimaryKey(BlogCategory record);
    List<BlogCategory> findCategoryList(PageQueryUtil pageQueryUtil);
    List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);
    int getTotalCategories(PageQueryUtil pageQueryUtil);
    int deleteBatch(Integer[] ids);
}
