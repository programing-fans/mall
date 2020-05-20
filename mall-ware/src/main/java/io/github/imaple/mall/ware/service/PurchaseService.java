package io.github.imaple.mall.ware.service;

import io.github.imaple.mall.ware.vo.MergeVo;
import io.github.imaple.mall.ware.vo.PurchaseDoneVo;
import com.baomidou.mybatisplus.extension.service.IService;
import io.github.imaple.common.utils.PageUtils;
import io.github.imaple.mall.ware.entity.PurchaseEntity;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-11-17 13:50:10
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);


    void mergePurchase(MergeVo mergeVo);


    void received(List<Long> ids);


    void done(PurchaseDoneVo doneVo);


}

