INSERT INTO `category` (`id`, `name`) VALUES (1, '1 катгеория');
INSERT INTO `category` (`id`, `name`) VALUES (2, '2 катгеория');
INSERT INTO `category` (`id`, `name`) VALUES (3, 'Высшая катгеория');

INSERT INTO `discount` (`id`, `name`, `percent`, `datefrom`, `dateto`) VALUES (1, '10%', 10, CURRENT_TIMESTAMP, NULL);

INSERT INTO `post` (`id`, `name`, `description`) VALUES (1, 'Boss', 'Boss');

INSERT INTO `department` (`id`, `pid`, `sname`, `name`, `datefrom`, `dateto`, `hier_level`) VALUES (1, NULL, 'Energym 1', 'Energym 1', CURRENT_TIMESTAMP, NULL, 1);

INSERT INTO `employee` (`firstname`, `lastname`, `familyname`, `departmentid`, `jobbegindate`, `dismissdate`, `postid`, `email`, `internalnumber`, `phone1`, `phone2`, `categoryid`, `photo`, `cardid`, `dbuser`, `discountid`, `gender`) VALUES ('Петр', 'Петрович', 'Петров', 1, CURRENT_TIMESTAMP, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

INSERT INTO `employeediscount` (`id`, `discountid`, `validfrom`, `employeeid`) VALUES (1, 1, CURRENT_TIMESTAMP-1, 1);