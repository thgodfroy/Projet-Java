-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 09, 2019 at 01:46 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `projetJava`
--

-- --------------------------------------------------------

--
-- Table structure for table `anneescolaire`
--

CREATE TABLE `anneescolaire` (
  `Id_anneescolaire` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anneescolaire`
--

INSERT INTO `anneescolaire` (`Id_anneescolaire`) VALUES
('2018/2019');

-- --------------------------------------------------------

--
-- Table structure for table `bulletin`
--

CREATE TABLE `bulletin` (
  `Id_bulletin` int(30) NOT NULL,
  `Id_trimestre` varchar(30) NOT NULL,
  `Id_personne` varchar(30) NOT NULL,
  `appreciation` varchar(100) NOT NULL,
  `moyenne` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bulletin`
--

INSERT INTO `bulletin` (`Id_bulletin`, `Id_trimestre`, `Id_personne`, `appreciation`, `moyenne`) VALUES
(1, '1', '1', 'Bon trimestre', 15),
(2, '1', '2', 'Excellent trimestre', 18),
(3, '2', '1', 'Bon second semestre', 16),
(4, '3', '1', 'Une légère baisse', 15);

-- --------------------------------------------------------

--
-- Table structure for table `classe`
--

CREATE TABLE `classe` (
  `Id_classe` varchar(30) NOT NULL,
  `Id_niveau` varchar(30) NOT NULL,
  `Id_anneescolaire` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `detailbulletin`
--

CREATE TABLE `detailbulletin` (
  `Id_detail` varchar(30) NOT NULL,
  `Id_bulletin` varchar(30) NOT NULL,
  `Id_enseignement` varchar(30) NOT NULL,
  `appreciation` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `discipline`
--

CREATE TABLE `discipline` (
  `Id_discipline` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `discipline`
--

INSERT INTO `discipline` (`Id_discipline`, `nom`) VALUES
('1', 'Maths'),
('2', 'Français'),
('3', 'Anglais'),
('4', 'Physique'),
('5', 'Chimie'),
('6', 'Histoire');

-- --------------------------------------------------------

--
-- Table structure for table `eleve`
--

CREATE TABLE `eleve` (
  `Id_stud` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prénom` varchar(30) NOT NULL,
  `id_personne` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `enseignement`
--

CREATE TABLE `enseignement` (
  `Id_enseignement` varchar(30) NOT NULL,
  `Id_classe` varchar(30) NOT NULL,
  `Id_discipline` varchar(30) NOT NULL,
  `Id_personne` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `evaluation`
--

CREATE TABLE `evaluation` (
  `Id_evaluation` varchar(30) NOT NULL,
  `Id_detail` varchar(30) NOT NULL,
  `note` int(10) NOT NULL,
  `appreciation` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inscription`
--

CREATE TABLE `inscription` (
  `Id_inscrip` varchar(30) NOT NULL,
  `Id_personne` varchar(30) NOT NULL,
  `Id_classe` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `niveau`
--

CREATE TABLE `niveau` (
  `Id_niveau` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `niveau`
--

INSERT INTO `niveau` (`Id_niveau`, `nom`) VALUES
('1', 'Seconde'),
('2', 'Premiere'),
('3', 'Terminale'),
('4', 'PCSI');

-- --------------------------------------------------------

--
-- Table structure for table `personne`
--

CREATE TABLE `personne` (
  `Id_personne` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prénom` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL,
  `mdp` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `personne`
--

INSERT INTO `personne` (`Id_personne`, `nom`, `prénom`, `type`, `mdp`) VALUES
('1', 'Safi', 'Théodora', 'Eleve', 1),
('2', 'Duchemann', 'Hugo', 'Eleve', 1),
('3', 'Sternberger', 'Lucie', 'Eleve', 1),
('4', 'Mokhber', 'Arash', 'Professeur', 1),
('5', 'Segado', 'JP', 'Professeur', 1),
('6', 'Finot', 'Thierry', 'Professeur', 1),
('7', 'Dupont', 'Marie', 'Admin', 1);

-- --------------------------------------------------------

--
-- Table structure for table `professeur`
--

CREATE TABLE `professeur` (
  `Id_prof` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prénom` varchar(30) NOT NULL,
  `id_personne` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `trimestre`
--

CREATE TABLE `trimestre` (
  `Id_trimestre` varchar(100) NOT NULL,
  `Numero` int(30) NOT NULL,
  `Debut` varchar(255) NOT NULL,
  `Fin` varchar(255) NOT NULL,
  `Id_anneescolaire` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `trimestre`
--

INSERT INTO `trimestre` (`Id_trimestre`, `Numero`, `Debut`, `Fin`, `Id_anneescolaire`) VALUES
('1', 1, '01/09/2018', '22/11/2018', '2018/2019'),
('2', 2, '23/11/2018', '15/03/2018', '2018/2019'),
('3', 3, '16/03/2019', '07/06/2019', '2018/2019');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anneescolaire`
--
ALTER TABLE `anneescolaire`
  ADD PRIMARY KEY (`Id_anneescolaire`);

--
-- Indexes for table `bulletin`
--
ALTER TABLE `bulletin`
  ADD PRIMARY KEY (`Id_bulletin`),
  ADD KEY `Id_trimestre` (`Id_trimestre`),
  ADD KEY `Id_personne` (`Id_personne`);

--
-- Indexes for table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`Id_classe`),
  ADD KEY `Id_niveau` (`Id_niveau`),
  ADD KEY `Id_anneescolaire` (`Id_anneescolaire`);

--
-- Indexes for table `detailbulletin`
--
ALTER TABLE `detailbulletin`
  ADD PRIMARY KEY (`Id_detail`),
  ADD KEY `Id_bulletin` (`Id_bulletin`);

--
-- Indexes for table `discipline`
--
ALTER TABLE `discipline`
  ADD PRIMARY KEY (`Id_discipline`);

--
-- Indexes for table `eleve`
--
ALTER TABLE `eleve`
  ADD PRIMARY KEY (`Id_stud`),
  ADD KEY `id_personne` (`id_personne`);

--
-- Indexes for table `enseignement`
--
ALTER TABLE `enseignement`
  ADD PRIMARY KEY (`Id_enseignement`),
  ADD KEY `Id_classe` (`Id_classe`),
  ADD KEY `Id_discipline` (`Id_discipline`),
  ADD KEY `Id_personne` (`Id_personne`);

--
-- Indexes for table `evaluation`
--
ALTER TABLE `evaluation`
  ADD PRIMARY KEY (`Id_evaluation`);

--
-- Indexes for table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`Id_inscrip`),
  ADD KEY `Id_personne` (`Id_personne`),
  ADD KEY `Id_classe` (`Id_classe`);

--
-- Indexes for table `niveau`
--
ALTER TABLE `niveau`
  ADD PRIMARY KEY (`Id_niveau`);

--
-- Indexes for table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`Id_personne`);

--
-- Indexes for table `professeur`
--
ALTER TABLE `professeur`
  ADD PRIMARY KEY (`Id_prof`),
  ADD KEY `id_personne` (`id_personne`);

--
-- Indexes for table `trimestre`
--
ALTER TABLE `trimestre`
  ADD PRIMARY KEY (`Id_trimestre`),
  ADD KEY `Id_anneescolaire` (`Id_anneescolaire`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bulletin`
--
ALTER TABLE `bulletin`
  MODIFY `Id_bulletin` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bulletin`
--
ALTER TABLE `bulletin`
  ADD CONSTRAINT `bulletin_ibfk_1` FOREIGN KEY (`Id_personne`) REFERENCES `personne` (`Id_personne`),
  ADD CONSTRAINT `bulletin_ibfk_2` FOREIGN KEY (`Id_trimestre`) REFERENCES `trimestre` (`Id_trimestre`);

--
-- Constraints for table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `classe_ibfk_2` FOREIGN KEY (`Id_niveau`) REFERENCES `niveau` (`Id_niveau`),
  ADD CONSTRAINT `classe_ibfk_3` FOREIGN KEY (`Id_anneescolaire`) REFERENCES `anneescolaire` (`Id_anneescolaire`);

--
-- Constraints for table `enseignement`
--
ALTER TABLE `enseignement`
  ADD CONSTRAINT `enseignement_ibfk_1` FOREIGN KEY (`Id_classe`) REFERENCES `classe` (`Id_classe`),
  ADD CONSTRAINT `enseignement_ibfk_2` FOREIGN KEY (`Id_discipline`) REFERENCES `discipline` (`Id_discipline`),
  ADD CONSTRAINT `enseignement_ibfk_3` FOREIGN KEY (`Id_personne`) REFERENCES `personne` (`Id_personne`);

--
-- Constraints for table `inscription`
--
ALTER TABLE `inscription`
  ADD CONSTRAINT `inscription_ibfk_1` FOREIGN KEY (`Id_classe`) REFERENCES `classe` (`Id_classe`),
  ADD CONSTRAINT `inscription_ibfk_2` FOREIGN KEY (`Id_personne`) REFERENCES `personne` (`Id_personne`);

--
-- Constraints for table `professeur`
--
ALTER TABLE `professeur`
  ADD CONSTRAINT `professeur_ibfk_1` FOREIGN KEY (`id_personne`) REFERENCES `professeur` (`Id_prof`);

--
-- Constraints for table `trimestre`
--
ALTER TABLE `trimestre`
  ADD CONSTRAINT `trimestre_ibfk_1` FOREIGN KEY (`Id_anneescolaire`) REFERENCES `anneescolaire` (`Id_anneescolaire`);
