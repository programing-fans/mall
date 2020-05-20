package io.github.imaple.mall.order.dao;

import io.github.imaple.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-08 09:56:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
