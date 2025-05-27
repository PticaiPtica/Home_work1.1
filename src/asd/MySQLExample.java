package asd;
public class MySQLExample {
    SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0;
    SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0;
    SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE =
            'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
        -- Schema BaseData
-- -----------------------------------------------------

        -- -----------------------------------------------------
        -- Schema BaseData
-- -----------------------------------------------------
    CREATE SCHEMA IF NOT EXISTS `BaseData` DEFAULT CHARACTER SET utf8;
    USE `BaseData`;

-- -----------------------------------------------------
        -- Table `BaseData`.`Subjects`
            -- -----------------------------------------------------
    CREATE TABLE IF NOT EXISTS `BaseData`.`Subjects`
            (
            `id`   INT          NOT NULL,
            `name` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
        -- Table `BaseData`.`Groups`
            -- -----------------------------------------------------
    CREATE TABLE IF NOT EXISTS `BaseData`.`Groups`
            (
            `id`           INT UNSIGNED NOT NULL AUTO_INCREMENT,
            `name`         VARCHAR(10)  NOT NULL,
    `year`         INT          NOT NULL,
            `DepartmentId` INT          NULL,
    PRIMARY KEY (`id`),
    INDEX `Depart_idx` (`DepartmentId` ASC) VISIBLE,
    CONSTRAINT `Depart`
    FOREIGN KEY (`DepartmentId`)
    REFERENCES `BaseData`.`Subjects` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
        -- Table `BaseData`.`Teachers`
            -- -----------------------------------------------------
    CREATE TABLE IF NOT EXISTS `BaseData`.`Teachers`
            (
            `id`      INT          NOT NULL,
            `name`    NVARCHAR(50) NOT NULL,
    `Salary`  INT          NOT NULL,
            `Surname` NVARCHAR(50) NOT NULL,
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB;


    SET SQL_MODE = @OLD_SQL_MODE;
    SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
    SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;



}

