-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2021 at 06:40 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `addfriends`
--

CREATE TABLE `addfriends` (
  `PublicID` varchar(200) NOT NULL,
  `FriendID` varchar(200) NOT NULL,
  `Username` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addfriends`
--

INSERT INTO `addfriends` (`PublicID`, `FriendID`, `Username`) VALUES
('1996', '1234', 'Mario'),
('1996', '1998', 'Dori'),
('1234', '1998', 'Dori');

-- --------------------------------------------------------

--
-- Table structure for table `be`
--

CREATE TABLE `be` (
  `ID` varchar(200) NOT NULL,
  `Class` varchar(200) NOT NULL,
  `Day` varchar(200) NOT NULL,
  `Duration` varchar(200) NOT NULL,
  `Credit` varchar(200) NOT NULL,
  `Professor` varchar(200) NOT NULL,
  `Classroom` varchar(200) NOT NULL,
  `Students` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `be`
--

INSERT INTO `be` (`ID`, `Class`, `Day`, `Duration`, `Credit`, `Professor`, `Classroom`, `Students`) VALUES
('001107 ', 'Composition I', 'Thursday', '15:00-18:00', '6', 'Nicole Johnson', 'C1', ''),
('014595 \r\n', 'Composition II', 'Wednesday', '09:00-12:00', '6', 'Nicola Johnson', 'B2', ''),
('049317 ', 'Calculus I', 'Wednesday', '09:00-12:00', '6', 'Aleksandër Prifti\r\n ', 'A3', ''),
('093861 ', 'Computer Applications', 'Tuesday', '09:00-12:00', '6', 'Teuta Prifti', 'Lab1', ''),
('349239', 'Principles of Management', 'Monday', '09:00-13:00', '8', 'Drilon Shehu', 'Theater', ''),
('376230 ', 'Introduction to Microeconomics', 'Tuesday', '09:00-12:00', '6', 'Rigers Gramo', 'B3', ''),
('505228 ', 'Financial Accounting', 'Saturday', '09:00-13:00', '8', 'Jona Hoxha', 'C3', ''),
('851658 ', 'Foreign language I', 'Friday', '09:00-12:00', '4', 'Ronald Dako', 'A3', ''),
('959956 \r\n', 'Foreign language II', 'Thursday', '09:00-13:00', '4', 'Erik Majko', 'C2', ''),
('986093 ', 'Calculus II', 'Monday', '09:00-13:00', '6', 'Aleksandër Prifti\r\n ', 'C3', '');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `username` varchar(200) NOT NULL,
  `comment` varchar(1000) NOT NULL,
  `ID` int(11) NOT NULL,
  `class` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`username`, `comment`, `ID`, `class`) VALUES
('Mario', 'This class is easy!', 13, 'Computer Applications'),
('Mario', 'I got a B in the Midterm...', 14, 'Introduction to Programming'),
('Alex', 'I am thinking to enroll in this class', 15, 'Composition I');

-- --------------------------------------------------------

--
-- Table structure for table `cs`
--

CREATE TABLE `cs` (
  `ID` varchar(200) NOT NULL,
  `Class` varchar(200) NOT NULL,
  `Day` varchar(200) NOT NULL,
  `Duration` varchar(200) NOT NULL,
  `Credit` varchar(200) NOT NULL,
  `Professor` varchar(200) NOT NULL,
  `Classroom` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cs`
--

INSERT INTO `cs` (`ID`, `Class`, `Day`, `Duration`, `Credit`, `Professor`, `Classroom`) VALUES
('401202', 'Computer Applications', 'Friday', '09:00-12:00', '3', 'Ismail Prifti', 'Lab3'),
('402201', 'Introduction to Programming', 'Monday', '09:00-13:00', '4', 'Fatmire Shehu\r\n', 'Lab3'),
('402209', 'Object-Oriented Programming with Java', 'Tuesday', '09:00-13:00', '4', 'Dardana Hoxha', 'Lab3'),
('402211', 'Introduction to Computer Science', 'Saturday', '09:00-12:00', '3', 'Teuta Prifti', 'Lab1'),
('403203\r\n\r\n', 'Programming in C#.Net', 'Saturday', '09:00-12:00', '3', 'Ervin Prifti\r\n ', 'Lab3'),
('403204', 'Data Structures', 'Thursday', '09:00-12:00', '3', 'Klaudia Hoxha\r\n ', 'Lab3'),
('403205\r\n\r\n', 'Computer Organization and  System Architecture', 'Wednesday', '09:00-12:00', '3', 'Kristaq Dibra\r\n ', 'Lab3'),
('403206', 'Operating Systems', 'Monday', '09:00-12:00', '3', 'Kristaq Dibra\r\n ', 'Lab3'),
('404201', 'Database Systems', 'Wednesday', '09:00-12:00', '3', 'Admir Dibra\r\n ', 'Lab3'),
('404212', 'System Analysis & Design', 'Friday', '09:00-12:00', '3', 'Bora Prifti', 'Lab3'),
('404219', 'Introduction to Mobile Application Development', 'Friday', '09:00-12:00', '3', 'Spartak Shehu\r\n ', 'Lab3'),
('404220\r\n\r\n', 'System Administration', 'Thursday', '09:00-12:00', '3', 'Vera Hoxha\r\n ', 'Lab3'),
('404221', 'Algorithms and Complexity', 'Tuesday', '17:00-20:00', '3', 'Pranvera Shehu\r\n ', 'Lab3'),
('422103\r\n\r\n', 'Calculus I', 'Monday', '09:00-13:00', '4', 'Ali Dibra\r\n ', 'A1'),
('422104', 'Calculus II', 'Tuesday', '09:00-13:00', '4', 'Ramiz Hoxha\r\n ', 'A1'),
('422108', 'Discrete Mathematics', 'Wednesday', '09:00-13:00', '4', 'Ramiz Hoxha\r\n ', 'A1'),
('423107', 'Probability and Statistics', 'Tuesday', '09:00-12:00', '3', 'Aleksandër Prifti\r\n ', 'A1');

-- --------------------------------------------------------

--
-- Table structure for table `encrollcourse`
--

CREATE TABLE `encrollcourse` (
  `CID` varchar(1000) NOT NULL,
  `Class` varchar(1000) NOT NULL,
  `Username` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `encrollcourse`
--

INSERT INTO `encrollcourse` (`CID`, `Class`, `Username`) VALUES
('404221', 'Algorithms and Complexity', 'Mario'),
('088644', 'Theories of Personality', 'Dori'),
('154305', 'Intro to Philosophy', 'Dori'),
('986093', 'Calculus II', 'Alex');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` varchar(4) NOT NULL,
  `Username` varchar(250) NOT NULL,
  `Password` varchar(250) NOT NULL,
  `registration` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Age` varchar(200) NOT NULL,
  `Degree` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Username`, `Password`, `registration`, `Email`, `Age`, `Degree`) VALUES
('1234', 'Mario', '1234', '28/05/2021', 'dori@gmail.com', '23', 'CS'),
('1996', 'Alex', '1996', '31/05/2021', 'alex@gmail.com', '21', 'BE'),
('1998', 'Dori', '1998', '31/05/2021', 'dori@gmail.com', '23', 'PY');

-- --------------------------------------------------------

--
-- Table structure for table `py`
--

CREATE TABLE `py` (
  `ID` varchar(200) NOT NULL,
  `Class` varchar(200) NOT NULL,
  `Day` varchar(200) NOT NULL,
  `Duration` varchar(200) NOT NULL,
  `Credit` varchar(200) NOT NULL,
  `Professor` varchar(200) NOT NULL,
  `Classroom` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `py`
--

INSERT INTO `py` (`ID`, `Class`, `Day`, `Duration`, `Credit`, `Professor`, `Classroom`) VALUES
('088644', 'Theories of Personality', 'Saturday', '09:00-12:00', '3', 'Skënder Prifti', 'B2'),
('154305', 'Intro to Philosophy', 'Monday', '09:00-12:00', '3', 'Teuta Dibra', 'C3'),
('401980 ', 'Human Biology', 'Thursday', '09:00-12:00', '3', 'Granit Shehu', 'C3'),
('494609', 'Social Psychology', 'Tuesday', '09:00-12:00', '3', 'Skënder Hoxha', 'C1'),
('559371 ', 'General Psychology', 'Tuesday', '09:00-12:00', '3', 'Mirela Dibra', 'Theatre'),
('567376 ', 'Statistics I', 'Monday', '09:00-12:00', '3', 'Luan Hoxha', 'A3'),
('632258 ', 'Introduction to Learning and Cognition', 'Monday', '09:00-12:00', '3', 'Gentian Hoxha', 'C1'),
('702092 ', 'Industrial & Organizational Behavior', 'Friday', '09:00-12:00', '3', 'Behar Shehu', 'C2'),
('787503 ', 'History and Systems of Psychology', 'Wednesday', '09:00-12:00', '3', 'Alma Dibra', 'Theater'),
('922673', 'Introduction to Psychological Testing and Measurement', 'Wednesday', '09:00-12:00', '3', 'Ervin Prifti', 'C3'),
('970625', 'Psychology of Adolescence and Adulthood', 'Friday', '09:00-12:00', '3', 'Xhesika Prifti', 'C1'),
('984310', 'Psychoanalysis, Humanism and Behaviorism', 'Tuesday', '09:00-12:00', '3', 'Fatmire Dibra', 'B3'),
('990313', 'Abnormal Psychology', 'Thursday', '09:00-12:00', '3', 'Flutura Dibra', 'A3'),
('992383 ', 'Psychology of infancy and Childhood', 'Saturday', '09:00-12:00', '3', 'Luljeta Shehu', 'B2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `be`
--
ALTER TABLE `be`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `cs`
--
ALTER TABLE `cs`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `py`
--
ALTER TABLE `py`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
