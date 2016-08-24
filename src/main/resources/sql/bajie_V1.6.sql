/*
Navicat MySQL Data Transfer

Source Server         : BajieSchool
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : bajie

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2016-08-24 17:58:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for accusation
-- ----------------------------
DROP TABLE IF EXISTS `accusation`;
CREATE TABLE `accusation` (
  `informant` varchar(16) NOT NULL,
  `against` varchar(16) NOT NULL,
  `content` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`informant`,`against`,`content`,`date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of accusation
-- ----------------------------
INSERT INTO `accusation` VALUES ('admin', 'admin', '人身攻击', '2016-08-23 18:09:05');
INSERT INTO `accusation` VALUES ('admin', 'dasda', 'dad', '2016-08-23 18:16:20');
INSERT INTO `accusation` VALUES ('admin', 'xxx', 'qqq', '2016-08-23 18:16:01');

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
INSERT INTO `activity` VALUES ('10000', '0', '周杰伦演唱会', '8月17日，周杰伦将在武汉光谷广场举办演唱会', 'img/activity/act/周杰伦.jpg', '2016-08-16 14:49:44', '520', '2465', '249', '125', '154', '湖北武汉', null, null);
INSERT INTO `activity` VALUES ('10001', '0', '科技展览', 'VR，无人机，无人驾驶，机器人等在武汉大学开办展会', 'img/activity/act/科技展览.jpeg', '2016-08-15 14:49:44', '52', '255', '199', '125', '174', '湖北武汉', null, null);
INSERT INTO `activity` VALUES ('10002', '0', '数学建模大赛', '阿里巴巴天池大数据竞赛', 'img/activity/act/阿里巴巴.jpg', '2016-08-14 14:49:44', '52', '255', '1699', '125', '174', '浙江杭州', null, null);
INSERT INTO `activity` VALUES ('10003', '1', '黄河落日', '大漠孤烟直，长河落日圆', 'img/activity/tabs/旅游/1.jpg', '2016-08-09 17:51:26', '26', '68', '44', '48', '156', '甘肃', null, null);
INSERT INTO `activity` VALUES ('10004', '1', '丽江水', '丽江大学生组团游，有兴趣的小伙伴一起约在华科聊一聊', 'img/activity/tabs/旅游/2.jpg', '2016-08-08 17:52:30', '154', '65', '165', '565', '56', '桂林', null, null);
INSERT INTO `activity` VALUES ('10005', '2', '武汉大学校庆', '珞珈山的小伙伴们，躁起来~~~', 'img/whu.png', '2016-08-16 17:54:33', '1554', '65', '56564', '4654', '565', '湖北武汉', null, null);
INSERT INTO `activity` VALUES ('10006', '3', '周杰伦演唱会', '有一起的小伙伴么？', 'img/activity/tabs/明星/1.jpg', '2016-08-16 17:55:56', '46545', '4564', '54654', '9846', '4654', '北京', null, null);
INSERT INTO `activity` VALUES ('10007', '4', '鹿晗最新电影', '盗墓笔记，大家都看了吗？', 'img/activity/tabs/电影/1.jpg', '2016-08-08 17:56:36', '1654', '4654', '126', '98', '5656', '北京', null, null);

-- ----------------------------
-- Table structure for activity_comment
-- ----------------------------
DROP TABLE IF EXISTS `activity_comment`;
CREATE TABLE `activity_comment` (
  `act_com_id` varchar(12) NOT NULL,
  `username` varchar(16) NOT NULL,
  `act_com_content` varchar(255) DEFAULT NULL,
  `act-com_time` datetime DEFAULT NULL,
  `act_com_like` int(5) DEFAULT NULL,
  PRIMARY KEY (`act_com_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity_comment
-- ----------------------------

-- ----------------------------
-- Table structure for activity_comment_comment
-- ----------------------------
DROP TABLE IF EXISTS `activity_comment_comment`;
CREATE TABLE `activity_comment_comment` (
  `a_c_c_id` varchar(12) NOT NULL COMMENT '评论ID',
  `act_com_id` varchar(12) NOT NULL COMMENT '原评论ID',
  `username` varchar(16) NOT NULL COMMENT '评论用户',
  `a_c_c_content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `a_c_c_time` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`a_c_c_id`,`act_com_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity_comment_comment
-- ----------------------------

-- ----------------------------
-- Table structure for activity_type
-- ----------------------------
DROP TABLE IF EXISTS `activity_type`;
CREATE TABLE `activity_type` (
  `act_type_id` int(2) NOT NULL,
  `act_type_name` varchar(20) NOT NULL,
  PRIMARY KEY (`act_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity_type
-- ----------------------------
INSERT INTO `activity_type` VALUES ('0', '推荐');
INSERT INTO `activity_type` VALUES ('1', '旅游');
INSERT INTO `activity_type` VALUES ('2', '高校');
INSERT INTO `activity_type` VALUES ('3', '明星');
INSERT INTO `activity_type` VALUES ('4', '电影');
INSERT INTO `activity_type` VALUES ('5', '音乐');
INSERT INTO `activity_type` VALUES ('6', '体育');
INSERT INTO `activity_type` VALUES ('7', '恋爱');

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
INSERT INTO `agenda` VALUES ('90000', 'LucasX', '跑步', '每天早上起来跑步', '2016-08-15 08:56:47', '2016-08-22 08:56:51');
INSERT INTO `agenda` VALUES ('90001', 'admin', '背单词', '每天早上起来背单词', '2016-08-15 08:56:45', '2016-08-22 08:56:53');

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
-- Table structure for banner
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `href` varchar(50) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES ('https://www.baidu.com', 'img/activity/ad/4.jpg');
INSERT INTO `banner` VALUES ('http://www.qq.com/', 'img/activity/ad/3.jpg');
INSERT INTO `banner` VALUES ('https://www.douban.com/', 'img/activity/ad/2.jpg');
INSERT INTO `banner` VALUES ('https://www.zhihu.com/', 'img/activity/ad/1.jpg');

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
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `username` varchar(16) NOT NULL,
  `content` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `qq` varchar(11) DEFAULT NULL,
  `wechat` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `reserve1` varchar(255) DEFAULT NULL,
  `reserve2` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES ('admin', '亲，APP太卡了呀~ T_T', '2016-08-23 17:18:12', '249048056', 'xulu0620', 'xulu0620@qq.com', '', '');
INSERT INTO `feedback` VALUES ('admin', '亲，APP太卡了呀~ T_T', '2016-08-23 17:18:46', '249048056', 'xulu0620', '', '', '');
INSERT INTO `feedback` VALUES ('admin', '不好看', '2016-08-23 17:20:35', '10086', '1231', '1231@qq.com', '', '');
INSERT INTO `feedback` VALUES ('admin', '卡卡卡卡啊卡卡', '2016-08-23 17:29:55', '', '10001', null, '', '');

-- ----------------------------
-- Table structure for login_status
-- ----------------------------
DROP TABLE IF EXISTS `login_status`;
CREATE TABLE `login_status` (
  `username` varchar(16) NOT NULL,
  `status` int(1) NOT NULL,
  `logintime` datetime DEFAULT NULL,
  PRIMARY KEY (`username`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login_status
-- ----------------------------
INSERT INTO `login_status` VALUES ('admin', '1', '2016-08-24 11:19:36');
INSERT INTO `login_status` VALUES ('LucasX', '0', '2016-08-24 16:10:29');

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
  `que_tags` varchar(50) DEFAULT NULL COMMENT '问题标签',
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
-- Table structure for study_reply
-- ----------------------------
DROP TABLE IF EXISTS `study_reply`;
CREATE TABLE `study_reply` (
  `std_id` varchar(12) NOT NULL COMMENT '学习ID',
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `std_re_content` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `std_re_time` datetime DEFAULT NULL COMMENT '回复时间',
  `std_re_like` int(5) DEFAULT NULL COMMENT '赞同数',
  PRIMARY KEY (`std_id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study_reply
-- ----------------------------

-- ----------------------------
-- Table structure for study_type
-- ----------------------------
DROP TABLE IF EXISTS `study_type`;
CREATE TABLE `study_type` (
  `type_id` varchar(12) NOT NULL,
  `type_name` varchar(20) NOT NULL,
  PRIMARY KEY (`type_id`,`type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study_type
-- ----------------------------
INSERT INTO `study_type` VALUES ('50000', '推荐');
INSERT INTO `study_type` VALUES ('50001', '考研');
INSERT INTO `study_type` VALUES ('50002', '英语');
INSERT INTO `study_type` VALUES ('50003', '高数');
INSERT INTO `study_type` VALUES ('50004', '计算机二级');
INSERT INTO `study_type` VALUES ('50005', '财会');
INSERT INTO `study_type` VALUES ('50006', '生科');
INSERT INTO `study_type` VALUES ('50007', '机械');
INSERT INTO `study_type` VALUES ('50008', '土建');
INSERT INTO `study_type` VALUES ('50009', '经管');
INSERT INTO `study_type` VALUES ('50010', '考公');
INSERT INTO `study_type` VALUES ('50011', '四六级');

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', 'ewqe', 'ewq');

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
INSERT INTO `university` VALUES ('10486', '武汉大学');
INSERT INTO `university` VALUES ('10500', '湖北工业大学');

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
INSERT INTO `user` VALUES ('admin', '1110831116', 'admin', '1', '13207145966', null, '10486', '信息管理学院', '2011', '1', '249048056', 'xulu0620', 'xldev', null, null, null, null);
INSERT INTO `user` VALUES ('LucasX', '1234567894', '123456', '1', '13207145966', null, '10486', '经济管理学院', '2016', '1', '249048056', 'xulu0620', 'xldev', null, null, null, null);

-- ----------------------------
-- Table structure for user_activity
-- ----------------------------
DROP TABLE IF EXISTS `user_activity`;
CREATE TABLE `user_activity` (
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `act_id` varchar(12) NOT NULL COMMENT '活动ID',
  `flag` char(1) DEFAULT NULL COMMENT '0——关注的活动；1——收藏的活动；2——参加的活动；3——报名的活动',
  PRIMARY KEY (`username`,`act_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_activity
-- ----------------------------
INSERT INTO `user_activity` VALUES ('admin', '10000', '0');
INSERT INTO `user_activity` VALUES ('admin', '10001', '0');
INSERT INTO `user_activity` VALUES ('LucasX', '10002', '0');

-- ----------------------------
-- Table structure for user_acttype
-- ----------------------------
DROP TABLE IF EXISTS `user_acttype`;
CREATE TABLE `user_acttype` (
  `username` varchar(16) NOT NULL,
  `act_type_id` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_acttype
-- ----------------------------
INSERT INTO `user_acttype` VALUES ('LucasX', '0');
INSERT INTO `user_acttype` VALUES ('LucasX', '1');
INSERT INTO `user_acttype` VALUES ('LucasX', '2');
INSERT INTO `user_acttype` VALUES ('LucasX', '3');
INSERT INTO `user_acttype` VALUES ('LucasX', '4');

-- ----------------------------
-- Table structure for user_study
-- ----------------------------
DROP TABLE IF EXISTS `user_study`;
CREATE TABLE `user_study` (
  `username` varchar(16) NOT NULL,
  `std_id` varchar(12) NOT NULL,
  `flag` char(1) DEFAULT NULL,
  PRIMARY KEY (`username`,`std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_study
-- ----------------------------

-- ----------------------------
-- Table structure for user_studytype
-- ----------------------------
DROP TABLE IF EXISTS `user_studytype`;
CREATE TABLE `user_studytype` (
  `username` varchar(16) NOT NULL,
  `stu_type` varchar(12) NOT NULL,
  PRIMARY KEY (`username`,`stu_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_studytype
-- ----------------------------
INSERT INTO `user_studytype` VALUES ('admin', '50000');
INSERT INTO `user_studytype` VALUES ('admin', '50001');
INSERT INTO `user_studytype` VALUES ('admin', '50002');
INSERT INTO `user_studytype` VALUES ('admin', '50003');
INSERT INTO `user_studytype` VALUES ('admin', '50004');
INSERT INTO `user_studytype` VALUES ('admin', '50008');
INSERT INTO `user_studytype` VALUES ('LucasX', '50011');

-- ----------------------------
-- Table structure for visitor
-- ----------------------------
DROP TABLE IF EXISTS `visitor`;
CREATE TABLE `visitor` (
  `username` varchar(16) NOT NULL COMMENT '访客用户名',
  `visitor` varchar(16) NOT NULL,
  `date` datetime NOT NULL COMMENT '访问时间',
  PRIMARY KEY (`date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitor
-- ----------------------------
INSERT INTO `visitor` VALUES ('LucasX', '9', '2016-08-18 14:26:09');
INSERT INTO `visitor` VALUES ('LucasX', '9', '2016-08-19 12:26:09');
INSERT INTO `visitor` VALUES ('LucasX', '9', '2016-08-20 12:26:09');
INSERT INTO `visitor` VALUES ('LucasX', '9', '2016-08-21 11:26:09');
INSERT INTO `visitor` VALUES ('LucasX', '11', '2016-08-22 10:26:09');
INSERT INTO `visitor` VALUES ('LucasX', '6', '2016-08-23 10:15:09');
INSERT INTO `visitor` VALUES ('LucasX', '2', '2016-08-24 10:15:09');

-- ----------------------------
-- View structure for activity_view
-- ----------------------------
DROP VIEW IF EXISTS `activity_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `activity_view` AS select `activity`.`act_id` AS `act_id`,`activity`.`act_type` AS `act_type`,`activity`.`act_title` AS `act_title`,`activity`.`act_content` AS `act_content`,`activity`.`act_img` AS `act_img`,`activity`.`act_time` AS `act_time`,`activity`.`act_like` AS `act_like`,`activity`.`act_comment` AS `act_comment` from `activity` ;

-- ----------------------------
-- View structure for user_activity_view
-- ----------------------------
DROP VIEW IF EXISTS `user_activity_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `user_activity_view` AS select `act`.`act_id` AS `act_id`,`act`.`act_title` AS `act_title`,`act`.`act_content` AS `act_content`,`act`.`act_img` AS `act_img`,`act`.`act_time` AS `act_time`,`act`.`act_like` AS `act_like`,`act`.`act_comment` AS `act_comment` from ((`activity` `act` join `user_activity`) join `login_status`) where ((`user_activity`.`act_id` = `act`.`act_id`) and (`user_activity`.`username` = `login_status`.`username`) and (`login_status`.`status` = 0)) ;
