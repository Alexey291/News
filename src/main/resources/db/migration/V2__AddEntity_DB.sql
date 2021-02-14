
insert into category (id, name)
    values (1, 'it');
insert into news1 (id, date, text, title, category_id)
    values (1, '2020.10.18 14:08:11', 'В сентябре 2020-го года Nvidia официально объявила о сделке по приобретению британской компании', 'Соглашение о покупке ARM компанией Nvidia оказалось под угрозой', 1);
insert into category_news (category_id, news_id)
    values (1, 1);

insert into category (id, name)
    values (2, 'sport');
insert into news1 (id, date, text, title, category_id)
    values (2, '2020.11.18 15:07:01', 'Появилось видео главного поединка турнира Абсолютного бойцовского чемпионата (UFC) между Камару Усманом и Гилбертом Бернсом. Ролик предоставлен правообладателем.', 'Появилось видео главного боя UFC 258', 2);
insert into category_news (category_id, news_id)
    values (2, 2);

insert into category (id, name)
    values (3, 'business');
insert into news1 (id, date, text, title, category_id)
    values (3, '2020.12.18 14:12:54', 'Из-за неправильной работы системы вызова экстренных служб Mercedes-Benz отзывает более 1,3 млн автомобилей. Об этом сообщает агентство Ассошиэйтед Пресс со ссылкой на заявление Национального управления безопасности движения на трассах США (NHTSA).', 'Mercedes отзывает более миллиона автомобилей из-за дефектов', 3);
insert into category_news (category_id, news_id)
    values (3, 3);










