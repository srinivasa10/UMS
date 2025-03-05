-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: universitymanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fee`
--

DROP TABLE IF EXISTS `fee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fee` (
  `course` varchar(20) DEFAULT NULL,
  `semester1` varchar(20) DEFAULT NULL,
  `semester2` varchar(20) DEFAULT NULL,
  `semester3` varchar(20) DEFAULT NULL,
  `semester4` varchar(20) DEFAULT NULL,
  `semester5` varchar(20) DEFAULT NULL,
  `semester6` varchar(20) DEFAULT NULL,
  `semester7` varchar(20) DEFAULT NULL,
  `semester8` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee`
--

LOCK TABLES `fee` WRITE;
/*!40000 ALTER TABLE `fee` DISABLE KEYS */;
INSERT INTO `fee` VALUES ('BTech','120000','100000','100000','100000','100000','100000','100000','100000'),('Bsc','80000','75000','75000','75000','75000','75000','',''),('BCA','75000','70000','70000','70000','70000','70000','',''),('MTech','130000','100000','100000','100000','','','',''),('MSc','85000','82000','82000','820000','','','',''),('MCA','80000','78000','78000','78000','','','',''),('Bcom','60000','55000','55000','55000','55000','55000','',''),('Mcom','65000','58000','58000','58000','','','','');
/*!40000 ALTER TABLE `fee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-26 23:30:56
