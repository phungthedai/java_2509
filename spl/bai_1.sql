CREATE database if not exists bai_1_database_sql;
use bai_1_database_sql;

-- Questions 1. Tạo table với các ràng buộc và kiểu dữ
-- Thêm ít nhất 5 bản ghi vào table.
create table customer (
	customer_id int auto_increment primary key,
    `name` varchar(100),
    phone varchar(20),
    email varchar(100),
    address varchar(255),
    note text
);

create table car (
	car_id varchar(50) primary key,
    maker enum('HONDA', 'TOYOTA', 'NISSAN'),
    model varchar(20),
    `year` int,
    color varchar(20),
    note text
);

create table car_order (
	order_id int auto_increment primary key,
    customer_id int,
    car_id varchar(50),
    ammount int default 1,
    sale_price bigint,
    order_date date,
    delivery_date date,
    delivery_address varchar(255),
    `status` tinyint default 0 check (`status` in (0, 1, 2)),
    note text,
    foreign key (customer_id) references customer(customer_id),
    foreign key (car_id) references car(car_id)
);		

insert into customer (`name`, phone, email, address, note) 
values
	('Nguyễn Văn A', '0901234567', 'vana@gmail.com', 'Hà Nội', 'Khách hàng thân thiết'),
	('Trần Thị B', '0912345678', 'thib@yahoo.com', 'TP HCM', 'Khách hàng tiềm năng'),
	('Lê Văn C', '0923456789', 'vanc@outlook.com', 'Đà Nẵng', 'Khách hàng tiềm năng'),
	('Phạm Minh D', '0934567890', 'minhd@gmail.com', 'Cần Thơ', 'Ưu tiên gọi buổi sáng'),
	('Hoàng Thị E', '0945678901', 'thie@gmail.com', 'Hải Phòng', 'Mua xe lần đầu'),
	('Đỗ Văn F', '0956789012', 'vanf@company.com', 'Huế', 'Liên hệ qua trợ lý'),
	('Vũ Thị G', '0967890123', 'thig@gmail.com', 'Nha Trang', 'Khách hàng thân thiết'),
	('Phan Văn H', '0978901234', 'vanh@gmail.com', 'Quảng Ninh', 'Mua xe lần đầu');

insert into car (car_id, maker, model, `year`, color, note)
values
	('CAR001', 'HONDA', 'Civic', 2023, 'Black', 'Phiên bản RS'),
	('CAR002', 'TOYOTA', 'Camry', 2024, 'White', 'Nhập khẩu Thái Lan'),
	('CAR003', 'NISSAN', 'Almera', 2022, 'Red', 'Tiết kiệm nhiên liệu'),
	('CAR004', 'HONDA', 'CR-V', 2023, 'Blue', 'Dòng SUV phổ biến'),
	('CAR005', 'TOYOTA', 'Vios', 2024, 'Silver', 'Mẫu xe quốc dân'),
	('CAR006', 'NISSAN', 'Navara', 2023, 'Gray', 'Xe bán tải mạnh mẽ'),
	('CAR007', 'HONDA', 'City', 2024, 'White', 'Phù hợp đô thị'),
	('CAR008', 'TOYOTA', 'Corolla Cross', 2023, 'Yellow', 'Dòng Hybrid');

insert into car_order (customer_id, car_id, ammount, sale_price, order_date, delivery_date, delivery_address, `status`, note)
values
	(1, 'CAR001', 1, 850000000, '2026-03-01', '2025-03-10', 'Hà Nội', 1, 'Giao xe tận nhà'),
	(2, 'CAR002', 1, 1100000000, '2026-03-05', '2025-03-15', 'TP HCM', 1, 'Giao xe tận nhà'),
	(3, 'CAR003', 2, 550000000, '2026-03-08', '2025-04-12', 'Đà Nẵng', 0, 'Khách đang chờ duyệt vay'),
	(4, 'CAR004', 1, 1050000000, '2026-03-10', '2025-03-10', 'Cần Thơ', 0, 'Khách đổi ý sang xe khác'),
	(5, 'CAR005', 1, 500000000, '2026-03-11', '2026-03-11', 'Hải Phòng', 1, 'Giao ngay trong ngày'),
	(6, 'CAR006', 1, 900000000, '2026-03-12', '2026-03-10', 'Huế', 2, 'Khách đổi ý sang xe khác'),
	(7, 'CAR007', 1, 600000000, '2026-03-13', '2026-01-20', 'Nha Trang', 0, 'Đã cọc 200 triệu'),
	(8, 'CAR008', 1, 950000000, '2026-03-13', '2026-02-10', 'Quảng Ninh', 0, 'Đã cọc 50 triệu');

-- Questions 2. Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã mua và sắp sếp tăng dần theo số lượng oto đã mua.
select c.`name`, sum(o.ammount) as sum_ammount
from customer c join car_order o on c.customer_id = o.customer_id
where o.`status` = 1
group by c.customer_id
order by  sum_ammount;

-- Questions 3. Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều oto nhất trong năm nay.
delimiter $$
create procedure getNameMakerBestSellingInYear(out nameMaker varchar(20))
	deterministic
	begin
		select c.maker into nameMaker
		from car c
        join car_order o on c.car_id = o.car_id
		where o.`status` = 1 and year(o.order_date) = year(curdate())
		group by c.maker
        having sum(o.ammount) = (
			select sum(o.ammount) as sum_ammount
			from car c
            join car_order o on c.car_id = o.car_id
			where o.`status` = 1 and year(o.order_date) = year(curdate())
			group by c.maker
			order by  sum_ammount desc
            limit 1
		);
	end$$
delimiter ;
call getNameMakerBestSellingInYear(@nameMaker);
select @nameMaker

-- Questions 4. Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của những năm trước. In ra số lượng bản ghi đã bị xóa.
delimiter $$
create procedure deleteCancelledOrdersFromPastYears()
	deterministic
	begin
		declare deleted_count int default  0;
        delete from car_order
        where year(order_date) < year(curdate());
        
        set deleted_count = row_count();
        select concat('Số lượng bản ghi đã bị xóa: ', deleted_count) AS resultMessage;
	end$$
delimiter ;
call deleteCancelledOrdersFromPastYears();

-- Questions 5. Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto và tên hãng sản xuất.
delimiter $$
create procedure getOrderInfoByCustomer(in customerID int)
	deterministic
	begin
		select c.`name`, co.order_id, co.ammount, car.maker
        from car_order co
        join car on co.car_id = car.car_id
        join customer c on co.customer_id = c.customer_id
        where c.customer_id = customerID
        and co.`status` = 0;
	end$$
delimiter ;
call getOrderInfoByCustomer(1);

-- Questions 6. Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ vào database (DeliveryDate < OrderDate + 15).
delimiter $$
create trigger validateDeliveryDate
	before insert on car_order
	for each row
    begin
		if new.delivery_date is not null and new.delivery_date < date_add(new.order_date, interval 15 day) then
			signal sqlstate '45000';
        end if;
    end$$
delimiter ;
insert into car_order(customer_id, car_id, ammount, sale_price, order_date, delivery_date, delivery_address, `status`, note)
values (8, 'CAR008', 1, 950000000, '2026-01-10', '2026-01-24', 'Quảng Ninh', 0, 'Đã cọc 50 triệu');
