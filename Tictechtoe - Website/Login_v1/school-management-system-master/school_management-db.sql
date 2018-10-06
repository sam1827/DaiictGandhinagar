-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 06, 2018 at 05:19 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school_management-db`
--

-- --------------------------------------------------------

--
-- Table structure for table `school_`
--

CREATE TABLE `school_` (
  `id` int(11) NOT NULL,
  `name` varchar(128) NOT NULL,
  `email` varchar(128) NOT NULL,
  `school_name` varchar(128) NOT NULL,
  `created` datetime NOT NULL,
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `school_`
--

INSERT INTO `school_` (`id`, `name`, `email`, `school_name`, `created`, `modified`) VALUES
(1, 'Simran', 'simran@gmai.com', 'svis', '2018-10-06 17:01:45', '2018-10-06 15:01:45'),
(2, 'Adi G', 'aditya@gmail.com', 'svis', '2018-10-06 17:02:46', '2018-10-06 15:02:46'),
(3, 'Sagar Mistry', 'sagar@gmail.com', 'vbsv', '2018-10-06 17:03:35', '2018-10-06 15:03:35'),
(4, 'Dhairya bhatt', 'dhairya@gmail.com', 'vbsv', '2018-10-06 17:04:19', '2018-10-06 15:04:19'),
(5, 'Pooja S', 'pooja@gmail.com', 'svm', '2018-10-06 17:04:55', '2018-10-06 15:04:55'),
(6, 'Sammer S', 'sammer@gmail.com', 'ucoe', '2018-10-06 17:05:29', '2018-10-06 15:05:29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `school_`
--
ALTER TABLE `school_`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `school_`
--
ALTER TABLE `school_`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
