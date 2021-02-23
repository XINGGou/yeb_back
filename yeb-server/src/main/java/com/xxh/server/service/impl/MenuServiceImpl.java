package com.xxh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxh.server.mapper.MenuMapper;
import com.xxh.server.pojo.Menu;
import com.xxh.server.service.IMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xxh
 * @since 2021-02-23
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
