-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2024 at 01:22 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `app_rental`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_detail_sewa`
--

CREATE TABLE `tbl_detail_sewa` (
  `ID_Sewa` int(11) NOT NULL,
  `ID_Konsol` int(11) NOT NULL,
  `Status_Pengembalian` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kategori`
--

CREATE TABLE `tbl_kategori` (
  `ID_Kategori` varchar(11) NOT NULL,
  `Nama_Kategori` varchar(45) NOT NULL,
  `Deskripsi` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_kategori`
--

INSERT INTO `tbl_kategori` (`ID_Kategori`, `Nama_Kategori`, `Deskripsi`) VALUES
('KTG2411001', 'Playstation4', 'Ready'),
('KTG2411002', 'PlayStation3', 'Unready');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_konsol`
--

CREATE TABLE `tbl_konsol` (
  `ID_Konsol` int(11) NOT NULL,
  `Nama_konsol` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  `Harga_Perjam` varchar(45) NOT NULL,
  `Harga_Perhari` varchar(45) NOT NULL,
  `ID_Kategori` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pelanggan`
--

CREATE TABLE `tbl_pelanggan` (
  `ID_Pelanggan` varchar(11) NOT NULL,
  `Nama` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Telepon` varchar(15) NOT NULL,
  `Jenis_Kelamin` enum('Laki - Laki','Perempuan') NOT NULL,
  `Alamat` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_pelanggan`
--

INSERT INTO `tbl_pelanggan` (`ID_Pelanggan`, `Nama`, `Email`, `Telepon`, `Jenis_Kelamin`, `Alamat`) VALUES
('PLGN2411001', 'Tyan', 'Tyan@gmail.com', '123', 'Perempuan', 'Jember'),
('PLGN2411002', 'Teguh_Darah', 'Teguh@gmail.com', '085', 'Laki - Laki', 'Jember'),
('PLGN2411003', 'apa', 'apa', 'apa', 'Perempuan', 'apa'),
('PLGN2411004', 'bola', 'b', 'b', 'Perempuan', 'b'),
('PLGN2411005', 'obaac', 'cc', 'c', 'Laki - Laki', 'cc'),
('PLGN2411006', 'Refanggaaa', 'Refangga@gmail.com', 'Refangga', 'Laki - Laki', 'Ambulu'),
('PLGN2411007', 'Coba', 'Coba@gmail.com', '089', 'Perempuan', 'Jember'),
('PLGN2411008', 'L', 'l', '0', 'Laki - Laki', 'l'),
('PLGN2411009', 'apa', 'apa', '081', 'Laki - Laki', 'apa'),
('PLGN2411010', 'yy', 'yy', '00000000', 'Laki - Laki', 'yy'),
('PLGN2411011', 'oo', 'oo', '99999', 'Laki - Laki', 'oo'),
('PLGN2411012', 'uu', 'uu', '88', 'Perempuan', 'uu'),
('PLGN2411013', 'inces', 'inces', '10', 'Perempuan', 'korea'),
('PLGN2411014', 'vivi', 'viivi', '022', 'Laki - Laki', 'j'),
('PLGN2411015', 'gggg', 'h', '22', 'Laki - Laki', 'bb'),
('PLGN2411016', 'jdh', 'duh', '333', 'Perempuan', 'hbc');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pengembalian`
--

CREATE TABLE `tbl_pengembalian` (
  `ID_Pengembalian` int(11) NOT NULL,
  `Tanggal_Pengambalian` date NOT NULL,
  `ID_Sewa` int(11) NOT NULL,
  `ID_Pelangggan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_penyewaan`
--

CREATE TABLE `tbl_penyewaan` (
  `ID_Sewa` int(11) NOT NULL,
  `Tanggal_Sewa` date NOT NULL,
  `Tanggal_Pengembalian` date NOT NULL,
  `Status_Sewa` varchar(45) NOT NULL,
  `ID_User` int(11) NOT NULL,
  `ID_Pelanggan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `ID_User` int(11) NOT NULL,
  `Nama_User` varchar(45) NOT NULL,
  `Jenis_Kelamin` enum('Laki - Laki','Perempuan') DEFAULT NULL,
  `Email` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Level` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`ID_User`, `Nama_User`, `Jenis_Kelamin`, `Email`, `Password`, `Level`) VALUES
(1, 'a', NULL, 'a', '0cc175b9c0f1b6a831c399e269772661', 'a');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_detail_sewa`
--
ALTER TABLE `tbl_detail_sewa`
  ADD KEY `tbl_detail_sewa_ibfk_1` (`ID_Konsol`),
  ADD KEY `tbi_detail_sewa_ibfk_2` (`ID_Sewa`);

--
-- Indexes for table `tbl_kategori`
--
ALTER TABLE `tbl_kategori`
  ADD PRIMARY KEY (`ID_Kategori`);

--
-- Indexes for table `tbl_konsol`
--
ALTER TABLE `tbl_konsol`
  ADD PRIMARY KEY (`ID_Konsol`),
  ADD KEY `tbl_konsol_ibfk_1` (`ID_Kategori`);

--
-- Indexes for table `tbl_pelanggan`
--
ALTER TABLE `tbl_pelanggan`
  ADD PRIMARY KEY (`ID_Pelanggan`);

--
-- Indexes for table `tbl_pengembalian`
--
ALTER TABLE `tbl_pengembalian`
  ADD PRIMARY KEY (`ID_Pengembalian`),
  ADD KEY `tbl_pengembalian_ibfk_1` (`ID_Pelangggan`);

--
-- Indexes for table `tbl_penyewaan`
--
ALTER TABLE `tbl_penyewaan`
  ADD PRIMARY KEY (`ID_Sewa`),
  ADD KEY `tbl_penyewaan_ibfk_2` (`ID_User`),
  ADD KEY `tbl_penyewaan_ibfk_1` (`ID_Pelanggan`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`ID_User`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `ID_User` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_detail_sewa`
--
ALTER TABLE `tbl_detail_sewa`
  ADD CONSTRAINT `tbi_detail_sewa_ibfk_2` FOREIGN KEY (`ID_Sewa`) REFERENCES `tbl_penyewaan` (`ID_Sewa`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_detail_sewa_ibfk_1` FOREIGN KEY (`ID_Konsol`) REFERENCES `tbl_konsol` (`ID_Konsol`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_penyewaan`
--
ALTER TABLE `tbl_penyewaan`
  ADD CONSTRAINT `tbl_penyewaan_ibfk_2` FOREIGN KEY (`ID_User`) REFERENCES `tbl_user` (`ID_User`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
