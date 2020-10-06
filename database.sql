CREATE DATABASE `springboot`;

USE `springboot`;

DROP TABLE IF EXISTS `t_stu`;

CREATE TABLE `t_stu` (
                          `stuId` varchar(10) NOT NULL COMMENT '学号',
                          `name` varchar(10) DEFAULT NULL COMMENT '姓名',
                          `department` varchar(10) DEFAULT NULL COMMENT '院系',
                          `major` varchar(10) DEFAULT NULL COMMENT '专业',
                           PRIMARY KEY (`stuId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
