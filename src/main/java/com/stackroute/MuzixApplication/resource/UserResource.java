package com.stackroute.MuzixApplication.resource;

import com.stackroute.MuzixApplication.document.Track;
import com.stackroute.MuzixApplication.repository.MuzixRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muzix")

public class UserResource {

private MuzixRepository muzixRepository;

    public UserResource(MuzixRepository muzixRepository) {
        this.muzixRepository = muzixRepository;
    }

    @GetMapping("/alltracks")

    public List<Track> getall()
    {
     return muzixRepository.findAll();
    }

    @PostMapping("/track")
     public  Track addTrack(@RequestBody Track track)
    {
        this.muzixRepository.insert(track);
        return  track;
    }

    @PutMapping("/update")
    public Track updatetrack(@RequestBody Track track)
    {
        muzixRepository.save(track);
        return  track;
    }

    @DeleteMapping("/track/{id}")
    public  String deleteTrack(@PathVariable String id )
    {
        String s="";
        Track t=new Track();
        while (t!=null)
        {
            if(t.getTrackid().equals(id)) {
                this.muzixRepository.delete(t);
                s= "deleted";
                break;
            }
            else
                s="id not found";
        }
        return s;

    }

}
