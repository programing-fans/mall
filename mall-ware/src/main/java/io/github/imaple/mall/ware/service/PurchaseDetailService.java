package io.github.imaple.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.imaple.common.utils.PageUtils;
import io.github.imaple.mall.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-11-17 13:50:10
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);


}

