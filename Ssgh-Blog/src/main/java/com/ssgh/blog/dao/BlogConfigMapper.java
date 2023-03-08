package com.ssgh.blog.dao;

import com.ssgh.blog.entity.BlogConfig;

import java.util.List;

public interface BlogConfigMapper {
    List<BlogConfig> selectAll();
    BlogConfig selectByPrimaryKey(String configName);
    int updateByPrimaryKeySelective(BlogConfig record);
}
