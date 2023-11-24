-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: sistemavendajogos
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Ação','Jogos de ação com muita adrenalina e combates intensos.'),(2,'Aventura','Jogos de aventura com narrativas envolventes e exploração.'),(3,'RPG','Jogos de interpretação de papéis com árvores de habilidades e escolhas impactantes.'),(4,'Estratégia','Jogos de estratégia que desafiam sua mente e tomada de decisão.'),(5,'Esportes','Jogos de esportes que simulam competições esportivas.'),(6,'Corrida','Jogos de corrida de alta velocidade e derrapagens emocionantes.'),(7,'Simulação','Jogos de simulação que replicam a vida real ou situações específicas.'),(8,'Quebra-Cabeça','Jogos de quebra-cabeça com desafios lógicos e enigmas.'),(9,'Tiro em Primeira Pessoa','Jogos de tiro em primeira pessoa com tiroteios realistas.'),(10,'Tiro em Terceira Pessoa','Jogos de tiro em terceira pessoa com visão ampla.'),(11,'Luta','Jogos de luta com combates corpo a corpo.'),(12,'Horror','Jogos de horror com sustos e atmosfera assustadora.'),(13,'Mundo Aberto','Jogos de mundo aberto com vastos ambientes exploráveis.'),(14,'Cooperativo','Jogos cooperativos que podem ser jogados com amigos.'),(15,'Online','Jogos online multiplayer com competição ou cooperação.'),(16,'Plataforma','Jogos de plataforma com saltos e desafios acrobáticos.'),(17,'Retro','Jogos retrô que relembram a era dos 8 ou 16 bits.'),(18,'Educativo','Jogos educativos para aprendizado e desenvolvimento.'),(19,'Construção','Jogos de construção e gerenciamento.'),(20,'Cartas e Tabuleiro','Jogos de cartas e tabuleiro digitais.'),(21,'Música e Ritmo','Jogos de música e ritmo para testar suas habilidades musicais.'),(22,'História Interativa','Jogos de história interativa com escolhas significativas.'),(23,'Artes Marciais','Jogos de artes marciais com lutas e técnicas especiais.'),(24,'Ficção Científica','Jogos de ficção científica com elementos futuristas.'),(25,'Fantasia','Jogos de fantasia com mundos mágicos e seres fantásticos.'),(26,'Comédia','Jogos que exploram elementos cômicos e humorísticos.'),(27,'Investigação','Jogos de investigação com mistérios a serem desvendados.'),(28,'Construção de Cidades','Jogos que envolvem a construção e gerenciamento de cidades.'),(29,'Esportes Radicais','Jogos que destacam esportes radicais e atividades extremas.'),(30,'Sobrevivência','Jogos de sobrevivência onde a luta pela vida é constante.'),(31,'Stealth','Jogos de stealth que exigem furtividade e habilidades táticas.'),(32,'Anime','Jogos com estética e temática inspiradas em animes.'),(33,'Simulação de Vida','Jogos de simulação de vida cotidiana.'),(34,'Multiplayer Local','Jogos multiplayer que podem ser jogados em modo local.'),(35,'Ficção Histórica','Jogos que exploram eventos e cenários históricos fictícios.'),(36,'Jogos de Cartas Colecionáveis','Jogos com mecânicas de cartas colecionáveis.'),(37,'Jogos de Tabuleiro Digitais','Jogos digitais baseados em jogos de tabuleiro clássicos.'),(38,'Romance','Jogos com foco em narrativas românticas e relacionamentos.'),(39,'Terror Psicológico','Jogos que exploram o terror psicológico e aspectos mentais.'),(40,'Espionagem','Jogos que envolvem missões de espionagem e intriga.'),(41,'Construção de Equipe','Jogos que requerem formação e gerenciamento de equipes.'),(42,'Culinária','Jogos que exploram a culinária e a gestão de restaurantes.'),(43,'Cibernético','Jogos ambientados em ambientes cibernéticos e tecnológicos.'),(44,'Arqueologia','Jogos que envolvem exploração arqueológica e descobertas antigas.'),(45,'Jogos de Mesa Digitais','Jogos digitais inspirados em jogos de mesa tradicionais.'),(46,'Ação e Aventura','Jogos que combinam elementos de ação e aventura.'),(47,'Exploração Espacial','Jogos que exploram a vastidão do espaço e suas maravilhas.'),(48,'Mistério Sobrenatural','Jogos que abordam mistérios sobrenaturais e paranormalidade.'),(49,'Jogos de Cartas de Estratégia','Jogos que combinam elementos de cartas e estratégia.'),(50,'Jogos de Arte','Jogos que destacam a expressão artística e a criatividade.');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidade` (
  `id` int NOT NULL,
  `id_estado` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `cidade_ibfk_1` FOREIGN KEY (`id_estado`) REFERENCES `estado` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,1,'São Paulo'),(2,1,'Campinas'),(3,1,'Guarulhos'),(4,2,'Rio de Janeiro'),(5,2,'Niterói'),(6,2,'Duque de Caxias'),(7,3,'Belo Horizonte'),(8,3,'Contagem'),(9,3,'Uberlândia'),(10,4,'Salvador'),(11,4,'Feira de Santana'),(12,4,'Camaçari'),(13,5,'Porto Alegre'),(14,5,'Caxias do Sul'),(15,5,'Pelotas'),(16,6,'Los Angeles'),(17,6,'San Francisco'),(18,6,'San Diego'),(19,7,'Toronto'),(20,7,'Ottawa'),(21,7,'Vancouver'),(22,8,'Londres'),(23,8,'Manchester'),(24,8,'Liverpool'),(25,9,'Sydney'),(26,26,'Riyadh'),(27,26,'Jeddah'),(28,26,'Mecca'),(29,26,'Medina'),(30,26,'Dammam'),(31,27,'Bogotá'),(32,27,'Medellín'),(33,27,'Cali'),(34,27,'Barranquilla'),(35,27,'Cartagena'),(36,28,'Jacarta'),(37,28,'Bali'),(38,28,'Surabaya'),(39,28,'Bandung'),(40,28,'Medan'),(41,29,'Kuala Lumpur'),(42,29,'Penang'),(43,29,'Johor Bahru'),(44,29,'Kuching'),(45,29,'Kota Kinabalu'),(46,30,'Central Region'),(47,30,'East Region'),(48,30,'North Region'),(49,30,'Northeast Region'),(50,30,'West Region'),(51,31,'Bangkok'),(52,31,'Chiang Mai'),(53,31,'Phuket'),(54,31,'Pattaya'),(55,31,'Krabi'),(56,32,'Hanoi'),(57,32,'Ho Chi Minh City'),(58,32,'Da Nang'),(59,32,'Hai Phong'),(60,32,'Can Tho'),(61,33,'Lima'),(62,33,'Arequipa'),(63,33,'Cusco'),(64,33,'Trujillo'),(65,33,'Iquitos'),(66,34,'Caracas'),(67,34,'Maracaibo'),(68,34,'Valencia'),(69,34,'Barquisimeto'),(70,34,'Maracay'),(71,35,'Montevidéu'),(72,35,'Canelones'),(73,35,'Maldonado'),(74,35,'Rocha'),(75,35,'Salto'),(76,36,'Assunção'),(77,36,'Ciudad del Este'),(78,36,'Encarnación'),(79,36,'San Lorenzo'),(80,36,'Luque'),(81,37,'Viena'),(82,37,'Graz'),(83,37,'Linz'),(84,37,'Innsbruck'),(85,37,'Salzburgo'),(86,38,'Bruxelas'),(87,38,'Antuérpia'),(88,38,'Gante'),(89,38,'Bruges'),(90,38,'Liège'),(91,39,'Amsterdã'),(92,39,'Roterdã'),(93,39,'Haia'),(94,39,'Utrecht'),(95,39,'Eindhoven'),(96,40,'Zurique'),(97,40,'Genebra'),(98,40,'Basileia'),(99,40,'Bern'),(100,40,'Lausanne'),(101,41,'Copenhague'),(102,41,'Aarhus'),(103,41,'Odense'),(104,41,'Aalborg'),(105,41,'Esbjerg'),(106,42,'Helsinque'),(107,42,'Espoo'),(108,42,'Tampere'),(109,42,'Vantaa'),(110,42,'Oulu'),(111,43,'Dublin'),(112,43,'Cork'),(113,43,'Galway'),(114,43,'Limerick'),(115,43,'Waterford'),(116,44,'Varsóvia'),(117,44,'Cracóvia'),(118,44,'Łódź'),(119,44,'Wrocław'),(120,44,'Poznań'),(121,45,'Budapeste'),(122,45,'Debrecen'),(123,45,'Szeged'),(124,45,'Miskolc'),(125,45,'Pécs'),(126,46,'Praga'),(127,46,'Brno'),(128,46,'Ostrava'),(129,46,'Plzeň'),(130,46,'Liberec'),(131,47,'Dubai'),(132,47,'Abu Dhabi'),(133,47,'Sharjah'),(134,47,'Ajman'),(135,47,'Fujairah'),(136,48,'Doha'),(137,48,'Al Rayyan'),(138,48,'Al Wakrah'),(139,48,'Al Khor'),(140,48,'Umm Salal'),(141,49,'Central Region'),(142,49,'East Region'),(143,49,'North Region'),(144,49,'Northeast Region'),(145,49,'West Region'),(146,50,'Malé'),(147,50,'Addu City'),(148,50,'Fuvahmulah'),(149,50,'Hithadhoo'),(150,50,'Kulhudhuffushi');
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12),(13,13),(14,14),(15,15),(16,16),(17,17),(18,18),(19,19),(20,20),(21,21),(22,22),(23,23),(24,24),(25,25),(26,26),(27,27);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id` int NOT NULL,
  `id_cidade` int NOT NULL,
  `nome_rua` varchar(500) NOT NULL,
  `cep` varchar(160) NOT NULL,
  `numero_residencia` varchar(160) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cidade` (`id_cidade`),
  CONSTRAINT `endereco_ibfk_1` FOREIGN KEY (`id_cidade`) REFERENCES `cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,1,'Avenida Paulista','01310-100','123'),(2,2,'Rua Copacabana','22050-002','456'),(3,3,'Avenida Amazonas','30190-002','789'),(4,4,'Rua da Pituba','40140-440','101'),(5,5,'Avenida Beira-Rio','90010-234','246'),(6,6,'Main Street','90001','789'),(7,7,'Elm Street','75001','555'),(8,8,'Broadway','10001','333'),(9,9,'Ocean Drive','33139','777'),(10,10,'Michigan Avenue','60601','123'),(11,11,'Yonge Street','M5B 2H1','456'),(12,12,'Rue Sainte-Catherine','H3B 1A7','789'),(13,13,'Granville Street','V6Z 1L2','101'),(14,14,'Glasgow Road','G1 2FF','246'),(15,15,'Cardiff Lane','D02 N527','789'),(16,16,'Sydney Road','2000','555'),(17,17,'Flinders Street','3000','333'),(18,18,'Baker Street','NW1 6XE','777'),(19,19,'Kensington Avenue','M5T 2N8','123'),(20,20,'Bondi Beach','2026','456'),(21,21,'St Kilda Road','3004','789'),(22,22,'The Strand','L2 0PP','101'),(23,23,'Pier Head','L3 1DP','246'),(24,24,'Circular Quay','2000','789'),(25,25,'George Street','2000','555'),(26,22,'jdflksjflsjf','4575457','245'),(27,1,'aham','4545225','132854'),(28,28,'Jalan Thamrin','10350','789'),(29,28,'Jalan Kebon Kacang','10240','567'),(30,29,'Jalan Ampang','50450','101'),(31,29,'Jalan Sultan Ismail','50480','202'),(32,30,'Orchard Road','238839','202'),(33,30,'Scotts Road','238878','303'),(34,31,'Thanon Ratchadamri','10330','303'),(35,31,'Sukhumvit Road','10110','404'),(36,32,'Phố Cổ','10000','404'),(37,32,'Nguyen Trai Street','70000','505'),(38,33,'Avenida Javier Prado','15023','505'),(39,33,'Avenida Arequipa','15046','606'),(40,34,'Avenida Urdaneta','1010','606'),(41,34,'Plaza Venezuela','1050','707'),(42,35,'Avenida 18 de Julio','11100','707'),(43,35,'Rambla Gandhi','11200','808'),(44,36,'Avenida Mariscal López','1300','808'),(45,36,'Calle Palma','1301','909'),(46,37,'Ringstraße','1010','909'),(47,37,'Kärntner Straße','1010','111'),(48,38,'Grand Place','1000','111'),(49,38,'Rue des Bouchers','1000','222'),(50,39,'Prinsengracht','1015','222'),(51,39,'Leidsestraat','1017','333'),(52,40,'Bahnhofstrasse','8001','333'),(53,40,'Rennweg','8001','444'),(54,41,'Strøget','1000','444'),(55,41,'Nyhavn','1051','555'),(56,42,'Mannerheimintie','100','555'),(57,42,'Esplanadi','130','666'),(58,43,'O\'Connell Street','D01 FV06','666'),(59,43,'Grafton Street','D02 V627','777'),(60,44,'Nowy Świat','00-001','777'),(61,44,'Krakowskie Przedmieście','00-071','888'),(62,45,'Andrássy út','1061','888'),(63,45,'Váci Street','1052','999'),(64,46,'Náměstí Republiky','11000','999'),(65,46,'Kampa Island','11000','1010'),(66,47,'Sheikh Zayed Road','PO Box 9292','1010'),(67,47,'Jumeirah Street','12345','1111'),(68,48,'West Bay','23263','1111'),(69,48,'The Pearl-Qatar','23263','1234'),(70,49,'Orchard Road','238839','1234'),(71,49,'Marina Bay Sands','18956','5678'),(72,50,'Orchid Magu','20025','5678'),(73,50,'Majeedhee Magu','20036','9101');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado` (
  `id` int NOT NULL,
  `id_pais` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  `uf` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pais` (`id_pais`),
  CONSTRAINT `estado_ibfk_1` FOREIGN KEY (`id_pais`) REFERENCES `pais` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,1,'São Paulo','SP'),(2,1,'Rio de Janeiro','RJ'),(3,1,'Minas Gerais','MG'),(4,1,'Bahia','BA'),(5,1,'Rio Grande do Sul','RS'),(6,2,'California','CA'),(7,2,'Texas','TX'),(8,2,'New York','NY'),(9,2,'Florida','FL'),(10,2,'Illinois','IL'),(11,3,'Ontario','ON'),(12,3,'Quebec','QC'),(13,3,'British Columbia','BC'),(14,3,'Alberta','AB'),(15,3,'Manitoba','MB'),(16,4,'Londres','ENG'),(17,4,'Manchester','ENG'),(18,4,'Liverpool','ENG'),(19,4,'Glasgow','SCT'),(20,4,'Cardiff','WLS'),(21,5,'Sydney','NSW'),(22,5,'Melbourne','VIC'),(23,5,'Brisbane','QLD'),(24,5,'Perth','WA'),(25,5,'Adelaide','SA'),(26,26,'Riyadh','RY'),(27,26,'Jeddah','JD'),(28,26,'Mecca','MC'),(29,26,'Medina','MD'),(30,26,'Dammam','DM'),(31,27,'Bogotá','BO'),(32,27,'Medellín','ME'),(33,27,'Cali','CA'),(34,27,'Barranquilla','BA'),(35,27,'Cartagena','CT'),(36,28,'Jacarta','JA'),(37,28,'Bali','BA'),(38,28,'Surabaya','SU'),(39,28,'Bandung','BD'),(40,28,'Medan','MD'),(41,29,'Kuala Lumpur','KL'),(42,29,'Penang','PG'),(43,29,'Johor Bahru','JB'),(44,29,'Kuching','KU'),(45,29,'Kota Kinabalu','KK'),(46,30,'Central Region','CR'),(47,30,'East Region','ER'),(48,30,'North Region','NR'),(49,30,'Northeast Region','NER'),(50,30,'West Region','WR'),(51,31,'Bangkok','BK'),(52,31,'Chiang Mai','CM'),(53,31,'Phuket','PH'),(54,31,'Pattaya','PT'),(55,31,'Krabi','KR'),(56,32,'Hanoi','HA'),(57,32,'Ho Chi Minh City','HCMC'),(58,32,'Da Nang','DN'),(59,32,'Hai Phong','HP'),(60,32,'Can Tho','CT'),(61,33,'Lima','LI'),(62,33,'Arequipa','AR'),(63,33,'Cusco','CU'),(64,33,'Trujillo','TR'),(65,33,'Iquitos','IQ'),(66,34,'Caracas','CA'),(67,34,'Maracaibo','MA'),(68,34,'Valencia','VA'),(69,34,'Barquisimeto','BA'),(70,34,'Maracay','MC'),(71,35,'Montevidéu','MT'),(72,35,'Canelones','CN'),(73,35,'Maldonado','MD'),(74,35,'Rocha','RO'),(75,35,'Salto','SA'),(76,36,'Assunção','AS'),(77,36,'Ciudad del Este','CDE'),(78,36,'Encarnación','EN'),(79,36,'San Lorenzo','SL'),(80,36,'Luque','LU'),(81,37,'Viena','VI'),(82,37,'Graz','GR'),(83,37,'Linz','LZ'),(84,37,'Innsbruck','IN'),(85,37,'Salzburgo','SA'),(86,38,'Bruxelas','BRU'),(87,38,'Antuérpia','ANT'),(88,38,'Gante','GAN'),(89,38,'Bruges','BRG'),(90,38,'Liège','LIE'),(91,39,'Amsterdã','AMS'),(92,39,'Roterdã','ROT'),(93,39,'Haia','HAA'),(94,39,'Utrecht','UTR'),(95,39,'Eindhoven','EIN'),(96,40,'Zurique','ZUR'),(97,40,'Genebra','GEN'),(98,40,'Basileia','BSL'),(99,40,'Bern','BER'),(100,40,'Lausanne','LAU'),(101,41,'Copenhague','COP'),(102,41,'Aarhus','AAR'),(103,41,'Odense','ODE'),(104,41,'Aalborg','AAL'),(105,41,'Esbjerg','ESJ'),(106,42,'Helsinque','HEL'),(107,42,'Espoo','ESP'),(108,42,'Tampere','TAM'),(109,42,'Vantaa','VAN'),(110,42,'Oulu','OUL'),(111,43,'Dublin','DUB'),(112,43,'Cork','CRK'),(113,43,'Galway','GAL'),(114,43,'Limerick','LIM'),(115,43,'Waterford','WAT'),(116,44,'Varsóvia','VAR'),(117,44,'Cracóvia','CRA'),(118,44,'Łódź','LOD'),(119,44,'Wrocław','WRO'),(120,44,'Poznań','POZ'),(121,45,'Budapeste','BUD'),(122,45,'Debrecen','DEB'),(123,45,'Szeged','SZG'),(124,45,'Miskolc','MIS'),(125,45,'Pécs','PEC'),(126,46,'Praga','PRA'),(127,46,'Brno','BRN'),(128,46,'Ostrava','OST'),(129,46,'Plzeň','PLZ'),(130,46,'Liberec','LIB'),(131,47,'Dubai','DB'),(132,47,'Abu Dhabi','AD'),(133,47,'Sharjah','SH'),(134,47,'Ajman','AJ'),(135,47,'Fujairah','FJ'),(136,48,'Doha','DO'),(137,48,'Al Rayyan','AR'),(138,48,'Al Wakrah','AW'),(139,48,'Al Khor','AK'),(140,48,'Umm Salal','US'),(141,49,'Central Region','CR'),(142,49,'East Region','ER'),(143,49,'North Region','NR'),(144,49,'Northeast Region','NER'),(145,49,'West Region','WR'),(146,50,'Malé','MA'),(147,50,'Addu City','AC'),(148,50,'Fuvahmulah','FU'),(149,50,'Hithadhoo','HI'),(150,50,'Kulhudhuffushi','KU');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_civil`
--

DROP TABLE IF EXISTS `estado_civil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado_civil` (
  `id` int NOT NULL,
  `nome` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_civil`
--

LOCK TABLES `estado_civil` WRITE;
/*!40000 ALTER TABLE `estado_civil` DISABLE KEYS */;
INSERT INTO `estado_civil` VALUES (1,'Solteiro(a)'),(2,'Casado(a)'),(3,'Divorciado(a)'),(4,'Viúvo(a)'),(5,'União Estável'),(6,'Separado(a)'),(7,'Namorando'),(8,'Noivo(a)'),(9,'Relacionamento Aberto'),(10,'Relacionamento Poliamoroso'),(11,'Viúvo(a) com Filhos'),(12,'Separado(a) com Filhos'),(13,'Divorciado(a) com Filhos'),(14,'Casado(a) com Filhos'),(15,'União Estável com Filhos'),(16,'Namorando com Filhos'),(17,'Noivo(a) com Filhos'),(18,'Relacionamento Aberto com Filhos'),(19,'Solteiranha'),(20,'Viúvo(a) sem Filhos'),(21,'Separado(a) sem Filhos'),(22,'Divorciado(a) sem Filhos'),(23,'Casado(a) sem Filhos'),(24,'União Estável sem Filhos'),(25,'Namorando sem Filhos'),(26,'Noivo(a) sem Filhos'),(27,'Relacionamento Aberto sem Filhos'),(28,'Relacionamento Poliamoroso sem Filhos'),(29,'Outro'),(30,'Prefiro não informar'),(31,'Viúvo(a) com Filhos Adultos'),(32,'Divorciado(a) com Filhos Adultos'),(33,'Casado(a) com Filhos Adultos'),(34,'União Estável com Filhos Adultos'),(35,'Namorando com Filhos Adultos'),(36,'Noivo(a) com Filhos Adultos'),(37,'Relacionamento Aberto com Filhos Adultos'),(38,'Relacionamento Poliamoroso com Filhos Adultos'),(39,'Viúvo(a) sem Filhos Adultos'),(40,'Divorciado(a) sem Filhos Adultos'),(41,'Casado(a) sem Filhos Adultos'),(42,'União Estável sem Filhos Adultos'),(43,'Namorando sem Filhos Adultos'),(44,'Noivo(a) sem Filhos Adultos'),(45,'Relacionamento Aberto sem Filhos Adultos'),(46,'Relacionamento Poliamoroso sem Filhos Adultos'),(47,'Viúvo(a) com Filhos Adolescentes'),(48,'Divorciado(a) com Filhos Adolescentes'),(49,'Casado(a) com Filhos Adolescentes'),(50,'União Estável com Filhos Adolescentes');
/*!40000 ALTER TABLE `estado_civil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `id` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'EA Sports'),(2,'Rockstar Games'),(3,'Square Enix'),(4,'Valve Corporation'),(5,'Konami'),(6,'Codemasters'),(7,'Maxis'),(8,'Puzzle Kings'),(9,'Bethesda'),(10,'Capcom'),(11,'Capcom'),(12,'Ubisoft'),(13,'Ubisoft'),(14,'Blizzard Entertainment'),(15,'Nintendo'),(16,'Retro Studios'),(17,'Educational Games Inc.'),(18,'Paradox Interactive'),(19,'Asmodee Digital'),(20,'Harmonix Music Systems'),(21,'Telltale Games'),(22,'Bandai Namco'),(23,'2K Games'),(24,'Fantasy World Studios'),(25,'Bethesda'),(26,'Quantum Dynamics'),(27,'Nebula Gaming'),(28,'TechnoRealm Interactive'),(29,'Celestial Games'),(30,'Phoenix Studios'),(31,'Astral Innovations'),(32,'Elemental Entertainment'),(33,'Nexus Creations'),(34,'FutureForge Games'),(35,'Cyberspace Dynamics'),(36,'Galactic Games Co.'),(37,'Infinity Realms'),(38,'DreamForge Interactive'),(39,'Cypher Studios'),(40,'Nebula Nexus Games'),(41,'Quantum Realms'),(42,'Virtual Odyssey Games'),(43,'Cosmic Interactive'),(44,'Nebula Spark Games'),(45,'Hyperspace Creations'),(46,'Quantum Leap Games'),(47,'Cybersphere Entertainment'),(48,'WarpDrive Studios'),(49,'Futura Interactive'),(50,'Dimensional Games Inc.');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pais` (
  `id` int NOT NULL,
  `nome` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` VALUES (1,'Brasil'),(2,'Estados Unidos'),(3,'Canadá'),(4,'Reino Unido'),(5,'França'),(6,'Alemanha'),(7,'Itália'),(8,'Espanha'),(9,'Portugal'),(10,'Argentina'),(11,'México'),(12,'Chile'),(13,'Austrália'),(14,'China'),(15,'Japão'),(16,'Índia'),(17,'Rússia'),(18,'África do Sul'),(19,'Egito'),(20,'Nigéria'),(21,'Quênia'),(22,'Coreia do Sul'),(23,'Turquia'),(24,'Suécia'),(25,'Noruega'),(26,'Arábia Saudita'),(27,'Colômbia'),(28,'Indonésia'),(29,'Malásia'),(30,'Singapura'),(31,'Tailândia'),(32,'Vietnã'),(33,'Peru'),(34,'Venezuela'),(35,'Uruguai'),(36,'Paraguai'),(37,'Áustria'),(38,'Bélgica'),(39,'Holanda'),(40,'Suíça'),(41,'Dinamarca'),(42,'Finlândia'),(43,'Irlanda'),(44,'Polônia'),(45,'Hungria'),(46,'República Tcheca'),(47,'Emirados Árabes Unidos'),(48,'Qatar'),(49,'Singapura'),(50,'Maldivas');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `id` int NOT NULL,
  `id_cliente` int NOT NULL,
  `id_produto` int NOT NULL,
  `data_pedido` date NOT NULL,
  `quantidade` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_produto` (`id_produto`),
  CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (1,1,1,'2023-11-08',5),(2,2,3,'2023-11-09',3),(3,3,2,'2023-11-10',2),(4,4,5,'2023-11-11',7),(5,5,4,'2023-11-12',1),(6,6,6,'2023-11-13',4),(7,7,7,'2023-11-14',2),(8,8,9,'2023-11-15',3),(9,9,8,'2023-11-16',6),(10,10,11,'2023-11-17',8),(11,11,10,'2023-11-18',2),(12,12,13,'2023-11-19',4),(13,13,12,'2023-11-20',5),(14,14,15,'2023-11-21',3),(15,15,14,'2023-11-22',6),(16,16,16,'2023-11-23',4),(17,17,17,'2023-11-24',2),(18,18,19,'2023-11-25',5),(19,19,18,'2023-11-26',1),(20,20,21,'2023-11-27',3),(21,21,20,'2023-11-28',4),(22,22,22,'2023-11-29',7),(23,23,24,'2023-11-30',2),(24,24,23,'2023-12-01',6),(25,25,25,'2023-12-02',3),(26,26,12,'2023-11-13',1),(27,27,102,'2023-11-17',1),(28,27,103,'2023-11-17',1),(29,26,40,'2023-11-17',1);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoa` (
  `id` int NOT NULL,
  `id_endereco` int NOT NULL,
  `id_estado_civil` int NOT NULL,
  `nome` varchar(30) NOT NULL,
  `sobrenome` varchar(30) NOT NULL,
  `genero` varchar(10) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `usuario` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_endereco` (`id_endereco`),
  KEY `id_estado_civil` (`id_estado_civil`),
  CONSTRAINT `pessoa_ibfk_1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`),
  CONSTRAINT `pessoa_ibfk_2` FOREIGN KEY (`id_estado_civil`) REFERENCES `estado_civil` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,1,1,'João','Silva','Masculino','(123) 456-7890','joao@example.com','joao','1234'),(2,2,2,'Maria','Santos','Feminino','(234) 567-8901','maria@example.com','maria','4321'),(3,3,3,'Pedro','Rodrigues','Masculino','(345) 678-9012','pedro@example.com','pedro','4434'),(4,4,4,'Ana','Ferreira','Feminino','(456) 789-0123','ana@example.com','ana','1111'),(5,5,5,'Carlos','Oliveira','Masculino','(567) 890-1234','carlos@example.com','carlos','2222'),(6,6,6,'Isabel','Pereira','Feminino','(678) 901-2345','isabel@example.com','isabel','3333'),(7,7,7,'Luiz','Gomes','Masculino','(789) 012-3456','luiz@example.com','luiz','4444'),(8,8,8,'Marta','Costa','Feminino','(890) 123-4567','marta@example.com','marta','5555'),(9,9,9,'Ricardo','Machado','Masculino','(901) 234-5678','ricardo@example.com','ricardo','6666'),(10,10,10,'Paula','Almeida','Feminino','(012) 345-6789','paula@example.com','paula','7777'),(11,11,11,'Fernando','Dias','Masculino','(123) 456-7890','fernando@example.com','fernando','8888'),(12,12,12,'Beatriz','Cruz','Feminino','(234) 567-8901','beatriz@example.com','beatriz','9999'),(13,13,13,'Gustavo','Ribeiro','Masculino','(345) 678-9012','gustavo@example.com','gustavo','1221'),(14,14,14,'Silvia','Vieira','Feminino','(456) 789-0123','silvia@example.com','siliva','asas'),(15,15,15,'Antônio','Carvalho','Masculino','(567) 890-1234','antonio@example.com','antonio','antonio12'),(16,16,16,'Aline','Sousa','Feminino','(678) 901-2345','aline@example.com','aline','aline12'),(17,17,17,'José','Martins','Masculino','(789) 012-3456','jose@example.com','jose','1212'),(18,18,18,'Catarina','Fernandes','Feminino','(890) 123-4567','catarina@example.com','catarina','paolino32'),(19,19,19,'Eduardo','Pires','Masculino','(901) 234-5678','eduardo@example.com','eduardo','edu40'),(20,20,20,'Lúcia','Santana','Feminino','(012) 345-6789','lucia@example.com','lucia','lucia23'),(21,21,21,'Rui','Mendes','Masculino','(123) 456-7890','rui@example.com','rui','rui090'),(22,22,22,'Teresa','Rocha','Feminino','(234) 567-8901','teresa@example.com','teresa','teresinha45'),(23,23,23,'Miguel','Fonseca','Masculino','(345) 678-9012','miguel@example.com','miguel','miguel24'),(24,24,24,'Helena','Correia','Feminino','(456) 789-0123','helena@example.com','helena','helena456'),(25,25,25,'Daniel','Cardoso','Masculino','(567) 890-1234','daniel@example.com','daniel','daniel567'),(26,26,30,'chris','constantine','MASCULINO','828884445','chris@gmail.com','chris','4545'),(27,27,2,'anny','caleff','FEMININO','997189745','anny@gmail.com','anny','1234');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `id_marca` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(500) NOT NULL,
  `preco` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_categoria` (`id_categoria`),
  KEY `id_marca` (`id_marca`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`),
  CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,5,1,'Space Odyssey: Aventuras Intergalácticas','Explore o universo em uma emocionante jornada intergaláctica, enfrente alienígenas e desvende mistérios cósmicos.',49.99),(2,5,1,'Reinos Mágicos: A Saga dos Feiticeiros','Embarque em uma jornada mágica e aprenda feitiços poderosos para salvar seu reino da escuridão.',39.99),(3,5,2,'Super Campeonato de Futebol 2023','Monte seu time de estrelas e conquiste a taça de campeão em uma simulação de futebol de última geração.',59.99),(4,5,2,'Corrida Extrema: Velocidade nas Ruas','Corra pelas ruas da cidade em alta velocidade, personalize seu carro e desafie rivais em corridas emocionantes.',44.99),(5,5,3,'Lendas de Eldoria: A Busca Pelo Tesouro Perdido','Junte-se a heróis lendários em busca do tesouro perdido de Eldoria, enfrentando monstros e resolvendo quebra-cabeças.',69.99),(6,1,3,'Cyber Assault: Missão Hacker','Entre no mundo sombrio da cibersegurança e realize missões secretas para desmascarar hackers e proteger a rede.',49.99),(7,2,1,'Estratégia de Guerra: Batalhas Épicas','Lidere seu exército em batalhas épicas, desenvolva estratégias brilhantes e conquiste territórios inimigos.',39.99),(8,3,4,'Campeonato de Surfe Radical','Domine as ondas e mostre suas habilidades de surfe em um campeonato emocionante com manobras radicais.',59.99),(9,4,2,'Rally Off-Road: Aventuras na Lama','Pilote veículos todo-o-terreno em trilhas desafiadoras, supere obstáculos naturais e conquiste o mundo do rally off-road.',44.99),(10,5,5,'Fantasia Épica: A Jornada do Herói','Embarque em uma jornada épica como herói destinado a derrotar o mal, desvendar mistérios e salvar o reino.',69.99),(11,1,6,'Invasão Zumbi: Sobrevivência na Cidade','Sobreviva ao apocalipse zumbi, construa fortificações, encontre recursos e lute contra hordas de mortos-vivos.',49.99),(12,2,7,'Império do Comércio: Conquista dos Mercados','Construa um império comercial, negocie produtos, faça alianças e torne-se o magnata dos negócios.',39.99),(13,3,8,'Copa Mundial de Rugby 2023','Escolha sua nação favorita e participe da emocionante Copa Mundial de Rugby, onde cada tackle conta.',59.99),(14,4,9,'Rali nas Montanhas: Velocidade na Natureza','Acelere pelas montanhas em ralis emocionantes, supere obstáculos naturais e conquiste a trilha selvagem.',44.99),(15,5,10,'Épicos da Espada: A Busca Pela Relíquia','Embarque em uma busca pela lendária relíquia, lute contra monstros e desvende segredos antigos.',69.99),(16,1,11,'Aventura Espacial: Exploração Alienígena','Explore planetas alienígenas, descubra vida extraterrestre e desvende os mistérios do cosmos.',49.99),(17,2,12,'Estratégia Medieval: Reinado dos Lordes','Construa seu reino medieval, forme alianças e conduza campanhas épicas para dominar o território.',39.99),(18,3,13,'Liga de Basquete Profissional','Monte seu time de basquete, participe de torneios profissionais e dispute o título da liga.',59.99),(19,4,14,'Corrida de Rally: Aventuras na Lama 2','Pilote veículos off-road aprimorados, enfrente terrenos desafiadores e conquiste o mundo do rally.',44.99),(20,5,15,'Mistérios do Antigo Egito: A Busca pela Relíquia Perdida','Explore as pirâmides, resolva enigmas ancestrais e descubra a relíquia perdida do Antigo Egito.',69.99),(21,1,16,'Guerra Cibernética: Confronto Digital','Participe de batalhas cibernéticas em um mundo virtual, hackeie sistemas e proteja a rede contra ameaças.',49.99),(22,2,17,'Estratégia de Guerra: Defesa do Castelo','Defenda seu castelo de invasões inimigas, construa fortificações e comande suas tropas na batalha.',39.99),(23,3,18,'Liga de Críquete Profissional','Entre nos campos de críquete, dispute partidas emocionantes e torne-se uma lenda do críquete.',59.99),(24,4,19,'Corrida Extrema: Velocidade nas Montanhas','Corra em trilhas de montanha desafiadoras, supere terrenos acidentados e conquiste as alturas.',44.99),(25,5,20,'Aventuras Submarinas: Tesouros das Profundezas','Mergulhe nas profundezas do oceano em busca de tesouros perdidos, enfrente criaturas marinhas e desvende segredos subaquáticos.',69.99),(26,12,15,'pirataria - jack sparrow e o 25 de março','baixa e veja a merda acontecer agr 2023',0.01),(27,1,4,'Half-Life 2','First-person shooter game by Valve Corporation',9.99),(28,1,4,'Portal 2','Puzzle-platform game by Valve Corporation',14.99),(29,1,4,'Team Fortress 2','Multiplayer first-person shooter game by Valve Corporation',0.00),(30,1,4,'Counter-Strike: Global Offensive','Multiplayer first-person shooter game by Valve Corporation',19.99),(31,1,4,'Dota 2','Multiplayer online battle arena game by Valve Corporation',0.00),(32,4,5,'Metal Gear Solid V: The Phantom Pain','Action-adventure game by Konami',29.99),(33,4,5,'Pro Evolution Soccer series','Football simulation video game series by Konami',49.99),(34,4,5,'Castlevania: Symphony of the Night','Action-adventure game by Konami',11.99),(35,4,5,'Silent Hill 2','Survival horror game by Konami',14.99),(36,4,5,'Contra series','Run-and-gun game series by Konami',9.99),(37,9,6,'Dirt Rally','Racing video game by Codemasters',39.99),(38,1,6,'F1 series','Formula One racing video game series by Codemasters',49.99),(39,1,6,'GRID series','Racing video game series by Codemasters',29.99),(40,1,6,'Operation Flashpoint: Dragon Rising','Tactical shooter video game by Codemasters',14.99),(41,1,6,'Overlord series','Action role-playing game series by Codemasters',19.99),(42,6,7,'SimCity series','City-building and management simulation game series by Maxis',29.99),(43,6,7,'The Sims series','Life simulation game series by Maxis',49.99),(44,6,7,'Spore','Life simulation real-time strategy game by Maxis',39.99),(45,6,7,'SimAnt','Life simulation video game by Maxis',9.99),(46,9,7,'SimEarth','Life simulation video game by Maxis',14.99),(47,7,8,'Bubble Witch Saga','Match-3 puzzle game by Puzzle Kings',0.00),(48,7,8,'Farm Heroes Saga','Match-3 puzzle game by Puzzle Kings',0.00),(49,7,8,'Candy Crush Saga','Match-3 puzzle game by Puzzle Kings',0.00),(50,7,8,'Pet Rescue Saga','Match-3 puzzle game by Puzzle Kings',0.00),(51,9,8,'Diamond Digger Saga','Match-3 puzzle game by Puzzle Kings',0.00),(52,8,9,'The Elder Scrolls V: Skyrim','Action role-playing game by Bethesda',39.99),(53,8,9,'Fallout 4','Action role-playing game by Bethesda',29.99),(54,8,9,'DOOM (2016)','First-person shooter game by Bethesda',19.99),(55,8,9,'Dishonored series','Action-adventure game series by Bethesda',49.99),(56,8,9,'Wolfenstein: The New Order','First-person shooter game by Bethesda',29.99),(57,1,10,'Resident Evil 7: Biohazard','Survival horror game by Capcom',29.99),(58,1,10,'Street Fighter V','Fighting game by Capcom',19.99),(59,1,10,'Monster Hunter: World','Action role-playing game by Capcom',39.99),(60,1,10,'Devil May Cry 5','Action-adventure game by Capcom',29.99),(61,1,10,'Mega Man 11','Action-platform game by Capcom',19.99),(62,1,11,'Assassin\'s Creed Odyssey','Action role-playing video game by Ubisoft',49.99),(63,1,11,'Far Cry 5','First-person shooter game by Ubisoft',39.99),(64,1,11,'Watch Dogs 2','Action-adventure game by Ubisoft',29.99),(65,1,11,'Rainbow Six Siege','Tactical shooter game by Ubisoft',29.99),(66,1,11,'The Division 2','Action role-playing game by Ubisoft',59.99),(67,1,12,'World of Warcraft','Massively multiplayer online role-playing game by Blizzard Entertainment',14.99),(68,1,12,'Overwatch','First-person shooter game by Blizzard Entertainment',19.99),(69,1,12,'Diablo III','Action role-playing game by Blizzard Entertainment',29.99),(70,1,12,'StarCraft II','Real-time strategy game by Blizzard Entertainment',19.99),(71,1,12,'Hearthstone','Digital collectible card game by Blizzard Entertainment',0.00),(72,13,13,'The Legend of Zelda: Breath of the Wild','Action-adventure game by Nintendo',59.99),(73,13,13,'Super Mario Odyssey','Platform game by Nintendo',49.99),(74,13,13,'Animal Crossing: New Horizons','Social simulation game by Nintendo',54.99),(75,13,13,'Splatoon 2','Third-person shooter game by Nintendo',39.99),(76,13,13,'Mario Kart 8 Deluxe','Racing game by Nintendo',49.99),(77,14,14,'Metroid Prime series','Action-adventure game series by Retro Studios',19.99),(78,14,14,'Donkey Kong Country Returns','Platform game by Retro Studios',29.99),(79,14,14,'Donkey Kong Country: Tropical Freeze','Platform game by Retro Studios',39.99),(80,18,15,'Math Blaster','Educational video game by Educational Games Inc.',9.99),(81,18,15,'Oregon Trail','Educational video game by Educational Games Inc.',14.99),(82,18,15,'Reader Rabbit series','Educational video game series by Educational Games Inc.',19.99),(83,16,16,'Europa Universalis IV','Grand strategy game by Paradox Interactive',29.99),(84,16,16,'Crusader Kings III','Grand strategy game by Paradox Interactive',39.99),(85,16,16,'Hearts of Iron IV','Grand strategy game by Paradox Interactive',49.99),(86,16,16,'Cities: Skylines','City-building game by Paradox Interactive',19.99),(87,20,17,'Carcassonne','Tile-based German-style board game by Asmodee Digital',29.99),(88,20,17,'Ticket to Ride','Board game by Asmodee Digital',24.99),(89,20,17,'Pandemic','Cooperative board game by Asmodee Digital',34.99),(90,20,17,'Splendor','Board game by Asmodee Digital',19.99),(91,21,18,'Rock Band series','Music video game series by Harmonix Music Systems',59.99),(92,21,18,'Dance Central series','Rhythm game series by Harmonix Music Systems',49.99),(93,22,19,'The Walking Dead series','Interactive drama graphic adventure game series by Telltale Games',29.99),(94,22,19,'The Wolf Among Us','Graphic adventure game by Telltale Games',19.99),(95,22,19,'Batman: The Telltale Series','Graphic adventure game by Telltale Games',24.99),(96,11,20,'Dark Souls series','Action role-playing game series by Bandai Namco',39.99),(97,11,20,'Tekken 7','Fighting game by Bandai Namco',49.99),(98,9,20,'Dragon Ball FighterZ','Fighting game by Bandai Namco',59.99),(99,11,20,'Pac-Man Championship Edition DX','Puzzle video game by Bandai Namco',9.99),(100,2,21,'BioShock Infinite','First-person shooter game by 2K Games',29.99),(101,25,22,'Kingdoms of Amalur: Reckoning','Action role-playing game by Fantasy World Studios',39.99),(102,46,12,'South Park: The Stick of Truth','South Park: The Stick of Truth é um RPG de ação baseado na série de televisão South Park.',29.99),(103,46,12,'South Park: The Fractured But Whole','South Park: The Fractured But Whole é a sequência do Stick of Truth, mantendo o humor característico da série.',39.99);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sistemavendajogos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-24 15:32:51
