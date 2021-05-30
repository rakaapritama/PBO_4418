-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2021 at 10:33 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_crud`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblmahasiswa`
--

CREATE TABLE `tblmahasiswa` (
  `id` int(10) NOT NULL,
  `nim` varchar(15) DEFAULT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `jk` varchar(10) DEFAULT NULL,
  `alamat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblmahasiswa`
--

INSERT INTO `tblmahasiswa` (`id`, `nim`, `nama`, `jk`, `alamat`) VALUES
(1120, 'A11.2019.12195', 'Luthfi', 'L', 'Semarang'),
(1121, 'A11.2019.12196', 'X', 'L', 'Semarang'),
(1122, '1', '1', 'L', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblmahasiswa`
--
ALTER TABLE `tblmahasiswa`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblmahasiswa`
--
ALTER TABLE `tblmahasiswa`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1123;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
