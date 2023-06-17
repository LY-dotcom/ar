/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : ar

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 25/04/2023 19:22:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;




-- ----------------------------
-- Table structure for applicant
-- ----------------------------
DROP TABLE IF EXISTS `applicant`;
CREATE TABLE `applicant` (
  `id` int NOT NULL  AUTO_INCREMENT,
  `username` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` varchar(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `profile_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `education` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_status` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of applicant
-- ----------------------------
BEGIN;
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (7, 'qz1', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '15287232224', 'http://localhost:1000/api/static/2023/04/24/c5d73612-af37-46aa-994d-3baa3c3a7cc9.jpeg', '博士', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (8, 'qz2', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '15287238361', 'http://localhost:1000/api/static/2023/03/04/2a506f70-2d3f-4982-a2a3-2cdf0c709cc8.jpeg', '专科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (9, 'qz3', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '17287238361', 'http://localhost:1000/api/static/2023/03/04/d7810f5a-01f4-4bee-80a5-42260fc1844c.jpeg', '本科', -1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (10, 'qz4', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '17287297361', 'http://localhost:1000/api/static/2023/03/04/d7810f5a-01f4-4bee-80a5-42260fc1844c.jpeg', '研究生', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (11, 'qz5', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '11287297361', 'http://localhost:1000/api/static/2023/03/04/d7810f5a-01f4-4bee-80a5-42260fc1844c.jpeg', '博士', -1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (12, 'qz6', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '11287297361', 'http://localhost:1000/api/static/2023/03/04/93c59827-3dfd-4e3c-b900-3408b8d40f6e.jpg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (13, 'qz7', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '11287297361', 'http://localhost:1000/api/static/2023/03/04/93c59827-3dfd-4e3c-b900-3408b8d40f6e.jpg', '专科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (14, 'qz8', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '11287297361', 'http://localhost:1000/api/static/2023/03/04/61f190e9-d942-49ea-88a7-998dde8a5141.jpeg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (15, 'qz9', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '11287297361', 'http://localhost:1000/api/static/2023/03/04/2813b43b-f41f-4303-98db-6bc6a5b8c374.jpeg', '专科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (16, 'qz10', '5c26d622effa0071f7c216cb9b880d80', 18, '男', '11287297361', 'http://localhost:1000/api/static/2023/03/04/2ad53076-a0de-4863-806b-f3cb2284fff2.jpeg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (19, 'a11212', '5c26d622effa0071f7c216cb9b880d80', NULL, '男', '16183202386', 'http://localhost:1000/api/static/2023/02/27/0af37a8c-1a5d-4c54-bf41-f7381fa8c9db.jpeg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (20, 'a1', 'd6ba20be71aff22a05d7d178ee76c9d7', NULL, '女', '16183202386', 'http://localhost:1000/api/static/2023/02/27/0af37a8c-1a5d-4c54-bf41-f7381fa8c9db.jpeg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (21, 'a18989', '5c26d622effa0071f7c216cb9b880d80', NULL, '男', '16183202386', 'http://localhost:1000/api/static/2023/02/27/0af37a8c-1a5d-4c54-bf41-f7381fa8c9db.jpeg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (22, 'a1', 'd6ba20be71aff22a05d7d178ee76c9d7', NULL, '男', '16183202386', 'http://localhost:1000/api/static/2023/02/27/0af37a8c-1a5d-4c54-bf41-f7381fa8c9db.jpeg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (23, 'a11', '5c26d622effa0071f7c216cb9b880d80', 23, '男', '16183202386', 'http://localhost:1000/api/static/2023/02/27/0af37a8c-1a5d-4c54-bf41-f7381fa8c9db.jpeg', '本科', 1);
INSERT INTO `applicant` (`id`, `username`, `password`, `age`, `sex`, `phone`, `profile_path`, `education`, `user_status`) VALUES (24, 'a10', '5c26d622effa0071f7c216cb9b880d80', 56, '男', '16183202386', 'http://localhost:1000/api/static/2023/02/27/0af37a8c-1a5d-4c54-bf41-f7381fa8c9db.jpeg', '本科', 1);
COMMIT;

-- ----------------------------
-- Table structure for apply_record
-- ----------------------------
DROP TABLE IF EXISTS `apply_record`;
CREATE TABLE `apply_record` (
  `id` int NOT NULL AUTO_INCREMENT,
  `resume_id` int DEFAULT NULL,
  `station_id` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `apply_date` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `meeting_datetime` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '面试的时间日期',
  `meeting_num` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '腾讯会议号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of apply_record
-- ----------------------------
BEGIN;
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (45, 27, 106, -1, '2023-04-05', '1970-1-1 8:0', NULL);
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (46, 27, 106, 2, '2023-04-05', '2023-4-5 17:8', '232323');
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (49, 27, 14, 0, '2023-04-06', NULL, NULL);
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (50, 31, 5, -1, '2023-04-20', '1970-1-1 8:0', NULL);
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (51, 31, 15, 2, '2023-04-20', '2023-4-20 22:18', '324324234');
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (52, 31, 95, 2, '2023-04-20', '2023-4-22 9:19', '23423');
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (53, 31, 3, 0, '2023-04-21', NULL, NULL);
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (54, 32, 5, 0, '2023-04-22', NULL, NULL);
INSERT INTO `apply_record` (`id`, `resume_id`, `station_id`, `status`, `apply_date`, `meeting_datetime`, `meeting_num`) VALUES (55, 33, 5, 2, '2023-04-22', '2023-4-22 14:10', '232323');
COMMIT;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `content` text COLLATE utf8mb4_general_ci,
  `prise_cnt` int DEFAULT NULL,
  `view_cnt` int DEFAULT NULL,
  `create_time` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `profile_path` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `applicant_id` int DEFAULT NULL,
  `status` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `check_info` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of article
-- ----------------------------
BEGIN;
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (4, '求职意向怎么写？学会抓住面试官的“眼球”', '随着社会生产力的发展，找工作成为了当代年轻人的首要重任，一份求职意向是打开一份工作的敲门砖，那么求职意向怎么写成为了许多求职者困扰的问题，由于每个企业竞争的工作岗位不同类型不同，所以求职意向自然也不同。\n　　求职意向的基础内容\n　　在求职过程中，求职意向怎么写成为许多应届生面临的实际问题。在求职过程中选择职业时切忌一定不要再求职意向上写许多职业，这会让HR觉得本人在选择职位时没过经过思考，求职意向的内容可以分为几大板块，首先是个人专业其次是对这份岗位的期望，然后就是为什么自己要选择这个岗位，这样不仅可以让人更加明确求职意向到底是什么，还能加深HR的印象，注意在写专业的时候选择自己专业或者熟悉专业的工作岗位，求职意向的描写也要一针见血表明来意，这样的求职意向会更加令人深刻，可以描写关于对这个专业与岗位的个人见解，展现个人的创造力。\n\n　　求职意向该如何选择\n　　在许多人眼里，求职意向怎么写不难，但是要让求职意向吸引眼球确实是一件难事，从BOSS直聘就可以看出一份好的求职意向有多重要，比如在BOSS直聘上，可以通过求职意向来推荐合适的工作，所以在写求职意向的时候还是要多花心思，思考什么工作适合自己，大部分人在求职意向上会选择热门职业，不会思考行业到底适不适合自己，盲目跟风后断送自己的前程。对于求职意向如何选择有以下建议，首先选择擅长的专业行业，毕竟这样更好上手，其次是感兴趣的行业，在各类招聘平台中有各行各类的行业选择，足以满足满足前面两点，最后是选择一家不错的公司，公司的高度决定着求职者的起点，如果没有擅长和喜欢的专业，可以先选择一家不错有口碑环境较好的公司学习，未雨绸缪。\n　　在这个竞争激烈的社会，求职意向选择好了就相当于有了一份好的工作，求职意向怎么写这个问题，求职意向如何选择才能更加适合日后工作，在实际生活中有许多为此苦恼的人，再好的求职意向也要有具体的能力填满白纸，毕竟想法要配的上实力，这样求职者在寻求过程中才会更有底气。', 28, 27, '2023-03-09 20:50', 'http://localhost:1000/api/static/2023/03/09/9cc487c9-3244-450e-b8e1-da863890d03f.jpg', 8, '1', NULL);
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (5, '实习生自我介绍：抓重点别啰嗦', '实习生自我介绍要抠重点不啰嗦。实习生去实习或是在单位进行短暂的工作时，也可能是要开始找工作面试时，都免不了要让大家认识你，这样的话就要做一个简短的自我介绍，当然介绍的内容一般都很简单，说一下自已在学习和生活中的经历，如果要求不高的话也要说一下自己的兴趣爱好，希望能和大家在以后的工作中和睦相处。实习生自我介绍也不能太啰嗦，可以上BOSS直聘，给老板当面自我介绍更通透。\n　　1、实习生自我介绍要抓住重点\n　　实习生自我介绍的时候一定要抓住重点，当你做好了面试的准备时，自我介绍的环节是少不了的，这一点能直接的看出你的表达能力，对你之前的经历也以清楚的做一些了解。如果是正式的工作面试那首先要礼貌的说大家好，毕业于某某大学的什么专业，这对工作后所从事的专业有一定的要求，其次再是在学校获得的荣誉，专业领域的特长是什么，也可以介绍一下自已对做事方面的看法以及做法，让面试官更深入的对你进行了解。上BOSS直聘，让老板直接对你进行面试。\n\n　　2、实习生自我介绍切记不能太感情用事\n　　实习生自我介绍时除了学习的经历以外，很多实习生会将自己的个人爱好以及做事的兴趣和喜好一股脑的说出来，其实实习生自我介绍时面试官大部分看的是你的工作能力和做事方法，对你的兴趣一般一会太在意，有时太过感情化说的太多会让面试官觉得你是一个做事情没有分寸，掌握不来主次的人，这样不会博得同情，反而会让人觉得你做事情不理智。\n　　实习生自我介绍完了以后还是要礼貌的说希望能融入大家，有机会向大家多学习，谢谢大家给了这次自我介绍的机会。', 0, 2, '2023-03-09 20:51', 'http://localhost:1000/api/static/2023/03/09/65ea4207-ecce-494c-b08f-4a11d494d76f.jpg', 8, '1', 'afwefaf');
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (6, '土木工程回国就业前景如何？应该到哪里求职呢？', '对于大多数的毕业生来说，在毕业之前往往都会提前了解自己所在专业的毕业前景，尤其是在海外留学的留学生们，因为对国内形势的不够了解，因此常常都有人会提问回国就业后的前景如何。尤其是毕业季的再一次到来，不少留学生们都选择回国就业，因此对于自己的就业未来还是非常关注的。就比如最近有不少留学生都在询问土木工程回国就业前景如何，应该到哪里就职呢？\n　　一、土木工程回国就业前景\n　　对于土木工程专业的学生来说，其实就业的可选择度还是非常高的。毕竟理工科的许多专业之间都有着共通性，所以能够去到许多的岗位工作，因此求职岗位也是非常多的。如果所在学校知名度高，且教学质量不错的话。土木工程回国就业之后基本都能够去到一些大型的建筑公司上班，或者是到省市级别的政府单位工作。\n\n　　二、土木工程回国就业如何找工作\n　　土木工程回国就业的留学生们可以选择通过BOSS直聘来找寻合适自己的岗位。BOSS直聘属于一个专业的招聘网站，大家可以直接在搜索框之中输入自己想要的岗位，就能够寻找到专业对口的工作。同时BOSS直聘也开通了海归求职的版块，帮助回国就业的海归们尽快找到合适的工作，在国内拥有一个稳定而幸福的生活。\n　　综上所述，土木工程回国就业找工作还是比较简单的。尤其是BOSS直聘不需要大家投递简历就可以直接和企业的boss开聊，从而让大家更好地进行求职，这是大多数的招聘网站都做不到的一点。', 0, 4, '2023-03-09 20:52', 'http://localhost:1000/api/static/2023/03/09/8d41793e-0ac5-484b-b815-706a763e06ec.jpg', 8, '1', NULL);
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (9, '毕业一年内的海归留学生应该参加校招还是社招？', '社又是一年毕业季，有许多留学生小伙伴向直直反应，由于职业规划不清晰，就读期间不确定今后是否回国求职，在春招秋招期间课业繁忙，对国内求职环境不了解等种种原因，在拿到毕业证之后才决定回国求职。相信各位小伙伴们已经十分了解校招的重要性了，那对于那些已经毕业的小伙伴们，在毕业一年内回国求职的海归留学生还可以参加校招吗？还是应该直接投递设招岗位？今天直直就来为留学生小伙伴们解决这个疑惑。\n\n一、校招和社招有什么区别？\n首先，让我们明确一下什么是校招，什么是社招。校招是应届生进入优质企业最简单直接的渠道之一，因此应届生这个身份十分值钱，而校招企业社招的要求往往是具有一定的工作经验，因为企业希望社招进来的员工是来直接干活的。那么问题来了，如何定义应届生这个身份呢？\n二、想要参加校招，留学生的应届生身份如何定义？\n接下来让我们以2021年秋招为例，看看几个知名的国内企业对应届生的身份是如何定义的（毕业时间以毕业证为准）想要以应届生的身份进入腾讯，字节跳动等一线大厂，你的毕业时间需要在2020.9-2021.8之间。华为则更宽松一些：2020.1.1-2021.12.31之间毕业的留学生都可以。除了互联网行业，像宝洁，四大等行业领军公司，都是可以接受毕业两年内的留学生以应届生的身份进行投递。一般来说，毕业时间在一年以内，可以参加当年大部分公司的校招。\n\n有的小伙伴们单看数字可能还是比较疑惑，那我们以英国留学生的普遍情况举个例子：英国大多是一年制硕士，学习时间安排的紧，毕业时间也比较靠后，如果确定要回国求职，在刚入学时就要为将来的求职做准备。9月入学的英国留学生们，可以多去参加大公司的校园招聘会，时刻关注着心仪公司的招聘岗位是否开放。除了9月份之外，你的第二次机会是在次年3-4月份，参与各大公司的春招。次年9-10月，你的第三次机会来了，这时候你应该已经完成了毕业设计或毕业论文了，国内大波公司的网申也开始了，所以要集中精力网申了。\n三、错过了校招，我该怎么办？\n之前也提到过了，社招和校招最大的区别就是，社招的成熟型人才通常都是即招即用。核心招聘的对象是“已经具备工作经验的人”。同时，社招也没有所谓的秋招春招时间线，而是根据公司需求，随时都在招人。错过校招的小伙伴们要做的是尽量展现自己的能力，为HR和将来的老板展示出你是一个有经验的，可以胜任这份工作的人。同时，错过校招的小伙伴们也不需要太担心，可以多使用BOSS直聘APP，和BOSS直接沟通，找到心仪的工作。\n写在最后：绝大多数大厂，对于留学生的应届身份界定并不是按学级，而是按毕业时间的。所以还没毕业或者即将毕业的留学生小伙伴们，赶快行动起来吧！', 3, 6, '2023-03-09 20:54', 'http://localhost:1000/api/static/2023/03/09/1f0e7414-23d6-48d3-9159-fe614ecf3f0a.jpg', 7, '1', NULL);
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (10, '【面试必读】如何回答“你目前有几个offer”？', '春招接近尾声，很多应届毕业的企业面试也即将结束。在春招后期，许多应届毕业生总会遇到HR询问：”你目前收到几个offer“，那我们应该如何知己知彼，把握主动权呢？HR一般是想通过这个问题评估以下三个方面：应聘者的市场竞争力，职业价值观，以及职业规划。面试官可以通过有多少公司认可你个人能力来间接评估应聘者的能力水平。此外，面试官可以通过应聘者接到offer的行业背景以及公司情况，来判断应聘者对于工作意向，对于行业的态度，是否有清晰的职业规划。\n\n原则一：诚实回答，真诚以待。面对此问题，应聘者首先不需要慌张，而是根据自己的情况诚实真诚地回答问题。如果手中没有offer，或者还在面试其他的公司，可以说：“目前还没有，正在寻找机会。” 或者可以说：“目前还没有，有两家公司正在面试，还没有收到offer。” 如若手头有offer，还在择优选择中，可以表述大概的情况，而不需要讲具体的内容或者对获得offer企业的评价。\n原则二：选择与应聘公司相关行业的offer。许多留学生回国后，会尝试应聘不同的行业，也会因此收到不同行业的面试邀请或者offer。因此，应聘者可以通过选择与求职公司行业相关背景的offer进行透露。但是，应聘者要注意尽量不需要透露公司具体的名字以及具体的薪资。许多应届毕业生在面试初期便将此类信息和盘托出，这也是一种有失职业的表现。\n原则三：阐述自己求职原因，透露自身职业规划。李开复曾说，求职面试，最重要的是应聘者的创意和灵气。应聘者无论是否拥有offer，都可以着重阐述自己来企业求职的原因，以及对于行业以及自身的职业规划，突出岗位适配度。\n最后，应聘者需要明确一点，offer的数量并不能完全反应自身能力的强弱，而是需要提高自身核心竞争力。应届生在面试的同时，需要积累经验，争取尽快获得自己的dream offer。', 0, 2, '2023-03-09 20:55', 'http://localhost:1000/api/static/2023/03/09/1b52d70b-9d8b-4376-8189-e2814eaa61cd.jpg', 7, '1', NULL);
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (13, 'article0', 'gdsagfsdgafsadkf\nfa\nwe\nfeaw\nf\newafaw\nf\nwa\nfawe\nfawe\nf\nwaef\nasfdasfas', 2, 1, '2023-04-05 18:02', 'http://localhost:1000/api/static/2023/04/05/e939540b-c5f4-4d1a-b863-4f6fc1ff5052.jpg', 7, '1', NULL);
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (14, 'aaaaaa', 'dsafasdfdsaf\nfawe\nfwa\nef\nwaef\nwae\nf', 0, 0, '2023-04-05 18:28', 'http://localhost:1000/api/static/2023/04/05/b16c55ff-45ce-4298-a68a-55a90b7e9573.jpg', 7, '1', NULL);
INSERT INTO `article` (`id`, `title`, `content`, `prise_cnt`, `view_cnt`, `create_time`, `profile_path`, `applicant_id`, `status`, `check_info`) VALUES (16, '11111', '饭撒蛋糕', 0, 0, '2023-04-20 21:29', 'http://localhost:1000/api/static/2023/04/20/6ce22314-8f21-4a22-8f1d-e9f61c0f8971.jpg', 7, '1', '阿迪说法');
COMMIT;

-- ----------------------------
-- Table structure for chat_record
-- ----------------------------
DROP TABLE IF EXISTS `chat_record`;
CREATE TABLE `chat_record` (
  `id` int NOT NULL AUTO_INCREMENT,
  `applicant_id` int DEFAULT NULL,
  `company_id` int DEFAULT NULL,
  `msg` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `datetime` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `mine` int DEFAULT NULL COMMENT '发送者\n1: applicant\n0: company',
  `is_read` int DEFAULT NULL COMMENT '接收方是否已读\n1：已读\n0: 未读',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=304 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of chat_record
-- ----------------------------
BEGIN;
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (275, 20, 15, '你好', '2023-04-20 20:47:07', 20, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (276, 20, 15, 'hello', '2023-04-20 20:47:16', 20, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (277, 20, 15, '在吗', '2023-04-20 20:47:23', 20, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (278, 7, 15, '你好', '2023-04-20 20:47:41', 7, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (279, 7, 15, '你好', '2023-04-20 20:47:48', 7, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (280, 7, 15, '在吗', '2023-04-20 20:47:50', 7, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (281, 20, 15, '我再', '2023-04-20 20:48:29', 15, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (282, 20, 16, '你好', '2023-04-20 20:48:47', 20, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (283, 7, 16, '你好', '2023-04-20 20:49:15', 7, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (284, 7, 16, 'you', '2023-04-20 20:49:20', 7, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (285, 7, 16, '', '2023-04-20 20:49:20', 7, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (286, 7, 16, 'zp2 你好', '2023-04-20 22:14:36', 7, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (287, 7, 16, '你好 目前找到工作吗', '2023-04-20 22:15:10', 16, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (288, 20, 17, '你好', '2023-04-20 22:19:48', 17, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (289, 20, 17, '再接再厉', '2023-04-20 22:19:59', 17, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (290, 20, 17, '好的', '2023-04-20 22:20:14', 20, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (291, 20, 15, '题666', '2023-04-21 19:30:41', 15, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (292, 20, 15, '6666', '2023-04-21 19:31:02', 20, 1);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (293, 20, 17, '你好', '2023-04-21 20:19:03', 20, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (294, 20, 17, '撒大', '2023-04-21 20:19:09', 20, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (295, 20, 17, '', '2023-04-21 20:24:14', 20, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (296, 20, 17, '你好', '2023-04-22 09:20:08', 20, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (297, 20, 17, 'dsafdsaf', '2023-04-22 09:20:11', 20, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (298, 20, 17, '', '2023-04-22 09:20:11', 20, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (299, 20, 17, '撒的范德萨发', '2023-04-22 09:20:13', 20, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (300, 7, 17, '你好', '2023-04-22 12:04:18', 7, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (301, 7, 17, '你好', '2023-04-22 12:04:23', 7, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (302, 7, 17, '你好', '2023-04-22 12:06:13', 7, 0);
INSERT INTO `chat_record` (`id`, `applicant_id`, `company_id`, `msg`, `datetime`, `mine`, `is_read`) VALUES (303, 7, 17, '你好', '2023-04-22 14:11:13', 7, 0);
COMMIT;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `title` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '公司名称',
  `descs` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `location_id` int DEFAULT NULL,
  `phone` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `build_date` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '成立的时间\n',
  `build_capital` int DEFAULT NULL COMMENT '注册资本',
  `status` int DEFAULT '0' COMMENT '审核状态',
  `logo_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '公司logo',
  `profile_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '企业用户头像',
  `location_detail` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `check_info` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '审核信息',
  `prosession` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_status` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of company
-- ----------------------------
BEGIN;
INSERT INTO `company` (`id`, `username`, `password`, `title`, `descs`, `location_id`, `phone`, `email`, `build_date`, `build_capital`, `status`, `logo_path`, `profile_path`, `location_detail`, `check_info`, `prosession`, `user_status`) VALUES (15, 'zp1', '5c26d622effa0071f7c216cb9b880d80', '云墨信息技术有限公司', '云和恩墨,以“数据驱动,成就未来”为使命,专注于DT(数据技术)领域,致力于为全球的关键大型客户、高成长客户、中小客户和个人提供富有竞争力的解决方案、产品和服务,实现组织和个人的发展成功。 我们的核心', 1, '15192004792', '2387126733@qq.com', '2008-12-17', 2000, 1, 'http://localhost:1000/api/static/2023/03/05/48fa301e-ccf2-44cd-ba38-30821bdc2b72.png', 'http://localhost:1000/api/static/2023/03/04/faf791b7-10f2-45dd-8c83-d18f28e6db77.jpeg', '北京市朝阳区光华路SO2B-23层', 'OK', '计算机', 1);
INSERT INTO `company` (`id`, `username`, `password`, `title`, `descs`, `location_id`, `phone`, `email`, `build_date`, `build_capital`, `status`, `logo_path`, `profile_path`, `location_detail`, `check_info`, `prosession`, `user_status`) VALUES (16, 'zp2', '5c26d622effa0071f7c216cb9b880d80', '爱码信息技术股份有限公司', '爱码智慧科技有限公司（简称“Magic Data”）是一家全球领先多模态AI数据解决方案提供商，公司总部设立在北京，并在香港和深圳设立全资子公司，全国多地设有数据处理中心。\nMagic Data 为从事语音识别、语音合成、自然语言理解等人工智能企业、机构提供数据解决方案。公司拥有自有数据集、Annotator®5.0智能化标注平台和数据服务三大产品，数据服务涵盖智慧出行、智能社交、智慧金融、智能家居、智能终端等五大行业，迄今服务了微软、高通、阿里巴巴、百度、腾讯等国内外上百家合作伙伴，业务涉及全球五大洲数十种语言。\nMagic Data 先后荣获“国家高新技术企业”、“中关村高新技术企业”、“中国信息协会理事会员单位”、“中国语音产业联盟会员单位”。服务和产品通过ISO 9001、ISO 27001、ISO/IEC 27701：2019等标准认证。入选北京市2021年度第一批专精特新“小巨人”企业名单，是信通院个人信息保护合规审计推进小组成员。\n我们是年轻且靠谱，大胆且创新的全球领先AI数据解决方案提供商。\nMagic Data 提供对话式训练数据集和Annotator安耐拓智能化标注系统，用场景化的AI数据解决方案帮助企业智能化的快速落地。\nMagic Data 创始人兼CEO 张晴晴博士，是中科院声学所副研究员，法国国家实验室LIMSI-CNRS博士后，是语音技术专家，更是对话式AI的先行者。\n作为一家深耕人工智能行业的AI数据公司，Magic Data 将作为企业不可或缺的AI数据伙伴，与企业一起共建智慧生活，用数据定义智能，让潜力带动创新。', 43, '1234343', '234563216733@qq.com', '2011-12-13', 2800, 1, 'http://localhost:1000/api/static/2023/03/05/08da2c4a-4301-4c26-85b2-69442698cac8.png', 'http://localhost:1000/api/static/2023/03/04/a4c2943a-0a3b-4832-a87b-01af5afa46d6.jpeg', '联航路1128号浦江智谷', '', '软件开发', 1);
INSERT INTO `company` (`id`, `username`, `password`, `title`, `descs`, `location_id`, `phone`, `email`, `build_date`, `build_capital`, `status`, `logo_path`, `profile_path`, `location_detail`, `check_info`, `prosession`, `user_status`) VALUES (17, 'zp3', '5c26d622effa0071f7c216cb9b880d80', '汤杰逊', '汤杰逊，成立于2013年，是目前中国炙手可热的品牌策略机构，成名于南方，被公认为“不一样的品牌新策略，能让品牌价值迅速被消费者感知的新派品牌策略机构！汤臣杰逊CEO刘威创立独特的「品牌超级体系」，从顶层设计、战略方向帮助品牌在市场中实现差异化定位，突围破局，荣获2021天猫食品品牌升级大奖。\n\n「品牌超级体系」是根据商业逻辑定制的思维模型，通过超级体系地图，建立与用户的沟通矩阵，顺应认知，占领消费者心智，为品牌落地而建立的新时代品牌理论体系。\n\n「品牌体系化研究院」依托于汤臣杰逊，通过上百个案例实操，研究上百个新消费品爆发增长背后，研发出一整套超级品牌打造与增长的策略模型。\n\n以“品牌体系化就是超级策略”为核心的方法论，从「品牌策略定位」、「产品策略布局」、「品类重塑」、「创新视觉咨询」、「视觉策略传达」等多维矩阵为多家企业提供超级品牌增长策略。', 35, '1234343', '234237216733@qq.com', '2012-12-24', 7000, 1, 'http://localhost:1000/api/static/2023/03/05/f2e20b26-3e18-4f12-b3cc-6d70d3d2fb46.jpeg', 'http://localhost:1000/api/static/2023/03/04/78403690-0287-4150-975c-000948069318.jpg', '建筑西路77号D区', '', '广告设计', 1);
INSERT INTO `company` (`id`, `username`, `password`, `title`, `descs`, `location_id`, `phone`, `email`, `build_date`, `build_capital`, `status`, `logo_path`, `profile_path`, `location_detail`, `check_info`, `prosession`, `user_status`) VALUES (26, 'zp0', '5c26d622effa0071f7c216cb9b880d80', 'company0', '购物网站购物网站购物网站\n购物网站购物网站购物网站\n购物网站购物网站购物网站\n购物网站购物网站购物网站', 19, '1234343', '434343@sd.com', '2022-12-23', 200, 1, 'http://localhost:1000/api/static/2023/04/05/3a5ff370-247e-4b20-8196-472168e94197.jpeg', 'http://localhost:1000/api/static/2023/04/05/5a63ae4c-97c7-42cf-94c8-f809391a6635.jpeg', '吴中区吴中大道34号', NULL, '互联网aaaadfas', 1);
INSERT INTO `company` (`id`, `username`, `password`, `title`, `descs`, `location_id`, `phone`, `email`, `build_date`, `build_capital`, `status`, `logo_path`, `profile_path`, `location_detail`, `check_info`, `prosession`, `user_status`) VALUES (27, 'r1', '5c26d622effa0071f7c216cb9b880d80', '京东', '购物网站', 7, '1234343', '434343@sd.com', '2022-12-23', 200, 0, 'http://localhost:1000/api/static/2023/02/27/93c5e728-b60e-4ad0-8bc4-0c4dcffa5e85.jpeg', 'http://localhost:1000/api/static/2023/02/27/0af37a8c-1a5d-4c54-bf41-f7381fa8c9db.jpeg', '吴中区吴中大道34号', NULL, NULL, 1);
INSERT INTO `company` (`id`, `username`, `password`, `title`, `descs`, `location_id`, `phone`, `email`, `build_date`, `build_capital`, `status`, `logo_path`, `profile_path`, `location_detail`, `check_info`, `prosession`, `user_status`) VALUES (28, 'zp8', '5c26d622effa0071f7c216cb9b880d80', '111', '1212', 31, '1', '1', '2023-04-09', 1111, -1, 'http://localhost:1000/api/static/2023/04/19/e41251be-8e61-4d10-a909-4255cb22f1d9.jpeg', 'http://localhost:1000/api/static/2023/04/19/57d4e65d-1c3b-436d-b4eb-22034822d035.jpg', '111', 'detail!!!', '1', 1);
COMMIT;

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `value` int NOT NULL AUTO_INCREMENT,
  `label` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pid` int DEFAULT NULL,
  PRIMARY KEY (`value`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of location
-- ----------------------------
BEGIN;
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (1, '北京', NULL);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (2, '浙江', NULL);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (3, '江苏', NULL);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (4, '宁波', 2);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (5, '杭州', 2);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (6, '苏州', 3);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (7, '南京', 3);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (8, '温州', 2);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (9, '绍兴', 2);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (10, '无锡', 3);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (12, '扬州', 3);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (13, '海曙', 4);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (14, '江北', 4);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (15, '镇海', 4);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (16, '北仑', 4);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (17, '奉化', 4);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (18, '上城', 5);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (19, '下城', 5);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (20, '江干', 5);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (21, '西湖', 5);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (22, '滨江', 5);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (23, '余杭', 5);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (24, '临安', 5);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (25, '姑苏', 6);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (26, '虎丘', 6);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (27, '吴中', 6);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (28, '相城', 6);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (29, '吴江', 6);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (30, '鼓楼', 7);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (31, '玄武', 7);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (32, '秦淮', 7);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (33, '雨花台', 7);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (34, '江宁', 7);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (35, '鹿城', 8);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (36, '龙湾', 8);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (37, '洞头', 8);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (38, '越城', 9);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (39, '上虞', 9);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (40, '新昌', 9);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (41, '柯桥', 9);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (42, '梁溪', 10);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (43, '新吴', 10);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (44, '广陵', 12);
INSERT INTO `location` (`value`, `label`, `pid`) VALUES (45, '江都', 12);
COMMIT;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of manager
-- ----------------------------
BEGIN;
INSERT INTO `manager` (`id`, `username`, `password`) VALUES (1, 'admin', '5c26d622effa0071f7c216cb9b880d80');
INSERT INTO `manager` (`id`, `username`, `password`) VALUES (2, 'admin2', '5c26d622effa0071f7c216cb9b880d80');
COMMIT;

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume` (
  `id` int NOT NULL AUTO_INCREMENT,
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `applicant_id` int DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '文件名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of resume
-- ----------------------------
BEGIN;
INSERT INTO `resume` (`id`, `url`, `applicant_id`, `name`) VALUES (17, 'http://localhost:1000/api/static/2023/03/07/fa032d72-8339-4c3e-9268-3ee846ab57d8.pdf', 8, 'Java后端-C-烟台科技学院-软件工程-15192004793 2的副本2.pdf');
INSERT INTO `resume` (`id`, `url`, `applicant_id`, `name`) VALUES (31, 'http://localhost:1000/api/static/2023/04/20/51b249ba-9c30-4842-ab26-aa859a2e46e0.pdf', 20, '我的简历 (33).pdf');
INSERT INTO `resume` (`id`, `url`, `applicant_id`, `name`) VALUES (32, 'http://localhost:1000/api/static/2023/04/22/484c045a-b9d7-47b6-b856-4c45e857064b.pdf', 20, '我的简历 (34).pdf');
COMMIT;

-- ----------------------------
-- Table structure for resume_detail
-- ----------------------------
DROP TABLE IF EXISTS `resume_detail`;
CREATE TABLE `resume_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `applicant_id` int DEFAULT NULL,
  `aname` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `birthday` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `station_type_id` int DEFAULT NULL,
  `location_id` int DEFAULT NULL,
  `min_salary` int DEFAULT NULL,
  `max_salary` int DEFAULT NULL,
  `education_info` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `program_info` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `work_info` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `self_info` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `profile_path` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of resume_detail
-- ----------------------------
BEGIN;
INSERT INTO `resume_detail` (`id`, `applicant_id`, `aname`, `age`, `sex`, `phone`, `email`, `birthday`, `station_type_id`, `location_id`, `min_salary`, `max_salary`, `education_info`, `program_info`, `work_info`, `self_info`, `profile_path`) VALUES (1, 7, 'Wil', 23, '男', '13278462919', '23782368@163.com', '2023-04-03', 7, 19, 3000, 5000, 'xxxx大学 软件工程专业\n2018年 - 2022年\n在校成绩\nCET4	\nGPA：3.7/5(专业前5%) \n奖学金：\nxx奖学金', 'xx项目 	\n技术栈 xxx + xxxx\n内容\n1、xxx\n2、xxx', 'xxxxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxxxxxx', 'xxxxxxxxx\nxxxxxxxxx', 'http://localhost:1000/api/static/2023/04/22/85576a87-754f-4e13-9b29-d7f4b9c0eddd.jpeg');
INSERT INTO `resume_detail` (`id`, `applicant_id`, `aname`, `age`, `sex`, `phone`, `email`, `birthday`, `station_type_id`, `location_id`, `min_salary`, `max_salary`, `education_info`, `program_info`, `work_info`, `self_info`, `profile_path`) VALUES (2, 20, '张三', 19, '男', '19827389273', '12323@qq.com', '2023-04-11', 12, 20, 1119, 11111, 'xxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxx', 'xxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxx', 'xxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 'xxxxxxxxxxxxxxx\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 'http://localhost:1000/api/static/2023/04/20/95faf9b3-bd64-427e-a1be-33f9fd75a4bd.jpeg');
COMMIT;

-- ----------------------------
-- Table structure for star_record
-- ----------------------------
DROP TABLE IF EXISTS `star_record`;
CREATE TABLE `star_record` (
  `applicant_id` int DEFAULT NULL,
  `station_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of star_record
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for station
-- ----------------------------
DROP TABLE IF EXISTS `station`;
CREATE TABLE `station` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `descs` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `status` int DEFAULT NULL,
  `work_exprience` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `education` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `company_id` int DEFAULT NULL,
  `station_type_id` int DEFAULT NULL,
  `location_id` int DEFAULT NULL,
  `location_detail` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `check_info` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `add_date` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `min_salary` int DEFAULT NULL,
  `max_salary` int DEFAULT NULL,
  `type` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '实习 or 全职',
  `duration` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of station
-- ----------------------------
BEGIN;
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (2, '后端开发工程师', '教育背景：\n本科及以上学历，计算机，软件及相关专业\n经验要求：\n5年以上网络后端开发经验；\n出色的python编程能力，有一定java经验更佳；\n深入了解至少一种python web框架(如Django,Tornado,Flask等)；\n设计和开发过 Restful 接口；\n有数据库管理，发现和解决问题和性能调优经验（ MySQL,PostgreSQL等）。\n以下经验将会是加分项：\n*有敏捷开发经验（如Scrum）；\n*了解 HTML,CSS and JavaScript；\n*熟悉Java语言，Spring, Spring Boot 和 Spring Cloud；\n*熟悉缓存, 消息和搜索技术 ；\n*熟悉微服务和分布式系统架构其他技能：\n有独立工作能力和团队合作精神；\n自我驱动，有责任感和创新意识，有开阔的视野和胸怀；\n良好的沟通能力。', 1, NULL, '本科', 16, 7, 19, '人工智能小镇T2区', NULL, '2022-02-10', 3000, 6000, '实习', '2-3月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (3, '海外广告素材设计师', '岗位职责：\n1、负责直播社交类产品海外广告素材制作，有工作经验的优先；\n2、根据不同产品特色及渠道特性进行差异化素材制作，跟进素材市场反馈；\n3、注重网络全平台各行业各媒体不同素材，积累素材库，对所需素材进行整理收集；\n4、配合上级完成所需的设计相关工作；\n职位要求：\n1、大专以上学历，设计、广告等相关专业优先；\n2、熟练使用AE、PR、photoshop等设计软件；\n3、有美术功底优先，审美好', 1, '2-3年', '本科', 17, 11, 13, '富海邦园19幢23楼', NULL, '2020-02-12', 10000, 15000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (5, '广告投放优化师', '岗位描述：\n1. 负责游戏海外买量的广告素材制作，包含平面、后期剪辑包装和特效制作等；\n2. 负责游戏广告项目的创意策划，关注并收集时下热点，理解用户属性及习惯，贴合游戏输出创意创作，并能独立完成创意广告的制作；\n3. 了解海外游戏广告投放及渠道特性，跟进成片的投放数据，根据市场数据优化创意和品质；\n4. 统筹并管理各类供应商的创意项目协作，创意需求、规范制定输出，项目进度把控，出品品质把控等。\n岗位要求：\n1. 本科以上学历，美术设计类及相关专业，三年以上设计工作经验，有海外休闲品类游戏广告相关经验优先；（能力优秀者可放宽）\n2. 精通Photoshop、Illustrator等图形设计软件，掌握After Effect、C4D等相关渲染软件，能独立产出UE4视频广告优先；\n3. 对游戏创意广告有钻研进取的态度，能独立完成15-30秒广告制作；\n4. 具备扎实的美术功底和良好的审美能力，独特的视觉感受能力，整体布局能力和色感好，能清晰表达设计理念；\n5. 工作认真细致，责任心强，良好的沟通能力和团队合作精神；\n6. 英语读写能力良好，能独立完成广告素材上的英文文案设计。', 1, '3-5年', '本科', 17, 11, 21, '西溪A区80号楼', NULL, '2022-02-15', 30000, 50000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (12, 'python开发工程师', '【岗位职责】\n1. 负责华为云数据库管控、运维等平台的设计、开发；\n2. 负责华为云数据库后台核心服务的开发支持。\n【岗位要求】\n1. 熟练使用Java、Python等任一一种语言，熟悉对应开发框架及其机制、原理；\n2. 熟悉MySQL、PostgreSQL、SQLServer、NoSQL等任一数据库，对原理有一定的了解；\n3. 有较好的沟通能力，思路清晰，善于思考，能独立分析和解决问题；\n4. 熟悉常见分布式架构，熟悉缓存、消息对列等开源中间件者优先；\n5.有大型企业级项目开发经验者优先，有云计算领域相关开发经验优先。\n***测试工程师***\n【岗位职责】\n1. 负责华为云数据库测试工作；\n2. 细分为功能测试、性能测试、可靠性测试、安全测试、POC测试、解决方案测试等。\n【岗位要求】\n1. 熟悉产品研发端到端流程，具备测试规划，测试需求分析，测试方案设计，测试用例设计和测试执行力；\n2. 至少熟悉Java、Python、C/C++、Shell等任一编程语言，熟悉Linux操作系统；\n3. 熟悉MySQL、PostgreSQLSQLServer、Oracle、MongoDB、Redis等任一数据库，有数据相关工作经验者优先；\n4. 责任心强，沟通能力好，适应团队工作，善于思考、总结和改进。\n***运维工程师***\n【岗位职责】\n1. 负责华为公有云、私有云、混合云、伙伴云等局点的现网运维工作；\n2. 负责华为公有云、私有云、混合云、伙伴云等局点的运维平台设计、开发工作。\n【岗位要求】\n1. 熟悉Linux操作系统，具备常见故障的诊断、分析和处理能力；\n2. 熟悉Java、C/C++、Shell、Python等任何一种编程语言；\n3. 有业界领先的运维平台设计、开发、维护、SRE等经验者优先；\n4. 责任心强，沟通能力好，适应团队工作，善于思考、总结和改进。\n***碎碎念***\n我所在的运维团队氛围挺好的，有好好培养新人，工作接触代码不算很多，挺适合开发干不下去的朋友orz\n对运维工作感兴趣的兄弟姐妹欢迎戳我问更多细节！', 1, '5-8年', '博士', 16, 8, 37, '华盛科研基地z2', NULL, '2021-08-10', 15000, 30000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (14, '品牌设计师', '岗位要求：\n1、配合设计主脑梳理品牌视觉VI体系、创意方向，提升品牌整体视觉调性\n2、品牌及产品传播营销相关的设计，包含但不限于LOGO、KV、页面、礼盒、包裹、手册、折页等\n3、联动内容策划输出符合市场审美喜好的平面/视频，赋能品牌传播\n4、具有独立的从0到1的设计创意能力，提出自己的创意想法，理解品牌业务线需求，完成主题创意策划设计视觉风格并落地执行\n任职资格：\n1、1年以上品牌创意设计经验，美妆行业/广告公司优先\n2、对行业发展、艺术设计前沿信息有敏锐洞察力，了解视觉趋势\n3、熟练运用PS/AI/Coreldarw等设计软件，有基础视频剪辑能力最佳\n加分项\n有以下行业经验：电子商务', 1, NULL, '本科', 17, 7, 21, '明豪大厦2601', NULL, '2022-05-17', 4000, 5000, '实习', '2-3月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (15, '游戏广告设计师', '职位描述：\n1、需要掌握的软件：PS/AE/PR；\n2、负责完成公司产品信息流广告素材的设计和包装；与投放师沟通协同优化符合良好品质的广告效果；可独立制作15秒-60秒符合业务需求的广告素材\n3、根据项目需求能够设计相关游戏美术方面的界面、图标；\n4、有良好审美，设计出游戏ICON、LOGO等游戏元素。\n岗位要求：\n1、有良好的审美，能独立设计，沟通能力强。\n【福利待遇】\n1、基本工资+全勤绩效；\n2、充满活力的工作氛围，舒适的办公环境，非常nice的老板，年轻化的团队；\n3、公司为员工缴纳五险一金，提供免费的下午茶，节日小礼品等福利；\n4、公司不定期提供员工旅游、聚餐等活动，让您充分感受到团队的温馨；\n5、享有国家法定节假日，带薪病假等一系列的丰富假期；\n加分项\n有以下行业经验：游戏', 1, NULL, '本科', 17, 11, 15, '中控信息大厦B座142101', NULL, '2020-05-20', 3000, 5500, '实习', '3-4月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (16, '视频素材设计师', '【岗位职责】\n1.负责公司APP产品的创意广告素材设计与制作，如短视频、平面图片、动态图片等；\n2.关注主流流量平台优秀广告设计，结合产品特性及用户特点进行差异化设计，制作有吸引力的视频广告及平面广告；\n3.与广告投放团队协作，提供创意想法，把握海外市场的设计风格并进行执行落地，提升广告点击率、转化率。\n【任职要求】\n1.本科及以上学历，动画、数字媒体、广告、影视后期、视觉传达等专业优先；\n2.熟练操作AE、PS及saber主流插件，熟悉PR、剪映等视频编辑类软件；\n3.善于学习，信息敏感度高，能够实时了解视频设计的流行趋势，提出崭新创意；\n4.良好的团队意识及合作精神，沟通能力强，具有高度责任心及执行力。\n【加分项】\n1.有视频广告设计、动画制作等相关经验优先；\n2.了解不同国家的文化及审美，熟悉海外用户习惯；\n3.有一定的数据分析能力，能根据投放效果及时优化设计。', 1, NULL, '本科', 17, 11, 1, '网金大厦19层', NULL, '2023-02-14', 4000, 6000, '实习', '2-5月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (18, '设计师', '岗位职责：\n1、负责各类产品的创意设计需求，根据创意需求，深入了解目标用户群的特点，进行创意内容的设计制作；\n2、负责广告素材设计，对点击类素材有独特的见解；\n3、负责各类产品广告图片的优化设计、整体美化，活动广告和相关图片的制作；\n4、平时工作的经验，市场上优秀的广告和视频，创意趋势等内容的收集、分析、分享；\n任职要求：\n1、精通Photoshop、Illustrator等相关软件，对色彩、构图等元素触觉敏感，独特的设计风格、独到的创意视点与创新意识；\n2、敏锐的视觉触觉，能快速创作出创意的点击率广告；对点击类广告有独到见解，特别是对点击类广告有深刻的理解；\n3、对营销传播行业趋势具有敏锐性，涉猎广泛，对内容、技术、社群、创意玩法有持续性的沉淀和创新\n4、对玩家的用户行为分析有较为深入的研究，具备良好的沟通协调能力；\n5、艺术设计、广告设计等相关美术设计专业及计算机专业优先；', 1, '2-3年', '专科', 17, 11, 44, '物联网科技园1幢692', NULL, '2022-02-17', 5500, 6000, '实习', '6-10月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (21, '资深视觉设计师', '1.有Banner，闪屏，活动专题页面等相关案例（服务金融行业的作品案例优先）；\n2. 有很好的色彩敏感度和艺术素养，有一定的手绘能力或鼠绘能力；\n3. 有责任感，具有良好的团队协作和学习能力。\n4. 沟通能力有要求，情商有保证；\n5. 对于图形版权、文字版权等有足够的敏锐度和过往经验；\n团队优势：\n会加入一个60+的专业设计师团体；\n会开始做一些有要求的设计，有多重审核的设计而不只是设计；\n会有直接跟需求方直接沟通的机会，所以不只是单纯的设计也有其他更综合的锤炼；\n压力会更大，但是做的事情也会更多样，更深入，要求更高', 1, '3-5年', '研究生', 17, 11, 39, '钱江国际时代广场12楼财富港', NULL, '2022-02-15', 15000, 25000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (23, '信息技术岗（运维）', '（一）专业需求\n计算机科学与技术、软件工程。\n（二）主要工作职责及任职资格\n1.主要工作职责：\n（1）根据公司信息化要求，强化部门信息化建设，负责部门计算机、打印机等设备的日常管理与维护；\n（2）负责配合信息中心对部门网络运行的日常维护、运行状况监控和故障申报；\n（3）负责开发部门内部计算机辅助程序；\n（4）负责组织应用软件的推广及培训；\n（5）负责提升部门信息化应用和管理水平。\n2.任职资格：\n（1）学历要求：应届大学本科及以上学历，专业对口，成绩优异；\n（2）本科英语四级成绩合格，硕士研究生英语六级成绩合格；\n（3）具有较强的语言表达能力、公文写作能力、综合分析能力、组织协调及沟通能力。\n（三）岗位基本要求\n1.政治素质好，职业素养高，业务能力强，作风品德正；\n2.遵守国家法律法规，无违法违纪和违反社会公德不良记录； \n3.认同公司企业文化，能够遵守公司各项规章制度、爱岗敬业，具有较强的事业心和责任心；\n4.服从组织安排、遵守团队协作规则、能与团队成员和谐共处；\n5.遵守廉洁从业有关规定、勤勉尽责、公道正派、注重自身作风形象并能维护公司形象、利益，严格保守商业秘密和工作秘密；\n6.身心健康，具有良好的心理素质和能够正常履职的身体素质。', 0, '1-2年', '专科', 15, 16, 45, '乐平镇智信大道23号', '', '2020-01-19', 6000, 10000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (24, '资深广告设计师', '1:客户跟踪维护，2:项目的设计，3：配合落地完成。4:地产标识，党建展厅经验优先，4:能出3D效果\n加分项\n有以下行业经验：政府/公共事业·广告/公关/会展', 1, '2-3年', '本科', 17, 11, 42, '上塘河198文创园11号', NULL, '2020-02-16', 10000, 15000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (57, '软件测试工程师', '职位描述\n1、主要负责公司APP测试工作，参与项目测试，保障产品质量；\n2、参与需求评审，编写测试用例，组织项目测试，完成测试计划，并负责缺陷的跟踪和管理；\n3、系统质量评价和反馈，及问题跟踪、推动解决；\n4、能独立负责整个项目并对自己的产品质量负责。\n职位要求\n1、1年以上软件测试经验，掌握测试理论、测试流程、测试规范、测试方法；\n2、很强的责任心，良好的沟通表达能力，能承受一定的工作压力；\n3、具备较强的学习能力和逻辑分析能力，投入度高。', 1, '不限', '本科', 16, 10, 22, '华星时代广场B座3楼311', 'salary', '2020-02-22', 8000, 13000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (67, '测试工程师', '职位描述\n工作职责：\n1、负责日常检测工作的统筹安排，根据任务情况，协调测试资源；\n2、配合资深工程师，完成某一小模块的测试方法开发方案的设计并执行；协助跟进日常质控数据审核，确保测量系统稳定性；\n3、协助资深工程师，完成本组内异常检测的过程检查及分析，输出分析报告。\n\n\n任职资格：\n1、2023届统招本科及以上学历；\n2、化学类、材料类、化工与制药类等相关专业；\n3、有较强的敬业精神和良好的团队合作意识，有良好的专业素质和学习领悟能力。', 0, '经验不限', '本科', 15, 9, 33, '汕头大街13号', '', '2019-11-18', 8000, 13000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (90, 'iOS开发工程师', '阿里新零售网红业务－盒马鲜生赋能传统实体零售，为提供线上线下融合的产品解决方案。\n1. 盒马&淘鲜达业务支撑；\n2. 提升端侧盒马app消费者使用体验；\n3. app技术架构升级优化，提升业务研发效率；\n4. 负责iOS客户端产品的开发；\n5. 各iOS应用框架开发和维护，SDK开发\n职位要求\n1、3年以上客户端开发经验，精通iOS手机平台，有其他主流平台开发经验也可以考虑；有Android经验优先\n2、熟悉掌握Objective-C 编程语言，有Objective-C 相关开发经验不少于1年；有C++经验优先\n3、开发基础良好，理解设计模式，在项目或产品中有很好的设计实践\n4、有强烈的责任心和团队精神，善于沟通和合作；能独立完成设计和编码\n5、对iOS的UI控件有优化经验者优先；有前端开发经验者优先', 0, NULL, '本科', 15, 15, 21, '余杭区西溪B区18号楼', '', '2020-02-16', 4000, 5000, '实习', '4-7月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (91, 'Web 前端工程师', '负责公司IT系统的PC端及手机端页面开发\n任职要求：\n1. 精通Web开发前端技术，熟悉JavaScript/HTML5/CSS;\n2. 熟练掌握并使用Vue框架、uni-app及主流UI框架\n3. 熟悉页面自适应布局\n4. 熟悉浏览器之间的差异，能够解决浏览器兼容问题\n5. 根据业务需求，封装高复用、可维护性好的前端组件\n6. 熟练使用调试工具，具有性能优化经验\n备注：此岗位与紫光云数签合同，工作地点长期稳定在新华三集团！', 0, NULL, '本科', 15, 17, 41, '新华三集团长河路46号', NULL, '2023-02-06', 3000, 5500, '实习', '5-6月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (92, 'java工程师', '职责描述：\n1、能带领团队完成相应任务的开发过程；\n2、能参与攻克高并发、高稳定性、处理复杂业务模型的能力；\n3、能根据软件需求说明，优质地完成开发任务。\n任职要求：\n1、计算机相关专业，全日制本科及以上学历，有3-5年实际开发经验；\n2、扎实的Java基础，掌握JVM、并发编程、网络编程等基础知识；\n3、熟练掌握Spring、SpringMVC、Mybatis，微服务等框架，具有框架整合和优化能力；\n4、熟练掌握Mysql、Oracle等关系型数据库，具有大型数据库、分布式数据库、性能及安全调优能力；\n5、熟练掌握Spring Boot、Spring Cloud、消息队列、分布式缓存、JVM性能优化等技术；\n6、具有Linux环境下的开发经验；\n7、有较强的技术攻关能力，具有初步的架构思维，能够编写架构设计文档；\n8、具有良好的沟通表达能力，能吃苦耐劳，有技术团队带队经验者优先。', 0, '2-3年', '本科', 15, 7, 1, '百脑汇科技大厦23楼', NULL, '2022-02-12', 4000, 8000, '全职', '');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (93, 'Java Web开发工程师', '职责描述：\n1、系统架构设计；\n2、核心代码编写；\n3、系统性能调优；\n4、业务建模优化\n任职要求：\n1、需要扎实的代码能力，丰富的项目经历，以及较好的技术攻关能力。\n2、精通Java编程基础：集合框架、多线程并发、IO/NIO、网络通信等；\n3、较强的业务建模能力；\n4、精通主流开源框架springMVC、springBoot、mybatis、dubbo等，阅读相关源码者优先；\n5、熟练掌握maven原理，熟练使用git、jekins等；\n6、有SpringClound、docker相关组件经验、熟悉实现原理的优先；\n7、熟悉主流关系数据库Mysql、Oracle，有sql调优经验优先；\n8、熟悉以下技术至少一种：消息（ActiveMQ/RabbitMQ/Kafka/RocketMQ）、搜索（es/lucene/solr）、缓存（Redis/Memcached）、缓存集群（Redis Sentinel/Redis Cluster/Codis）技术者优先；\n9、敢于拼搏的精神、喜欢挑战、积极的主动性和责任感；\n10、良好的逻辑思维、沟通能力、学习能力。', 0, NULL, '本科', 15, 7, 1, '百脑汇科技大厦16楼', NULL, '2022-02-24', 5500, 6000, '实习', '2-3月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (94, 'C#技术开发 C/S方向', '1、计算机及相关专业本科以上，7年及以上开发经验；\n2、熟悉.Net framework（WCF, Rest API）或者.Net core。\n3、熟练掌握WPF技术或者Winform，熟练使用mvvm模式，有自定义控件库优先；\n4、熟练掌握代码调试和性能调优方法，具备良好的问题分析解决能力；\n5、熟练掌握多进程，多线程并发环境编程，高性能缓存使用；\n6、掌握常用的数据结构和设计模式，具备一定的系统分析与设计能力；\n7、责任心强，思维严谨，学习能力强，具有良好的计划、沟通、协作和抗压能力；\n8、有C++开发经验者优先。\n9、有证券金融行业知识、行情资讯等金融系统开发经验者优先。\n岗位描述：\n1、负责投资管理系统的开发设计、编码和系统质保工作；\n2、负责技术研究和产品性能优化，持续改进产品。', -1, NULL, '本科', 15, 18, 27, '中国杭州5G创新园08M', NULL, '2022-03-20', 3000, 5000, '实习', '4-7月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (95, '前端开发工程师', '职位要求\n1.负责公司项目的前端技术开发工作\n3.项目涉及pc端、移动端，移动端开发和适配；\n5.负责产品设计和前端交互；\n6.通过技术提高开发效率，更好的服务业务；\n任职资格\n1.3年以上前端开发经验； \n2.精通HTML5、CSS3、JavaScript、Typescript等Web前端开发技术； \n3.熟悉常用的前端框架（Vue/React/Electron/uniapp）及组件库（如Element-UI/Antd），并了解其基本原理；\n4.熟悉git使用，熟悉前端代码管理和代码发布流程；\n5.能够独立负责项目，从0-1构建前端项目；', 1, NULL, '本科', 15, 17, 36, '中国杭州5G创新园2M', NULL, '2022-02-13', 5000, 6500, '实习', '1-3月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (96, '资深前端工程师（vue）', '岗位职责： \n1、负责业务部门前端技术规划制定；\n2、负责前端基础规范制定、前端基础框架编码；\n3、负责前端问题排查。\n岗位要求：\n1、有5年以上的前端开发经验，学历本科及以上；\n2、熟练掌握PC前端开发、熟悉主流浏览器的技术特点；\n3、熟练运用JavaScript语言与HTML5、CSS3等技术，基础知识扎实；\n4、熟悉前端最新的技术架构，例如：VUE、React等；\n5、有前端组件化开发经验优先；有Spring框架开发经验优先；\n6、对技术有强烈的进取心，具有良好的沟通能力和团队合作精神、优秀的分析问题和解决问题的能力。', 1, '2-3年', '本科', 15, 17, 24, '欧美金融城2幢4312室', NULL, '2022-02-24', 25000, 35000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (97, 'Web研发工程师/专家', '我们希望你负责：\n•多终端产品的前端设计、开发、优化、维护；\n•与app端、后端工程师配合，完成功能的研发和调试；\n•探索和实践移动端混合开发、移动端动态化方案等\n我们希望你有：\n•全日制统招本科及以上学历，计算机相关专业；\n•有3年及以上的前端领域开发经验，能独立完成前端开发工作；\n•对前端的基础知识，CSS、JavaScript、Typescript、性能优化、网络原理等有深入的理解；\n•良好的前端架构能力，熟练目前各类主流前端框架（React/Vue/Angular之一）并理解相关实现原理；\n•了解移动端混合架构（Hybrid/ReactNative/Flutter等）；\n•了解NodeServer框架（Express/Koa等）；\n•具备新技术洞察能力，有良好的团队合作精神和沟通能力，敢于挑战。', 1, '2-4年', '专科', 15, 7, 41, '欧美金融城2幢4350室', NULL, '2022-06-21', 25000, 30000, '全职', NULL);
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (98, '前端研发工程师', '【岗位职责】：\n1、负责多终端产品的前端设计、开发、优化、维护；\n2、与app端、后端工程师配合，完成功能的研发和调试；\n3、探索和实践移动端混合开发、移动端动态化方案等。\n【任职要求】：\n1、全日制统招本科及以上学历，计算机相关专业；\n2、有 3 年及以上的前端领域开发经验，能独立完成前端开发工作；\n3、对前端的基础知识，CSS、JavaScript、Typescript、性能优化、网络原理等有深入的理解；\n4、良好的前端架构能力，熟练目前各类主流前端框架（ React / Vue / Angular 之一 ）并理解相关实现原理；\n5、了解移动端混合架构（Hybrid / React Native / Flutter 等）；\n6、了解 Node Server 框架（ Express / Koa 等 ）；\n7、具备新技术洞察能力，有良好的团队合作精神和沟通能力，敢于挑战。', 1, NULL, '本科', 15, 7, 45, '欧美广场英国中心T2-431室', NULL, '2022-02-23', 4000, 5000, '实习', '2-3月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (99, '大数据开发工程师', '工作职责：\n1）、数据ETL工作；\n2）、参与数据产品设计工作：数据分析挖掘：与医疗业务专家配合，承担数据仓库构建、模型构建、数据标签、知识库、画像分析等相关数据产品等设计工作；\n3）、数据挖掘分析工作；\n4）、数据产品研发工作。\n任职要求：\n1）、具有深厚的统计学、数据挖掘等相关知识，熟悉数据仓库和数据挖掘的相关技术，精通建模方法并有过独立的建模实践；\n2）、熟悉软件产品研发流程：精通SAS，R，SPSS等统计分析软件，具有海量数据挖掘、分析相关项目实施经验，参加过完整的数据挖掘项目并有成功案例；\n3）、精通Kettle、pentaho等工具的使用或开发；\n4）、熟悉Python、TIDB、关系型数据库、大数据Hadoop生态编程及数据库操作者优先录用。', -1, NULL, '研究生', 16, 13, 19, '国际影视中心350', NULL, '2022-02-27', 3000, 5500, '实习', '2-3月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (100, '数据产品经理', '1. 研究和规划内容数据对创作者的功能、服务及所需的业务流程，把握产品定位；\n2. 结合创作者的创作场景，建立公司的内容数据 运营体系；\n3. 跟踪、分析、挖掘内容的创作需求，进行需求评估，并完成需求的实现跟踪； \n4. 规划产品运营目标与策略，持续改善产品及功能。\n任职要求：\n1. 大学本科学历以上，3年以上工作经验，计算数学、数理统计和计算机相关专业背景者优先；\n2. 丰富的产品管理经验，从需求的确认、产品的原型，PRD的撰写、资源的协调，产品上线后的跟进与项目管理；\n3. 对主流大数据产品、BI产品的现状和发展趋势有深入了解；\n4. 有负责设计过数据分析、数据挖掘、数据可视化、在线数据相关产品者优先；\n5. 追求高品质产品的精神与热情，对行业动态有足够洞察力及敏锐度。\n6. 对大数据金融产品和跨境电商服务平台和产品生态有一定了解。', 1, '2-3年', '本科', 16, 13, 36, '研祥科技大厦A110', NULL, '2022-06-27', 12000, 16000, '全职', '2-6月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (101, '运维工程师', '***招聘要求***\n    1.该岗位为社招，23级应届生请走校招通道。\n    2.目前招聘要求需要全日制统招本科及以上学历，非全日制本科和专升本不在招聘范围之内。\n    3.不限经验，会写代码就行，入职后会有导师（全是大牛）带着学习六个月时间，期间工资全额照发。\n前端、后端、测试、C、C++、Java、Python等各种语言都招。\n目前华为云处于扩招状态，岗位急缺，门槛较低，容易进，可以尝试。\n走正常华为招聘流程，机试和面试，其中机试可以准备充分了再参加，不限时间。\n---------------------------------------------------\n我是开发，目前处于缺人，除了部门hr之外，大家都要帮忙收集简历的状态。\n我很懒，所以不会主动去沟通，但是有兴趣投递的，可以直接联系我。\n虽然我知道你们八成已经被华为骚扰怕了，但实际情况就是真的缺人。。。\n华为云部门算是华为比较年轻的部门，但是发展力度很大，打算短期之内冲击世界前列，所以现在进来的，留下的，以后都是骨干。\n最后一句话，如果你看到了这个招聘信息，算是缘分，对于面试候选者我会从头带到尾，尽可能的为你们提供有用的信息和答疑，帮助通过面试。\n有兴趣的话就来找我吧~', 1, NULL, '专科', 16, 16, 43, '华为科研基地B5', NULL, '2022-05-15', 5500, 6000, '实习', '2-3月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (102, '运维工程师', '总体要求：掌握python/C/Go/Java/Js等其中一种编程语言即可，无业务对口要求，入职后有业务培训。从事岗位半年内，由老员工“师徒”责任制指导业务。\n华为&德科联合岗位（OD）：\n非应届生\n最高学历院校top150', 1, NULL, '本科', 16, 7, 44, '研究所江淑路', NULL, '2022-02-12', 3000, 5000, '实习', '4-8月');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (110, '2', '2', 0, '1-2年', '本科', 15, 7, 42, '2222', 'ahsdaoifh', '2022-02-12', 7000, 8000, '实习', '222');
INSERT INTO `station` (`id`, `title`, `descs`, `status`, `work_exprience`, `education`, `company_id`, `station_type_id`, `location_id`, `location_detail`, `check_info`, `add_date`, `min_salary`, `max_salary`, `type`, `duration`) VALUES (111, 'qwqw', 'qwq', 0, '1-2年', '本科', 15, 7, 43, '22', NULL, '2022-02-12', 8500, 10000, '实习', '2');
COMMIT;

-- ----------------------------
-- Table structure for station_type
-- ----------------------------
DROP TABLE IF EXISTS `station_type`;
CREATE TABLE `station_type` (
  `value` int NOT NULL AUTO_INCREMENT,
  `label` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pid` int DEFAULT NULL,
  PRIMARY KEY (`value`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of station_type
-- ----------------------------
BEGIN;
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (1, '技术', NULL);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (2, '市场', NULL);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (3, '后端开发', 1);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (4, '测试', 1);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (5, '广告', 2);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (6, '市场营销', 2);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (7, 'Java', 3);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (8, 'Python', 3);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (9, '测试工程师', 4);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (10, '自动化测试', 4);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (11, '广告设计', 5);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (12, '网络推广', 6);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (13, '大数据', 1);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (14, 'PHP', 3);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (15, 'IOS', 1);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (16, '运维', 1);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (17, '前端', 1);
INSERT INTO `station_type` (`value`, `label`, `pid`) VALUES (18, 'c#', 3);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
