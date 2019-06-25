use `opendecision_modeler`;

/*
Navicat MySQL Data Transfer

Source Server         : 笔记本
Source Server Version : 50726
Source Host           : 192.168.199.117:3306
Source Database       : opendecision_modeler

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-06-24 23:56:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dataset
-- ----------------------------
DROP TABLE IF EXISTS `dataset`;
CREATE TABLE `dataset` (
  `id` varchar(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for datasource
-- ----------------------------
DROP TABLE IF EXISTS `datasource`;
CREATE TABLE `datasource` (
  `id` varchar(20) NOT NULL,
  `parentId` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `size` double DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `id` varchar(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `algorithm` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `evaluator_version` varchar(255) DEFAULT NULL,
  `size` double DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for model_group
-- ----------------------------
DROP TABLE IF EXISTS `model_group`;
CREATE TABLE `model_group` (
  `id` varchar(20) NOT NULL,
  `parentId` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for model_tag
-- ----------------------------
DROP TABLE IF EXISTS `model_tag`;
CREATE TABLE `model_tag` (
  `id` varchar(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for model_version
-- ----------------------------
DROP TABLE IF EXISTS `model_version`;
CREATE TABLE `model_version` (
  `id` varchar(20) NOT NULL,
  `versionId` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `algorithm` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `evaluator_version` varchar(255) DEFAULT NULL,
  `size` double DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for model_version_latest
-- ----------------------------
DROP TABLE IF EXISTS `model_version_latest`;
CREATE TABLE `model_version_latest` (
  `id` varchar(20) NOT NULL,
  `versionId` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `algorithm` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `evaluator_version` varchar(255) DEFAULT NULL,
  `size` double DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
