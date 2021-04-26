package cn.edu.scujcc;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/channel")
public class TvSerivesController {
	@Autowired
	private TvSerivesDto tvSerivesDto;
	@GetMapping("/{id}")
	public Channel getChannel(@PathVariable String id) {
		Channel result = tvSerivesDto.getChannel(id);
		return result;
	}
	@DeleteMapping("/{id}")
	public boolean deleteChannel(@PathVariable String id) {
		boolean result1 = false;
		result1 = tvSerivesDto.deleteChannel(id);
		//*List<Channel> result = tvSerivesDto.getAll();
		return result1;	
	}
	@PostMapping
	public Channel createChannel(@RequestBody Channel c) {
		Channel result = null;
		result = tvSerivesDto.createChannel(c);
		return result;
	}
	@GetMapping
	public List<Channel> getAll(){
		List<Channel> result = tvSerivesDto.getAll();
		return result;
	}
	@PutMapping
	public Channel updateChannel(@RequestBody Channel u) {
		Channel result = null;
		result = tvSerivesDto.updateChannel(u);
		return result;
	}
	@GetMapping("/desc/{desc}")//∏˘æ›√Ë ˆ≤È’“
	public List<Channel> searchByDesc(@PathVariable String desc){
		List<Channel> result = null;
		result = tvSerivesDto.searchByDesc(desc);
		return result;
	}
}