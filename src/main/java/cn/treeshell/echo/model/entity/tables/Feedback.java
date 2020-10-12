/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity.tables;


import cn.treeshell.echo.model.entity.Echo;
import cn.treeshell.echo.model.entity.Indexes;
import cn.treeshell.echo.model.entity.Keys;
import cn.treeshell.echo.model.entity.tables.records.FeedbackRecord;

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
 * 反馈表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Feedback extends TableImpl<FeedbackRecord> {

    private static final long serialVersionUID = 373931684;

    /**
     * The reference instance of <code>echo.feedback</code>
     */
    public static final Feedback FEEDBACK = new Feedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeedbackRecord> getRecordType() {
        return FeedbackRecord.class;
    }

    /**
     * The column <code>echo.feedback.id</code>. id
     */
    public final TableField<FeedbackRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>echo.feedback.title</code>. 反馈标题
     */
    public final TableField<FeedbackRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "反馈标题");

    /**
     * The column <code>echo.feedback.content</code>. 反馈内容
     */
    public final TableField<FeedbackRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "反馈内容");

    /**
     * The column <code>echo.feedback.user_id</code>. 反馈人id
     */
    public final TableField<FeedbackRecord, Integer> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "反馈人id");

    /**
     * The column <code>echo.feedback.status</code>. 0：未解决，1：已解决
     */
    public final TableField<FeedbackRecord, Byte> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：未解决，1：已解决");

    /**
     * The column <code>echo.feedback.active</code>. 0：未删除，1：已删除
     */
    public final TableField<FeedbackRecord, Byte> ACTIVE = createField(DSL.name("active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：未删除，1：已删除");

    /**
     * The column <code>echo.feedback.create_time</code>. 创建日期
     */
    public final TableField<FeedbackRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建日期");

    /**
     * The column <code>echo.feedback.update_time</code>. 修改日期
     */
    public final TableField<FeedbackRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改日期");

    /**
     * Create a <code>echo.feedback</code> table reference
     */
    public Feedback() {
        this(DSL.name("feedback"), null);
    }

    /**
     * Create an aliased <code>echo.feedback</code> table reference
     */
    public Feedback(String alias) {
        this(DSL.name(alias), FEEDBACK);
    }

    /**
     * Create an aliased <code>echo.feedback</code> table reference
     */
    public Feedback(Name alias) {
        this(alias, FEEDBACK);
    }

    private Feedback(Name alias, Table<FeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private Feedback(Name alias, Table<FeedbackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("反馈表"));
    }

    public <O extends Record> Feedback(Table<O> child, ForeignKey<O, FeedbackRecord> key) {
        super(child, key, FEEDBACK);
    }

    @Override
    public Schema getSchema() {
        return Echo.ECHO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FEEDBACK_PRIMARY);
    }

    @Override
    public Identity<FeedbackRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FEEDBACK;
    }

    @Override
    public UniqueKey<FeedbackRecord> getPrimaryKey() {
        return Keys.KEY_FEEDBACK_PRIMARY;
    }

    @Override
    public List<UniqueKey<FeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<FeedbackRecord>>asList(Keys.KEY_FEEDBACK_PRIMARY);
    }

    @Override
    public Feedback as(String alias) {
        return new Feedback(DSL.name(alias), this);
    }

    @Override
    public Feedback as(Name alias) {
        return new Feedback(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Feedback rename(String name) {
        return new Feedback(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Feedback rename(Name name) {
        return new Feedback(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, Integer, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
