-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Nov 2024 pada 15.09
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

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
-- Struktur dari tabel `tbl_detail_sewa`
--

CREATE TABLE `tbl_detail_sewa` (
  `Status_Pengembalian` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_kategori`
--

CREATE TABLE `tbl_kategori` (
  `ID_Kategori` int(11) NOT NULL,
  `Nama_Kategori` varchar(45) NOT NULL,
  `Deskripsi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tbl_kategori`
--

INSERT INTO `tbl_kategori` (`ID_Kategori`, `Nama_Kategori`, `Deskripsi`) VALUES
(2411001, 'Konsol Budget Low', 'PlayStation di bawah 3'),
(2411002, 'Konsol Budget Up', 'Konsol dengan terbaru atau canggih ps 4 ketas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_konsol`
--

CREATE TABLE `tbl_konsol` (
  `ID_Konsol` varchar(11) NOT NULL,
  `Nama_konsol` varchar(45) NOT NULL,
  `Status` enum('Tersedia','Digunakan') DEFAULT NULL,
  `Stock` int(10) NOT NULL,
  `Harga_Perjam` varchar(45) NOT NULL,
  `Harga_Perhari` varchar(45) NOT NULL,
  `ID_Kategori` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tbl_konsol`
--

INSERT INTO `tbl_konsol` (`ID_Konsol`, `Nama_konsol`, `Status`, `Stock`, `Harga_Perjam`, `Harga_Perhari`, `ID_Kategori`) VALUES
('2411001', 'PlayStation2', 'Tersedia', 4, '2,000', '10,000', 2411002),
('2411002', 'PlayStation4', 'Tersedia', 4, '2,000', '2,0000', 2411002);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_pelanggan`
--

CREATE TABLE `tbl_pelanggan` (
  `ID_Pelanggan` varchar(12) NOT NULL,
  `Nama` varchar(45) NOT NULL,
  `Tipe_Identitas` varchar(45) NOT NULL,
  `Jenis_Kelamin` enum('Laki - Laki','Perempuan') NOT NULL,
  `Telepon` varchar(45) NOT NULL,
  `Alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tbl_pelanggan`
--

INSERT INTO `tbl_pelanggan` (`ID_Pelanggan`, `Nama`, `Tipe_Identitas`, `Jenis_Kelamin`, `Telepon`, `Alamat`) VALUES
('PLGN2411001', 'Dhemas', 'KTP', 'Laki - Laki', '085', 'Jember'),
('PLGN2411002', 'Tyan', 'SIM', 'Laki - Laki', '0812', 'Banyuwangi'),
('PLGN2411003', 'Refangga', 'KTM', 'Laki - Laki', '12345', 'Jember'),
('PLGN2411004', 'Teguh', 'KTP', 'Laki - Laki', '6789', 'Jember');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_pengembalian`
--

CREATE TABLE `tbl_pengembalian` (
  `ID_Pengembalian` int(11) NOT NULL,
  `Tanggal_Pengambalian` date NOT NULL,
  `ID_Sewa` int(11) NOT NULL,
  `ID_Pelangggan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_penyewaan`
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
-- Struktur dari tabel `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `ID_Transaksi` int(11) NOT NULL,
  `ID_Konsol` varchar(11) NOT NULL,
  `Durasi` int(11) NOT NULL,
  `Jenis_penyewaan` enum('Jam','Hari') NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `tgl_transaksi` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`ID_Transaksi`, `ID_Konsol`, `Durasi`, `Jenis_penyewaan`, `total`, `tgl_transaksi`) VALUES
(1, '2411001', 3, 'Jam', 6000.00, '2024-11-21 21:06:16'),
(2, '2411002', 3, 'Jam', 6000.00, '2024-11-21 21:06:16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_user`
--

CREATE TABLE `tbl_user` (
  `ID_User` int(11) NOT NULL,
  `Nama_User` varchar(45) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Level` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tbl_user`
--

INSERT INTO `tbl_user` (`ID_User`, `Nama_User`, `Username`, `Email`, `Password`, `Level`) VALUES
(1, 'a', '', 'a', '0cc175b9c0f1b6a831c399e269772661', 'a');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbl_kategori`
--
ALTER TABLE `tbl_kategori`
  ADD PRIMARY KEY (`ID_Kategori`);

--
-- Indeks untuk tabel `tbl_konsol`
--
ALTER TABLE `tbl_konsol`
  ADD PRIMARY KEY (`ID_Konsol`),
  ADD KEY `tbl_konsol_ibfk_1` (`ID_Kategori`);

--
-- Indeks untuk tabel `tbl_pelanggan`
--
ALTER TABLE `tbl_pelanggan`
  ADD PRIMARY KEY (`ID_Pelanggan`);

--
-- Indeks untuk tabel `tbl_pengembalian`
--
ALTER TABLE `tbl_pengembalian`
  ADD PRIMARY KEY (`ID_Pengembalian`),
  ADD KEY `tbl_pengembalian_ibfk_1` (`ID_Pelangggan`);

--
-- Indeks untuk tabel `tbl_penyewaan`
--
ALTER TABLE `tbl_penyewaan`
  ADD PRIMARY KEY (`ID_Sewa`),
  ADD KEY `tbl_penyewaan_ibfk_2` (`ID_User`),
  ADD KEY `tbl_penyewaan_ibfk_1` (`ID_Pelanggan`);

--
-- Indeks untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD PRIMARY KEY (`ID_Transaksi`),
  ADD KEY `fk_konsol` (`ID_Konsol`);

--
-- Indeks untuk tabel `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`ID_User`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  MODIFY `ID_Transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `ID_User` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tbl_konsol`
--
ALTER TABLE `tbl_konsol`
  ADD CONSTRAINT `tbl_konsol_ibfk_1` FOREIGN KEY (`ID_Kategori`) REFERENCES `tbl_kategori` (`ID_Kategori`);

--
-- Ketidakleluasaan untuk tabel `tbl_penyewaan`
--
ALTER TABLE `tbl_penyewaan`
  ADD CONSTRAINT `tbl_penyewaan_ibfk_2` FOREIGN KEY (`ID_User`) REFERENCES `tbl_user` (`ID_User`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD CONSTRAINT `fk_konsol` FOREIGN KEY (`ID_Konsol`) REFERENCES `tbl_konsol` (`ID_Konsol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
