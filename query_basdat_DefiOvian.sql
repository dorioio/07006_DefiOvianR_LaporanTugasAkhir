--> CREATE TABLESPACE 
CREATE TABLESPACE project 
datafile 'D:\Basis Data Semester 4\project.dbf'
size 30M;


-->Create User
CREATE USER project_07006
IDENTIFIED BY project
DEFAULT TABLESPACE project
QUOTA 30M ON project


-->Table Login
create table login_07006
(
username INTEGER not null,
password INTEGER,
id_owner INTEGER,
constraint PK_login primary key (id_owner)
);

-->Table transaksi
create table transaksi_07006
(
id_transaksi INTEGER not null,
id_owner INTEGER,
tgl_transaksi VARCHAR(50),
total_harga FLOAT,
uang_bayar INTEGER,
kembalian INTEGER,
constraint PK_transaksi primary key (id_transaksi)
);

-->table detail transaksi 
create table detail_transaksi_07006
(
id_transaksi INTEGER not null,
id_barang INTEGER,
jumlah INTEGER,
constraint PK_detail_transaksi primary key (id_transaksi)
);

--> table barang
create table barang_07006
(
id_barang INTEGER not null, 
id_jenisbarang INTEGER,
nama_barang VARCHAR(100),
harga_barang INTEGER,
stok INTEGER,
constraint PK_barang primary key (id_barang)
);
 
-->table jenis barang
create table jenis_barang_07006
(
id_jenisbarang INTEGER not null,
nama_jenisbarang VARCHAR(50),
constraint PK_jenis_barang_07006 primary key (id_jenisbarang)
);


--> create table login
SQL>insert into login_07006(username, password, id_owner) values ('ovian', '12345678', id_owner.Nextval);
SQL> insert into login_07006(username, password, id_owner) values ('dor', '12345678', id_owner.Nextval);
SQL> insert into login_07006(username, password, id_owner) values ('dia', '12345678', id_owner.Nextval);
SQL> insert into login_07006(username, password, id_owner) values ('dinda', '12345678', id_owner.Nextval);
SQL> insert into login_07006(username, password, id_owner) values ('doi', '12345678', id_owner.Nextval);
1 row created.


--> create table transaksi
SQL> insert into transaksi_07006(id_transaksi, id_owner, tgl_transaksi, total_harga, uang_bayar, kembalian) values (1, 1, to_date('01/01/2000','dd/mm/yyyy'), '8000', '10000', '2000');
SQL> insert into transaksi_07006(id_transaksi, id_owner, tgl_transaksi, total_harga, uang_bayar, kembalian) values (2, 2, to_date('02/02/2000','dd/mm/yyyy'), '5000', '10000', '5000');
SQL> insert all
  2  into transaksi_07006(id_transaksi, id_owner, tgl_transaksi, total_harga, uang_bayar, kembalian) values (3, 3, to_date('03/03/2000','dd/mm/yyyy'), '6000', '10000', '4000')
  3  into transaksi_07006(id_transaksi, id_owner, tgl_transaksi, total_harga, uang_bayar, kembalian) values (4, 4, to_date('04/04/2000','dd/mm/yyyy'), '7000', '10000', '3000')
  4  into transaksi_07006(id_transaksi, id_owner, tgl_transaksi, total_harga, uang_bayar, kembalian) values (5, 5, to_date('05/05/2000','dd/mm/yyyy'), '10000', '10000', '0')
  5  select 1 from dual;


-->create table barang
SQL> insert into barang_07006(id_barang, id_jenisbarang, nama_barang, harga_barang, stok) values (1, 1, 'adidas', '800000', '1');
SQL> insert into barang_07006(id_barang, id_jenisbarang, nama_barang, harga_barang, stok) values (2, 2, 'nike', '600000', '2');
SQL> insert all
  2  into barang_07006(id_barang, id_jenisbarang, nama_barang, harga_barang, stok) values (3, 3, 'converse', '400000', '3')
  3  into barang_07006(id_barang, id_jenisbarang, nama_barang, harga_barang, stok) values (4, 4, 'compass', '300000', '4')
  4  into barang_07006(id_barang, id_jenisbarang, nama_barang, harga_barang, stok) values (5, 5, 'vans', '900000', '4')
  5  select 1 from dual;


-->create table jenis barang
SQL> insert into jenis_barang_07006(id_jenisbarang, nama_jenisbarang) values (1, 'sneakers');
SQL> insert into jenis_barang_07006(id_jenisbarang, nama_jenisbarang) values (2, 'casual');
SQL> insert all
  2  into jenis_barang_07006(id_jenisbarang, nama_jenisbarang) values (3, 'cat')
  3  into jenis_barang_07006(id_jenisbarang, nama_jenisbarang) values (4, 'fashion')
  4  into jenis_barang_07006(id_jenisbarang, nama_jenisbarang) values (5, 'futsal')
  5  select 1 from dual;


--> create detail transaksi
SQL> insert into detail_transaksi_07006(id_transaksi, id_barang, jumlah) values (1, 1, 1);
SQL> insert into detail_transaksi_07006(id_transaksi, id_barang, jumlah) values (2, 2, 2);
SQL> insert all
  2  into detail_transaksi_07006(id_transaksi, id_barang, jumlah) values (3, 3, 3)
  3  into detail_transaksi_07006(id_transaksi, id_barang, jumlah) values (4, 4, 4)
  4  into detail_transaksi_07006(id_transaksi, id_barang, jumlah) values (5, 5, 5)
  5  select 1 from dual;


