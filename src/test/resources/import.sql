INSERT INTO user(id, email, password, username) VALUES (1, 'testuser@gmail.com', 'user0password', 'user0');
INSERT INTO forum (forum_id, description, forum_name) VALUES (1, '설명', 'tech');
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (1, 'veri tas lux mea', 'text1', NULL, now(), 1, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (2, 'veri tas lux mea', 'text2', NULL, now(), 1, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (3, 'veri tas lux mea', 'text3', NULL, now(), 1, 1);