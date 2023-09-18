-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2021 at 01:38 AM
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
-- Database: `doanjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `user` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `accountType` varchar(30) NOT NULL,
  `employeeID` varchar(30) DEFAULT NULL,
  `remember` tinyint(1) NOT NULL,
  `enabled` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`user`, `password`, `accountType`, `employeeID`, `remember`, `enabled`) VALUES
('NV01', 'NV010332329456', 'Admin', 'NV01', 1, 1),
('NV02', 'NV020789456123', 'Admin', 'NV02', 0, 1),
('NV03', 'NV030123456789', 'Admin', 'NV03', 0, 1),
('NV04', 'NV0401223671799', 'Admin', 'NV04', 0, 1),
('NV05', 'NV050542137899', 'Admin', 'NV05', 0, 1),
('root', 'admin', 'mainAdmin', NULL, 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `billID` varchar(30) NOT NULL,
  `employeeID` varchar(30) NOT NULL,
  `customerID` varchar(30) NOT NULL,
  `date` varchar(30) NOT NULL,
  `time` varchar(30) NOT NULL,
  `total` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`billID`, `employeeID`, `customerID`, `date`, `time`, `total`) VALUES
('HD1', 'root', 'KH08', '2021/05/23', '14:59:43', 694400),
('HD2', 'root', 'KH02', '2021/05/23', '20:56:32', 418500),
('HD3', 'root', 'KH10', '2021/05/23', '20:59:03', 1229700),
('HD4', 'NV01', 'KH07', '2021/05/23', '21:01:53', 980000);

-- --------------------------------------------------------

--
-- Table structure for table `billdetail`
--

DROP TABLE IF EXISTS `billdetail`;
CREATE TABLE `billdetail` (
  `billID` varchar(30) NOT NULL,
  `productID` varchar(30) NOT NULL,
  `quantity` int(10) NOT NULL,
  `price` int(30) NOT NULL,
  `total` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billdetail`
--

INSERT INTO `billdetail` (`billID`, `productID`, `quantity`, `price`, `total`) VALUES
('HD1', 'KH03', 1, 380000, 304000),
('HD1', 'KH04', 1, 220000, 154000),
('HD1', 'KNS01', 2, 76000, 121600),
('HD1', 'KNS02', 1, 70000, 70000),
('HD1', 'KNS03', 1, 64000, 44800),
('HD2', 'KH01', 1, 145000, 130500),
('HD2', 'KH02', 1, 100000, 80000),
('HD2', 'KNS04', 1, 80000, 64000),
('HD2', 'NN02', 1, 180000, 144000),
('HD3', 'KH01', 9, 145000, 1174500),
('HD3', 'MG01', 1, 69000, 55200),
('HD4', 'NN01', 10, 140000, 980000);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `categoryID` varchar(30) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`categoryID`, `name`) VALUES
('khoa_hoc', 'Khoa học'),
('ky_nang_song', 'Kỹ năng sống'),
('manga', 'Manga'),
('ngoai_ngu', 'Ngoại ngữ'),
('ngon_tinh', 'Ngôn tình '),
('tieu_thuyet', 'Tiểu thuyết');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customerID` varchar(30) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `phone` varchar(11) NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `name`, `phone`, `address`) VALUES
('KH01', 'Nguyễn Văn A', '123456789', '95/16/3-A Trịnh Đình Trọng , P.Phú Trung , Q.Tân Phú'),
('KH02', 'Trần Thị B', '987654321', 'Số 1 Đường 3/2 , P.8 , Q.11'),
('KH03', 'Huỳnh Hậu Giang', '567891234', '8 Lò Siêu , P.16 , Q.11'),
('KH04', 'Nam Kì Khởi Nghĩa', '543219876', '269/8 Nguyễn Thị Nhỏ, P.16, Q.11'),
('KH05', 'Trần Quang Khải', '123459876', '343D Lạc Long Quân, P.5 , Q.11'),
('KH06', 'Mạc Đĩnh Chi', '987654320', '4 Tân Hòa Đông, P.14, Q.6,'),
('KH07', 'Marie Curie', '456123780', '159 Nam Kỳ Khởi Nghĩa, P.7, Q.3'),
('KH08', 'Nguyễn Thị Minh Khai', '1234569870', '275 Điện Biên Phủ, P.7, Q.3,'),
('KH09', 'Trịnh Tuấn C', '33645789', '6/7 Thái Phiên , P.16 , Q.11'),
('KH10', 'Võ Văn D', '45132971', '72 Đường số 5 CX Bình Thới, P.8, Q.11');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employeeID` varchar(30) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `phone` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeID`, `name`, `dob`, `address`, `phone`) VALUES
('NV01', 'Trịnh Tuấn Lộc', '1/1/2001', 'Số 1 Thái Phiên , P.16 , Q.11', '0332329456'),
('NV02', 'Nhân viên 02', '16/11/2001', '527 Sư Vạn Hạnh, P.12, Q.10', '0789456123'),
('NV03', 'Nhân viên 03', '27/11/2001', '215 Hồng Bàng, P.11, Q.5', '0123456789'),
('NV04', 'Nhân viên 04', '9/5/2001', '111 Trần Quý , P.4 , Q.11', '01223671799'),
('NV05', 'Nhân viên 05', '27/3/2001', 'Số 2 Bertrand Russell, P.Tân Phú , Q.7', '0542137899'),
('root', 'Main Admin', 'none', 'none', 'none');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` varchar(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `author` varchar(30) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `size` varchar(30) NOT NULL,
  `category` varchar(30) NOT NULL,
  `coverType` varchar(11) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `datePublic` varchar(11) NOT NULL,
  `detail` varchar(1000) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `discount` varchar(5) NOT NULL,
  `url` varchar(50) NOT NULL,
  `stock` int(11) NOT NULL,
  `issuers` varchar(50) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `pages` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `supplier` varchar(50) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `translator` varchar(30) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `author`, `size`, `category`, `coverType`, `datePublic`, `detail`, `discount`, `url`, `stock`, `issuers`, `pages`, `price`, `supplier`, `translator`) VALUES
('KH01', 'Vũ trụ từ hư không', 'Lawrence M Krauss', '14 x 20.5 cm', 'khoa_hoc', 'Bìa mềm', '01-2019', 'Cuốn sách dành cho những ai quan tâm đến Vật lý học, Vũ trụ học, những ai tò mò Vũ trụ của chúng ta đã bắt đầu như thế nào, và kết thúc ra sao.', '0.1', 'src/img/book/KH_1.jpg', 20, 'Alpha Books', 320, 145000, 'NXB Thế Giới', NULL),
('KH02', 'Trật Tự Thời Gian', 'Carlo Rovelli', '14 x 20,5 cm', 'khoa_hoc', 'Bìa mềm', '12-2019', 'Thời gian là một bí ẩn không ngừng đánh đố chúng ta. Các triết gia, nghệ sĩ và nhà thơ từ lâu đã khám phá ý nghĩa của nó trong khi các nhà khoa học nhận thấy rằng cấu trúc của thời gian khác với trực giác đơn giản mà chúng ta có về nó. Từ Boltzmann đến lý thuyết lượng tử, từ Einstein đến hấp dẫn lượng tử vòng, sự hiểu biết của chúng ta về thời gian đã trải qua những biến đổi căn bản.\r\nVới sự quyến rũ phi thường, kết hợp khoa học, triết học và nghệ thuật, Carlo Rovelli đã làm sáng tỏ bí ẩn về thời gian. Trật tự thời gian cho thấy rằng để hiểu chính mình, chúng ta cần suy ngẫm về thời gian - và để hiểu thời gian chúng ta cần suy ngẫm về bản thân.', '0.2', 'src/img/book/KH_2.jpg', 29, 'Alpha Books', 232, 100000, 'NXB Thế Giới', 'Nguyễn Hải Châu'),
('KH03', 'The Book Of Humans', 'Adam Rutherford', '19.6 x 12.8 x 2.4 cm', 'khoa_hoc', 'Bìa mềm', '01-2019', 'WHAT MAKES US HUMAN?\r\nWaging war?\r\nSex for pleasure?\r\nCreating art?\r\nMastery of fire?\r\nIn this thrilling tour of the animal kingdom, Adam Rutherford tells the story of how we became the unique creatures we are today. Illuminated by the latest scientific discoveries, THE BOOK OF HUMANS is a dazzling compendium of what unequivocally fixes us as animals, and reveals how we are extraordinary among them.', '0.2', 'src/img/book/KH_3.jpg', 29, 'Hachette UK Distribution', 272, 380000, 'W&N', NULL),
('KH04', 'Borrowed Time: The Science Of How And Why We Age', 'Sue Armstrong', '21.6 x 13.5 x 2.2 cm', 'khoa_hoc', 'Bìa mềm', '1-2020', 'The question of how and why organisms age has teased scientists for centuries. There are myriad competing theories, from the idea that aging is a simple wear and tear process, like the rusting of a car, to the belief that aging and death are genetically programmed and controlled. In fact, there is no clearly defined limit to life, and no single, predictable program playing itself out: different things are happening within and between tissues, and each system or organ accumulates damage at its own pace, according to the kind of insults imposed on it by daily living.', '0.3', 'src/img/book/KH_4.jpg', 29, 'Macmillan Publishers', 272, 220000, 'Bloomsbury Publishing', 'Bloomsbury Publishing'),
('KNS01', 'Đắc nhân tâm', 'Dale Carnegie', '14.5 x 20.5 cm', 'ky_nang_song', 'Bìa mềm', '03-2016', 'Cuốn sách đưa ra các lời khuyên về cách thức cư xử, ứng xử và giao tiếp với mọi người để đạt được thành công trong cuộc sống.', '0.2', 'src/img/book/KNS_01.jpg', 28, 'FIRST NEWS', 320, 76000, 'NXB Tổng hợp TP.HCM', NULL),
('KNS02', 'Tuổi trẻ đáng giá bao nhiêu?', 'Rosie Nguyễn', '14 x 20.5 cm', 'ky_nang_song', 'Bìa mềm', '10-2016', 'Cuốn sách mang đến cho các bạn trẻ những tư tưởng tích cực nhất để mạnh mẽ bước chân vào đời.', '0', 'src/img/book/KNS_02.jpg', 29, 'Nhã Nam', 285, 70000, 'NXB Hội Nhà Văn', NULL),
('KNS03', 'Nếu tôi biết được khi còn 20', 'Tina Seelig', '13 x 20.5 cm', 'ky_nang_song', 'Bìa mềm', '02-2016', 'Cuốn sách trang bị cho bạn sự tự tin để biến căng thẳng thành sự hào hứng, biến thử thách thành các cơ hội.', '0.3', 'src/img/book/KNS_03.jpg', 29, 'NXB Trẻ', 252, 64000, 'NXB Trẻ', NULL),
('KNS04', 'Đừng lựa chọn an nhàn khi còn trẻ', 'Cảnh Thiên', '13 x 20.5 cm', 'ky_nang_song', 'Bìa mềm', '02-2019', 'Nếu bạn lựa chọn an nhàn trong 10 năm, tương lai sẽ buộc bạn phải vất vả trong 50 năm để bù đắp lại. Nếu bạn bươn chải vất vả trong 10 năm, thứ mà bạn chắc chắn có được là 50 năm hạnh phúc. Điều quý giá nhất không phải là tiền mà là tiền bạc. Thế nên, bạn à, đừng lựa chọn an nhàn khi còn trẻ.', '0.2', 'src/img/book/KNS_04.jpg', 29, 'AZ Việt Nam', 316, 80000, 'NXB Thế giới', NULL),
('MG01', 'Fullmetal Alchemist - Cang Giả Kim Thuật Sư - Fullmetal Edition Tập 7', 'Hiromu Arakawa', '18 x 13 cm', 'manga', 'Bìa mềm', '1-2020', 'Trong thế giới của những giả kim thuật sư, có một tồn tại đã đi vào huyền thoại và trở thành ước mơ bất cứ ai cũng ao khát - đó chính là \"Hòn đá Triết gia\".\r\nBối cảnh của \"Fullmetal Alchemist\" được đặt trong một thế giới hư cấu, nơi giả kim thuật là một trong những kĩ thuật khoa học tiên tiến nhất con người từng biết đến. Và anh em nhà Elric cũng không là ngoại lệ. Sau thất bại khi cố gắng đem người mẹ dấu yêu từ cõi chết trở về, người anh Edward mất đi chân trái và người em Alphonse mất toàn bộ cơ thể; bằng nỗ lực đến tuyệt vọng, Edward đã hi sinh nốt cánh tay phải của mình để giành lại linh hồn Alphonse và chuyển hóa nó vào trong một bộ giáp.', '0.2', 'src/img/book/MG_1.jpg', 29, 'NXB Kim Đồng', 244, 69000, 'NXB Kim Đồng', NULL),
('MG02', 'OVERLORD - Tập 1', 'Maruyama Kugane', '18 x 13 cm', 'manga', 'Bìa mềm', '1-2020', 'Được chuyển thể từ light novel ăn khách cùng tên, Overlord phiên bản truyện tranh xoay quanh nhân vật Momonga, chủ tướng guild Ainz Ooal Gown hùng mạnh trong game YGGDRASIL. Mặc dù đã từng được săn đón nồng nhiệt, song thời gian trôi qua, YGGDRASIL cũng tới ngày phải đóng cửa. Những đồng đội ngày xưa bỏ đi, chỉ còn một mình Momonga ngồi trong đại lăng mộ Nazarick, căn cứ của guild, chờ đợi giây phút kết thúc.\r\nThế nhưng, khoảnh khắc đóng cửa trôi qua, Momonga nhận ra mình không còn ở trong game YGGDRASIL nữa mà đã bị dịch chuyển đến thế giới khác.\r\nSau khi cân nhắc hoàn cảnh của bản thân ở thế giới thật (không người thân, bạn bè, người yêu, cũng chẳng có địa vị trong xã hội), Momonga quyết định ở lại thế giới này, bắt đầu hành trình “xâm lược thế giới”.', '0.2', 'src/img/book/MG_2.jpg', 30, 'IPM', 180, 35000, 'NXB Hà Nội', 'Supa'),
('MG03', 'Spy X Family Tập 1', 'Tatsuya Endo', '17.6 x 11.3 cm', 'manga', 'Bìa mềm', '1-2020', 'Nhằm ngăn chặn âm mưu gây chiến, giữ vững nền hòa bình Đông - Tây, điệp viên hàng đầu của Westalis, Twilight phải xây dựng một gia đình và cho con theo học tại học viện danh giá nhất Ostania hòng tiếp cận yếu nhân cầm đầu phe chủ chiến của đất nước này: Desmon Donavan! Và thật tình cờ, đứa trẻ mà Twilight nhận làm \"con\" ở cô nhi viện, Anya, lại có khả năng đọc suy nghĩ của người khác. Chưa kể \"người vợ\" anh buộc phải chọn lựa trong lúc vội vàng, Yor, lại là một… sát thủ!!\r\nBa người với lí do riêng để che giấu thân phận đã cùng chung sống với nhau dưới một mái nhà. Từ đây câu chuyện siêu hấp dẫn và hài hước về gia đình điệp viên chính thức mở !!', '0.4', 'src/img/book/MG_3.jpg', 30, 'NXB Kim Đồng', 208, 25000, 'NXB Kim Đồng', 'Phương Nga'),
('MG04', 'Crimson-Shell - Đóa Hồng Đỏ Thẫm', 'Jun Mochizuki', '18 x 13 cm', 'manga', 'Bìa mềm', '1-2020', 'Từ thời xa xưa, có một lão bác học điên đã tạo ra một loài hoa đặc biệt gọi là \"Premier Rose\". Sau đó, ông trồng gieo hạt và cấy hạt \"Premier Rose\" vào cơ thể con người khiến cho người đó trở nên điên cuồng và mất đi lí trí. Người ta gọi nó là \"Black Rose\". Duy, có một trường hợp đặc biệt đó là trường hợp đột biến của Claudia, hay người ta còn gọi là Rose Witch, một Black Rose lạnh lùng, trầm cảm (dễ thương, xinh đẹp, loli, mặc đồ gothic, ) đã được Xeno, một kiếm sĩ bí ẩn đánh tan \"tản băng\" ấy và họ trở thành một cặp trời sinh. Vào một ngày \"đệp zời\", Xeno đã phản bội tổ chức Red Rose, tổ chức được thành lập để săn lùng Black Rose. Claudia, thành viên ưu tú của họ, không chỉ giỏi chiến đấu mà còn có một bí mật đặc biệt. Bên trong cô, có hạt giống Hoa Hồng Đỏ Thẫm! Claudia quyết định sẽ tìm anh và hỏi cho ra lẽ về vụ việc này. Liệu cô có gây rắc rối gì không? Liệu cô có thể chịu đựng được sự phản bội từ người cô thương yêu nhất?', '0', 'src/img/book/MG_4.jpg', 30, 'NXB Kim Đồng', 208, 36000, 'NXB Kim Đồng', NULL),
('NN01', 'Cambridge Ielts 14 Academic With Answers', 'Cambridge', '19 x 24 cm', 'ngoai_ngu', 'Bìa mềm', '12-2019', 'Authentic examination papers from Cambridge Assessment English provide perfect practice because they are EXACTLY like the real test. Inside IELTS 14 Academic with Answers (without audio) you\'ll find FOUR complete examination papers plus details of the different parts of the test and the scoring system, so you familiarise yourself with the test format and practise your exam technique. This book comes with answers, tape scripts and sample writing answers. This book does not contain the audio recordings. A Student\'s Book with Answers with Audio is sold separately and includes all the material for the Listening tests.', '0.3', 'src/img/book/NN_1.jpg', 20, 'Cty Sách VN', 300, 140000, 'NXB Cambridge University', 'Hương Giang'),
('NN02', 'Giải Thích Ngữ Pháp Tiếng Anh Với Bài Tập Và Đáp Án', 'Mai Lan Hương, Hà Thanh Uyên', '24 x 17 cm', 'ngoai_ngu', 'Bìa mềm', '1-2020', 'Trong lần tái bản GIẢI THÍCH NGỮ PHÁP TIẾNG ANH năm 2020 này, nhằm nâng cao chất lượng sách và giúp người học trau dồi, củng cố và nâng cao kiến thức ngữ pháp tiếng Anh, chúng tôi chỉnh sửa, bổ sung và cập nhật một số kiến thức ngữ pháp mới.\r\nẤn bản mới GIẢI THÍCH NGỮ PHÁP TIẾNG ANH gồm 5 chương, hệ thống hóa toàn diện kiến thức ngữ pháp tiếng Anh từ cơ bản đến nâng cao:\r\nChương 1: Từ Loại (Parts of Speech)\r\nChương 2: Thì và Sự Phối Hợp Thì (Tenses and Sequence of Tenses)\r\nChương 3: Mệnh Đề (Clauses)\r\nChương 4: Câu (Sentences)\r\nChương 5: Từ Vựng Học (Word Study)', '0.2', 'src/img/book/NN_2.jpg', 29, 'ZenBooks', 560, 180000, 'NXB Đà Nẵng', ''),
('NN03', 'Hackers Ielts: Writing', 'Viện ngôn ngữ Hackers', '16 x 24 cm', 'ngoai_ngu', 'Bìa mềm', '1-2019', 'Sách hướng dẫn rất rõ về phần thi IELTS Listening, từ cách thức thi, cách làm bài, kể cả kế hoạch cụ thể để ôn luyện mỗi ngày trong vòng 1-2 tháng.', '0', 'src/img/book/NN_3.jpg', 30, 'Alpha Books', 452, 239000, 'NXB Thế Giới', 'Ngô Thu Hằng'),
('NN04', 'How To Crack The Ielts Speaking Test - Part 1', 'Đặng Trần Tùng', '16 x 24 cm', 'ngoai_ngu', 'Bìa mềm', '1-2020', 'Cuốn sách tập trung vào 20 chủ đề thường gặp trong IELTS Speaking, với những tips hữu ích nhằm giúp các thí sinh có thể đạt được các band điểm mong muốn, phổ biến với các mức 6.0, 7.0 và 8.0. Các câu trả lời mẫu trong sách cũng xoay quanh cuộc sống thường ngày, tạo cảm giác quen thuộc, gần gũi với người đọc, mở ra hướng tư duy gắn liền với thực tiễn cuộc sống.\r\n\r\n', '0', 'src/img/book/NN_4.jpg', 30, 'Alpha Books', 252, 299000, 'NXB Thế Giới', NULL),
('NT01', 'Yêu Thầm Mười Năm Chưa Dám Nói', 'Minh Khai Dạ Hợp', '20.5 x 14.5 cm', 'ngon_tinh', 'Bìa mềm', '1-2020', 'Một Lâm Duyệt chấp nhất vì tình yêu, một Trần Lộc Xuyên kiên trì vì Lâm Duyệt.\r\nThuở mộng mơ, cô là cô gái nhỏ nhút nhát “Mình thích cậu ấy, nhưng không dám bắt chuyện”; anh là chàng trai với lòng tự trọng cao “Cô ấy còn chẳng thèm để ý đến mình, chắc là ghét mình rồi”.\r\nLớn lên, cô là nhân viên kế hoạch lanh lợi “Cứ thế đi, mình phải cho anh ấy biết mình yêu anh ấy”; anh là lập trình viên xứng tầm “nam thần” “Bất kể thế nào cũng phải khiến cô ấy yêu mình”.\r\nLiệu hai người có cùng thực hiện được mong ước, khiến sự chờ đợi và nhung nhớ hơn mười năm trời không bị phí hoài hay không?', '0.1', 'src/img/book/NT_1.jpg', 30, 'AZ Việt Nam', 528, 145000, 'NXB Thanh Niên', 'Hàn Vũ Phi'),
('NT02', 'Anh Không Muốn Để Em Một Mình', 'Diệp Lạc Vô Tâm', '20.5 x 14.5 cm', 'ngon_tinh', 'Bìa mềm', '1-2020', 'Cuộc đời con người ngắn ngủi, chúng ta luôn cố gắng tiến về phía trước, hy vọng phía cuối con đường nhìn thấy phong cảnh đẹp. Nhưng khi chúng ta thực sự đến điểm cuối đó, chờ đợi chúng ta lại là phong cảnh nào? Tôi không thể nghĩ ra nên nói chuyện với một vài người... là những người bước lên “chuyến tàu cuối” của cuộc đời. Đối với họ, hành trình sinh mệnh chỉ còn lại trạm cuối cùng, họ muốn dừng chân, ngắm thật nhiều phong cảnh hai bên đường, cho dù chỉ là một bông hoa nở, một chiếc lá rơi…\r\nThì ra, câu chuyện của cuộc đời không giống như tiểu thuyết, câu chuyện của cuộc đời luôn không biết lúc nào thì đột nhiên dừng lại, chỉ còn lại là bông pháo hoa rực rỡ và ngắn ngủi trong ký ức mỗi người.', '0', 'src/img/book/NT_2.jpg', 30, 'Đinh Tị', 272, 89000, 'NXB Văn Học', 'Hà Giang'),
('NT03', 'Ngàn Năm Chờ Đợi', 'Diệp Lạc Vô Tâm', '13 x 20.5 cm', 'ngon_tinh', 'Bìa mềm', '12-2019', 'Ai bảo thần tiên không có cảm giác, không có máu và nước mắt? Đó là sự khắc cốt ghi tâm chưa một lần trải qua\r\nTa coi nàng là tri kỷ, coi nàng là người duy nhất hiểu được nỗi niềm tâm sự trong lòng ta giữa đất trời bao la, cũng là người duy nhất có thể tồn tại vĩnh hằng với ta trong tam giới...\r\nNếu một ngày nào đó nàng có thể nói chuyện với ta, mỉm cười với ta, thì ta sẵn sàng đánh đổi bằng tất cả những gì ta có...\r\nTại sao đến khi cử động được, mỉm cười được, nàng lại quên ta nhanh như vậy...', '0.2', 'src/img/book/NT_3.jpg', 30, 'Đinh Tị', 176, 45000, 'NXB Thanh Niên', 'Hà Giang'),
('NT04', 'Sự Dịu Dàng Khó Cưỡng', 'Diệp Lạc Vô Tâm', '14.5 x 20.5 cm', 'ngon_tinh', 'Bìa mềm', '12-2019', 'Sinh nhật lần thứ 14, Quan Tiểu Úc gặp tình yêu sét đánh tại Bule Pub. Anh chàng lạ mắt trông cao quý và hấp dẫn đã thu hút ánh nhìn và trái tim cô bé mới lớn. Rồi khi nhìn chàng trai xa lạ kia khoác vai người đẹp rời đi, “mối tình đầu thơ ngây” của cô bỗng tan thành mây khói.\r\nNăm cô 22 tuổi, bố mẹ cô sắp xếp một cuộc gặp mặt với Âu Dương Y Phàm, anh chàng nổi tiếng đẹp trai, giỏi giang, con nhà gia, hai nhà đã có hẹn ước với nhau từ nhỏ. Nhưng vì nghe nói anh ta là một “hoa hoa công tử”, thay người yêu còn nhanh hơn cả thay áo, Quan Tiểu Úc chưa kịp gặp mặt đã lén trốn đi mất. Cô rất ghét loại người như anh ta.', '0.2', 'src/img/book/NT_4.jpg', 30, 'Đinh Tị', 304, 79000, 'NXB Văn Học', 'Hà Giang'),
('TT01', 'Con chim xanh biếc bay về 1', 'Nguyễn Nhật Ánh', '13 x 20 cm', 'tieu_thuyet', 'Bìa cứng', '01-2019', 'Như một cuốn phim “trinh thám tình yêu”, Con chim xanh biếc bay về dẫn bạn đi hết từ bất ngờ này đến tò mò suy đoán khác, để kết thúc bằng một nỗi hân hoan vô bờ sau bao phen hồi hộp nghi kỵ đến khó thở.\r\nBạn sẽ theo phe sinh viên-nhân viên với những câu thơ dịu dàng và đáo để, hay phe ông chủ với những kỹ năng kinh doanh khởi nghiệp? Và hãy đoán thử, điều gì khiến bạn có thể cảm động đến rưng rưng trong cuộc sống giữa Sài Gòn bộn bề\r\nLâu lắm mới có hình ảnh thành phố rộn ràng trong tác phẩm của Nguyễn Nhật Ánh - điều hấp dẫn khác thường của Con chim xanh biếc bay về.', '0.2', 'src/img/book/TT_1.jpg', 30, 'NXB Trẻ', 396, 202500, 'NXB Trẻ', ''),
('TT02', 'Hạ đỏ', 'Nguyễn Nhật Ánh', '12 x 20 cm', 'tieu_thuyet', 'Bìa mềm', '02-2019', 'Kể về mối tình đầu trong sáng của một cậu học trò dành cho một cô gái quê 16 tuổi trong dịp về quê nghỉ hè, và những việc làm cao đẹp của cậu cho em bé quê chân chất chịu nhiều thiệt thòi ở nông thôn. Chuyện nhiều hình ảnh, dễ thương và trong sáng… vẫn không thiếu những “pha” thú vị cho ta những tiếng cười sảng khoái.', '0.2', 'src/img/book/TT_2.jpg', 30, 'NXB Trẻ', 184, 49200, 'NXB Trẻ', ''),
('TT03', 'Ngôi trường mọi khi', 'Nguyễn Nhật Ánh', '12 x 20 cm', 'tieu_thuyet', 'Bìa mềm', '12-2018', 'Những câu chuyện về nhóm bạn học sinh năm đầu cấp 3 với bao kỷ niệm vui buồn hờn giận, bao nhiêu trò tinh nghịch của tuổi mới lớn. Với những Hạt tiêu, Tóc ngắn, Hột mít, Bảnh trai, Răng chuột, Mặt mụn… đã tạo nên không khí của một lớp học thật dễ thương với bao nhiêu tình cảm yêu thương, cảm động và gần gũi. Đây là sách mới nhất của tác giả viết về tuổi áo trắng mộng mơ và tinh nghịch.', '0', 'src/img/book/TT_5.jpg', 30, 'NXB Trẻ', 236, 61200, 'NXB Trẻ', ''),
('TT04', 'Trước vòng chung kết', 'Nguyễn Nhật Ánh', '13 x 20 cm', 'tieu_thuyet', 'Bìa mềm', '02-2019', 'Truyện kể về phong trào bóng đá học đường giữa những đội bóng của các khu phố, những đội bóng của các phường và giữa những đội bóng của các lớp (cùng trường) với nhau.\r\nTruyện mở đầu bằng trận cầu trên vỉa hè nảy lửa của phong trào bóng đá đường phố giữa đội \"Mũi tên vàng\" (tức đội khu phố 1) và đội \"Sư tử\" (tức đội khu phố 2) của phường 2.\r\nHai đội có thể được xem là \"hai đối thủ truyền kiếp\", \"không đội trời chung\", và cùng sở hữu những siêu sao lợi hại, ví dụ như: Tân (Nguyễn Hoàng Tân) là đội trưởng đội \"Mũi tên vàng\" và Hùng bụi là đội trưởng đội \"Sư tử\", Hoàng là thủ môn của đội \"Mũi tên vàng\", được mệnh danh là \"thủ môn xuất sắc nhất phường 2\", Long quắn là thủ môn của đội \"Sư tử\", một thủ môn cũng khá xuất sắc ở đấu trường phường 2, Sơn cao cùng với Hùng bụi là hai tiền đạo nổi trội nhất của đội \"Sư tử\",....\r\nTruyện đề cao tinh thần thể thao chân chính, sự thành thật và cũng nhấn mạnh tầm quan trọng và cần thiết của việc học tập và trau dồi kiến thức.', '0.3', 'src/img/book/TT_4.jpg', 30, 'NXB Trẻ', 256, 50220, 'NXB Trẻ', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`user`),
  ADD KEY `account_ibfk_1` (`employeeID`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`billID`),
  ADD KEY `bill_ibfk_1` (`customerID`),
  ADD KEY `bill_ibfk_2` (`employeeID`);

--
-- Indexes for table `billdetail`
--
ALTER TABLE `billdetail`
  ADD PRIMARY KEY (`billID`,`productID`),
  ADD KEY `billdetail_ibfk_1` (`productID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`categoryID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `category` (`category`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `account_ibfk_1` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`employeeID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `bill_ibfk_2` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`employeeID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `billdetail`
--
ALTER TABLE `billdetail`
  ADD CONSTRAINT `billdetail_ibfk_1` FOREIGN KEY (`productID`) REFERENCES `product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `billdetail_ibfk_2` FOREIGN KEY (`billID`) REFERENCES `bill` (`billID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`category`) REFERENCES `category` (`categoryID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
