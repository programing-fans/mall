package io.github.imaple.mall.coupon.dao;

import io.github.imaple.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-08 09:36:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
