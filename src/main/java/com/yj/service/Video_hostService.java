package com.yj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yj.dao.DouyuTV_Video_hostDao;
import com.yj.dao.HuyaLive_Video_hostDao;
import com.yj.dao.Video_hostDao;
import com.yj.dao.ZhanqiTV_Video_hostDao;
import com.yj.pojo.Video_host;

@Service
public class Video_hostService {

	@Autowired
	public Video_hostDao video_hostDao;
	@Autowired
	public DouyuTV_Video_hostDao douyuTV_video_hostDao;
	@Autowired
	public ZhanqiTV_Video_hostDao zhanqiTV_video_hostDao;
	@Autowired
	public HuyaLive_Video_hostDao huyaLive_Video_hostDao;
	
	/**
	 * 添加主播信息到video_host表，如果主播已存在，则更新主播信息
	 * @param video_host
	 * @return
	 */
	public int insertVideo_host(Video_host video_host){
		return video_hostDao.insertVideo_host(video_host);
	}
	
	/**
	 * 使用replace into批量更新熊猫tv主播表
	 * @param host_list
	 * @return
	 */
	public int replace_host_list(List<Video_host> host_list){
		return video_hostDao.replace_host_list(host_list);
	}
	
	/**
	 * 使用replace into批量更新斗鱼tv主播表
	 * @param host_list
	 * @return
	 */
	public int replace_DouyuTV_host_list(List<Video_host> host_list){
		return douyuTV_video_hostDao.replace_host_list(host_list);
	}
	
	/**
	 * 使用replace into批量更新战旗tv主播表
	 * @param host_list
	 * @return
	 */
	public int replace_ZhanqiTV_host_list(List<Video_host> host_list){
		return zhanqiTV_video_hostDao.replace_host_list(host_list);
	}
	
	/**
	 * 使用replace into批量更新虎牙直播主播表
	 * @param host_list
	 * @return
	 */
	public int replace_HuyaLive_host_list(List<Video_host> host_list){
		return huyaLive_Video_hostDao.replace_host_list(host_list);
	}
}
