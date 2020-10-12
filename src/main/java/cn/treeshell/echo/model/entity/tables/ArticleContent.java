/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity.tables;


import cn.treeshell.echo.model.entity.Echo;
import cn.treeshell.echo.model.entity.Indexes;
import cn.treeshell.echo.model.entity.Keys;
import cn.treeshell.echo.model.entity.tables.records.ArticleContentRecord;

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
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 文章内容表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArticleContent extends TableImpl<ArticleContentRecord> {

    private static final long serialVersionUID = 166572078;

    /**
     * The reference instance of <code>echo.article_content</code>
     */
    public static final ArticleContent ARTICLE_CONTENT = new ArticleContent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArticleContentRecord> getRecordType() {
        return ArticleContentRecord.class;
    }

    /**
     * The column <code>echo.article_content.id</code>. id
     */
    public final TableField<ArticleContentRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>echo.article_content.content</code>. 内容
     */
    public final TableField<ArticleContentRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "内容");

    /**
     * The column <code>echo.article_content.active</code>. 0：未删除，1：已删除
     */
    public final TableField<ArticleContentRecord, Byte> ACTIVE = createField(DSL.name("active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：未删除，1：已删除");

    /**
     * The column <code>echo.article_content.create_time</code>. 创建日期
     */
    public final TableField<ArticleContentRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建日期");

    /**
     * The column <code>echo.article_content.update_time</code>. 修改日期
     */
    public final TableField<ArticleContentRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改日期");

    /**
     * Create a <code>echo.article_content</code> table reference
     */
    public ArticleContent() {
        this(DSL.name("article_content"), null);
    }

    /**
     * Create an aliased <code>echo.article_content</code> table reference
     */
    public ArticleContent(String alias) {
        this(DSL.name(alias), ARTICLE_CONTENT);
    }

    /**
     * Create an aliased <code>echo.article_content</code> table reference
     */
    public ArticleContent(Name alias) {
        this(alias, ARTICLE_CONTENT);
    }

    private ArticleContent(Name alias, Table<ArticleContentRecord> aliased) {
        this(alias, aliased, null);
    }

    private ArticleContent(Name alias, Table<ArticleContentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("文章内容表"));
    }

    public <O extends Record> ArticleContent(Table<O> child, ForeignKey<O, ArticleContentRecord> key) {
        super(child, key, ARTICLE_CONTENT);
    }

    @Override
    public Schema getSchema() {
        return Echo.ECHO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ARTICLE_CONTENT_PRIMARY);
    }

    @Override
    public Identity<ArticleContentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ARTICLE_CONTENT;
    }

    @Override
    public UniqueKey<ArticleContentRecord> getPrimaryKey() {
        return Keys.KEY_ARTICLE_CONTENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<ArticleContentRecord>> getKeys() {
        return Arrays.<UniqueKey<ArticleContentRecord>>asList(Keys.KEY_ARTICLE_CONTENT_PRIMARY);
    }

    @Override
    public ArticleContent as(String alias) {
        return new ArticleContent(DSL.name(alias), this);
    }

    @Override
    public ArticleContent as(Name alias) {
        return new ArticleContent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ArticleContent rename(String name) {
        return new ArticleContent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ArticleContent rename(Name name) {
        return new ArticleContent(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
