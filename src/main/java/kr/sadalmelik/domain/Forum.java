package kr.sadalmelik.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Post의 상위 개념
 * 계층형 구조로 post의 데이터를 담는다.
 */
@Data
@Entity
public class Forum {

    @Id
    @GeneratedValue
    @Column(name="FORUM_ID")
    private Long id;

    @Column(name="FORUM_NAME")
    private String forumName;

    @Column(name="FORUM_KEY")
    private String forumKey;

    @Column(name="DESCRIPTION")
    private String description;
}
