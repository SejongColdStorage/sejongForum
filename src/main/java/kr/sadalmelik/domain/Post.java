package kr.sadalmelik.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "POST_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="FORUM_ID", nullable = false)
    private Forum forum;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "WRITE_DATE", nullable = false)
    private Date writeDate;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @Column(name = "TEXT")
    private String text;

    @ElementCollection
    private List<String> tagList;
}
