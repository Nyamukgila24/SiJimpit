-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Jun 2025 pada 07.25
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
-- Database: `sijimpit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `menu_pembayaran_warga`
--

CREATE TABLE `menu_pembayaran_warga` (
  `nama` varchar(100) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `nominal` int(20) NOT NULL,
  `status` varchar(20) NOT NULL DEFAULT 'belum'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `menu_pembayaran_warga`
--

INSERT INTO `menu_pembayaran_warga` (`nama`, `nik`, `no_hp`, `tanggal`, `nominal`, `status`) VALUES
('11', '11', '11', '2028-09-05', 0, ''),
('3515100000', 'aini', '0882', '2025-05-16', 0, ''),
('123456', 'aiii', '0888', '2025-05-17', 15, ''),
('123456', 'Aini', '0888', '2025-05-17', 15000, ''),
('awdas', 'kwlda', '123123', '2025-09-08', 500, 'belum'),
('22', 'jokowi', '22', '2025-09-28', 500, 'belum'),
('12', 'mas cihuy', '123', '2008-12-25', 1000, 'belum'),
('22', 'Santoso', '22', '2005-12-09', 1000, 'verifikasi'),
('222', 'santoso', '222', '2005-09-12', 200, 'verifikasi'),
('1231231', 'santi', '232', '2008-10-09', 1000, 'verifikasi'),
('2', 'aron', '2', '2005-09-20', 1000, 'verifikasi'),
('123123', 'Iqq', '0838456', '2012-08-12', 2000, 'verifikasi'),
('22', 'amr', '22', '2024-12-20', 200, 'verifikasi'),
('8787', 'jkm', '089808099', '2005-09-20', 2000, 'verifikasi'),
('aku', '123213', '123', '2025-09-12', 2000, 'verifikasi'),
('Amba', '30192', '083', '2005-12-28', 2000, 'belum');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `noHP` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `nik`, `nama`, `password`, `noHP`, `role`) VALUES
(2, '1111111111111111', '', 'admin123', '', 'admin'),
(8, '12345678901', 'iqbal', '123456', '', 'user'),
(9, '2222', 'amr', '111111', '', 'user'),
(11, '11', 'Amri', '11', '', 'user'),
(12, '22', 'jokowi ', '22', '', 'user'),
(14, '123', 'Haji Susanto', '123', '083', 'user');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
