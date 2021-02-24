package com.xxh.server.controller;


import com.xxh.server.pojo.Menu;
import com.xxh.server.service.IAdminService;
import com.xxh.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xxh
 * @since 2021-02-23
 */
@RestController
@RequestMapping("/system/cfg")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @ApiOperation(value = "根据用户id查询菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenusByAdminId(){
        return menuService.getMenusByAdminId();
    }
}
