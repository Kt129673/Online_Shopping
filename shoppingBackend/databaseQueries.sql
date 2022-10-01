CREATE TABLE category(
	id IDENTITY,
	name varchar(200),
	description varchar(500),
	image_url varchar(100),
	is_active BOOLEAN,
--	primary key
	CONSTRAINTS pk_category_id PRIMARY KEY (id)
	

);
