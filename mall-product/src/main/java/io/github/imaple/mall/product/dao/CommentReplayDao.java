package io.github.imaple.mall.product.dao;

import io.github.imaple.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-01 21:08:48
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
