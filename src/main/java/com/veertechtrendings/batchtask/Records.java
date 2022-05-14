package com.veertechtrendings.batchtask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "soulxpoint")
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "TEXT")
    private String iframe;
    private String name;
    private String categories;
    private long loves;
    private long views;
    private long likes;
    private long dislikes;
    private String starName;
    @Column(columnDefinition = "TEXT")
    private String tags;
    @Column(columnDefinition = "TEXT")
    private String mainThumbnails;
    @Column(columnDefinition = "TEXT")
    private String coverPic;
    @Column(columnDefinition = "TEXT")
    private String additionalThumbnails;

}
