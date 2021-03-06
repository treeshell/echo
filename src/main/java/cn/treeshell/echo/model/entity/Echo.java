/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity;


import cn.treeshell.echo.model.entity.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Echo extends SchemaImpl {

    private static final long serialVersionUID = -654968933;

    /**
     * The reference instance of <code>echo</code>
     */
    public static final Echo ECHO = new Echo();

    /**
     * 文章表
     */
    public final Article ARTICLE = cn.treeshell.echo.model.entity.tables.Article.ARTICLE;

    /**
     * 文章内容表
     */
    public final ArticleContent ARTICLE_CONTENT = cn.treeshell.echo.model.entity.tables.ArticleContent.ARTICLE_CONTENT;

    /**
     * 用户点赞文章表
     */
    public final ArticleLike ARTICLE_LIKE = cn.treeshell.echo.model.entity.tables.ArticleLike.ARTICLE_LIKE;

    /**
     * 文章分类表
     */
    public final Category CATEGORY = cn.treeshell.echo.model.entity.tables.Category.CATEGORY;

    /**
     * 评论表
     */
    public final Comment COMMENT = cn.treeshell.echo.model.entity.tables.Comment.COMMENT;

    /**
     * 用户点赞评论表
     */
    public final CommentLike COMMENT_LIKE = cn.treeshell.echo.model.entity.tables.CommentLike.COMMENT_LIKE;

    /**
     * 反馈表
     */
    public final Feedback FEEDBACK = cn.treeshell.echo.model.entity.tables.Feedback.FEEDBACK;

    /**
     * 友链表
     */
    public final FriendLink FRIEND_LINK = cn.treeshell.echo.model.entity.tables.FriendLink.FRIEND_LINK;

    /**
     * 系统菜单表
     */
    public final Menu MENU = cn.treeshell.echo.model.entity.tables.Menu.MENU;

    /**
     * 通知表
     */
    public final Notice NOTICE = cn.treeshell.echo.model.entity.tables.Notice.NOTICE;

    /**
     * 悄悄话表
     */
    public final PrivateMessage PRIVATE_MESSAGE = cn.treeshell.echo.model.entity.tables.PrivateMessage.PRIVATE_MESSAGE;

    /**
     * 系统角色表
     */
    public final Role ROLE = cn.treeshell.echo.model.entity.tables.Role.ROLE;

    /**
     * 角色权限关系表
     */
    public final RoleMenu ROLE_MENU = cn.treeshell.echo.model.entity.tables.RoleMenu.ROLE_MENU;

    /**
     * 文章标签表
     */
    public final Tag TAG = cn.treeshell.echo.model.entity.tables.Tag.TAG;

    /**
     * 用户表
     */
    public final User USER = cn.treeshell.echo.model.entity.tables.User.USER;

    /**
     * 用户角色关系表
     */
    public final UserRole USER_ROLE = cn.treeshell.echo.model.entity.tables.UserRole.USER_ROLE;

    /**
     * No further instances allowed
     */
    private Echo() {
        super("echo", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Article.ARTICLE,
            ArticleContent.ARTICLE_CONTENT,
            ArticleLike.ARTICLE_LIKE,
            Category.CATEGORY,
            Comment.COMMENT,
            CommentLike.COMMENT_LIKE,
            Feedback.FEEDBACK,
            FriendLink.FRIEND_LINK,
            Menu.MENU,
            Notice.NOTICE,
            PrivateMessage.PRIVATE_MESSAGE,
            Role.ROLE,
            RoleMenu.ROLE_MENU,
            Tag.TAG,
            User.USER,
            UserRole.USER_ROLE);
    }
}
