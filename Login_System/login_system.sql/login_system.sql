-- phpMyAdmin SQL Dump
-- version 3.1.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 05, 2015 at 07:38 AM
-- Server version: 5.1.30
-- PHP Version: 5.2.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `login_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE IF NOT EXISTS `accounts` (
  `id` int(20) NOT NULL,
  `amount` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`id`, `amount`) VALUES
(11205005, 198635),
(11205023, 22343456),
(11205004, 5000),
(11207865, 122222),
(11205001, 500),
(11295991, 500);

-- --------------------------------------------------------

--
-- Table structure for table `donated_list1`
--

CREATE TABLE IF NOT EXISTS `donated_list1` (
  `id` int(20) NOT NULL,
  `date` varchar(20) NOT NULL,
  `blood_group` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donated_list1`
--

INSERT INTO `donated_list1` (`id`, `date`, `blood_group`) VALUES
(11205003, '04.01.2015', 'A+'),
(11205002, '10.05.2013', 'A_'),
(11207865, '03.01.2015', 'B+'),
(11205001, '12.12.2015', 'A+'),
(11205007, '04.01.2015', 'B-'),
(1120506, '05.01.2015', 'O-'),
(11205005, '05.01.2015', 'O+'),
(11205006, '05.01.2015', 'O-');

-- --------------------------------------------------------

--
-- Table structure for table `donor_list`
--

CREATE TABLE IF NOT EXISTS `donor_list` (
  `name` varchar(20) NOT NULL,
  `id` int(20) NOT NULL,
  `blood_group` varchar(20) NOT NULL,
  `sex` varchar(20) NOT NULL,
  `contact_num` int(20) NOT NULL,
  `age` varchar(20) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `occupation` text NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY (`id`,`contact_num`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor_list`
--

INSERT INTO `donor_list` (`name`, `id`, `blood_group`, `sex`, `contact_num`, `age`, `mail`, `occupation`, `address`) VALUES
('abdullha', 11205001, 'A+', 'Male', 1828465390, '25', 'abdullhabd@gmail.com', 'student', 'Nasirabad'),
('sabrina', 11205002, 'A-', 'Female', 1834251647, '25', 'Sabrina@gmail.com', 'Student', 'Andorkilla'),
('tamima', 11207865, 'B+', 'Female', 1534278459, '56', 'tamima', 'howsewite', 'newmarket'),
('Ruchi', 11205003, 'A+', 'Female', 1828274536, '32', 'ruchictg@gmal.com', 'homemaker', 'newmarket,station road'),
('Jarnas', 11205004, 'A-', 'Female', 1634251786, '45', 'jarnas@yahoo.com', 'teacher', 'kapasgola'),
('tabassom', 11205005, 'O+', 'Female', 1945285346, '35', 'tabassom@gmail.com', 'homemaker', 'Cosmopoliton'),
('1', 1, '1', 'Male', 111, '1', '1', '1', '1'),
('maun', 11205006, 'O-', 'Male', 1745628923, '24', 'maun@gmail.com', 'student', 'Chawkbazar'),
('Jannat', 11205007, 'B-', 'Female', 1911265348, '40', 'jannat@yahoo.com', 'housewife', 'Newmarket'),
('tshfia', 11205046, 'A-', 'Female', 155678655, '21', 'tasfia@gmail.com', 'Student', 'hilsha road');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE IF NOT EXISTS `registration` (
  `Name` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`Password`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Name`, `Password`) VALUES
('julia', 'julia'),
('esha', 'esha'),
('syama', 'syama'),
('sakib', 'sakib'),
('nargis', 'nargis'),
('rohan', 'rohan'),
('rohit', 'rohit'),
('c', 'c'),
('11', '11'),
('1', '1'),
('ruchi', 'ruchi'),
('1111', '1111'),
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `registration_data`
--

CREATE TABLE IF NOT EXISTS `registration_data` (
  `user_id` int(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration_data`
--

