package com.ssgh.blog.service;

import com.ssgh.blog.controller.vo.BlogDetailVO;
import com.ssgh.blog.controller.vo.SimpleBlogListVO;
import com.ssgh.blog.entity.Blog;
import com.ssgh.blog.util.PageQueryUtil;
import com.ssgh.blog.util.PageResult;

import java.util.List;

public interface BlogService {
    String saveBlog(Blog blog);
    PageResult getBlogPage(PageQueryUtil pageQueryUtil);
    Boolean deleteBatch(Integer[] ids);
    int getTotalBlogs();
    Blog getBlobById(Long blogId);
    String updateBlog(Blog blog);
    PageResult getBlogsForIndexPage(int page);
    List<SimpleBlogListVO> getBlogListForIndexPage(int type);
    BlogDetailVO getBlogDetail(Long blogId);
    PageResult getBlogsPageById(String tagName, int page);
    PageResult getBlogsPageByCategory(String categoryId, int page);
    PageResult getBlogsPageBySearch(String keyword, int page);
    BlogDetailVO getBlogDetailBySubUrl(String subUrl);

}
