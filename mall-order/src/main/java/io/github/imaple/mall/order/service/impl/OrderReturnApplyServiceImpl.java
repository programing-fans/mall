package io.github.imaple.mall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.imaple.common.utils.PageUtils;
import io.github.imaple.common.utils.Query;
import io.github.imaple.mall.order.dao.OrderReturnApplyDao;
import io.github.imaple.mall.order.entity.OrderReturnApplyEntity;
import io.github.imaple.mall.order.service.OrderReturnApplyService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApplyEntity> page = this.page(
                new Query<OrderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OrderReturnApplyEntity>()
        );

        return new PageUtils(page);
    }

}
