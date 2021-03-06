package com.steve.authority.admin.dao;

import com.steve.authority.admin.model.SysRoleMenu;
import com.steve.authority.admin.model.SysRoleMenuKey;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int deleteByPrimaryKey(SysRoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int insert(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int insertSelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    SysRoleMenu selectByPrimaryKey(SysRoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int updateByPrimaryKey(SysRoleMenu record);
}