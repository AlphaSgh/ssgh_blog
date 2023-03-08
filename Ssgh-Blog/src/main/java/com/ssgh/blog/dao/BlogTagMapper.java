package com.ssgh.blog.dao;

import com.ssgh.blog.entity.BlogTag;
import com.ssgh.blog.entity.BlogTagCount;
import com.ssgh.blog.util.PageQueryUtil;

import java.util.List;

public interface BlogTagMapper {
    int deleteByPrimaryKey(Integer tagId);
    int insert(BlogTag record);
    int insertSelective(BlogTag record);
    BlogTag selectByPrimaryKey(Integer tagId);
    BlogTag selectByTagName(String tagName);
    int updateByPrimaryKeySelective(BlogTag record);
    int updateByPrimaryKey(BlogTag record);
    List<BlogTag> fingTagList(PageQueryUtil pageQueryUtil);
    List<BlogTagCount> getTagCount();
    int getTotalTags(PageQueryUtil pageQueryUtil);
    int deleteBatch(Integer[] ids);
    int batchInsertBlogTag(List<BlogTag> tagList);
}
