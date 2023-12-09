package com.xproce.inventoryservice.web;

import com.xproce.inventoryservice.dao.repository.CreatorRepository;
import com.xproce.inventoryservice.dao.repository.VideoRepository;
import com.xproce.inventoryservice.dao.entities.Creator;
import com.xproce.inventoryservice.dao.entities.Video;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQlController {
    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;
    VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository){
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
    }
    @QueryMapping
    public List<Video> videoList(){
        return videoRepository.findAll();
    }
    @QueryMapping
    public Creator creatorById(@Argument Integer id) {
        return creatorRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }


}
