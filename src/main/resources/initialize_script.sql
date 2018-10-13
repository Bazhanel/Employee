-- EMPLOYEE

INSERT INTO `employee` (`employee_name`, `email`, `role_id`, `location_id`, `permision_id`, `function_id`) VALUES ('Mark', 'mark@mail.com', 1, 1, 1, 1);
INSERT INTO `employee` (`employee_name`, `email`, `role_id`, `location_id`, `permision_id`, `function_id`) VALUES ('Paul', 'paul@mail.com', 1, 1, 1, 2);
INSERT INTO `employee` (`employee_name`, `email`, `role_id`, `location_id`, `permision_id`, `function_id`) VALUES ('Kira', 'kira@mail.com', 1, 1, 2, 1);

-- EMPLOYEE_PASSWORDS

INSERT INTO `employee_passwords` (`password`, `employee_id` ) VALUES (12345, 1);
INSERT INTO `employee_passwords` (`password`, `employee_id` ) VALUES (12345, 2);
INSERT INTO `employee_passwords` (`password`, `employee_id` ) VALUES (12345, 3);

-- EMPLOYEE_INFORMATION

INSERT INTO `employee_information` (`employee_id`, `first_name`, `last_name`, `gender`, `birth_date`, `phone_number`, `additional_phone_number`, `additional_email`, `avatar_url`)
VALUES (1, 'Mark', 'Zukerberg', 1, '2000-10-04', '+380501111111', 'Master' '+380502222222', 'mark2@email.com', 'https://avataaars.io/?avatarStyle=Circle&topType=LongHairFrida&accessoriesType=Prescription01&facialHairType=BeardMagestic&facialHairColor=BrownDark&clotheType=ShirtScoopNeck&clotheColor=White&eyeType=Dizzy&eyebrowType=FlatNatural&mouthType=Default&skinColor=Yellow');


INSERT INTO `employee_information` (`employee_id`, `first_name`, `last_name`, `gender`, `birth_date`, `phone_number`, `additional_phone_number`, `additional_email`, `avatar_url`)
VALUES (2, 'Paul', 'McKartney', 1, '2001-01-01', '+380502222222', 'Master' '+380503333333', 'paul2@email.com', 'https://avataaars.io/?avatarStyle=Circle&topType=LongHairNotTooLong&accessoriesType=Round&hairColor=Auburn&facialHairType=MoustacheMagnum&facialHairColor=Black&clotheType=Overall&clotheColor=PastelYellow&eyeType=Default&eyebrowType=UnibrowNatural&mouthType=Eating&skinColor=Light');

INSERT INTO `employee_information` (`employee_id`, `first_name`, `last_name`, `gender`, `birth_date`, `phone_number`, `additional_phone_number`, `additional_email`, `avatar_url`)
VALUES (3, 'Kira', 'Nightley', 2, '2002-02-02', '+380503333333', 'Master' '+380504444444', 'kira2@email.com', 'https://avataaars.io/?avatarStyle=Circle&topType=LongHairBob&accessoriesType=Wayfarers&hairColor=Black&facialHairType=Blank&facialHairColor=Red&clotheType=ShirtVNeck&clotheColor=Gray01&eyeType=Surprised&eyebrowType=Default&mouthType=Eating&skinColor=Tanned');

-- USER_ROLES

INSERT INTO `user_roles` (`id`,`type_role`) VALUES (1, 'ADMIN');
INSERT INTO `user_roles` (`id`,`type_role`) VALUES (2, 'EMPLOYEE'); -- USER
INSERT INTO `user_roles` (`id`,`type_role`) VALUES (3, 'CLIENT');
INSERT INTO `user_roles` (`id`,`type_role`) VALUES (3, 'UNDEFINED');


-- LOCATIONS

INSERT INTO `locations` (`location_name`) VALUES ('Tychiny'); 

-- ZONE OF RESPONSIBILITY

INSERT INTO `zone_of_responsibility` (`zone_name`, `employee_id`) VALUES ('sales', 1);
INSERT INTO `zone_of_responsibility` (`zone_name`, `employee_id`) VALUES ('reception', 2);
INSERT INTO `zone_of_responsibility` (`zone_name`, `employee_id`) VALUES ('auqazone', 3);

-- DEPARTMENT

INSERT INTO `department` (`department_name`, `department_id`) VALUES ('sales', 1);
INSERT INTO `department` (`department_name`, `department_id`) VALUES ('reception', 2);
INSERT INTO `department` (`department_name`, `department_id`) VALUES ('back_office', 3);

-- PERMISIONS

INSERT INTO `permision` (`permision_name`) VALUES ('databases');
INSERT INTO `permision` (`permision_name`) VALUES ('client_profile');
INSERT INTO `permision` (`permision_name`) VALUES ('reports');

-- MAIN_FUNCTIONS

INSERT INTO `main_functions` (`function_name`) VALUES ('Sales department control');
INSERT INTO `main_functions` (`function_name`) VALUES ('Client issues solving');
INSERT INTO `main_functions` (`function_name`) VALUES ('Aquazone control');
