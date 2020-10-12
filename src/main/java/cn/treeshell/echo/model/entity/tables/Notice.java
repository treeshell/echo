/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity.tables;


import cn.treeshell.echo.model.entity.Echo;
import cn.treeshell.echo.model.entity.Indexes;
import cn.treeshell.echo.model.entity.Keys;
import cn.treeshell.echo.model.entity.tables.records.NoticeRecord;

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
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 通知表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Notice extends TableImpl<NoticeRecord> {

    private static final long serialVersionUID = -767590791;

    /**
     * The reference instance of <code>echo.notice</code>
     */
    public static final Notice NOTICE = new Notice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NoticeRecord> getRecordType() {
        return NoticeRecord.class;
    }

    /**
     * The column <code>echo.notice.id</code>. id
     */
    public final TableField<NoticeRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>echo.notice.operation_id</code>. 操作类型id：文章收藏、文章评论、评论收藏、评论回复、悄悄话回复
     */
    public final TableField<NoticeRecord, Integer> OPERATION_ID = createField(DSL.name("operation_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "操作类型id：文章收藏、文章评论、评论收藏、评论回复、悄悄话回复");

    /**
     * The column <code>echo.notice.type</code>. 1：文章收藏通知，2：文章评论通知，11：评论收藏通知，12：评论回复通知；21：悄悄话回复通知
     */
    public final TableField<NoticeRecord, Integer> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "1：文章收藏通知，2：文章评论通知，11：评论收藏通知，12：评论回复通知；21：悄悄话回复通知");

    /**
     * The column <code>echo.notice.user_id</code>. 接收通知的用户id
     */
    public final TableField<NoticeRecord, Integer> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "接收通知的用户id");

    /**
     * The column <code>echo.notice.is_read</code>. 0：未读，1：已读
     */
    public final TableField<NoticeRecord, Byte> IS_READ = createField(DSL.name("is_read"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：未读，1：已读");

    /**
     * The column <code>echo.notice.active</code>. 0：未删除，1：已删除
     */
    public final TableField<NoticeRecord, Byte> ACTIVE = createField(DSL.name("active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：未删除，1：已删除");

    /**
     * The column <code>echo.notice.create_time</code>. 创建日期
     */
    public final TableField<NoticeRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建日期");

    /**
     * The column <code>echo.notice.update_time</code>. 修改日期
     */
    public final TableField<NoticeRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改日期");

    /**
     * Create a <code>echo.notice</code> table reference
     */
    public Notice() {
        this(DSL.name("notice"), null);
    }

    /**
     * Create an aliased <code>echo.notice</code> table reference
     */
    public Notice(String alias) {
        this(DSL.name(alias), NOTICE);
    }

    /**
     * Create an aliased <code>echo.notice</code> table reference
     */
    public Notice(Name alias) {
        this(alias, NOTICE);
    }

    private Notice(Name alias, Table<NoticeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Notice(Name alias, Table<NoticeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("通知表"));
    }

    public <O extends Record> Notice(Table<O> child, ForeignKey<O, NoticeRecord> key) {
        super(child, key, NOTICE);
    }

    @Override
    public Schema getSchema() {
        return Echo.ECHO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NOTICE_PRIMARY);
    }

    @Override
    public Identity<NoticeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NOTICE;
    }

    @Override
    public UniqueKey<NoticeRecord> getPrimaryKey() {
        return Keys.KEY_NOTICE_PRIMARY;
    }

    @Override
    public List<UniqueKey<NoticeRecord>> getKeys() {
        return Arrays.<UniqueKey<NoticeRecord>>asList(Keys.KEY_NOTICE_PRIMARY);
    }

    @Override
    public Notice as(String alias) {
        return new Notice(DSL.name(alias), this);
    }

    @Override
    public Notice as(Name alias) {
        return new Notice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Notice rename(String name) {
        return new Notice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Notice rename(Name name) {
        return new Notice(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
