CREATE DATABASE inventorysystem;
USE inventorysystem;

CREATE TABLE employees (
    EmployeeId int AUTO_INCREMENT,
    Firstname varchar(255) NOT NULL,
    Lastname varchar(255) NOT NULL,
    Age int(255) NOT NULL,
    Address varchar(255) NOT NULL,

    PRIMARY KEY (EmployeeId));

CREATE TABLE users (
    UserId int AUTO_INCREMENT,
    EmployeeId int(255) NOT NULL,
    Username varchar(255) NOT NULL,
    Userpassword varchar(255) NOT NULL,
    isAdmin tinyint(1),

    PRIMARY KEY (UserId));

CREATE TABLE products (
    ProductId int AUTO_INCREMENT,
    ProductName varchar(255) NOT NULL,
    ProductSpec varchar(255) NOT NULL,
    ProductType varchar(255) NOT NULL,
    ProductBrand varchar(255) NOT NULL,
    PackType varchar(255) NOT NULL,
    PackQuantity int(255) NOT NULL,
    ProductDescription varchar(255) NOT NULL,

    PRIMARY KEY (ProductId));

CREATE TABLE brands (
    BrandId int AUTO_INCREMENT,
    BrandName varchar(255) NOT NULL,

    PRIMARY KEY (BrandId));

CREATE TABLE Specifications (
    SpecificationId int AUTO_INCREMENT,
    SpecificationName varchar(255) NOT NULL,

    PRIMARY KEY (SpecificationId));

CREATE TABLE ProductTypes (
    ProductTypeId int AUTO_INCREMENT,
    ProductTypeName varchar(255) NOT NULL,

    PRIMARY KEY (ProductTypeId));

CREATE TABLE PackagingType (
    PackagingTypeId int AUTO_INCREMENT,
    PackagingTypeName varchar(255) NOT NULL,

    PRIMARY KEY (PackagingTypeId));

INSERT INTO employees (EmployeeId,Firstname,Lastname,Age,Address)
    VALUES (1,'Joshua','Pardorla',21,'Tungkop');

INSERT INTO users (UserId,EmployeeId,Username,Userpassword,isAdmin)
    VALUES (1,1,'josh12','josh12',1);

INSERT INTO users (UserId,EmployeeId,Username,Userpassword,isAdmin)
    VALUES (2,1,'josh123','josh123',0);
INSERT INTO brands (BrandId,BrandName)
    VALUES (1,'Uniliver');
INSERT INTO Specifications (SpecificationId,SpecificationName)
    VALUES (1,'100ml');
INSERT INTO ProductTypes (ProductTypeId,ProductTypeName )
    VALUES (1,'Beverage');
INSERT INTO PackagingType (PackagingTypeId,PackagingTypeName )
    VALUES (1,'Plastic');

INSERT INTO PackagingType (PackagingTypeId,PackagingTypeName )
    VALUES (1,'Plastic');