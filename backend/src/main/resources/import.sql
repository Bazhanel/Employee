INSERT INTO `company` (`id`, `sname`, `name`, `phone`, `phone2`, `email`, `address`, `orgcode`) VALUES (1, 'Test Company', 'Test Company', NULL, NULL, 'org@org.com', 'Ukraine', '000000');

INSERT INTO `category` (`id`, `name`) VALUES (1, '1 катгеория');
INSERT INTO `category` (`id`, `name`) VALUES (2, '2 катгеория');
INSERT INTO `category` (`id`, `name`) VALUES (3, 'Высшая катгеория');

INSERT INTO `services` (`id`, `name`, `description`) VALUES (1, 'Бассейн', NULL);
INSERT INTO `services` (`id`, `name`, `description`) VALUES (2, 'Персональная тренировка', NULL);
INSERT INTO `services` (`id`, `name`, `description`) VALUES (3, 'Групповая тренировка', NULL);
INSERT INTO `services` (`id`, `name`, `description`) VALUES (4, 'Стретчинг', NULL);

INSERT INTO `category_spec` (`id`, `categoryid`, `serviceid`, `datefrom`, `dateto`) VALUES (1, 3, 1, NULL, NULL);
INSERT INTO `category_spec` (`id`, `categoryid`, `serviceid`, `datefrom`, `dateto`) VALUES (2, 3, 2, NULL, NULL);

INSERT INTO `discount` (`id`, `name`, `percent`, `datefrom`, `dateto`) VALUES (1, '10%', 10, CURRENT_TIMESTAMP, NULL);

INSERT INTO `post` (`id`, `name`, `description`) VALUES (1, 'Boss', 'Boss');
INSERT INTO `post` (`id`, `name`, `description`) VALUES (2, 'Cleaning manager', 'Cleaning manager');

INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`, `companyid`, `position`) VALUES (1, NULL, 'Energym 1', 'Energym 1', CURRENT_TIMESTAMP, NULL, 1, 1, NULL);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`, `companyid`, `position`) VALUES (4, 1, 'Energym 1 1', 'Energym 1 1', CURRENT_TIMESTAMP, NULL, 1, 1, NULL);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`, `companyid`, `position`) VALUES (5, 1, 'Energym 1 2', 'Energym 1 2', CURRENT_TIMESTAMP, NULL, 1, 1, NULL);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`, `companyid`, `position`) VALUES (2, NULL, 'Energym 2', 'Energym 2', CURRENT_TIMESTAMP, NULL, 1, 1, NULL);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`, `companyid`, `position`) VALUES (3, NULL, 'Energym 3', 'Energym 3', CURRENT_TIMESTAMP, NULL, 1, 1, NULL);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`, `companyid`, `position`) VALUES (6, 3, 'Energym 3 1', 'Energym 3 1', CURRENT_TIMESTAMP, NULL, 1, 1, NULL);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`, `companyid`, `position`) VALUES (7, 3, 'Energym 3 2', 'Energym 3 2', CURRENT_TIMESTAMP, NULL, 1, 1, NULL);

INSERT INTO `employee` (`id`, `firstname`, `lastname`, `familyname`, `departmentid`, `jobbegindate`, `dismissdate`, `postid`, `email`, `internalnumber`, `phone1`, `phone2`, `categoryid`, `photo`, `cardid`, `dbuser`, `discountid`, `gender`) VALUES (1, 'Петр', 'Петрович', 'Петров', 1, CURRENT_TIMESTAMP, NULL, 1, NULL, NULL, NULL, NULL, 3, NULL, NULL, NULL, NULL, 0);

INSERT INTO `employeediscount` (`id`, `discountid`, `validfrom`, `employeeid`) VALUES (1, 1, CURRENT_TIMESTAMP-1, 1);

INSERT INTO `gym` (`id`, `name`, `description`, `capacity`, `company`) VALUES (1, 'Гимнастический зал', NULL, 20, 1);

INSERT INTO `trainingtype` (`id`, `name`, `description`, `avaliable4group`) VALUES (1, 'Стретчинг', 'Стретчинг для группы', 1);

INSERT INTO `grouptraining` (`id`, `employeeid`, `gymid`, `serviceid`, `amount`, `state`, `description`, `trainintypeid`) VALUES (1, 1, 1, 4, 10, 1, NULL, 1);

INSERT INTO `application_user` (`id`, `username`, `password`) VALUES (1, 'user1', '$2a$04$myHC/CoDgVNPCem6ejBA0.Ku5dcG0mse9cxlGN7.r7ZVv1G6TZdFm');
INSERT INTO `application_user` (`id`, `username`, `password`) VALUES (2, 'user2', '$2a$04$myHC/CoDgVNPCem6ejBA0.Ku5dcG0mse9cxlGN7.r7ZVv1G6TZdFm');
INSERT INTO `application_user` (`id`, `username`, `password`) VALUES (3, 'admin', '$2a$04$myHC/CoDgVNPCem6ejBA0.Ku5dcG0mse9cxlGN7.r7ZVv1G6TZdFm');
