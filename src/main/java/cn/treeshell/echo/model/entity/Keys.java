/*
 * This file is generated by jOOQ.
 */
package cn.treeshell.echo.model.entity;


import cn.treeshell.echo.model.entity.tables.Article;
import cn.treeshell.echo.model.entity.tables.ArticleContent;
import cn.treeshell.echo.model.entity.tables.ArticleLike;
import cn.treeshell.echo.model.entity.tables.Category;
import cn.treeshell.echo.model.entity.tables.Comment;
import cn.treeshell.echo.model.entity.tables.CommentLike;
import cn.treeshell.echo.model.entity.tables.Feedback;
import cn.treeshell.echo.model.entity.tables.FriendLink;
import cn.treeshell.echo.model.entity.tables.Menu;
import cn.treeshell.echo.model.entity.tables.Notice;
import cn.treeshell.echo.model.entity.tables.PrivateMessage;
import cn.treeshell.echo.model.entity.tables.Role;
import cn.treeshell.echo.model.entity.tables.RoleMenu;
import cn.treeshell.echo.model.entity.tables.Tag;
import cn.treeshell.echo.model.entity.tables.User;
import cn.treeshell.echo.model.entity.tables.UserRole;
import cn.treeshell.echo.model.entity.tables.records.ArticleContentRecord;
import cn.treeshell.echo.model.entity.tables.records.ArticleLikeRecord;
import cn.treeshell.echo.model.entity.tables.records.ArticleRecord;
import cn.treeshell.echo.model.entity.tables.records.CategoryRecord;
import cn.treeshell.echo.model.entity.tables.records.CommentLikeRecord;
import cn.treeshell.echo.model.entity.tables.records.CommentRecord;
import cn.treeshell.echo.model.entity.tables.records.FeedbackRecord;
import cn.treeshell.echo.model.entity.tables.records.FriendLinkRecord;
import cn.treeshell.echo.model.entity.tables.records.MenuRecord;
import cn.treeshell.echo.model.entity.tables.records.NoticeRecord;
import cn.treeshell.echo.model.entity.tables.records.PrivateMessageRecord;
import cn.treeshell.echo.model.entity.tables.records.RoleMenuRecord;
import cn.treeshell.echo.model.entity.tables.records.RoleRecord;
import cn.treeshell.echo.model.entity.tables.records.TagRecord;
import cn.treeshell.echo.model.entity.tables.records.UserRecord;
import cn.treeshell.echo.model.entity.tables.records.UserRoleRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>echo</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ArticleRecord, Integer> IDENTITY_ARTICLE = Identities0.IDENTITY_ARTICLE;
    public static final Identity<ArticleContentRecord, Integer> IDENTITY_ARTICLE_CONTENT = Identities0.IDENTITY_ARTICLE_CONTENT;
    public static final Identity<ArticleLikeRecord, Integer> IDENTITY_ARTICLE_LIKE = Identities0.IDENTITY_ARTICLE_LIKE;
    public static final Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
    public static final Identity<CommentRecord, Integer> IDENTITY_COMMENT = Identities0.IDENTITY_COMMENT;
    public static final Identity<CommentLikeRecord, Integer> IDENTITY_COMMENT_LIKE = Identities0.IDENTITY_COMMENT_LIKE;
    public static final Identity<FeedbackRecord, Integer> IDENTITY_FEEDBACK = Identities0.IDENTITY_FEEDBACK;
    public static final Identity<FriendLinkRecord, Integer> IDENTITY_FRIEND_LINK = Identities0.IDENTITY_FRIEND_LINK;
    public static final Identity<MenuRecord, Integer> IDENTITY_MENU = Identities0.IDENTITY_MENU;
    public static final Identity<NoticeRecord, Integer> IDENTITY_NOTICE = Identities0.IDENTITY_NOTICE;
    public static final Identity<PrivateMessageRecord, Integer> IDENTITY_PRIVATE_MESSAGE = Identities0.IDENTITY_PRIVATE_MESSAGE;
    public static final Identity<RoleRecord, Integer> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<RoleMenuRecord, Integer> IDENTITY_ROLE_MENU = Identities0.IDENTITY_ROLE_MENU;
    public static final Identity<TagRecord, Integer> IDENTITY_TAG = Identities0.IDENTITY_TAG;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;
    public static final Identity<UserRoleRecord, Integer> IDENTITY_USER_ROLE = Identities0.IDENTITY_USER_ROLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ArticleRecord> KEY_ARTICLE_PRIMARY = UniqueKeys0.KEY_ARTICLE_PRIMARY;
    public static final UniqueKey<ArticleRecord> KEY_ARTICLE_UK_TITLE = UniqueKeys0.KEY_ARTICLE_UK_TITLE;
    public static final UniqueKey<ArticleContentRecord> KEY_ARTICLE_CONTENT_PRIMARY = UniqueKeys0.KEY_ARTICLE_CONTENT_PRIMARY;
    public static final UniqueKey<ArticleLikeRecord> KEY_ARTICLE_LIKE_PRIMARY = UniqueKeys0.KEY_ARTICLE_LIKE_PRIMARY;
    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = UniqueKeys0.KEY_CATEGORY_PRIMARY;
    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_UK_NAME = UniqueKeys0.KEY_CATEGORY_UK_NAME;
    public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = UniqueKeys0.KEY_COMMENT_PRIMARY;
    public static final UniqueKey<CommentLikeRecord> KEY_COMMENT_LIKE_PRIMARY = UniqueKeys0.KEY_COMMENT_LIKE_PRIMARY;
    public static final UniqueKey<FeedbackRecord> KEY_FEEDBACK_PRIMARY = UniqueKeys0.KEY_FEEDBACK_PRIMARY;
    public static final UniqueKey<FriendLinkRecord> KEY_FRIEND_LINK_PRIMARY = UniqueKeys0.KEY_FRIEND_LINK_PRIMARY;
    public static final UniqueKey<MenuRecord> KEY_MENU_PRIMARY = UniqueKeys0.KEY_MENU_PRIMARY;
    public static final UniqueKey<NoticeRecord> KEY_NOTICE_PRIMARY = UniqueKeys0.KEY_NOTICE_PRIMARY;
    public static final UniqueKey<PrivateMessageRecord> KEY_PRIVATE_MESSAGE_PRIMARY = UniqueKeys0.KEY_PRIVATE_MESSAGE_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<RoleMenuRecord> KEY_ROLE_MENU_PRIMARY = UniqueKeys0.KEY_ROLE_MENU_PRIMARY;
    public static final UniqueKey<TagRecord> KEY_TAG_PRIMARY = UniqueKeys0.KEY_TAG_PRIMARY;
    public static final UniqueKey<TagRecord> KEY_TAG_UK_NAME = UniqueKeys0.KEY_TAG_UK_NAME;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_UK_USERNAME = UniqueKeys0.KEY_USER_UK_USERNAME;
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = UniqueKeys0.KEY_USER_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ArticleRecord, Integer> IDENTITY_ARTICLE = Internal.createIdentity(Article.ARTICLE, Article.ARTICLE.ID);
        public static Identity<ArticleContentRecord, Integer> IDENTITY_ARTICLE_CONTENT = Internal.createIdentity(ArticleContent.ARTICLE_CONTENT, ArticleContent.ARTICLE_CONTENT.ID);
        public static Identity<ArticleLikeRecord, Integer> IDENTITY_ARTICLE_LIKE = Internal.createIdentity(ArticleLike.ARTICLE_LIKE, ArticleLike.ARTICLE_LIKE.ID);
        public static Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = Internal.createIdentity(Category.CATEGORY, Category.CATEGORY.ID);
        public static Identity<CommentRecord, Integer> IDENTITY_COMMENT = Internal.createIdentity(Comment.COMMENT, Comment.COMMENT.ID);
        public static Identity<CommentLikeRecord, Integer> IDENTITY_COMMENT_LIKE = Internal.createIdentity(CommentLike.COMMENT_LIKE, CommentLike.COMMENT_LIKE.ID);
        public static Identity<FeedbackRecord, Integer> IDENTITY_FEEDBACK = Internal.createIdentity(Feedback.FEEDBACK, Feedback.FEEDBACK.ID);
        public static Identity<FriendLinkRecord, Integer> IDENTITY_FRIEND_LINK = Internal.createIdentity(FriendLink.FRIEND_LINK, FriendLink.FRIEND_LINK.ID);
        public static Identity<MenuRecord, Integer> IDENTITY_MENU = Internal.createIdentity(Menu.MENU, Menu.MENU.ID);
        public static Identity<NoticeRecord, Integer> IDENTITY_NOTICE = Internal.createIdentity(Notice.NOTICE, Notice.NOTICE.ID);
        public static Identity<PrivateMessageRecord, Integer> IDENTITY_PRIVATE_MESSAGE = Internal.createIdentity(PrivateMessage.PRIVATE_MESSAGE, PrivateMessage.PRIVATE_MESSAGE.ID);
        public static Identity<RoleRecord, Integer> IDENTITY_ROLE = Internal.createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<RoleMenuRecord, Integer> IDENTITY_ROLE_MENU = Internal.createIdentity(RoleMenu.ROLE_MENU, RoleMenu.ROLE_MENU.ID);
        public static Identity<TagRecord, Integer> IDENTITY_TAG = Internal.createIdentity(Tag.TAG, Tag.TAG.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
        public static Identity<UserRoleRecord, Integer> IDENTITY_USER_ROLE = Internal.createIdentity(UserRole.USER_ROLE, UserRole.USER_ROLE.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ArticleRecord> KEY_ARTICLE_PRIMARY = Internal.createUniqueKey(Article.ARTICLE, "KEY_article_PRIMARY", Article.ARTICLE.ID);
        public static final UniqueKey<ArticleRecord> KEY_ARTICLE_UK_TITLE = Internal.createUniqueKey(Article.ARTICLE, "KEY_article_uk_title", Article.ARTICLE.TITLE);
        public static final UniqueKey<ArticleContentRecord> KEY_ARTICLE_CONTENT_PRIMARY = Internal.createUniqueKey(ArticleContent.ARTICLE_CONTENT, "KEY_article_content_PRIMARY", ArticleContent.ARTICLE_CONTENT.ID);
        public static final UniqueKey<ArticleLikeRecord> KEY_ARTICLE_LIKE_PRIMARY = Internal.createUniqueKey(ArticleLike.ARTICLE_LIKE, "KEY_article_like_PRIMARY", ArticleLike.ARTICLE_LIKE.ID);
        public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = Internal.createUniqueKey(Category.CATEGORY, "KEY_category_PRIMARY", Category.CATEGORY.ID);
        public static final UniqueKey<CategoryRecord> KEY_CATEGORY_UK_NAME = Internal.createUniqueKey(Category.CATEGORY, "KEY_category_uk_name", Category.CATEGORY.NAME);
        public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = Internal.createUniqueKey(Comment.COMMENT, "KEY_comment_PRIMARY", Comment.COMMENT.ID);
        public static final UniqueKey<CommentLikeRecord> KEY_COMMENT_LIKE_PRIMARY = Internal.createUniqueKey(CommentLike.COMMENT_LIKE, "KEY_comment_like_PRIMARY", CommentLike.COMMENT_LIKE.ID);
        public static final UniqueKey<FeedbackRecord> KEY_FEEDBACK_PRIMARY = Internal.createUniqueKey(Feedback.FEEDBACK, "KEY_feedback_PRIMARY", Feedback.FEEDBACK.ID);
        public static final UniqueKey<FriendLinkRecord> KEY_FRIEND_LINK_PRIMARY = Internal.createUniqueKey(FriendLink.FRIEND_LINK, "KEY_friend_link_PRIMARY", FriendLink.FRIEND_LINK.ID);
        public static final UniqueKey<MenuRecord> KEY_MENU_PRIMARY = Internal.createUniqueKey(Menu.MENU, "KEY_menu_PRIMARY", Menu.MENU.ID);
        public static final UniqueKey<NoticeRecord> KEY_NOTICE_PRIMARY = Internal.createUniqueKey(Notice.NOTICE, "KEY_notice_PRIMARY", Notice.NOTICE.ID);
        public static final UniqueKey<PrivateMessageRecord> KEY_PRIVATE_MESSAGE_PRIMARY = Internal.createUniqueKey(PrivateMessage.PRIVATE_MESSAGE, "KEY_private_message_PRIMARY", PrivateMessage.PRIVATE_MESSAGE.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = Internal.createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", Role.ROLE.ID);
        public static final UniqueKey<RoleMenuRecord> KEY_ROLE_MENU_PRIMARY = Internal.createUniqueKey(RoleMenu.ROLE_MENU, "KEY_role_menu_PRIMARY", RoleMenu.ROLE_MENU.ID);
        public static final UniqueKey<TagRecord> KEY_TAG_PRIMARY = Internal.createUniqueKey(Tag.TAG, "KEY_tag_PRIMARY", Tag.TAG.ID);
        public static final UniqueKey<TagRecord> KEY_TAG_UK_NAME = Internal.createUniqueKey(Tag.TAG, "KEY_tag_uk_name", Tag.TAG.NAME);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_UK_USERNAME = Internal.createUniqueKey(User.USER, "KEY_user_uk_username", User.USER.USERNAME);
        public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = Internal.createUniqueKey(UserRole.USER_ROLE, "KEY_user_role_PRIMARY", UserRole.USER_ROLE.ID);
    }
}
