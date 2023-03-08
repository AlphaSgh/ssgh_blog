package com.ssgh.blog.service.impl;

import com.ssgh.blog.controller.vo.BlogDetailVO;
import com.ssgh.blog.controller.vo.SimpleBlogListVO;
import com.ssgh.blog.dao.BlogMapper;
import com.ssgh.blog.entity.Blog;
import com.ssgh.blog.service.BlogService;
import com.ssgh.blog.util.PageQueryUtil;
import com.ssgh.blog.util.PageResult;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public String saveBlog(Blog blog) {
        return null;
    }

    @Override
    public PageResult getBlogPage(PageQueryUtil pageQueryUtil) {
        return null;
    }

    @Override
    public Boolean deleteBatch(Integer[] ids) {
        return null;
    }

    @Override
    public int getTotalBlogs() {
        return 0;
    }

    @Override
    public Blog getBlobById(Long blogId) {
        return null;
    }

    @Override
    public String updateBlog(Blog blog) {
        return null;
    }

    @Override
    public PageResult getBlogsForIndexPage(int page) {
        return null;
    }

    @Override
    public List<SimpleBlogListVO> getBlogListForIndexPage(int type) {
        return null;
    }

    @Override
    public BlogDetailVO getBlogDetail(Long blogId) {
        return null;
    }

    @Override
    public PageResult getBlogsPageById(String tagName, int page) {
        return null;
    }

    @Override
    public PageResult getBlogsPageByCategory(String categoryId, int page) {
        return null;
    }

    @Override
    public PageResult getBlogsPageBySearch(String keyword, int page) {
        return null;
    }

    @Override
    public BlogDetailVO getBlogDetailBySubUrl(String subUrl) {
        return null;
    }
}
