package com.aop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.vo.DemoVo;

@Service
public class DemoService {

		private  static List<DemoVo> demovo = new ArrayList<>();
		
		
	static {
	    demovo.add(new DemoVo("hhh","ygy",12365));
	    demovo.add(new DemoVo("hhh","ygy",14563));
	    demovo.add(new DemoVo("hhh","ygy",12569));
	}
	public List<DemoVo> findAll(){
		return demovo;
	}
}
