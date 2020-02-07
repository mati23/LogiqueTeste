-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema logique
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema logique
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `logique` DEFAULT CHARACTER SET latin1 ;
USE `logique` ;

-- -----------------------------------------------------
-- Table `logique`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `logique`.`User` (
  `id` INT(11) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `password_hash` VARCHAR(45) NULL DEFAULT NULL,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `logique`.`Urls`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `logique`.`Urls` (
  `id` INT(11) NOT NULL,
  `origin_url` VARCHAR(255) NULL DEFAULT NULL,
  `short_url` VARCHAR(255) NULL DEFAULT NULL,
  `user_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_id_idx` (`user_id` ASC),
  CONSTRAINT `fk_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `logique`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `logique`.`User_Urls`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `logique`.`User_Urls` (
  `User_id` INT(11) NOT NULL,
  `urls_id` INT(11) NOT NULL,
  UNIQUE INDEX `UK_lkq3gy2hd8un1qwtq9a6db6e2` (`urls_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `logique`.`incrementor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `logique`.`incrementor` (
  `next_val` BIGINT(20) NULL DEFAULT NULL)
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
