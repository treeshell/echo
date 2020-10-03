-- 用户表
CREATE TABLE `user`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `mobile` VARCHAR(20) DEFAULT '' COMMENT '电话',
    `username` VARCHAR(30) NOT NULL COMMENT '用户名',
    `password` VARCHAR(80) NOT NULL COMMENT '密码',
    `email` VARCHAR(30) DEFAULT '' COMMENT '邮箱',
    `avatar_url` VARCHAR(255) DEFAULT '' COMMENT '头像地址',
    `signature` VARCHAR(50) DEFAULT '' COMMENT '签名',
    `introduction` VARCHAR(255) COMMENT '简介',
    `gender` TINYINT(1) DEFAULT 0 COMMENT '0：未知，1：男，2：女',
    `status` TINYINT(1) DEFAULT 0 COMMENT '0：可用，1：禁用',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    `last_login_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '最后登陆日期',
    PRIMARY KEY (`id`) ,
    UNIQUE KEY uk_username (`username`)
) DEFAULT CHARSET = utf8 COMMENT = '用户表';

-- 用户角色关系表
CREATE TABLE `user_role`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `role_id` VARCHAR(20) NOT NULL COMMENT '角色Id',
    `user_id` VARCHAR(20) NOT NULL COMMENT '用户Id',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '用户角色关系表';

-- 系统角色表
CREATE TABLE `role`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `name` VARCHAR(30) NOT NULL COMMENT '角色名称（汉字）',
    `description` VARCHAR(128) DEFAULT '' COMMENT '角色描述',
    `code` VARCHAR(30) NOT NULL COMMENT '角色的英文code，如：ADMIN',
    `sort` INT(2) DEFAULT 99 COMMENT '角色顺序',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '系统角色表';

-- 系统菜单表
CREATE TABLE `menu`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `parent_ids` VARCHAR(200) NOT NULL COMMENT '当前菜单所有父菜单ID',
    `is_leaf` TINYINT(1) NOT NULL COMMENT '0：不是叶子节点，1：是叶子节点',
    `name` VARCHAR(30) NOT NULL COMMENT '菜单名称',
    `redirect_url` VARCHAR(255) NOT NULL COMMENT '跳转URL',
    `icon_url` VARCHAR(255) DEFAULT NULL COMMENT 'icon地址',
    `sort` TINYINT(2) DEFAULT 99 COMMENT '菜单排序',
    `level` TINYINT(2) NOT NULL COMMENT '菜单层级',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '系统菜单表';

-- 角色权限关系表
CREATE TABLE `role_menu`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `role_id` VARCHAR(20) NOT NULL COMMENT '角色ID',
    `menu_id` VARCHAR(20) NOT NULL COMMENT '权限ID',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '角色权限关系表';

-- 文章分类表
CREATE TABLE `category`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `parent_ids` VARCHAR(200) NOT NULL COMMENT '当前菜单所有父菜单ID',
    `name` VARCHAR(30) NOT NULL COMMENT '分类名称',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`) ,
    UNIQUE KEY uk_name (`name`)
) DEFAULT CHARSET = utf8 COMMENT = '文章分类表';

-- 文章标签表
CREATE TABLE `tag`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `name` VARCHAR(30) NOT NULL COMMENT '标签名称',
    `category_id` VARCHAR(20) DEFAULT '' COMMENT '分类ID',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`) ,
    UNIQUE KEY uk_name (`name`)
) DEFAULT CHARSET = utf8 COMMENT = '文章标签表';

-- 文章表
CREATE TABLE `article`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `user_id` VARCHAR(20) NOT NULL COMMENT '发表者ID',
    `title` VARCHAR(50) NOT NULL COMMENT '标题',
    `content_id` VARCHAR(20) NOT NULL COMMENT '文章内容ID',
    `digest` VARCHAR(255) NOT NULL COMMENT '摘要',
    `image_url` VARCHAR(255) DEFAULT '' COMMENT '主图地址',
    `type` TINYINT(1) DEFAULT 0 COMMENT '0：原创，1：转载，2：翻译',
    `origin_url` VARCHAR(255) DEFAULT '' COMMENT '转载/翻译的原文链接',
    `likes` INT(5) DEFAULT 0 COMMENT '点赞/喜欢数',
    `tag_id` VARCHAR(20) NOT NULL COMMENT '标签ID',
    `category_id` VARCHAR(20) NOT NULL COMMENT '分类ID',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`) ,
    UNIQUE KEY uk_title (`title`)
) DEFAULT CHARSET = utf8 COMMENT = '文章表';

-- 文章内容表
CREATE TABLE `article_content`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `content` TEXT NOT NULL COMMENT '内容',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '文章内容表';

-- 反馈表
CREATE TABLE `feedback`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `title` VARCHAR(30) NOT NULL COMMENT '反馈标题',
    `content` VARCHAR(255) NOT NULL COMMENT '反馈内容',
    `user_id` VARCHAR(20) NOT NULL COMMENT '反馈人ID',
    `status` TINYINT(1) DEFAULT 0 COMMENT '0：未解决，1：已解决',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '反馈表';

-- 友链表
CREATE TABLE `friend_link`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `title` VARCHAR(40) NOT NULL COMMENT '博客标题',
    `url` VARCHAR(255) NOT NULL COMMENT '博客地址',
    `image_url` VARCHAR(255) DEFAULT '' COMMENT '博客图标地址',
    `email` VARCHAR(30) DEFAULT '' COMMENT '联系人邮箱',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '友链表';

-- 评论表
CREATE TABLE `comment`(
    `id` VARCHAR(20)  NOT NULL COMMENT 'ID',
    `content` VARCHAR(255) NOT NULL COMMENT '评论内容',
    `parent_id` VARCHAR(20)  NOT NULL COMMENT '评论父节点ID',
    `article_id` VARCHAR(20)  NOT NULL COMMENT '评论文章ID',
    `user_id` VARCHAR(20)  NOT NULL COMMENT '评论用户ID',
    `answerer_id` VARCHAR(20) DEFAULT '' COMMENT '回答评论用户ID',
    `status` tinyint(1)  DEFAULT 0 COMMENT '0：待审核，1：审核通过',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '评论表';

-- 用户点赞文章表
CREATE TABLE `article_like`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `article_id` VARCHAR(20) NOT NULL COMMENT '文章ID',
    `user_id` VARCHAR(20) NOT NULL COMMENT '用户ID',
    `publisher_id` VARCHAR(20) NOT NULL COMMENT '发布文章用户ID',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '用户点赞文章表';

-- 用户点赞评论表
CREATE TABLE `comment_like`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `comment_id` VARCHAR(20) NOT NULL COMMENT '评论ID',
    `user_id` VARCHAR(20) NOT NULL COMMENT '收藏用户ID',
    `publisher_id` VARCHAR(20) NOT NULL COMMENT '发布评论用户ID',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '用户点赞评论表';

-- 悄悄话表
CREATE TABLE `private_message`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `content` VARCHAR(255)NOT NULL COMMENT '悄悄话内容',
    `user_id` VARCHAR(20) NOT NULL COMMENT '发送悄悄话用户ID',
    `replier_id` VARCHAR(20) NOT NULL COMMENT '回复悄悄话用户ID',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    `reply_time`  TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '回复日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '悄悄话表';

-- 通知表
CREATE TABLE `notice`(
    `id` VARCHAR(20) NOT NULL COMMENT 'ID',
    `operation_id` VARCHAR(20) NOT NULL COMMENT '操作类型ID：文章收藏、文章评论、评论收藏、评论回复、悄悄话回复',
    `type` INT(2) NOT NULL COMMENT '1：文章收藏通知，2：文章评论通知，11：评论收藏通知，12：评论回复通知；21：悄悄话回复通知',
    `user_id` VARCHAR(20) NOT NULL COMMENT '接收通知的用户ID',
    `is_read` TINYINT(1) DEFAULT 0 COMMENT '0：未读，1：已读',
    `active` TINYINT(1) DEFAULT 0 COMMENT '0：未删除，1：已删除',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8 COMMENT = '通知表';