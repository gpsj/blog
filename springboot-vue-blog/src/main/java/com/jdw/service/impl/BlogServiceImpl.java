package com.jdw.service.impl;

import com.jdw.entity.Blog;
import com.jdw.mapper.BlogMapper;
import com.jdw.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jdw
 * @since 2021-10-29
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
