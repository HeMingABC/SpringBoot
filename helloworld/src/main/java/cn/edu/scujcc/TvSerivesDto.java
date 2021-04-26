package cn.edu.scujcc;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TvSerivesDto {
	@Autowired
	private TvRepository repo;
	public Channel getChannel(String id) {
		Channel result = new Channel();
		if(null!=id) {
			if(repo.findById(id).isPresent())
			{
				result=repo.findById(id).get();
			}
		}
		
		return result;
	}
	
	public boolean deleteChannel(String id) {
		boolean result = true;
		try {
		repo.deleteById(id);
		}catch(Exception e) {
			result = false;
		}
		return result;
	}
	
	public List<Channel> getAll(){
		List<Channel> result = null;
		result = repo.findAll();
		return result;
	}
	
	public Channel createChannel(Channel c) {
		return repo.save(c);
	}
	public Channel updateChannel(Channel u) {
		Channel updateAfter = null;
		updateAfter = getChannel(u.getId());
		if(u.getName()!=null) {
			updateAfter.setName(u.getName());
		}
		return repo.save(updateAfter);
	}
	public List<Channel> searchByDesc(String desc){
		return repo.findByDescLike(desc);
	}
}