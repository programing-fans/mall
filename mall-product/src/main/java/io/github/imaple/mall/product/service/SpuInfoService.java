package io.github.imaple.mall.product.service;

import io.github.imaple.mall.product.vo.SpuSaveVo;
import com.baomidou.mybatisplus.extension.service.IService;
import io.github.imaple.common.utils.PageUtils;
import io.github.imaple.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-01 21:08:49
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);


    PageUtils queryPageByCondition(Map<String, Object> params);


}

