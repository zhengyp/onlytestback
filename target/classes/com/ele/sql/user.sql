CREATE TABLE ele_user
(
    id INT PRIMARY KEY NOT NULL COMMENT '编号' AUTO_INCREMENT,
    name VARCHAR(50) COMMENT '姓名',
    sex VARCHAR(10) COMMENT '性别',
    address VARCHAR(50) COMMENT '地址',
    bir TIMESTAMP COMMENT '生日'
);