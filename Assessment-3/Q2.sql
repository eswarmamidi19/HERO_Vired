 create table Football_Venue(
    venue_id number(5),
    venue_name varchar2(20),
    city_id number(5),
    capacity number(7));





insert into Football_venue values (20001, 'France',10003, 42115);
insert into Football_venue values (20002, 'argintana',10004, 42115);
insert into Football_venue values (20003, 'portugal',10005, 50000);
insert into Football_venue values (20004, 'spain',10006, 50100);
insert into Football_venue values (20005, 'brazil',10007, 30100);
insert into Football_venue values (20006, 'india',10008, 10100);
insert into Football_venue values (20007, 'england',10009, 56900);
insert into Football_venue values (20008, 'japan',10010, 78900);
insert into Football_venue values (20009, 'korea',10011, 8900);
insert into Football_venue values (20010, 'america',10012, 89900);
insert into Football_venue values (20011, 'australia',10013, 89902);


select count(venue_name) from Football_venue;


SELECT Venue_name AS location, capacity AS volume from Football_venue;

delete from Football_venue where venue_name='australia';


















