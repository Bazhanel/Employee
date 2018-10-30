INSERT INTO `category` (`id`, `name`) VALUES (1, '1 катгеория');
INSERT INTO `category` (`id`, `name`) VALUES (2, '2 катгеория');
INSERT INTO `category` (`id`, `name`) VALUES (3, 'Высшая катгеория');

INSERT INTO `services` (`id`, `name`, `description`) VALUES (1, 'Бассейн', NULL);
INSERT INTO `services` (`id`, `name`, `description`) VALUES (2, 'Персональная тренировка', NULL);
INSERT INTO `services` (`id`, `name`, `description`) VALUES (3, 'Групповая тренировка', NULL);

INSERT INTO `category_spec` (`id`, `categoryid`, `serviceid`, `datefrom`, `dateto`) VALUES (1, 3, 1, NULL, NULL);
INSERT INTO `category_spec` (`id`, `categoryid`, `serviceid`, `datefrom`, `dateto`) VALUES (2, 3, 2, NULL, NULL);

INSERT INTO `discount` (`id`, `name`, `percent`, `datefrom`, `dateto`) VALUES (1, '10%', 10, CURRENT_TIMESTAMP, NULL);

INSERT INTO `post` (`id`, `name`, `description`) VALUES (1, 'Boss', 'Boss');
INSERT INTO `post` (`id`, `name`, `description`) VALUES (2, 'Cleaning manager', 'Cleaning manager');

INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (1, NULL, 'Energym 1', 'Energym 1', CURRENT_TIMESTAMP, NULL, 1);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (4, 1, 'Energym 1 1', 'Energym 1 1', CURRENT_TIMESTAMP, NULL, 1);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (5, 1, 'Energym 1 2', 'Energym 1 2', CURRENT_TIMESTAMP, NULL, 1);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (2, NULL, 'Energym 2', 'Energym 2', CURRENT_TIMESTAMP, NULL, 1);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (3, NULL, 'Energym 3', 'Energym 3', CURRENT_TIMESTAMP, NULL, 1);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (6, 3, 'Energym 3 1', 'Energym 3 1', CURRENT_TIMESTAMP, NULL, 1);
INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (7, 3, 'Energym 3 2', 'Energym 3 2', CURRENT_TIMESTAMP, NULL, 1);

INSERT INTO `employee` (`firstname`, `lastname`, `familyname`, `departmentid`, `jobbegindate`, `dismissdate`, `postid`, `email`, `internalnumber`, `phone1`, `phone2`, `categoryid`, `photo`, `cardid`, `dbuser`, `discountid`, `gender`) VALUES ('Петр', 'Петрович', 'Петров', 1, CURRENT_TIMESTAMP, NULL, 1, NULL, NULL, NULL, NULL, 3, NULL, NULL, NULL, NULL, 0);

INSERT INTO `employeediscount` (`id`, `discountid`, `validfrom`, `employeeid`) VALUES (1, 1, CURRENT_TIMESTAMP-1, 1);
