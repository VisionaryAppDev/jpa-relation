drop table Citizen;
select * from Citizen;
create table Citizen(
    id UUID primary key,
    name VARCHAR(100) not null
);


drop table Passport;
select * from Passport;
create table Passport(
    id UUID primary key,
    passport_no VARCHAR(100) not null
);


CREATE TABLE citizen_Passport (
  citizen_id UUID NOT NULL,
  passport_id UUID NOT NULL,
  PRIMARY KEY (citizen_id, passport_id),
  FOREIGN KEY (citizen_id) REFERENCES Citizen(id),
  FOREIGN KEY (passport_id) REFERENCES Passport(id)

  ---   Short hand
--   citizen_id UUID REFERENCES country (id),
--   passport_id UUID REFERENCES capital (id),
--   PRIMARY KEY (citizen_id, passport_id)
);