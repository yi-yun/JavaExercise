/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50600
Source Host           : localhost:3306
Source Database       : exam

Target Server Type    : MYSQL
Target Server Version : 50600
File Encoding         : 65001

Date: 2019-06-21 10:34:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL,
  `dname` varchar(50) DEFAULT NULL,
  `loc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('10', '教研部', '杭州');
INSERT INTO `dept` VALUES ('20', '学工部', '上海');
INSERT INTO `dept` VALUES ('30', '销售部', '广州');
INSERT INTO `dept` VALUES ('40', '财务部', '武汉');

-- ----------------------------
-- Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(11) NOT NULL,
  `ename` varchar(50) DEFAULT NULL,
  `job` varchar(50) DEFAULT NULL,
  `mgr` int(11) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` decimal(7,2) DEFAULT NULL,
  `COMM` decimal(7,2) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`),
  KEY `fk_emp` (`mgr`),
  CONSTRAINT `fk_emp` FOREIGN KEY (`mgr`) REFERENCES `emp` (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1001', '甘宁', '文员', '1013', '2000-12-17', '8000.00', null, '20');
INSERT INTO `emp` VALUES ('1002', '黛绮丝', '销售员', '1006', '2001-02-20', '16000.00', '3000.00', '30');
INSERT INTO `emp` VALUES ('1003', '殷天正', '销售员', '1006', '2001-02-22', '12500.00', '5000.00', '30');
INSERT INTO `emp` VALUES ('1004', '刘备', '经理', '1009', '2001-04-02', '29750.00', null, '20');
INSERT INTO `emp` VALUES ('1005', '谢逊', '销售员', '1006', '2001-09-28', '12500.00', '14000.00', '30');
INSERT INTO `emp` VALUES ('1006', '关羽', '经理', '1009', '2001-05-01', '28500.00', null, '30');
INSERT INTO `emp` VALUES ('1007', '张飞', '经理', '1009', '2001-09-01', '24500.00', null, '10');
INSERT INTO `emp` VALUES ('1008', '诸葛亮', '分析师', '1004', '2007-04-19', '30000.00', null, '20');
INSERT INTO `emp` VALUES ('1009', '曾阿牛', '董事长', null, '2001-11-17', '50000.00', null, '10');
INSERT INTO `emp` VALUES ('1010', '韦一笑', '销售员', '1006', '2001-09-08', '15000.00', '0.00', '30');
INSERT INTO `emp` VALUES ('1011', '周泰', '文员', '1008', '2007-05-23', '11000.00', null, '20');
INSERT INTO `emp` VALUES ('1012', '程普', '文员', '1006', '2001-12-03', '9500.00', null, '30');
INSERT INTO `emp` VALUES ('1013', '庞统', '分析师', '1004', '2001-12-03', '30000.00', null, '20');
INSERT INTO `emp` VALUES ('1014', '黄盖', '文员', '1007', '2002-01-23', '13000.00', null, '10');
INSERT INTO `emp` VALUES ('1015', '张三', '保洁员', '1001', '2013-05-01', '80000.00', '50000.00', '50');

-- ----------------------------
-- Table structure for `salgrade`
-- ----------------------------
DROP TABLE IF EXISTS `salgrade`;
CREATE TABLE `salgrade` (
  `grade` int(11) NOT NULL,
  `losal` int(11) DEFAULT NULL,
  `hisal` int(11) DEFAULT NULL,
  PRIMARY KEY (`grade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salgrade
-- ----------------------------
INSERT INTO `salgrade` VALUES ('1', '7000', '12000');
INSERT INTO `salgrade` VALUES ('2', '12010', '14000');
INSERT INTO `salgrade` VALUES ('3', '14010', '20000');
INSERT INTO `salgrade` VALUES ('4', '20010', '30000');
INSERT INTO `salgrade` VALUES ('5', '30010', '99990');

-- ----------------------------
-- Table structure for `stu`
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `sid` int(11) NOT NULL,
  `sname` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gander` varchar(10) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL,
  `tuition` int(11) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('1', '王永', '23', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('2', '张雷', '25', '男', '辽宁', '2500');
INSERT INTO `stu` VALUES ('3', '李强', '22', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('4', '宋永合', '25', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('5', '叙美丽', '23', '女', '北京', '1000');
INSERT INTO `stu` VALUES ('6', '陈宁', '22', '女', '山东', '2500');
INSERT INTO `stu` VALUES ('7', '王丽', '21', '女', '北京', '1600');
INSERT INTO `stu` VALUES ('8', '李永', '23', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('9', '张玲', '23', '女', '广州', '2500');
INSERT INTO `stu` VALUES ('10', '啊历', '18', '男', '山西', '3500');
INSERT INTO `stu` VALUES ('11', '王刚', '23', '男', '湖北', '4500');
INSERT INTO `stu` VALUES ('12', '陈永', '24', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('13', '李雷', '24', '男', '辽宁', '2500');
INSERT INTO `stu` VALUES ('14', '李沿', '22', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('15', '王小明', '25', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('16', '王小丽', '23', '女', '北京', '1000');
INSERT INTO `stu` VALUES ('17', '唐宁', '22', '女', '山东', '2500');
INSERT INTO `stu` VALUES ('18', '唐丽', '21', '女', '北京', '1600');
INSERT INTO `stu` VALUES ('19', '啊永', '23', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('20', '唐玲', '23', '女', '广州', '2500');
INSERT INTO `stu` VALUES ('21', '叙刚', '18', '男', '山西', '3500');
INSERT INTO `stu` VALUES ('22', '王累', '23', '男', '湖北', '4500');
INSERT INTO `stu` VALUES ('23', '赵安', '23', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('24', '关雷', '25', '男', '辽宁', '2500');
INSERT INTO `stu` VALUES ('25', '李字', '22', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('26', '叙安国', '25', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('27', '陈浩难', '23', '女', '北京', '1000');
INSERT INTO `stu` VALUES ('28', '陈明', '22', '女', '山东', '2500');
INSERT INTO `stu` VALUES ('29', '孙丽', '21', '女', '北京', '1600');
INSERT INTO `stu` VALUES ('30', '李治国', '23', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('31', '张娜', '23', '女', '广州', '2500');
INSERT INTO `stu` VALUES ('32', '安强', '18', '男', '山西', '3500');
INSERT INTO `stu` VALUES ('33', '王欢', '23', '男', '湖北', '4500');
INSERT INTO `stu` VALUES ('34', '周天乐', '23', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('35', '关雷', '25', '男', '辽宁', '2500');
INSERT INTO `stu` VALUES ('36', '吴强', '22', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('37', '吴合国', '25', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('38', '正小和', '23', '女', '北京', '1000');
INSERT INTO `stu` VALUES ('39', '吴丽', '22', '女', '山东', '2500');
INSERT INTO `stu` VALUES ('40', '冯含', '21', '女', '北京', '1600');
INSERT INTO `stu` VALUES ('41', '陈冬', '23', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('42', '关玲', '23', '女', '广州', '2500');
INSERT INTO `stu` VALUES ('43', '包利', '18', '男', '山西', '3500');
INSERT INTO `stu` VALUES ('44', '威刚', '23', '男', '湖北', '4500');
INSERT INTO `stu` VALUES ('45', '李永', '23', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('46', '张关雷', '25', '男', '辽宁', '2500');
INSERT INTO `stu` VALUES ('47', '送小强', '22', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('48', '关动林', '25', '男', '北京', '1500');
INSERT INTO `stu` VALUES ('49', '苏小哑', '23', '女', '北京', '1000');
INSERT INTO `stu` VALUES ('50', '赵宁', '22', '女', '山东', '2500');
INSERT INTO `stu` VALUES ('51', '陈丽', '21', '女', '北京', '1600');
INSERT INTO `stu` VALUES ('52', '钱小刚', '23', '男', '北京', '3500');
INSERT INTO `stu` VALUES ('53', '艾林', '23', '女', '广州', '2500');
INSERT INTO `stu` VALUES ('54', '郭林', '18', '男', '山西', '3500');
INSERT INTO `stu` VALUES ('55', '周制强', '23', '男', '湖北', '4500');
