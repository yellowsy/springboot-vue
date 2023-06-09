package com.hsy.springboot.mapper;

import com.hsy.springboot.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hsy
 * @since 2023-04-09
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
