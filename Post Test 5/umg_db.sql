-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 10, 2025 at 12:54 PM
-- Server version: 8.4.3
-- PHP Version: 8.3.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `umg_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `albums`
--

CREATE TABLE `albums` (
  `id` int NOT NULL,
  `title` varchar(100) NOT NULL,
  `release_year` int DEFAULT NULL,
  `artist_id` int DEFAULT NULL,
  `tracklist` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `albums`
--

INSERT INTO `albums` (`id`, `title`, `release_year`, `artist_id`, `tracklist`) VALUES
(1, '5 Seconds of Summer', 2014, 1, 'She Looks So Perfect, Amnesia'),
(2, 'Fearless', 2008, 2, 'Love Story, You Belong With Me'),
(3, 'Midnights', 2022, 3, 'Lavender Haze, Anti-Hero, Karma'),
(4, 'Emails I Can?t Send', 2022, 4, 'Nonsense, Feather, Fast Times'),
(5, 'SOUR', 2021, 5, 'Drivers License, Deja Vu, Good 4 U'),
(6, 'Terlalu Manis', 1991, 6, 'Terlalu Manis, Anyer 10 Maret, Ku Tak Bisa'),
(7, 'The Land Is Inhospitable and So Are We', 2023, 7, 'Bug Like an Angel, Heaven, My Love Mine All Mine'),
(8, 'Beatopia', 2022, 8, 'Talk, 10:36, See You Soon'),
(9, 'Meet The Vamps', 2014, 9, 'Can We Dance, Wild Heart, Last Night'),
(10, 'Fine Line', 2019, 10, 'Adore You, Watermelon Sugar, Falling');

-- --------------------------------------------------------

--
-- Table structure for table `artists`
--

CREATE TABLE `artists` (
  `id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `genre` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `debut_year` int DEFAULT NULL,
  `label` varchar(100) DEFAULT NULL,
  `manager` varchar(100) DEFAULT NULL,
  `type` enum('Band','Solo') NOT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `members` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `artists`
--

INSERT INTO `artists` (`id`, `name`, `genre`, `country`, `debut_year`, `label`, `manager`, `type`, `nickname`, `members`) VALUES
(1, '5 Seconds of Summer', 'Pop Rock', 'Australia', 2011, 'Capitol Records', 'Adam Wilkinson', 'Band', NULL, 'Luke Hemmings, Calum Hood, Michael Clifford, Ashton Irwin'),
(2, 'Taylor Swift', 'Pop', 'USA', 2006, 'Republic Records', 'Tree Paine', 'Solo', 'TayTay', NULL),
(3, 'One Direction', 'Pop', 'UK', 2011, 'Polydor', 'Simon Cowell', 'Band', NULL, 'Harry Styles, Zayn Malik, Niall Horan, Liam Payne, Louis Tomlinson'),
(4, 'Sabrina Carpenter', 'Pop', 'USA', 2015, 'Republic Records', 'Sarah Stennett', 'Solo', 'Brina', NULL),
(5, 'Olivia Rodrigo', 'Pop', 'USA', 2020, 'Geffen Records', 'Aleen Keshishian', 'Solo', 'Liv', NULL),
(6, 'Slank', 'Rock', 'Indonesia', 1983, 'Capitol Records', 'Bimbim Slank', 'Band', NULL, 'Kaka, Ridho, Ivanka, Bimbim'),
(7, 'Mitski', 'Indie Rock', 'Japan/USA', 2012, 'Dead Oceans', 'Mitski Miyawaki', 'Solo', 'Mitski', NULL),
(8, 'Beabadoobee', 'Indie Rock', 'UK', 2018, 'Dirty Hit', 'Rex Orange County', 'Solo', 'Bea', NULL),
(9, 'The Vamps', 'Pop Rock', 'UK', 2012, 'Island Records', 'Joe O?Neill', 'Band', NULL, 'Brad Simpson, James McVey, Connor Ball, Tristan Evans'),
(10, 'Harry Styles', 'Pop Rock', 'UK', 2016, 'Columbia Records', 'Jeff Azoff', 'Solo', 'Harry', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `concerts`
--

CREATE TABLE `concerts` (
  `id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `location` varchar(100) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `lineup` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `concerts`
--

INSERT INTO `concerts` (`id`, `name`, `location`, `date`, `lineup`) VALUES
(1, 'Rock Out With Your Socks Out Tour', 'Sydney', '2015', '5 Seconds of Summer'),
(2, 'Fearless Tour', 'Nashville', '2009', 'Taylor Swift'),
(3, 'Love On Tour', 'London', '2023', 'Harry Styles'),
(4, 'SOUR Tour', 'Los Angeles', '2022', 'Olivia Rodrigo'),
(5, 'Emails I Can?t Send Tour', 'New York', '2023', 'Sabrina Carpenter'),
(6, 'Beatopia Tour', 'Tokyo', '2023', 'Beabadoobee'),
(7, 'The Land Is Inhospitable Tour', 'Chicago', '2023', 'Mitski'),
(8, 'The Slank Fest', 'Jakarta', '2022', 'Slank'),
(9, 'The Vamps Greatest Hits Tour', 'Manchester', '2022', 'The Vamps'),
(10, 'Fearless Tour Reboot', 'New York', '2023', 'Taylor Swift');

-- --------------------------------------------------------

--
-- Table structure for table `contracts`
--

CREATE TABLE `contracts` (
  `id` int NOT NULL,
  `artist_id` int DEFAULT NULL,
  `label_id` int DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `contracts`
--

INSERT INTO `contracts` (`id`, `artist_id`, `label_id`, `start_date`, `end_date`) VALUES
(1, 1, 2, '2011-01-01', '2020-12-31'),
(2, 2, 1, '2018-01-01', '2025-12-31'),
(3, 3, 3, '2011-01-01', '2020-12-31'),
(4, 4, 1, '2020-01-01', '2026-12-31'),
(5, 5, 4, '2021-01-01', '2025-12-31'),
(6, 6, 2, '1990-01-01', '2030-12-31'),
(7, 7, 5, '2018-01-01', '2028-12-31'),
(8, 8, 6, '2020-01-01', '2030-12-31'),
(9, 9, 7, '2014-01-01', '2024-12-31'),
(10, 10, 8, '2019-01-01', '2029-12-31');

-- --------------------------------------------------------

--
-- Table structure for table `labels`
--

CREATE TABLE `labels` (
  `id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `country` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contact` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `labels`
--

INSERT INTO `labels` (`id`, `name`, `country`, `address`, `contact`) VALUES
(1, 'Republic Records', 'USA', 'New York', '111-222-333'),
(2, 'Capitol Records', 'USA', 'Los Angeles', '444-555-666'),
(3, 'Polydor', 'UK', 'London', '123-456-789'),
(4, 'Geffen Records', 'USA', 'Los Angeles', '333-999-888'),
(5, 'Dead Oceans', 'USA', 'Bloomington', '444-111-222'),
(6, 'Dirty Hit', 'UK', 'London', '555-333-222'),
(7, 'Island Records', 'UK', 'London', '777-666-555'),
(8, 'Columbia Records', 'USA', 'New York', '888-777-666'),
(9, 'BigHit Music', 'South Korea', 'Seoul', '999-111-222'),
(10, 'Avex Group', 'Japan', 'Tokyo', '222-888-777');

-- --------------------------------------------------------

--
-- Table structure for table `songs`
--

CREATE TABLE `songs` (
  `id` int NOT NULL,
  `title` varchar(100) NOT NULL,
  `duration` varchar(10) DEFAULT NULL,
  `album_id` int DEFAULT NULL,
  `artist_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `albums`
--
ALTER TABLE `albums`
  ADD PRIMARY KEY (`id`),
  ADD KEY `artist_id` (`artist_id`);

--
-- Indexes for table `artists`
--
ALTER TABLE `artists`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `concerts`
--
ALTER TABLE `concerts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `contracts`
--
ALTER TABLE `contracts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `artist_id` (`artist_id`),
  ADD KEY `label_id` (`label_id`);

--
-- Indexes for table `labels`
--
ALTER TABLE `labels`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `songs`
--
ALTER TABLE `songs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `album_id` (`album_id`),
  ADD KEY `artist_id` (`artist_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `albums`
--
ALTER TABLE `albums`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `artists`
--
ALTER TABLE `artists`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `concerts`
--
ALTER TABLE `concerts`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `contracts`
--
ALTER TABLE `contracts`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `labels`
--
ALTER TABLE `labels`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `songs`
--
ALTER TABLE `songs`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `albums`
--
ALTER TABLE `albums`
  ADD CONSTRAINT `albums_ibfk_1` FOREIGN KEY (`artist_id`) REFERENCES `artists` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `contracts`
--
ALTER TABLE `contracts`
  ADD CONSTRAINT `contracts_ibfk_1` FOREIGN KEY (`artist_id`) REFERENCES `artists` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `contracts_ibfk_2` FOREIGN KEY (`label_id`) REFERENCES `labels` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `songs`
--
ALTER TABLE `songs`
  ADD CONSTRAINT `songs_ibfk_1` FOREIGN KEY (`album_id`) REFERENCES `albums` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `songs_ibfk_2` FOREIGN KEY (`artist_id`) REFERENCES `artists` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
