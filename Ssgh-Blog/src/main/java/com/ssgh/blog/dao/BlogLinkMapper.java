package com.ssgh.blog.dao;

import com.ssgh.blog.entity.BlogLink;
import com.ssgh.blog.util.PageQueryUtil;

import java.util.List;

public interface BlogLinkMapper {
    int deleteByPrimaryKey(Integer linkId);
    int insert(BlogLink record);
    int insertSelective(BlogLink record);
    BlogLink selectByPrimaryKey(Integer linkId);
    int updateByPrimaryKeySelective(BlogLink record);
    int updateByPrimaryKey(BlogLink record);
    List<BlogLink> findLinkList(PageQueryUtil pageQueryUtil);
    int getTotalLinks(PageQueryUtil pageQueryUtil);
    int deleteBatch(Integer[] ids);
}
