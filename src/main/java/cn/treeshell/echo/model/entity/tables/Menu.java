/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity.tables;


import cn.treeshell.echo.model.entity.Echo;
import cn.treeshell.echo.model.entity.Indexes;
import cn.treeshell.echo.model.entity.Keys;
import cn.treeshell.echo.model.entity.tables.records.MenuRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 系统菜单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Menu extends TableImpl<MenuRecord> {

    private static final long serialVersionUID = 1192342308;

    /**
     * The reference instance of <code>echo.menu</code>
     */
    public static final Menu MENU = new Menu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MenuRecord> getRecordType() {
        return MenuRecord.class;
    }

    /**
     * The column <code>echo.menu.id</code>. id
     */
    public final TableField<MenuRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>echo.menu.parent_id</code>. 当前菜单的父菜单id
     */
    public final TableField<MenuRecord, Integer> PARENT_ID = createField(DSL.name("parent_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "当前菜单的父菜单id");

    /**
     * The column <code>echo.menu.is_leaf</code>. 0：不是叶子节点，1：是叶子节点
     */
    public final TableField<MenuRecord, Byte> IS_LEAF = createField(DSL.name("is_leaf"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "0：不是叶子节点，1：是叶子节点");

    /**
     * The column <code>echo.menu.name</code>. 菜单名称
     */
    public final TableField<MenuRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "菜单名称");

    /**
     * The column <code>echo.menu.redirect_url</code>. 跳转URL
     */
    public final TableField<MenuRecord, String> REDIRECT_URL = createField(DSL.name("redirect_url"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "跳转URL");

    /**
     * The column <code>echo.menu.icon_url</code>. icon地址
     */
    public final TableField<MenuRecord, String> ICON_URL = createField(DSL.name("icon_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "icon地址");

    /**
     * The column <code>echo.menu.sort</code>. 菜单排序
     */
    public final TableField<MenuRecord, Byte> SORT = createField(DSL.name("sort"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("99", org.jooq.impl.SQLDataType.TINYINT)), this, "菜单排序");

    /**
     * The column <code>echo.menu.level</code>. 菜单层级
     */
    public final TableField<MenuRecord, Byte> LEVEL = createField(DSL.name("level"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "菜单层级");

    /**
     * The column <code>echo.menu.active</code>. 0：未删除，1：已删除
     */
    public final TableField<MenuRecord, Byte> ACTIVE = createField(DSL.name("active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：未删除，1：已删除");

    /**
     * The column <code>echo.menu.create_time</code>. 创建日期
     */
    public final TableField<MenuRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建日期");

    /**
     * The column <code>echo.menu.update_time</code>. 修改日期
     */
    public final TableField<MenuRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改日期");

    /**
     * Create a <code>echo.menu</code> table reference
     */
    public Menu() {
        this(DSL.name("menu"), null);
    }

    /**
     * Create an aliased <code>echo.menu</code> table reference
     */
    public Menu(String alias) {
        this(DSL.name(alias), MENU);
    }

    /**
     * Create an aliased <code>echo.menu</code> table reference
     */
    public Menu(Name alias) {
        this(alias, MENU);
    }

    private Menu(Name alias, Table<MenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private Menu(Name alias, Table<MenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("系统菜单表"));
    }

    public <O extends Record> Menu(Table<O> child, ForeignKey<O, MenuRecord> key) {
        super(child, key, MENU);
    }

    @Override
    public Schema getSchema() {
        return Echo.ECHO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MENU_PRIMARY);
    }

    @Override
    public Identity<MenuRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MENU;
    }

    @Override
    public UniqueKey<MenuRecord> getPrimaryKey() {
        return Keys.KEY_MENU_PRIMARY;
    }

    @Override
    public List<UniqueKey<MenuRecord>> getKeys() {
        return Arrays.<UniqueKey<MenuRecord>>asList(Keys.KEY_MENU_PRIMARY);
    }

    @Override
    public Menu as(String alias) {
        return new Menu(DSL.name(alias), this);
    }

    @Override
    public Menu as(Name alias) {
        return new Menu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Menu rename(String name) {
        return new Menu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Menu rename(Name name) {
        return new Menu(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, Byte, String, String, String, Byte, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
