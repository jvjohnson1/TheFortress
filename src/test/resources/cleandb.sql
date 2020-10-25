-- MySQL dump 10.13  Distrib 8.0.16, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: FortDev
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Roles`
--

DROP TABLE IF EXISTS `Roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Roles` (
  `roleID` int(11) NOT NULL AUTO_INCREMENT,
  `userName` text,
  `roleName` text,
  PRIMARY KEY (`roleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Roles`
--

LOCK TABLES `Roles` WRITE;
/*!40000 ALTER TABLE `Roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `Roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Soldier`
--

DROP TABLE IF EXISTS `Soldier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Soldier` (
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(30) DEFAULT NULL,
  `userName` varchar(30) DEFAULT NULL,
  `soldierRank` varchar(15) DEFAULT NULL,
  `soldierID` int(11) NOT NULL,
  `platoonNumber` int(11) DEFAULT NULL,
  `password` text,
  PRIMARY KEY (`soldierID`),
  UNIQUE KEY `Soldier_soldierID_uindex` (`soldierID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Soldier`
--

LOCK TABLES `Soldier` WRITE;
/*!40000 ALTER TABLE `Soldier` DISABLE KEYS */;
INSERT INTO `Soldier` VALUES ('Tony','Morris','tmorris','Private',13289,2,'password123'),('Laura','Richards','lrichards','Private',24816,1,'Madison'),('Aaron','Miller','amiller','Private',32839,3,'College'),('Jean','Jones','jjones','Private',42129,1,'Bearsfan'),('Brett','Cooper','bcooper','Private',42819,3,'ILoveCats'),('John','Rogers','jrogers','Private',63975,3,'tooeasy'),('Allen','Turner','aturner','Private',64822,2,'mydogLucy'),('Keith','Forde','kforde','Private',83200,3,'secret'),('Lisa','Volks','lvolks','Captain',86328,0,'K%f(x@fp*wY^cp'),('Tony','Smith','tsmith','Lieutenant',89274,3,'V!King5f@N'),('Jason','Jackson','jjackson','Private',92473,2,'jjackson!'),('Beth','Soe','bsoe','Private',93450,2,'mysecret'),('Linda','Wisse','lwisse','Lieutenant',93625,2,'mR_r0B0T@o'),('Steve','Walters','swalters','Private',94722,1,'mynameisSteve'),('Mark','Collins','mcollins','Lieutenant',98372,1,'mI55i$$!Ppi');
/*!40000 ALTER TABLE `Soldier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-25 12:24:40
