/*
Navicat MySQL Data Transfer

Source Server         : BajieSchool
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : bajie

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2016-08-30 10:33:19
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
  `act_id` int(12) NOT NULL AUTO_INCREMENT,
  `act_type` int(2) DEFAULT NULL,
  `act_title` varchar(100) NOT NULL,
  `act_content` varchar(255) DEFAULT NULL,
  `act_img` varchar(100) DEFAULT '../img/img-default-activity.jpg',
  `act_time` datetime DEFAULT NULL,
  `act_like` int(5) DEFAULT '0',
  `act_comment` int(5) DEFAULT '0',
  `act_follow` int(5) DEFAULT '0',
  `act_join` int(5) DEFAULT '0',
  `act_signup` int(5) DEFAULT '0',
  `act_place` varchar(255) DEFAULT '暂无',
  `reserve1` varchar(255) DEFAULT NULL,
  `reserve2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`act_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10011 DEFAULT CHARSET=utf8;

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
INSERT INTO `activity` VALUES ('10008', '5', '周杰伦的床边故事', '新专辑哦~', 'img/activity/act/周杰伦.jpg', '2016-08-02 14:16:32', '68742', '65654', '66871', '26545', '269462', '北京', null, null);
INSERT INTO `activity` VALUES ('10009', '6', '军训', '天气转凉快了。。', null, '2016-08-02 14:17:15', '32156', '1665', '1564', '3465', '65474', '武汉', null, null);
INSERT INTO `activity` VALUES ('10010', '7', '恋爱。。。', '你们当时都是怎么认识对方的？', null, '2016-08-22 14:17:54', '156465', '654654', '6546789', '4987', '498', null, null, null);

-- ----------------------------
-- Table structure for activity_comment
-- ----------------------------
DROP TABLE IF EXISTS `activity_comment`;
CREATE TABLE `activity_comment` (
  `act_com_id` int(12) NOT NULL,
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
  `a_c_c_id` int(12) NOT NULL COMMENT '评论ID',
  `act_com_id` int(12) NOT NULL COMMENT '原评论ID',
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
  `ag_id` int(12) NOT NULL AUTO_INCREMENT COMMENT '日程ID',
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `ag_title` varchar(50) NOT NULL COMMENT '日程标题',
  `ag_remark` varchar(50) DEFAULT NULL COMMENT '日程备注',
  `ag_time` datetime DEFAULT NULL COMMENT '开始时间',
  `ag_remind` datetime DEFAULT NULL COMMENT '提醒时间',
  `ag_show` int(1) DEFAULT '0',
  PRIMARY KEY (`ag_id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=90026 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of agenda
-- ----------------------------
INSERT INTO `agenda` VALUES ('90000', 'LucasX', '跑步', '每天早上起来跑步', '2016-08-15 08:56:47', '2016-08-22 08:56:51', '1');
INSERT INTO `agenda` VALUES ('90001', 'admin', '背单词', '每天早上起来背单词', '2016-08-15 08:56:45', '2016-08-22 08:56:53', '1');
INSERT INTO `agenda` VALUES ('90025', 'LucasX', '和婷婷看电影', '晚上去吧', '2016-08-01 10:10:00', '2016-08-01 10:00:00', '0');

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer` (
  `ans_id` int(12) NOT NULL AUTO_INCREMENT COMMENT '答案ID',
  `que_id` int(12) NOT NULL COMMENT '问题ID',
  `ans_content` varchar(255) NOT NULL COMMENT '答案内容',
  `username` varchar(16) NOT NULL COMMENT '答主用户名',
  `ans_like` int(5) DEFAULT '0' COMMENT '赞同',
  `ans_comment` int(5) DEFAULT '0' COMMENT '评论',
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
  `type` int(20) DEFAULT NULL COMMENT '收藏对象类型',
  `id` int(12) DEFAULT NULL COMMENT '收藏对象ID'
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
INSERT INTO `login_status` VALUES ('admin', '1', '2016-08-27 10:35:20');
INSERT INTO `login_status` VALUES ('LucasX', '0', '2016-08-30 09:39:49');

-- ----------------------------
-- Table structure for notification
-- ----------------------------
DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
  `no_id` int(12) NOT NULL,
  `no_content` varchar(255) DEFAULT NULL,
  `type` int(1) DEFAULT NULL,
  `no_url` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`no_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notification
-- ----------------------------

-- ----------------------------
-- Table structure for points
-- ----------------------------
DROP TABLE IF EXISTS `points`;
CREATE TABLE `points` (
  `username` varchar(16) NOT NULL,
  `point` int(8) DEFAULT NULL,
  `date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of points
-- ----------------------------
INSERT INTO `points` VALUES ('LucasX', '5', '2016-08-08 11:08:59');
INSERT INTO `points` VALUES ('LucasX', '10', '2016-08-24 11:09:35');
INSERT INTO `points` VALUES ('admin', '15', '2016-08-16 11:11:30');
INSERT INTO `points` VALUES ('admin', '20', '2016-08-16 11:11:40');

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `que_id` int(12) NOT NULL AUTO_INCREMENT COMMENT '问题ID',
  `que_title` varchar(100) NOT NULL COMMENT '问题标题',
  `que_tags` varchar(50) DEFAULT NULL COMMENT '问题标签',
  `que_content` varchar(255) DEFAULT NULL COMMENT '问题内容',
  `que_img` varchar(100) DEFAULT 'img/img-default-quora.jpg' COMMENT '图片',
  `que_like` int(5) DEFAULT '0' COMMENT '赞同数',
  `que_comment` int(5) DEFAULT '0' COMMENT '评论数',
  `que_time` datetime DEFAULT NULL,
  PRIMARY KEY (`que_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30008 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('30000', '如何入门机器学习？', '机器学习', '985在读大二，对机器学习很感兴趣，如何入门呢？', 'img/shelock.jpeg', '565', '56', '2016-08-09 19:13:15');
INSERT INTO `question` VALUES ('30001', '如何规划自己的大学生活', '大学', '大学生如何正确地规划自己的大学生活呢？好好学习，天天向上！', 'img/whu.png', '565', '4654', '2016-08-04 19:14:09');
INSERT INTO `question` VALUES ('30007', '如何入门deep learning？', null, 'rt', '', '0', '0', '2016-08-29 13:06:47');

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
  `std_id` int(12) NOT NULL AUTO_INCREMENT,
  `type_id` int(2) DEFAULT NULL,
  `std_title` varchar(100) DEFAULT NULL,
  `std_content` varchar(255) DEFAULT NULL,
  `std_like` int(5) DEFAULT '0',
  `std_comment` int(5) DEFAULT '0',
  `std_time` datetime DEFAULT NULL,
  PRIMARY KEY (`std_id`)
) ENGINE=InnoDB AUTO_INCREMENT=50018 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study
-- ----------------------------
INSERT INTO `study` VALUES ('50000', '1', '考研数学', '问一下小伙伴们，考研数学如何拿145分？', '165', '45', '2016-08-15 14:28:19');
INSERT INTO `study` VALUES ('50001', '11', '四六级。。。', '出分数了，大家情况怎么样啊', '4654', '465', '2016-08-09 14:29:08');
INSERT INTO `study` VALUES ('50002', '0', '计算机二级推荐', '推荐信息', '1321', '132', '2016-08-23 15:24:11');
INSERT INTO `study` VALUES ('50003', '0', '推荐系统', '推荐系统在电子商务中的应用', '132', '132', '2016-08-09 15:23:58');
INSERT INTO `study` VALUES ('50004', '2', 'GRE', '烤鸡。。。', '132', '132', '2016-08-17 15:24:34');
INSERT INTO `study` VALUES ('50005', '3', '高数', '傅立叶变换。。。', '498', '1265', '2016-08-23 15:25:00');
INSERT INTO `study` VALUES ('50006', '4', '二级', '有什么用么', '46', '465', '2016-08-03 15:25:23');
INSERT INTO `study` VALUES ('50007', '5', '财务管理', 'CFO。。。', '495', '288', '2016-08-01 15:25:44');
INSERT INTO `study` VALUES ('50008', '6', '生物', 'DNA。。。', '465', '98', '2016-08-09 10:18:48');
INSERT INTO `study` VALUES ('50009', '7', '机械', '机械购期末考。。。', '79', '6', '2016-08-02 10:19:15');
INSERT INTO `study` VALUES ('50010', '8', '土建', 'CAD。。CAD', '95', '65', '2016-08-26 10:20:02');
INSERT INTO `study` VALUES ('50011', '9', '经济学', '微观经济学', '79', '26', '2016-08-05 10:20:23');
INSERT INTO `study` VALUES ('50014', '2', '大学英语', '大学英语大学英语大学英语', '0', '0', '2016-08-29 14:14:44');
INSERT INTO `study` VALUES ('50015', '3', '高等数学', '高等数学', '0', '0', '2016-08-29 14:15:57');
INSERT INTO `study` VALUES ('50016', '9', '2222', '少时诵诗书', '0', '0', '2016-08-29 14:35:35');
INSERT INTO `study` VALUES ('50017', '0', '2222', '少时诵诗书', '0', '0', '2016-08-29 14:35:52');

-- ----------------------------
-- Table structure for study_reply
-- ----------------------------
DROP TABLE IF EXISTS `study_reply`;
CREATE TABLE `study_reply` (
  `std_re_id` int(12) NOT NULL AUTO_INCREMENT,
  `std_id` int(12) NOT NULL COMMENT '学习ID',
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `std_re_content` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `std_re_time` datetime DEFAULT NULL COMMENT '回复时间',
  `std_re_like` int(5) DEFAULT '0' COMMENT '赞同数',
  PRIMARY KEY (`std_re_id`)
) ENGINE=InnoDB AUTO_INCREMENT=60003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study_reply
-- ----------------------------
INSERT INTO `study_reply` VALUES ('60001', '50000', 'LucasX', '少玩游戏多读书。。', '2016-08-23 14:45:48', '4560');
INSERT INTO `study_reply` VALUES ('60002', '50000', 'admin', '火钳刘明', '2016-08-09 16:53:39', '165');

-- ----------------------------
-- Table structure for study_type
-- ----------------------------
DROP TABLE IF EXISTS `study_type`;
CREATE TABLE `study_type` (
  `type_id` int(2) NOT NULL,
  `type_name` varchar(20) NOT NULL,
  PRIMARY KEY (`type_id`,`type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study_type
-- ----------------------------
INSERT INTO `study_type` VALUES ('0', '推荐');
INSERT INTO `study_type` VALUES ('1', '考研');
INSERT INTO `study_type` VALUES ('2', '英语');
INSERT INTO `study_type` VALUES ('3', '高数');
INSERT INTO `study_type` VALUES ('4', '计算机二级');
INSERT INTO `study_type` VALUES ('5', '财会');
INSERT INTO `study_type` VALUES ('6', '生科');
INSERT INTO `study_type` VALUES ('7', '机械');
INSERT INTO `study_type` VALUES ('8', '土建');
INSERT INTO `study_type` VALUES ('9', '经管');
INSERT INTO `study_type` VALUES ('10', '考公');
INSERT INTO `study_type` VALUES ('11', '四六级');

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
  `univ_id` int(5) NOT NULL COMMENT '学校ID',
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
  `password` varchar(255) NOT NULL COMMENT '密码',
  `sex` char(4) DEFAULT NULL COMMENT '性别',
  `cellphone` char(11) NOT NULL COMMENT '手机号',
  `avatar` varchar(100) DEFAULT 'img/avatar-default-boy.png' COMMENT '头像',
  `university` int(5) NOT NULL COMMENT '大学',
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
INSERT INTO `user` VALUES ('admin', '1110831116', '21232f297a57a5a743894a0e4a801fc3', '1', '13207145966', 'img/avatar-default-boy.png', '10486', '信息管理学院', '2011', '1', '249048056', 'xulu0620', 'xldev', null, null, null, null);
INSERT INTO `user` VALUES ('LucasX', '1234567894', 'e10adc3949ba59abbe56e057f20f883e', '1', '13207145966', 'img/avatar-default-girl.png', '10486', '经济管理学院', '2016', '1', '249048056', 'xulu0620', 'xldev', null, null, null, null);

-- ----------------------------
-- Table structure for user_activity
-- ----------------------------
DROP TABLE IF EXISTS `user_activity`;
CREATE TABLE `user_activity` (
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `act_id` int(12) NOT NULL COMMENT '活动ID',
  `flag` int(1) DEFAULT NULL COMMENT '0——发布的活动；1——参加的活动；2——关注的活动；3——报名的活动',
  PRIMARY KEY (`username`,`act_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_activity
-- ----------------------------
INSERT INTO `user_activity` VALUES ('admin', '10000', '0');
INSERT INTO `user_activity` VALUES ('admin', '10001', '1');
INSERT INTO `user_activity` VALUES ('LucasX', '10002', '0');
INSERT INTO `user_activity` VALUES ('LucasX', '10003', '1');

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
-- Table structure for user_question
-- ----------------------------
DROP TABLE IF EXISTS `user_question`;
CREATE TABLE `user_question` (
  `username` varchar(16) NOT NULL,
  `que_id` int(12) NOT NULL,
  `flag` int(1) NOT NULL COMMENT '0---我的提问；1--我的回答'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_question
-- ----------------------------
INSERT INTO `user_question` VALUES ('LucasX', '30000', '0');
INSERT INTO `user_question` VALUES ('LucasX', '30001', '1');
INSERT INTO `user_question` VALUES ('LucasX', '30007', '0');

-- ----------------------------
-- Table structure for user_study
-- ----------------------------
DROP TABLE IF EXISTS `user_study`;
CREATE TABLE `user_study` (
  `username` varchar(16) NOT NULL,
  `std_id` int(12) NOT NULL,
  `flag` int(1) DEFAULT NULL COMMENT '0——发帖；1——点赞；2——评论',
  PRIMARY KEY (`username`,`std_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_study
-- ----------------------------
INSERT INTO `user_study` VALUES ('LucasX', '50000', '0');

-- ----------------------------
-- Table structure for user_studytype
-- ----------------------------
DROP TABLE IF EXISTS `user_studytype`;
CREATE TABLE `user_studytype` (
  `username` varchar(16) NOT NULL,
  `stu_type` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_studytype
-- ----------------------------
INSERT INTO `user_studytype` VALUES ('admin', '0');
INSERT INTO `user_studytype` VALUES ('admin', '6');
INSERT INTO `user_studytype` VALUES ('admin', '7');
INSERT INTO `user_studytype` VALUES ('admin', '8');
INSERT INTO `user_studytype` VALUES ('admin', '9');
INSERT INTO `user_studytype` VALUES ('admin', '5');
INSERT INTO `user_studytype` VALUES ('LucasX', '0');
INSERT INTO `user_studytype` VALUES ('LucasX', '3');

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
-- View structure for question_view
-- ----------------------------
DROP VIEW IF EXISTS `question_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `question_view` AS select `question`.`que_id` AS `que_id`,`question`.`que_img` AS `que_img`,`question`.`que_title` AS `que_title`,`question`.`que_time` AS `que_time`,`question`.`que_content` AS `que_content`,`question`.`que_like` AS `que_like`,`question`.`que_comment` AS `que_comment` from `question` ;

-- ----------------------------
-- View structure for user_activity_view
-- ----------------------------
DROP VIEW IF EXISTS `user_activity_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `user_activity_view` AS select `act`.`act_id` AS `act_id`,`act`.`act_title` AS `act_title`,`act`.`act_content` AS `act_content`,`act`.`act_img` AS `act_img`,`act`.`act_time` AS `act_time`,`act`.`act_like` AS `act_like`,`act`.`act_comment` AS `act_comment` from ((`activity` `act` join `user_activity`) join `login_status`) where ((`user_activity`.`act_id` = `act`.`act_id`) and (`user_activity`.`username` = `login_status`.`username`) and (`login_status`.`status` = 0)) ;
