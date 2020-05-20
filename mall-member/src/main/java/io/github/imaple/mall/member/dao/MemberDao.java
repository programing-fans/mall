package io.github.imaple.mall.member.dao;

import io.github.imaple.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author xiaowu
 * @email yixiaowu2008@gmail.com
 * @date 2019-10-08 09:47:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
