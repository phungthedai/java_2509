-- xác đinh các table và dữ liệu
-- users ()
-- products (actual_quantity, quantity_cart, discount)
-- carts (users_id )
-- carts_item (cart_id, products_id, quantity_product )
-- orders (user_id, status_order, payment_method, payment_status)
-- order_items ( order_id, product_id, quantity)
-- tracking_order (orders_id, location, user_update)
-- email_notifications(order_id, sent_status)

create table users (
	id int not null auto_increment primary key,
    user_name varchar(255),
    full_name varchar(255),
    age int,
    address varchar(255),
    phone varchar(255)
);

create table products (
	id int not null auto_increment primary key,
    name_product varchar(255),
    introduction varchar(255),
    price int,
    weight int,
    actual_quantity int,
    quantity_cart int,
    discount int,
	img_id int,
    foreign key (img_id) references img_products(id)
);

create table carts (
	id int not null auto_increment primary key,
	users_id int,
    create_date date,
    update_date date,
    foreign key (users_id) references users(id)
);

create table carts_item (
	id int not null auto_increment primary key,
    cart_id int,
    products_id int,
    quantity_product int,
    added_at date,
    foreign key (products_id) references products(id),
    foreign key (cart_id) references carts(id)
);

create table orders (
	id int not null auto_increment primary key,
    user_id int,
    status_order enum('PENDING', 'CONFIRMED', 'PICKING', 'SHIPPING', 'DELIVERED', 'FAILED', 'RETURNING') default 'PENDING',
    payment_method enum('COD', 'ONLINE_PAYMENT') not null,
    payment_status enum('UNPAID', 'AWAITING_PAYMENT', 'PAID', 'REFUNDED') default 'UNPAID',
    foreign key (user_id) references users(id)
);

create table order_items (
    id int not null auto_increment primary key,
    order_id int,
    product_id int,
    quantity int not null,
    foreign key (order_id) references orders(id),
    foreign key (product_id) references products(id)
);

create table tracking_order (
	id int not null auto_increment primary key,
    orders_id int,
    location varchar(255),
    update_date date,
    user_update int,
    foreign key (orders_id) references orders(id),
    foreign key (user_update) references users(id)
);

create table email_notifications (
    id int not null auto_increment primary key,
    order_id int,
    recipient_email varchar(255),
    subject_email varchar(255),
    content varchar(255),
    sent_status enum('PENDING', 'SENT', 'FAILED') default 'PENDING',
    created_at date,
    foreign key (order_id) references orders(id)
);
