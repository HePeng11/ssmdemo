/*
Navicat MySQL Data Transfer

Source Server         : hplocal
Source Server Version : 80012
Source Host           : 127.0.0.1:3306
Source Database       : jxc

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-12-12 11:03:30
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysmenus
-- ----------------------------
INSERT INTO `sysmenus` VALUES ('1', '菜单管理', 'fa fa-edit', '/syssettings/menus.html', null);
INSERT INTO `sysmenus` VALUES ('2', 'xxx', 'fa fa-laptop', 'xxxxx', null);
INSERT INTO `sysmenus` VALUES ('3', 'dddd', 'fa fa-edit', 'sdfa', '2');
INSERT INTO `sysmenus` VALUES ('4', '用户管理', 'fa fa-laptop', '/syssettings/users.html', null);
INSERT INTO `sysmenus` VALUES ('5', 'dfasdg', 'fa fa-laptop', 'http://www.baidu.com', '2');
INSERT INTO `sysmenus` VALUES ('6', 'ggszzz', 'fa fa-laptop', 'sdfsad', '3');
INSERT INTO `sysmenus` VALUES ('7', 'ddd', 'fa fa-laptop', 'dddaa', null);
INSERT INTO `sysmenus` VALUES ('8', 'aaaa', null, 'aa', '2');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `realname` varchar(64) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `sex` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '管理员', '15808218540', '男');
INSERT INTO `users` VALUES ('4', 'admin19', 'e10adc3949ba59abbe56e057f20f883e', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('5', 'admin1322', '71b3b26aaa319e0cdf6fdb8429c112b0', '管理员', '15808218540', '男');
INSERT INTO `users` VALUES ('6', 'admin161f', '4a9d970a38b63f32496638e519ff34b3', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('7', 'admin16hh', '8c017104ab737fe157d2bfa7c9dac63b', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('8', 'admin1669', 'd41d8cd98f00b204e9800998ecf8427e', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('10', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('11', 'admin163', 'd41d8cd98f00b204e9800998ecf8427e', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('13', 'admin1666', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('15', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('16', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('17', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('18', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('19', 'admin169', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('20', 'admin161', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('23', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('31', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('32', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('33', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('34', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('35', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('36', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('37', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('38', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('39', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('40', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('41', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('42', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('43', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('44', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('45', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('47', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('48', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('50', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('52', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('53', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('54', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('55', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('56', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('57', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('58', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('59', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('60', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('61', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('62', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('63', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('64', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('65', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('66', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('67', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('68', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('69', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('70', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('71', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('72', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('73', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('74', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('75', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('76', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('77', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('79', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('80', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('81', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('83', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('84', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('85', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('86', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('88', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('90', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('91', 'admin16', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('92', 'admin191', '123456', '管理员', '15808218540', '女');
INSERT INTO `users` VALUES ('93', 'erqwe', 'd74682ee47c3fffd5dcd749f840fcdd4', 'hepeng', '13990073020', '男');
INSERT INTO `users` VALUES ('94', 'admin1912', 'e10adc3949ba59abbe56e057f20f883e', 'hepeng', '13990073020', '男');
