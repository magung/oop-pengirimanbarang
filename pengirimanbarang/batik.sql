-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Bulan Mei 2019 pada 08.04
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `batik`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `batik`
--

CREATE TABLE `batik` (
  `no_kirim` varchar(20) NOT NULL,
  `nama_pembeli` varchar(50) NOT NULL,
  `tanggal_kirim` varchar(50) NOT NULL,
  `kode_batik` varchar(11) NOT NULL,
  `motif_batik` varchar(11) NOT NULL,
  `jumlah_kodi` varchar(20) NOT NULL,
  `total_harga` varchar(200) NOT NULL,
  `biaya_kirim` varchar(200) NOT NULL,
  `prosentase_adm` varchar(20) NOT NULL,
  `biaya_adm` varchar(200) NOT NULL,
  `total_biaya` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `batik`
--

INSERT INTO `batik` (`no_kirim`, `nama_pembeli`, `tanggal_kirim`, `kode_batik`, `motif_batik`, `jumlah_kodi`, `total_harga`, `biaya_kirim`, `prosentase_adm`, `biaya_adm`, `total_biaya`) VALUES
('1212', 'pembeli', '2019-05-01', 'BTK 02', 'Parang', '2', '900000', '40000', '5', '9000', '949000'),
('12121', 'pembeli', '2019-05-01', 'BTK 02', 'Parang', '2', '900000', '40000', '10', '18000', '958000'),
('1213', 'pembeli2', '2019-05-01', 'BTK 03', 'Parang', '2', '1000000', '46000', '0', '0', '1046000'),
('3', 'ay', '2019-05-02', 'BTK 03', 'Parang', '15', '7500000', '180000', '0', '0', '7680000'),
('31', 'ayobeli', '2019-05-02', 'BTK 03', 'Parang', '5', '2500000', '115000', '5', '25000', '2640000'),
('32', 'pembeli4', '2019-05-02', 'BTK 03', 'Parang', '12', '6000000', '144000', '10', '120000', '6264000'),
('321', 'ay1', '2019-05-02', 'BTK 03', 'Parang', $�O�.H(47�䌤 �;��x����Y����c���p0'���e�<�;���p}!U]5	c��(Ч�&V�e�?�x~���3���i���3��(�ͅ��!�K�q}U�B������)Mk���
*s]j��B�5s�\��V ��<�(6RH�	hE�z�wަxǍq>�Q��j�mVS��D��~F	�)��wЂ��3'*f��F�+��a��Ut�uW�g�I��
���@ Ԇ*�A�� Ӟ|�� �@"M2i�r������Aj`�[`���*�'���rV�H�W"uR+5Hr֢���57R�[�ɻ[J��]��P�.�ޫ^{ۅF���J�V�#Y$bP%O!UUI��a��D1b"f.
�K ��!`"��%~�/�����xiB'��!�DW`[)ӿ��V&,�\�rq�n~|�J��0[VW��VȜ���xb���u=�7e�9Q���>	=�o;\�et�,��2u��"�*�S ��m6�PX�jj�?���k�)0M
U�?�7�;}l����6�!²�m��Ǻ�j;�5	��O����,JI@�B,XC��`b�_+d� �f�e��