INSERT INTO user(id, email, password, username) VALUES (1, 'testuser@gmail.com', 'user0password', 'user0');

INSERT INTO forum (forum_id, description, forum_name) VALUES (1, '설명', 'frontend 이야기');
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (1, 'webstorm을 설치하였습니다.', 'text1', NULL, now(), 1, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (2, 'html5를 사용하기에 앞서 알아야 할 것들', 'text2', NULL, now(), 1, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (3, 'frontend개발자는 어디까지 개발해야 하나요', 'text3', NULL, now(), 1, 1);

INSERT INTO forum (forum_id, description, forum_name) VALUES (2, '설명', '백엔드 웹개발 모임터');
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (4, 'Eclipse 더이상 못쓰겠내요.....', 'text1', NULL, now(), 2, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (5, '어제 안드로이드 개발자랑 싸워버렸습니다.', 'text2', NULL, now(), 2, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (6, '난 경기도 안양의 이준영이다.', 'text3', NULL, now(), 2, 1);


INSERT INTO forum (forum_id, description, forum_name) VALUES (3, '설명', '치킨집준비위원회');
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (7, '각 지역별 숨겨진 치킨 맛집 리스트(ver. 3)', 'text1', NULL, now(), 3, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (8, '치킨집 차리신분들 한달 순이익이 어느정도 나나요?', 'text2', NULL, now(), 3, 1);
INSERT INTO post (post_id, text, title, update_date, write_date, forum_id, user_id) VALUES (9, '◈и▷라이브바둑이 게임◁и◈합법적인 운영.', 'text3', NULL, now(), 3, 1);