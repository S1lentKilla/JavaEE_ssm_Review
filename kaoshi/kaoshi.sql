/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.40 : Database - ssm_kaoshi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm_kaoshi` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `ssm_kaoshi`;

/*Table structure for table `signon` */

DROP TABLE IF EXISTS `signon`;

CREATE TABLE `signon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `jobs` varchar(50) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `signon` */

insert  into `signon`(`id`,`username`,`jobs`,`phone`) values (1,'joy','doctor','13745874578'),(2,'jack','teacher','13521210112'),(3,'tom','worker','15179405961'),(4,'lisi','worker','12345678901'),(5,'zhangsan','teacher','12345678901'),(6,'wangwu','author','13688888888'),(8,'admin','student','12345678902'),(9,'admin','student','12345678902'),(10,'admin','student','12345678902'),(11,'admin','student','12345678902'),(12,'admin','student','12345678902'),(13,'admin','student','12345678902');

/*Table structure for table `tb_book` */

DROP TABLE IF EXISTS `tb_book`;

CREATE TABLE `tb_book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `press` varchar(32) DEFAULT NULL,
  `author` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tb_book` */

insert  into `tb_book`(`id`,`name`,`press`,`author`) values (1,'JavaEE应用','人民邮电出版社','黑马');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
