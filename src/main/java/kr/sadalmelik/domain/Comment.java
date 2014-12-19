package kr.sadalmelik.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue
    @Column(name = "COMMENT_ID")
    private Long id;

    @Column(name="TEXT")
    private String text;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
