package io.github.imaple.mall.ware.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import io.github.imaple.mall.ware.vo.MergeVo;
import io.github.imaple.mall.ware.vo.PurchaseDoneVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.github.imaple.mall.ware.entity.PurchaseEntity;
import io.github.imaple.mall.ware.service.PurchaseService;
import io.github.imaple.common.utils.PageUtils;
import io.github.imaple.common.utils.R;



/**
 * 采购信息
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-11-17 13:50:10
 */
@RestController
@RequestMapping("ware/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    ///ware/purchase/done
    @PostMapping("/done")
    public R finish(@RequestBody PurchaseDoneVo doneVo){

        purchaseService.done(doneVo);

        return R.ok();
    }

    /**
     * 领取采购单
     * @return
     */
    @PostMapping("/received")
    public R received(@RequestBody List<Long> ids){

        purchaseService.received(ids);

        return R.ok();
    }

    ///ware/purchase/unreceive/list
    ///ware/purchase/merge
    @PostMapping("/merge")
    public R merge(@RequestBody MergeVo mergeVo){

        purchaseService.mergePurchase(mergeVo);
        return R.ok();
    }

    @RequestMapping("/unreceive/list")
    public R unreceivelist(@RequestParam Map<String, Object> params){
        PageUtils page = purchaseService.queryPageUnreceivePurchase(params);

        return R.ok().put("page", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = purchaseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PurchaseEntity purchase = purchaseService.getById(id);

        return R.ok().put("purchase", purchase);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PurchaseEntity purchase){
        purchase.setUpdateTime(new Date());
        purchase.setCreateTime(new Date());
		purchaseService.save(purchase);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PurchaseEntity purchase){
		purchaseService.updateById(purchase);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		purchaseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
