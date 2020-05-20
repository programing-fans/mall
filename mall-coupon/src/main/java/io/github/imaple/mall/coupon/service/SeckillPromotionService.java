package io.github.imaple.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.imaple.common.utils.PageUtils;
import io.github.imaple.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-08 09:36:40
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

