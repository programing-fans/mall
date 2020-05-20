package io.github.imaple.mall.order.dao;

import io.github.imaple.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-08 09:56:16
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {

}
