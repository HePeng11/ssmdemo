/*
Navicat MySQL Data Transfer

Source Server         : hplocal
Source Server Version : 80012
Source Host           : 127.0.0.1:3306
Source Database       : jxc

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-11-06 17:40:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sysmenus`
-- ----------------------------
DROP TABLE IF EXISTS `sysmenus`;
CREATE TABLE `sysmenus` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Text` varchar(64) DEFAULT NULL,
  `Icon` varchar(64) DEFAULT NULL,
  `Url` varchar(128) DEFAULT NULL,
  `ParentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysmenus
-- ----------------------------
INSERT INTO `sysmenus` VALUES ('1', '用户管理', 'fa fa-laptop', 'xxx', null);
INSERT INTO `sysmenus` VALUES ('2', 'xxx', 'fa fa-laptop', 'xxxxx', '1');
INSERT INTO `sysmenus` VALUES ('3', 'dddd', 'fa fa-laptop', 'sdfa', '1');
INSERT INTO `sysmenus` VALUES ('4', 'gggg', 'fa fa-laptop', 'sfdadfa', null);

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'ces', '456');
INSERT INTO `users` VALUES ('3', 'dfsad', '456');
