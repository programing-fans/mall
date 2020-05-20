package io.github.imaple.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.imaple.common.utils.PageUtils;
import io.github.imaple.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-08 09:56:16
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

