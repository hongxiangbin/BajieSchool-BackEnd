/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : bajieschool

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2016-08-18 18:27:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for testUser
-- ----------------------------
DROP TABLE IF EXISTS `testUser`;
CREATE TABLE `testUser` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testUser
-- ----------------------------
INSERT INTO `testUser` VALUES ('1', 'abn', 'qwe');
INSERT INTO `testUser` VALUES ('2', 'sd', 'CS');
