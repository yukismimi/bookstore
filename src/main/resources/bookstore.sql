/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : bookstore

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 27/02/2019 08:06:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for admin_security_question
-- ----------------------------
DROP TABLE IF EXISTS `admin_security_question`;
CREATE TABLE `admin_security_question`  (
  `admin_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `question_no` int(2) NULL DEFAULT NULL,
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for adress
-- ----------------------------
DROP TABLE IF EXISTS `adress`;
CREATE TABLE `adress`  (
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dictrict` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zipcode` int(6) NULL DEFAULT NULL,
  `adress_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver_phone_number` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` int(255) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  `stock` int(255) NOT NULL,
  `press` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `other_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `on_sell_status` int(255) NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, 'ジョジョの奇妙な冒険', '荒木飛呂彦', 680.00, 100, '集英社', '冒険の物語！', 1);

-- ----------------------------
-- Table structure for book_label
-- ----------------------------
DROP TABLE IF EXISTS `book_label`;
CREATE TABLE `book_label`  (
  `book_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `label` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for favourite
-- ----------------------------
DROP TABLE IF EXISTS `favourite`;
CREATE TABLE `favourite`  (
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for recharge_record
-- ----------------------------
DROP TABLE IF EXISTS `recharge_record`;
CREATE TABLE `recharge_record`  (
  `recharge_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `recharge_time` datetime(6) NOT NULL,
  `recharge_status` int(2) NOT NULL,
  `delete_flag` int(1) NOT NULL,
  PRIMARY KEY (`recharge_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for security_question
-- ----------------------------
DROP TABLE IF EXISTS `security_question`;
CREATE TABLE `security_question`  (
  `question_no` int(2) NOT NULL,
  `question_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`question_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for shopping_cart
-- ----------------------------
DROP TABLE IF EXISTS `shopping_cart`;
CREATE TABLE `shopping_cart`  (
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `amount` int(4) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for status
-- ----------------------------
DROP TABLE IF EXISTS `status`;
CREATE TABLE `status`  (
  `status_id` int(2) NOT NULL,
  `status_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`status_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for transaction
-- ----------------------------
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction`  (
  `order_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_time` datetime(6) NOT NULL,
  `order_status` int(2) NOT NULL,
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `unit_price` decimal(10, 2) NOT NULL,
  `total_price` decimal(10, 2) NOT NULL,
  `amount` int(4) NOT NULL,
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dictrict` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zipcode` int(6) NULL DEFAULT NULL,
  `adress_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver_phone_number` int(11) NULL DEFAULT NULL,
  `other_message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `delete_flag` int(1) NOT NULL,
  PRIMARY KEY (`order_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(255) NULL DEFAULT NULL,
  `gender` int(255) NULL DEFAULT NULL,
  `mail_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `other_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_security_question
-- ----------------------------
DROP TABLE IF EXISTS `user_security_question`;
CREATE TABLE `user_security_question`  (
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `question_no` int(2) NULL DEFAULT NULL,
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
