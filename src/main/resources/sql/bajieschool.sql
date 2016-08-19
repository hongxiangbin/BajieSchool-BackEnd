/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : bajieschool

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2016-08-19 20:33:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `act_id` varchar(12) NOT NULL,
  `act_type` varchar(2) DEFAULT NULL,
  `act_title` varchar(100) NOT NULL,
  `act_content` varchar(255) DEFAULT NULL,
  `act_img` varchar(100) DEFAULT NULL,
  `act_time` datetime DEFAULT NULL,
  `act_like` int(5) DEFAULT NULL,
  `act_comment` int(5) DEFAULT NULL,
  `act_follow` int(5) DEFAULT NULL,
  `act_join` int(5) DEFAULT NULL,
  `act_signup` int(5) DEFAULT NULL,
  `act_place` varchar(255) DEFAULT NULL,
  `reserve1` varchar(255) DEFAULT NULL,
  `reserve2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`act_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity
-- ----------------------------

-- ----------------------------
-- Table structure for activity-comment
-- ----------------------------
DROP TABLE IF EXISTS `activity-comment`;
CREATE TABLE `activity-comment` (
  `act_com_id` varchar(12) NOT NULL,
  `username` varchar(16) NOT NULL,
  `act_com_content` varchar(255) DEFAULT NULL,
  `act-com_time` datetime DEFAULT NULL,
  `act_com_like` int(5) DEFAULT NULL,
  PRIMARY KEY (`act_com_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity-comment
-- ----------------------------

-- ----------------------------
-- Table structure for activity-comment-comment
-- ----------------------------
DROP TABLE IF EXISTS `activity-comment-comment`;
CREATE TABLE `activity-comment-comment` (
  `a_c_c_id` varchar(12) NOT NULL COMMENT '评论ID',
  `act_com_id` varchar(12) NOT NULL COMMENT '原评论ID',
  `username` varchar(16) NOT NULL COMMENT '评论用户',
  `a_c_c_content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `a_c_c_time` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`a_c_c_id`,`act_com_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity-comment-comment
-- ----------------------------

-- ----------------------------
-- Table structure for activity-type
-- ----------------------------
DROP TABLE IF EXISTS `activity-type`;
CREATE TABLE `activity-type` (
  `act_type_id` varchar(2) NOT NULL,
  `act_type_name` varchar(20) NOT NULL,
  PRIMARY KEY (`act_type_id`,`act_type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity-type
-- ----------------------------

-- ----------------------------
-- Table structure for agenda
-- ----------------------------
DROP TABLE IF EXISTS `agenda`;
CREATE TABLE `agenda` (
  `ag_id` varchar(12) NOT NULL COMMENT '日程ID',
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `ag_title` varchar(50) NOT NULL COMMENT '日程标题',
  `ag_remark` varchar(50) DEFAULT NULL COMMENT '日程备注',
  `ag_time` datetime NOT NULL COMMENT '开始时间',
  `ag_remind` datetime DEFAULT NULL COMMENT '提醒时间',
  PRIMARY KEY (`ag_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of agenda
-- ----------------------------

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer` (
  `ans_id` varchar(12) NOT NULL COMMENT '答案ID',
  `que_id` varchar(12) NOT NULL COMMENT '问题ID',
  `ans_content` varchar(255) DEFAULT NULL COMMENT '答案内容',
  `username` varchar(16) NOT NULL COMMENT '答主用户名',
  `ans_like` int(5) DEFAULT NULL COMMENT '赞同',
  `ans_comment` int(5) DEFAULT NULL COMMENT '评论',
  `ans_time` datetime DEFAULT NULL COMMENT '回答时间',
  PRIMARY KEY (`ans_id`,`que_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answer
-- ----------------------------

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `username` varchar(16) DEFAULT NULL COMMENT '用户名',
  `type` varchar(20) DEFAULT NULL COMMENT '收藏对象类型',
  `id` varchar(12) DEFAULT NULL COMMENT '收藏对象ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collection
-- ----------------------------

-- ----------------------------
-- Table structure for login-status
-- ----------------------------
DROP TABLE IF EXISTS `login-status`;
CREATE TABLE `login-status` (
  `username` varchar(16) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`username`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login-status
-- ----------------------------

-- ----------------------------
-- Table structure for notification
-- ----------------------------
DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
  `no_id` varchar(12) NOT NULL,
  `no_content` varchar(255) DEFAULT NULL,
  `type` char(1) DEFAULT NULL,
  `no_url` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`no_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notification
-- ----------------------------

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `que_id` varchar(12) NOT NULL COMMENT '问题ID',
  `que_title` varchar(100) NOT NULL COMMENT '问题标题',
  `que_content` varchar(255) DEFAULT NULL COMMENT '问题内容',
  `que_img` varchar(100) DEFAULT NULL COMMENT '图片',
  `que_like` int(5) DEFAULT NULL COMMENT '赞同数',
  `que_comment` int(5) DEFAULT NULL COMMENT '评论数',
  `que_time` datetime DEFAULT NULL,
  PRIMARY KEY (`que_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for reminder
-- ----------------------------
DROP TABLE IF EXISTS `reminder`;
CREATE TABLE `reminder` (
  `r_option` varchar(20) NOT NULL,
  `r_value` int(2) NOT NULL,
  PRIMARY KEY (`r_option`,`r_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reminder
-- ----------------------------

-- ----------------------------
-- Table structure for setting
-- ----------------------------
DROP TABLE IF EXISTS `setting`;
CREATE TABLE `setting` (
  `username` varchar(16) NOT NULL,
  `is_update` char(1) DEFAULT NULL,
  `is_shareloc` char(1) DEFAULT NULL,
  `is_showimg` char(1) DEFAULT NULL,
  `reserve1` varchar(255) DEFAULT NULL,
  `reserve2` varchar(255) DEFAULT NULL,
  `reserve3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of setting
-- ----------------------------

-- ----------------------------
-- Table structure for study
-- ----------------------------
DROP TABLE IF EXISTS `study`;
CREATE TABLE `study` (
  `std_id` varchar(12) NOT NULL,
  `type_id` varchar(2) DEFAULT NULL,
  `std_title` varchar(100) DEFAULT NULL,
  `std_content` varchar(255) DEFAULT NULL,
  `std_like` int(5) DEFAULT NULL,
  `std_comment` int(5) DEFAULT NULL,
  `std_time` datetime DEFAULT NULL,
  PRIMARY KEY (`std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study
-- ----------------------------

-- ----------------------------
-- Table structure for study-reply
-- ----------------------------
DROP TABLE IF EXISTS `study-reply`;
CREATE TABLE `study-reply` (
  `std_id` varchar(12) NOT NULL COMMENT '学习ID',
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `std_re_content` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `std_re_time` datetime DEFAULT NULL COMMENT '回复时间',
  `std_re_like` int(5) DEFAULT NULL COMMENT '赞同数',
  PRIMARY KEY (`std_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study-reply
-- ----------------------------

-- ----------------------------
-- Table structure for study-type
-- ----------------------------
DROP TABLE IF EXISTS `study-type`;
CREATE TABLE `study-type` (
  `type_id` varchar(12) NOT NULL,
  `type_name` varchar(20) NOT NULL,
  PRIMARY KEY (`type_id`,`type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study-type
-- ----------------------------

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', 'dsa', 'sda');
INSERT INTO `test_user` VALUES ('2', 'd2ws', 'dsad');

-- ----------------------------
-- Table structure for university
-- ----------------------------
DROP TABLE IF EXISTS `university`;
CREATE TABLE `university` (
  `univ_id` char(5) NOT NULL COMMENT '学校ID',
  `univ_name` varchar(50) NOT NULL COMMENT '学校名称',
  PRIMARY KEY (`univ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of university
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `no_id` varchar(12) DEFAULT NULL COMMENT '通知ID',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `sex` char(4) DEFAULT NULL COMMENT '性别',
  `cellphone` char(11) NOT NULL COMMENT '手机号',
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像',
  `university` char(5) NOT NULL COMMENT '大学',
  `institution` varchar(50) DEFAULT NULL COMMENT '学院',
  `enroll_year` char(4) NOT NULL COMMENT '入学年份',
  `level` char(1) DEFAULT NULL COMMENT '学位级别',
  `qq` varchar(10) DEFAULT NULL,
  `wechat` varchar(20) DEFAULT NULL,
  `weibo` varchar(50) DEFAULT NULL,
  `reserve1` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `reserve2` varchar(255) DEFAULT NULL,
  `reserve3` varchar(255) DEFAULT NULL,
  `reserve4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user-activity
-- ----------------------------
DROP TABLE IF EXISTS `user-activity`;
CREATE TABLE `user-activity` (
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `act_id` varchar(12) NOT NULL COMMENT '活动ID',
  `flag` char(1) DEFAULT NULL COMMENT '0——关注的活动；1——收藏的活动；2——参加的活动；3——报名的活动',
  PRIMARY KEY (`username`,`act_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user-activity
-- ----------------------------

-- ----------------------------
-- Table structure for user-study
-- ----------------------------
DROP TABLE IF EXISTS `user-study`;
CREATE TABLE `user-study` (
  `username` varchar(16) NOT NULL,
  `std_id` varchar(12) NOT NULL,
  `flag` char(1) DEFAULT NULL,
  PRIMARY KEY (`username`,`std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user-study
-- ----------------------------

-- ----------------------------
-- Table structure for visitor
-- ----------------------------
DROP TABLE IF EXISTS `visitor`;
CREATE TABLE `visitor` (
  `username` varchar(16) NOT NULL COMMENT '访客用户名',
  `date` datetime NOT NULL COMMENT '访问时间',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitor
-- ----------------------------
