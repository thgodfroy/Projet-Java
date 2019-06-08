-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 08, 2019 at 09:39 AM
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

-- --------------------------------------------------------

--
-- Table structure for table `bulletin`
--

CREATE TABLE `bulletin` (
  `Id_bulletin` varchar(30) NOT NULL,
  `Id_trimestre` varchar(30) NOT NULL,
  `Id_inscrip` varchar(30) NOT NULL,
  `appreciation` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `classe`
--

CREATE TABLE `classe` (
  `Id_classe` varchar(30) NOT NULL,
  `Id_ecole` varchar(30) NOT NULL,
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

-- --------------------------------------------------------

--
-- Table structure for table `ecole`
--

CREATE TABLE `ecole` (
  `Id_ecole` varchar(30) NOT NULL,
  `nom_ecole` varchar(30) NOT NULL
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

-- --------------------------------------------------------

--
-- Table structure for table `personne`
--

CREATE TABLE `personne` (
  `Id_personne` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prénom` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `personne`
--

INSERT INTO `personne` (`Id_personne`, `nom`, `prénom`, `type`) VALUES
('1', 'Safi', 'Théodora', 'Eleve'),
('2', 'Duchemann', 'Hugo', 'Eleve'),
('3', 'Sternberger', 'Lucie', 'Eleve'),
('4', 'Mokhber', 'Arash', 'Professeur'),
('5', 'Segado', 'JP', 'Professeur'),
('6', 'Finot', 'Thierry', 'Professeur');

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
  ADD PRIMARY KEY (`Id_bulletin`);

--
-- Indexes for table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`Id_classe`),
  ADD KEY `Id_ecole` (`Id_ecole`),
  ADD KEY `Id_niveau` (`Id_niveau`),
  ADD KEY `Id_anneescolaire` (`Id_anneescolaire`);

--
-- Indexes for table `detailbulletin`
--
ALTER TABLE `detailbulletin`
  ADD PRIMARY KEY (`Id_detail`);

--
-- Indexes for table `discipline`
--
ALTER TABLE `discipline`
  ADD PRIMARY KEY (`Id_discipline`);

--
-- Indexes for table `ecole`
--
ALTER TABLE `ecole`
  ADD PRIMARY KEY (`Id_ecole`);

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
-- Indexes for table `trimestre`
--
ALTER TABLE `trimestre`
  ADD PRIMARY KEY (`Id_trimestre`),
  ADD KEY `Id_anneescolaire` (`Id_anneescolaire`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `classe_ibfk_1` FOREIGN KEY (`Id_ecole`) REFERENCES `ecole` (`Id_ecole`),
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
-- Constraints for table `trimestre`
--
ALTER TABLE `trimestre`
  ADD CONSTRAINT `trimestre_ibfk_1` FOREIGN KEY (`Id_anneescolaire`) REFERENCES `anneescolaire` (`Id_anneescolaire`);
