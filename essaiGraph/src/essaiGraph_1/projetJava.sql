-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 24 mai 2019 à 12:06
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projetJava`
--
-- --------------------------------------------------------

--
-- Structure de la table `ecole`
--

DROP TABLE IF EXISTS `ecole`;
CREATE TABLE IF NOT EXISTS `ecole` (
  `Id_ecole` varchar(30) NOT NULL,
  `nom_ecole` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_ecole`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `anneescolaire`
--

DROP TABLE IF EXISTS `anneescolaire`;
CREATE TABLE IF NOT EXISTS `anneescolaire` (
  `Id_anneescolaire` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_anneescolaire`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `trimestre`
--

DROP TABLE IF EXISTS `trimestre`;
CREATE TABLE IF NOT EXISTS `trimestre` (
  `Id_trimestre` varchar(100) NOT NULL,
  `Numero` int(30) NOT NULL,
  `Debut` varchar(255) NOT NULL,
  `Fin` varchar(255) NOT NULL,
  -- clé étrangère année scol
  ALTER TABLE `trimestre` ADD FOREIGN KEY (`Id_anneescolaire`) REFERENCES `anneescolaire`(`Id_anneescolaire`) ON DELETE RESTRICT ON UPDATE RESTRICT;
  PRIMARY KEY (`Id_trimestre`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `niveau`;
CREATE TABLE IF NOT EXISTS `niveau` (
  `Id_niveau` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_niveau`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `Id_classe` varchar(30) NOT NULL,
  --clé étrangère id_ecole
  CONSTRAINT Id_ecole
    FOREIGN KEY (ecole)
    REFERENCES ecole(Id_ecole)
  --clé étrangère id_niveau
  CONSTRAINT Id_niveau
    FOREIGN KEY (niveau)
    REFERENCES niveau(Id_niveau)
  --clé étrangère Id_anneescolaire
  CONSTRAINT Id_anneescolaire
    FOREIGN KEY (anneescolaire)
    REFERENCES anneescolaire(Id_anneescolaire)
  PRIMARY KEY (`Id_classe`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------

--
-- Structure de la table `discipline`
--

DROP TABLE IF EXISTS `discipline`;
CREATE TABLE IF NOT EXISTS `discipline` (
  `Id_discipline` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_discipline`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `Id_personne` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prénom` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_personne`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------

--
-- Structure de la table `enseignement`
--

DROP TABLE IF EXISTS `enseignement`;
CREATE TABLE IF NOT EXISTS `enseignement` (
  `Id_enseignement` varchar(30) NOT NULL,
  -- clé étrangère classe
  CONSTRAINT Id_classe
    FOREIGN KEY (classe)
    REFERENCES classe(Id_classe)
  -- clé étrangère discipline
  CONSTRAINT Id_discipline
    FOREIGN KEY (discipline)
    REFERENCES discipline(Id_discipline)
  -- clé étrangère personne
    CONSTRAINT Id_personne
      FOREIGN KEY (personne)
      REFERENCES personne(Id_personne)
  PRIMARY KEY (`Id_enseignement`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

DROP TABLE IF EXISTS `inscription`;
CREATE TABLE IF NOT EXISTS `inscription` (
  `Id_inscrip` varchar(30) NOT NULL,
  -- clé étrangère classe
  CONSTRAINT Id_classe
    FOREIGN KEY (classe)
    REFERENCES classe(Id_classe)
    -- clé étrangère personne
  CONSTRAINT Id_personne
    FOREIGN KEY (personne)
    REFERENCES personne(Id_personne)
  PRIMARY KEY (`Id_inscrip`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE IF NOT EXISTS `bulletin` (
  `Id_bulletin` varchar(30) NOT NULL,
  `Id_trimestre` varchar(30) NOT NULL,
  `Id_inscrip` varchar(30) NOT NULL,
  `appreciation` varchar(100) NOT NULL,
  PRIMARY KEY (`Id_bulletin`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------

--
-- Structure de la table `detailbulletin`
--

DROP TABLE IF EXISTS `detailbulletin`;
CREATE TABLE IF NOT EXISTS `detailbulletin` (
  `Id_detail` varchar(30) NOT NULL,
  `Id_bulletin` varchar(30) NOT NULL,
  `Id_enseignement` varchar(30) NOT NULL,
  `appreciation` varchar(100) NOT NULL,
  PRIMARY KEY (`Id_detail`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE IF NOT EXISTS `evaluation` (
  `Id_evaluation` varchar(30) NOT NULL,
  `Id_detail` varchar(30) NOT NULL,
  `note` int(10) NOT NULL,
  `appreciation` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_evaluation`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
