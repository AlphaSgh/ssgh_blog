package com.ssgh.blog.dao;

import com.ssgh.blog.entity.Blog;
import com.ssgh.blog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {
    int deleteByPrimaryKey(Long blogId);
    int insert(Blog record);
    int insertSelective(Blog record);
    Blog selectByPrimaryKey(Long blogId);
    int updateByPrimaryKeySelective(Blog record);
    int updateByPrimaryKeyWithBLOBs(Blog record);
    int updateByPrimaryKey(Blog record);
    List<Blog> findBlogList(PageQueryUtil pageQueryUtil);
    List<Blog> findBlogListByType(@Param("type") int type, @Param("limit") int limit);
    int getTotalBlogs(PageQueryUtil pageQueryUtil);
    int deleteBatch(Integer[] ids);
    List<Blog> getBlogsPageByTagId(PageQueryUtil pageQueryUtil);
    int getTotalBlogsByTagId(PageQueryUtil pageQueryUtil);
    Blog selectBySubUrl(String subUrl);
    int updateBlogCategorys(@Param("categoryName") String categoryName, @Param("categoryId") Integer categoryId, @Param("ids") Integer[] ids);
}
