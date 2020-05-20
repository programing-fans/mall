package io.github.imaple.mall.coupon.dao;

import io.github.imaple.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-08 09:36:40
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
