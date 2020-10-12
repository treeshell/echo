/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity.tables.records;


import cn.treeshell.echo.model.entity.tables.RoleMenu;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 角色权限关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleMenuRecord extends UpdatableRecordImpl<RoleMenuRecord> implements Record6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 71595835;

    /**
     * Setter for <code>echo.role_menu.id</code>. id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>echo.role_menu.id</code>. id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>echo.role_menu.role_id</code>. 角色id
     */
    public void setRoleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>echo.role_menu.role_id</code>. 角色id
     */
    public Integer getRoleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>echo.role_menu.menu_id</code>. 权限id
     */
    public void setMenuId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>echo.role_menu.menu_id</code>. 权限id
     */
    public Integer getMenuId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>echo.role_menu.active</code>. 0：未删除，1：已删除
     */
    public void setActive(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>echo.role_menu.active</code>. 0：未删除，1：已删除
     */
    public Byte getActive() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>echo.role_menu.create_time</code>. 创建日期
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>echo.role_menu.create_time</code>. 创建日期
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>echo.role_menu.update_time</code>. 修改日期
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>echo.role_menu.update_time</code>. 修改日期
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RoleMenu.ROLE_MENU.ID;
    }

    @Override
    public Field<Integer> field2() {
        return RoleMenu.ROLE_MENU.ROLE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return RoleMenu.ROLE_MENU.MENU_ID;
    }

    @Override
    public Field<Byte> field4() {
        return RoleMenu.ROLE_MENU.ACTIVE;
    }

    @Override
    public Field<Timestamp> field5() {
        return RoleMenu.ROLE_MENU.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field6() {
        return RoleMenu.ROLE_MENU.UPDATE_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getRoleId();
    }

    @Override
    public Integer component3() {
        return getMenuId();
    }

    @Override
    public Byte component4() {
        return getActive();
    }

    @Override
    public Timestamp component5() {
        return getCreateTime();
    }

    @Override
    public Timestamp component6() {
        return getUpdateTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getRoleId();
    }

    @Override
    public Integer value3() {
        return getMenuId();
    }

    @Override
    public Byte value4() {
        return getActive();
    }

    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    @Override
    public RoleMenuRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RoleMenuRecord value2(Integer value) {
        setRoleId(value);
        return this;
    }

    @Override
    public RoleMenuRecord value3(Integer value) {
        setMenuId(value);
        return this;
    }

    @Override
    public RoleMenuRecord value4(Byte value) {
        setActive(value);
        return this;
    }

    @Override
    public RoleMenuRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public RoleMenuRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public RoleMenuRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleMenuRecord
     */
    public RoleMenuRecord() {
        super(RoleMenu.ROLE_MENU);
    }

    /**
     * Create a detached, initialised RoleMenuRecord
     */
    public RoleMenuRecord(Integer id, Integer roleId, Integer menuId, Byte active, Timestamp createTime, Timestamp updateTime) {
        super(RoleMenu.ROLE_MENU);

        set(0, id);
        set(1, roleId);
        set(2, menuId);
        set(3, active);
        set(4, createTime);
        set(5, updateTime);
    }
}