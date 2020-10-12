/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity.tables;


import cn.treeshell.echo.model.entity.Echo;
import cn.treeshell.echo.model.entity.Indexes;
import cn.treeshell.echo.model.entity.Keys;
import cn.treeshell.echo.model.entity.tables.records.TagRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 文章标签表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tag extends TableImpl<TagRecord> {

    private static final long serialVersionUID = 1607936384;

    /**
     * The reference instance of <code>echo.tag</code>
     */
    public static final Tag TAG = new Tag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TagRecord> getRecordType() {
        return TagRecord.class;
    }

    /**
     * The column <code>echo.tag.id</code>. id
     */
    public final TableField<TagRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>echo.tag.name</code>. 标签名称
     */
    public final TableField<TagRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "标签名称");

    /**
     * The column <code>echo.tag.category_id</code>. 分类id
     */
    public final TableField<TagRecord, Integer> CATEGORY_ID = createField(DSL.name("category_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "分类id");

    /**
     * The column <code>echo.tag.active</code>. 0：未删除，1：已删除
     */
    public final TableField<TagRecord, Byte> ACTIVE = createField(DSL.name("active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：未删除，1：已删除");

    /**
     * The column <code>echo.tag.create_time</code>. 创建日期
     */
    public final TableField<TagRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建日期");

    /**
     * The column <code>echo.tag.update_time</code>. 修改日期
     */
    public final TableField<TagRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改日期");

    /**
     * Create a <code>echo.tag</code> table reference
     */
    public Tag() {
        this(DSL.name("tag"), null);
    }

    /**
     * Create an aliased <code>echo.tag</code> table reference
     */
    public Tag(String alias) {
        this(DSL.name(alias), TAG);
    }

    /**
     * Create an aliased <code>echo.tag</code> table reference
     */
    public Tag(Name alias) {
        this(alias, TAG);
    }

    private Tag(Name alias, Table<TagRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tag(Name alias, Table<TagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("文章标签表"));
    }

    public <O extends Record> Tag(Table<O> child, ForeignKey<O, TagRecord> key) {
        super(child, key, TAG);
    }

    @Override
    public Schema getSchema() {
        return Echo.ECHO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TAG_PRIMARY, Indexes.TAG_UK_NAME);
    }

    @Override
    public Identity<TagRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TAG;
    }

    @Override
    public UniqueKey<TagRecord> getPrimaryKey() {
        return Keys.KEY_TAG_PRIMARY;
    }

    @Override
    public List<UniqueKey<TagRecord>> getKeys() {
        return Arrays.<UniqueKey<TagRecord>>asList(Keys.KEY_TAG_PRIMARY, Keys.KEY_TAG_UK_NAME);
    }

    @Override
    public Tag as(String alias) {
        return new Tag(DSL.name(alias), this);
    }

    @Override
    public Tag as(Name alias) {
        return new Tag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tag rename(String name) {
        return new Tag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tag rename(Name name) {
        return new Tag(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}