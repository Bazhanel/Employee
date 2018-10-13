-- drop SCHEMA if exists`energym`;

-- -----------------------------------------------------
-- Schema energym
-- -----------------------------------------------------
-- CREATE SCHEMA IF NOT EXISTS `energym` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
-- USE `energym` ;

-- -----------------------------------------------------
-- Table `energym`.`EMPLOYEE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee` (
  `id`              BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `employee_name`   VARCHAR(100) NOT NULL,
  `email`           VARCHAR(100) NOT NULL,
  `role_id`         INT          NOT NULL,
  `location_id`     INT          NOT NULL,
  `permision_id`    INT          NOT NULL,
  `function_id`     INT          NOT NULL
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `energym`.`EMPLOYEE_PASSWORDS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_passwords` (
  `id`            BIGINT        NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `password`      VARCHAR(8000) NOT NULL,
  `employee_id`   BIGINT        NOT NULL
)
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `energym`.`EMPLOYEE_INFORMATION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_information` (
  `employee_id`             BIGINT      NOT NULL,
  `first_name`              VARCHAR(50) NOT NULL,
  `last_name`               VARCHAR(50) NOT NULL,
  `gender`                  INT         NOT NULL, -- 1-male, 0-female
  `birth_date`              DATE        NOT NULL,
  `phone_number`            VARCHAR(50) NOT NULL,
  `sport_category`          VARCHAR(50) NOT NULL,
  `additional_phone_number` VARCHAR(50),
  `additional_email`        VARCHAR(100),
  `avatar_url`              VARCHAR(4000)
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `energym`.`EMPLOYEE_ROLES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_roles` (
  `id`        INT         NOT NULL PRIMARY KEY,
  `type_role` VARCHAR(50) NOT NULL
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `energym`.`LOCATIONS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `locations` (
  `id`            INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `location_name` VARCHAR(50) NOT NULL,
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `energym`.`ZOR - ZONE OF RESPONSIBILITY`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `zone_of_responsibility` (
  `id`                INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `zone_name`         VARCHAR(50) NOT NULL,
  `employee_id`       BIGINT      NOT NULL
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `energym`.`DEPARTMENT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `department` (
  `id`                INT             NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `department_name`   VARCHAR(50)     NOT NULL
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `energym`.`PERMISIONS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `permision` (
  `id`                INT             NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `permision_name`    VARCHAR(50)     NOT NULL
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `energym`.`MAIN_FUNCTIONS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `main_functions` (
  `id`               INT           NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `function_name`    VARCHAR(50)   NOT NULL
)
ENGINE = InnoDB;
