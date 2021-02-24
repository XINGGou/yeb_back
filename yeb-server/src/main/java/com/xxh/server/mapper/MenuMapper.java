package com.xxh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxh.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xxh
 * @since 2021-02-23
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据用户id查询菜单列表
     * @param id
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);
}
