-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2024 at 07:51 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventoryapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `detailpembelian`
--

CREATE TABLE `detailpembelian` (
  `IDDetailPembelian` int(11) NOT NULL,
  `IDPembelian` int(11) DEFAULT NULL,
  `KodeProduk` int(11) DEFAULT NULL,
  `Jumlah` int(11) DEFAULT NULL,
  `Harga` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detailpembelian`
--

INSERT INTO `detailpembelian` (`IDDetailPembelian`, `IDPembelian`, `KodeProduk`, `Jumlah`, `Harga`) VALUES
(10001, 9001, 1001, 10, 250.00),
(10002, 9002, 1002, 5, 200.00),
(10003, 9003, 1003, 8, 480.00);

-- --------------------------------------------------------

--
-- Table structure for table `detailpenjualan`
--

CREATE TABLE `detailpenjualan` (
  `IDDetailPenjualan` int(11) NOT NULL,
  `IDPenjualan` int(11) DEFAULT NULL,
  `KodeProduk` int(11) DEFAULT NULL,
  `Jumlah` int(11) DEFAULT NULL,
  `Harga` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detailpenjualan`
--

INSERT INTO `detailpenjualan` (`IDDetailPenjualan`, `IDPenjualan`, `KodeProduk`, `Jumlah`, `Harga`) VALUES
(8001, 7001, 1001, 5, 125.00),
(8002, 7002, 1002, 3, 150.00),
(8003, 7003, 1003, 8, 600.00);

-- --------------------------------------------------------

--
-- Table structure for table `distributor`
--

CREATE TABLE `distributor` (
  `IDDistributor` int(11) NOT NULL,
  `NamaDistributor` varchar(255) NOT NULL,
  `AlamatDistributor` varchar(255) DEFAULT NULL,
  `NomorTelepon` varchar(15) DEFAULT NULL,
  `EmailDistributor` varchar(255) DEFAULT NULL,
  `StatusDistributor` enum('Aktif','Tidak Aktif') DEFAULT 'Aktif'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `distributor`
--

INSERT INTO `distributor` (`IDDistributor`, `NamaDistributor`, `AlamatDistributor`, `NomorTelepon`, `EmailDistributor`, `StatusDistributor`) VALUES
(6001, 'Distributor X', 'Street XYZ, City X', '5551234', 'distributorX@example.com', 'Aktif'),
(6002, 'Distributor Y', 'Street YZA, City Y', '5555678', 'distributorY@example.com', 'Aktif'),
(6003, 'Distributor Z', 'Street ZAB, City Z', '5559012', 'distributorZ@example.com', 'Tidak Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `IDEmployee` int(11) NOT NULL,
  `NamaEmployee` varchar(255) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Gaji` decimal(10,2) NOT NULL,
  `IzinAksesTambahan` varchar(255) DEFAULT NULL,
  `TanggungJawabKhusus` varchar(255) DEFAULT NULL,
  `KasDitangani` varchar(255) DEFAULT NULL,
  `EmployeeType` enum('Admin','Staff','Kasir') NOT NULL,
  `Username` varchar(50) NOT NULL DEFAULT 'default',
  `Password` varchar(50) NOT NULL DEFAULT 'default',
  `status` enum('Aktif','Tidak Aktif') NOT NULL DEFAULT 'Aktif'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`IDEmployee`, `NamaEmployee`, `Jabatan`, `Gaji`, `IzinAksesTambahan`, `TanggungJawabKhusus`, `KasDitangani`, `EmployeeType`, `Username`, `Password`, `status`) VALUES
(2001, 'John Doe', 'Manager', 5000000.00, 'Full Access', NULL, NULL, 'Admin', 'admin', 'admin', 'Aktif'),
(3001, 'Jane Smith', 'Clerk', 3000000.00, NULL, 'Data Entry', NULL, 'Staff', 'staff', 'staff', 'Aktif'),
(4001, 'Bob Johnson', 'Cashier', 3500000.00, NULL, NULL, 'Cash Register #1', 'Kasir', 'kasir', 'kasir', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `IDPelanggan` int(11) NOT NULL,
  `NamaPelanggan` varchar(255) NOT NULL,
  `Alamat` varchar(255) DEFAULT NULL,
  `NomorTelepon` varchar(15) DEFAULT NULL,
  `NIK` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`IDPelanggan`, `NamaPelanggan`, `Alamat`, `NomorTelepon`, `NIK`) VALUES
(5001, 'Customer A', 'Street 123, City A', '123456789', 'NIK12345'),
(5002, 'Customer B', 'Street 456, City B', '987654321', 'NIK67890'),
(5003, 'Customer C', 'Street 789, City C', '111223344', 'NIK11223');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `IDPembelian` int(11) NOT NULL,
  `Tanggal` date DEFAULT NULL,
  `MetodePembayaran` varchar(50) DEFAULT NULL,
  `IDDistributor` int(11) DEFAULT NULL,
  `IDPegawai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`IDPembelian`, `Tanggal`, `MetodePembayaran`, `IDDistributor`, `IDPegawai`) VALUES
(9001, '2023-01-04', 'Credit Card', 6001, 2001),
(9002, '2023-01-05', 'Cash', 6002, 3001),
(9003, '2023-01-06', 'Credit Card', 6003, 4001);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `IDPenjualan` int(11) NOT NULL,
  `Tanggal` date DEFAULT NULL,
  `MetodePembayaran` varchar(50) DEFAULT NULL,
  `IDPelanggan` int(11) DEFAULT NULL,
  `IDPegawai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`IDPenjualan`, `Tanggal`, `MetodePembayaran`, `IDPelanggan`, `IDPegawai`) VALUES
(7001, '2023-01-01', 'Cash', 5001, 2001),
(7002, '2023-01-02', 'Credit Card', 5002, 3001),
(7003, '2023-01-03', 'Cash', 5003, 4001);

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `KodeProduk` int(11) NOT NULL,
  `NamaProduk` varchar(255) NOT NULL,
  `Harga` decimal(10,2) NOT NULL,
  `Stok` int(11) NOT NULL,
  `Kategori` varchar(50) DEFAULT NULL,
  `TanggalKadaluarsa` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`KodeProduk`, `NamaProduk`, `Harga`, `Stok`, `Kategori`, `TanggalKadaluarsa`) VALUES
(1001, 'Product A', 25000.00, 100, 'Category 1', '2023-12-31'),
(1002, 'Product B', 50000.00, 50, 'Category 2', '2023-12-31'),
(1003, 'Product C', 75000.00, 75, 'Category 1', '2023-12-31');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detailpembelian`
--
ALTER TABLE `detailpembelian`
  ADD PRIMARY KEY (`IDDetailPembelian`),
  ADD KEY `IDPembelian` (`IDPembelian`),
  ADD KEY `KodeProduk` (`KodeProduk`);

--
-- Indexes for table `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD PRIMARY KEY (`IDDetailPenjualan`),
  ADD KEY `IDPenjualan` (`IDPenjualan`),
  ADD KEY `KodeProduk` (`KodeProduk`);

--
-- Indexes for table `distributor`
--
ALTER TABLE `distributor`
  ADD PRIMARY KEY (`IDDistributor`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`IDEmployee`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`IDPelanggan`),
  ADD UNIQUE KEY `NIK` (`NIK`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`IDPembelian`),
  ADD KEY `IDDistributor` (`IDDistributor`),
  ADD KEY `IDPegawai` (`IDPegawai`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`IDPenjualan`),
  ADD KEY `IDPelanggan` (`IDPelanggan`),
  ADD KEY `IDPegawai` (`IDPegawai`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`KodeProduk`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detailpembelian`
--
ALTER TABLE `detailpembelian`
  ADD CONSTRAINT `detailpembelian_ibfk_1` FOREIGN KEY (`IDPembelian`) REFERENCES `pembelian` (`IDPembelian`),
  ADD CONSTRAINT `detailpembelian_ibfk_2` FOREIGN KEY (`KodeProduk`) REFERENCES `produk` (`KodeProduk`);

--
-- Constraints for table `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD CONSTRAINT `detailpenjualan_ibfk_1` FOREIGN KEY (`IDPenjualan`) REFERENCES `penjualan` (`IDPenjualan`),
  ADD CONSTRAINT `detailpenjualan_ibfk_2` FOREIGN KEY (`KodeProduk`) REFERENCES `produk` (`KodeProduk`);

--
-- Constraints for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `pembelian_ibfk_1` FOREIGN KEY (`IDDistributor`) REFERENCES `distributor` (`IDDistributor`),
  ADD CONSTRAINT `pembelian_ibfk_2` FOREIGN KEY (`IDPegawai`) REFERENCES `employee` (`IDEmployee`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`IDPelanggan`) REFERENCES `pelanggan` (`IDPelanggan`),
  ADD CONSTRAINT `penjualan_ibfk_2` FOREIGN KEY (`IDPegawai`) REFERENCES `employee` (`IDEmployee`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
