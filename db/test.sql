/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-01-05 09:32:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `clsId` varchar(36) NOT NULL,
  `clsName` varchar(50) NOT NULL,
  PRIMARY KEY (`clsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('001', '一班');
INSERT INTO `class` VALUES ('002', '二班');
INSERT INTO `class` VALUES ('003', '三班');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuId` varchar(36) NOT NULL,
  `stuName` varchar(50) NOT NULL,
  `stuGender` varchar(2) DEFAULT NULL,
  `clsId` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`stuId`),
  KEY `STU_CLS` (`clsId`),
  CONSTRAINT `STU_CLS` FOREIGN KEY (`clsId`) REFERENCES `class` (`clsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('96939363564257282', '张三', '男', '001');
INSERT INTO `student` VALUES ('96939363564257283', '张三2', '非男', '002');
INSERT INTO `student` VALUES ('96939363564257284', '张三1', '男', '002');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userid` varchar(36) NOT NULL,
  `userName` varchar(36) DEFAULT NULL,
  `userSex` varchar(36) DEFAULT NULL,
  `userAge` int(10) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('96939363564257285', '张三1', '1', '11');
SET FOREIGN_KEY_CHECKS=1;
