# mysql docker script
docker run -p 3306:3306 --name mysql5.7.40 -e MYSQL_ROOT_PASSWORD=root -e TZ=Asia/Taipei -d mysql:5.7.40 --default-authentication-plugin=mysql_native_password
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=root -e TZ=Asia/Taipei -d mysql --default-authentication-plugin=mysql_native_password

# mysql database create script
CREATE DATABASE `example` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

# mysql table create script
# product_data
CREATE TABLE example.product_data (
	id varchar(100) NOT NULL,
	name varchar(100) NOT NULL,
	amt DECIMAL NOT NULL,
	create_time DATETIME NOT NULL,
	CONSTRAINT product_data_PK PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

